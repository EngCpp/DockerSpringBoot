package com.example.model.dao;

import com.example.model.entity.User;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Carlos Eduardo
 */
@Repository
public class UsersDao extends AbstractDao<User> {

    public User find(Object pk) {
        return (User) em.find(User.class, pk);
    }

    public List findAll() {
        return em.createQuery("select object(o) from User as o").getResultList();
    }
    
    public int remove(int id) {
        Query qry = em.createQuery("delete from User u where u.id = :id");        
              qry.setParameter("id", id);
              
        return qry.executeUpdate();
    }    
}
