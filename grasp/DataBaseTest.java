/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp;

import GRASP.DataBase;
import GRASP.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AndreiPC
 */
public class DataBaseTest {
    
    public DataBaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addUser method, of class DataBase.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User u = new User("ionel@yahoo.com");
        String expectedEmail ="gigel@yahoo.com";
        DataBase instance = new DataBase();
        instance.addUser(u);
        assertEquals(expectedEmail,u.getEmail());
        
// TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }


   
    
}
