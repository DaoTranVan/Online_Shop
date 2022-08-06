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
public class Accounts {

    private String userID;
    private String name;
    private String password;
    private String address;
    private String city;
    private String phone;
    private String admin;

    public Accounts() {
    }

    public Accounts(String userID, String name, String password, String address, String city, String phone, String admin) {
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.admin = admin;
    }
    public Accounts(String userID, String name, String password, String address, String city, String phone){
        this.userID = userID;
        this.name = name;
        this.password = password;
        this.address = address;
        this.city = city;
        this.phone = phone;
    }

    public Accounts(String userID, String password, String admin) {
        this.userID = userID;
        this.password = password;
        this.admin = admin;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
