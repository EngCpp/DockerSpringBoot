/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

import com.example.model.entity.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author engcpp
 */
public class SanityTest {
    
 @Test
  public void userEntityTest(){
      User user = new User(10, "Stefan", "Molinoux", 50);
      
      assertEquals(user.getFirstName(), "Stefan");
      assertEquals(user.getLastName(), "Molinoux");
      assertEquals(user.getAge(), 50);      
  }
}
