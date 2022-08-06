/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */
public class ProductsNGTest {
    
    public ProductsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getProductID method, of class Products.
     */
    @Test
    public void testGetProductID() {
        System.out.println("getProductID");
        Products instance = new Products();
        int expResult = 0;
        int result = instance.getProductID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductID method, of class Products.
     */
    @Test
    public void testSetProductID() {
        System.out.println("setProductID");
        int productID = 0;
        Products instance = new Products();
        instance.setProductID(productID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductName method, of class Products.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        Products instance = new Products();
        String expResult = "";
        String result = instance.getProductName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductName method, of class Products.
     */
    @Test
    public void testSetProductName() {
        System.out.println("setProductName");
        String productName = "";
        Products instance = new Products();
        instance.setProductName(productName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryID method, of class Products.
     */
    @Test
    public void testGetCategoryID() {
        System.out.println("getCategoryID");
        Products instance = new Products();
        int expResult = 0;
        int result = instance.getCategoryID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryID method, of class Products.
     */
    @Test
    public void testSetCategoryID() {
        System.out.println("setCategoryID");
        int categoryID = 0;
        Products instance = new Products();
        instance.setCategoryID(categoryID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryName method, of class Products.
     */
    @Test
    public void testGetCategoryName() {
        System.out.println("getCategoryName");
        Products instance = new Products();
        String expResult = "";
        String result = instance.getCategoryName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryName method, of class Products.
     */
    @Test
    public void testSetCategoryName() {
        System.out.println("setCategoryName");
        String categoryName = "";
        Products instance = new Products();
        instance.setCategoryName(categoryName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImg method, of class Products.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        Products instance = new Products();
        String expResult = "";
        String result = instance.getImg();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class Products.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        String img = "";
        Products instance = new Products();
        instance.setImg(img);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Products.
     */
    @Test
    public void testGetPrice() {
        Products instance = new Products();
        String expResult = "";
        String result = instance.getPrice();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Products.
     */
    @Test(expectedExceptions = Exception.class)
    public void testSetPriceWithNagative() {
        System.out.println("setPrice");
        String price = "-100";
        Products instance = new Products();
        
        instance.setPrice(price);
    }
    @Test
    public void testSetPriceWithPostive() {
        System.out.println("setPrice");
        String price = "100";
        Products instance = new Products();
        instance.setPrice(price);
        double actual = Double.parseDouble(instance.getPrice()) ;
        assertEquals(actual, price);
    }

    /**
     * Test of getQuantity method, of class Products.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Products instance = new Products();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Products.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Products instance = new Products();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
