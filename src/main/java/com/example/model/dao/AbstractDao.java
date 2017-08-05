/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author engcpp
 */
public class AbstractDao <T> {
    @PersistenceContext
    protected EntityManager em;
    
   public void create(T obj) {
        em.persist(obj);
    }

    public void edit(T obj) {
        em.merge(obj);
    }

    public void destroy(T obj) {
        em.remove(em.merge(obj));
    }    
}
