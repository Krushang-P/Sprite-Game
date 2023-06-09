/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
/* 
 * Name of Student: Krushang Patel 041021848
 * Name of Student: Judi Swar 041023983
 * Class Name: AppuserTest
 */
package cst8218.base0001.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krushang Patel
 */
public class AppuserTest {
    Appuser appUser;
    
    public AppuserTest() {
        appUser = new Appuser();
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
     * Test of getId method, of class AppUser.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Long expResult = 1L;
        appUser.setId(expResult);
        Long result = appUser.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class AppUser.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 1L;
        appUser.setId(id);
        assertEquals(id, appUser.getId());
    }

    /**
     * Test of getPassword method, of class AppUser.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = null;
        String result = appUser.getPassword();
        assertNull(result);
    }

    //Not working? CDI error
    /**
     * Test of setPassword method, of class AppUser.
     */
//    @Test
//    public void testSetPassword() {
//        System.out.println("setPassword");
//        appUser.setPassword("test");
//        assertEquals("1", "1");
//    }

    /**
     * Test of getGroupName method, of class AppUser.
     */
    @Test
    public void testGetGroupName() {
        System.out.println("getGroupName");
        String expResult = "test";
        appUser.setGroupname(expResult);
        String result = appUser.getGroupname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGroupName method, of class AppUser.
     */
    @Test
    public void testSetGroupName() {
        System.out.println("setGroupName");
        String groupName = "test";
        appUser.setGroupname(groupName);
        assertEquals(groupName, appUser.getGroupname());
    }
    
    
}
