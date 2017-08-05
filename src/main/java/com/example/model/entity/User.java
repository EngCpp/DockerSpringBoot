/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author engcpp
 */
@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Id
    @Column(name = "user_id") 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int    id;

    @Column(name = "user_first_name")    
    private String firstName;

    @Column(name = "user_last_name")
    private String lastName;
    
    @Column(name = "user_age")
    private int age;

    public User(){}
    public User(int id, String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
        this.id        = id;
    }    
    
    public void setId(int id){
       this.id = id;
    }
    
    
    public int getId(){
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }       
}