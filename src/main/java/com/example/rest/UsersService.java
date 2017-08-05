/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.rest;

import com.example.model.dao.UsersDao;
import com.example.model.entity.User;
import java.util.Collection;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author engcpp
 */
@RestController
@RequestMapping(value="/users")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UsersService {
    @Autowired
    private UsersDao dao;    

    @RequestMapping(method=RequestMethod.GET)
    public Collection<User> getJson() {        
        return dao.findAll();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getJson(@PathVariable int id) {    
        return this.dao.find(id);
    }    
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public boolean deleteJson(@PathVariable int id) {    
        this.dao.remove(id);
        return true;
    }    
    
    @RequestMapping(method=RequestMethod.POST)
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public boolean postJson(@RequestBody User content) {  
        this.dao.create(content);        
        return true;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public boolean putJson(@RequestBody User content) {        
        this.dao.edit(content);
        return true;
    }         
}
