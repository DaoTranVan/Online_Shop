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
public class InfoPC {
    private int productID;
    private String productName;
    private String img;
    private String cpu;
    private String main;
    private String ram;
    private String vga;
    private String ssd;
    private String nguon;
    private String vocase;
    private String price;

    public InfoPC() {
    }

    public InfoPC(int productID, String productName, String img, String cpu, String main, String ram, String vga, String ssd, String nguon, String vocase, String price) {
        this.productID = productID;
        this.productName = productName;
        this.img = img;
        this.cpu = cpu;
        this.main = main;
        this.ram = ram;
        this.vga = vga;
        this.ssd = ssd;
        this.nguon = nguon;
        this.vocase = vocase;
        this.price = price;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getNguon() {
        return nguon;
    }

    public void setNguon(String nguon) {
        this.nguon = nguon;
    }

    public String getVocase() {
        return vocase;
    }

    public void setVocase(String vocase) {
        this.vocase = vocase;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    

    
  
}
