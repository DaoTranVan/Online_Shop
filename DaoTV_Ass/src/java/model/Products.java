/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Products {
    private int productID;
    private String productName;
    private int categoryID;
    private String categoryName;
    private String img;
    private String price;
    private int quantity;

    public Products() {
    }

    public Products(int productID, String productName, int categoryID, String categoryName, String img, String price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.img = img;
        this.price = price;
        this.quantity = quantity;
    }

    
    public Products(int productID, String productName, String price){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
    public Products(int productID, String productName, int categoryID, String img, String price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.categoryID = categoryID;
        this.img = img;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
