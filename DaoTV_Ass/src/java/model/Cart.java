/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
    
    public int getQuantityByID(int id){
        return getItemByID(id).getQuantity();
    }
    private Item getItemByID(int id){
        for(Item i: items){
            if(i.getProduct().getProductID()==id){
                return i;
            }
        }
        return null;
    }
    public void addItem(Item t){
        if(getItemByID(t.getProduct().getProductID())!=null){
            Item m = getItemByID(t.getProduct().getProductID());
            m.setQuantity(m.getQuantity()+t.getQuantity());
        }else{
            items.add(t);
        }
    }
    public void removeItem(int id){
        if(getItemByID(id)!=null){
            items.remove(getItemByID(id));
        }
    }
    public double getTotalMoney(){
        double t=0;
        for(Item i:items){
            t+=(i.getQuantity()*i.getPrice());
        }
        return t;
    }
    private Products getProductByID(int id,List<Products> list){
        for (Products i: list){
            if(i.getProductID()==id){
                return i;
            }
        }
        return null;
    }
    public Cart (String txt, List<Products> list){
        items = new ArrayList<>();
        try{
        if(txt!=null && txt.length()!=0){
            String[] s= txt.split(",");
            for(String i: s){
                String[] n = i.split(":");
                int id = Integer.parseInt(n[0]);
                int quantity = Integer.parseInt(n[1]);           
                Products p = getProductByID(id, list);
                Item t= new Item(p, quantity, Double.parseDouble(p.getPrice()));
                addItem(t);
                
            }
        }
        }catch(NumberFormatException e){
        }
    }

}
