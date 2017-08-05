/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author engcpp
 */
@RestController
@EnableAutoConfiguration // Enables Base Search Package
@ComponentScan
@ServletComponentScan
public class Application {        
    public static void main(String args[]){
        SpringApplication.run(Application.class, args);   
    }    
}