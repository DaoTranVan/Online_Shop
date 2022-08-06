/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Categories;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class CategoryDAO extends DBContext{
    //lay tat du lieu tu bang Cstegory
    //select * from Categories
    public List<Categories> getAll(){
        List<Categories> list = new ArrayList<>();
        String sql = "select * from Categories";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Categories c = new Categories();
                c.setCategoryID(rs.getInt("categoryID"));
                c.setCategoryName(rs.getString("categoryName"));
                c.setDescribe(rs.getString("describe"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
    //delete
    //delete from Categories where id=4
    public void delete(int id){
        String sql = "delete from Categories where CategoryID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Categories getCategoryByID(int id){
        String sql="select * from Categories where CategoryID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Categories c = new Categories();
                c.setCategoryID(rs.getInt("categoryID"));
                c.setCategoryName(rs.getString("categoryName"));
                c.setDescribe(rs.getString("describe"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    //insert into Categories values(7,'KKK','Mong')
    public void insert(Categories c){
        String sql="insert into Categories values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getCategoryID());
            st.setString(2, c.getCategoryName());
            st.setString(3, c.getDescribe());
            
            st.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void update(Categories c){
        String sql="update Categories set categoryName=?, describe=? where categoryID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,c.getCategoryName());
            st.setString(2,c.getDescribe());
            st.setInt(3,c.getCategoryID());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    //test co ket noi dc database ko
    public static void main(String[] args) {
        CategoryDAO c = new CategoryDAO();
        List<Categories> list = c.getAll();
        System.out.println(list.get(0).getCategoryName());
    }
}
