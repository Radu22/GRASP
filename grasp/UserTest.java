/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp;

import GRASP.MailBox;
import GRASP.Message;
import GRASP.User;
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
public class UserTest {
    
    public UserTest() {
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
     * Test of composeMessage method, of class User.
     */
    @Test
    public void testComposeMessage() {
        System.out.println("composeMessage");
        Message m =new Message ("ionel@yahoo.com","vladut@yahoo.com","salut","none");
        Message expectedM=new Message("vladut@yahoo.com","ionel@yahoo.com","salut","none");
        User instance = new User("dasda@yahoo.com");
        instance.composeMessage(m);
        assertEquals(expectedM.to,m.to);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class User.
     */
}

    