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
public class InfoLab {
    private int productID;
    private String productName;
    private String img;
    private String cpu;
    private String gpu;
    private String manhinh;
    private String hedieuhanh;
    private String ram;
    private String ssd;
    private String hdd;
    private String lan;
    private String wlan;
    private String congketnoi;
    private String banphim;
    private String pin;
    private String kichthuoc;
    private String trongluong;
    private String price;

    public InfoLab() {
    }

    public InfoLab(int productID, String productName, String img, String cpu, String gpu, String manhinh, String hedieuhanh, String ram, String ssd, String hdd, String lan, String wlan, String congketnoi, String banphim, String pin, String kichthuoc, String trongluong, String price) {
        this.productID = productID;
        this.productName = productName;
        this.img = img;
        this.cpu = cpu;
        this.gpu = gpu;
        this.manhinh = manhinh;
        this.hedieuhanh = hedieuhanh;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.lan = lan;
        this.wlan = wlan;
        this.congketnoi = congketnoi;
        this.banphim = banphim;
        this.pin = pin;
        this.kichthuoc = kichthuoc;
        this.trongluong = trongluong;
        this.price = price;
    }
    public InfoLab(int productID,String cpu, String gpu, String manhinh, String hedieuhanh, String ram, String ssd, String hdd, String lan, String wlan, String congketnoi, String banphim, String pin, String kichthuoc, String trongluong) {
        this.productID = productID;
        this.cpu = cpu;
        this.gpu = gpu;
        this.manhinh = manhinh;
        this.hedieuhanh = hedieuhanh;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.lan = lan;
        this.wlan = wlan;
        this.congketnoi = congketnoi;
        this.banphim = banphim;
        this.pin = pin;
        this.kichthuoc = kichthuoc;
        this.trongluong = trongluong;
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

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getManhinh() {
        return manhinh;
    }

    public void setManhinh(String manhinh) {
        this.manhinh = manhinh;
    }

    public String getHedieuhanh() {
        return hedieuhanh;
    }

    public void setHedieuhanh(String hedieuhanh) {
        this.hedieuhanh = hedieuhanh;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public String getWlan() {
        return wlan;
    }

    public void setWlan(String wlan) {
        this.wlan = wlan;
    }

    public String getCongketnoi() {
        return congketnoi;
    }

    public void setCongketnoi(String congketnoi) {
        this.congketnoi = congketnoi;
    }

    public String getBanphim() {
        return banphim;
    }

    public void setBanphim(String banphim) {
        this.banphim = banphim;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public String getTrongluong() {
        return trongluong;
    }

    public void setTrongluong(String trongluong) {
        this.trongluong = trongluong;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    
    
}
