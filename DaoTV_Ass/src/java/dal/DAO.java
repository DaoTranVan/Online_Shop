/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Accounts;
import model.Cart;
import model.InfoLab;
import model.InfoPC;
import model.Item;
import model.Products;
import model.Thongke;

/**
 *
 * @author ADMIN
 */
public class DAO extends DBContext{
    
    public Accounts check(String user, String pass) {
        String sql = "select * from Accounts where UserID=? and Password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                Accounts a = new Accounts(rs.getString("UserID"), rs.getString("Name"), rs.getString("Password"), rs.getString("Address"), rs.getString("City"), rs.getString("Phone"), rs.getString("Admin"));
                return a;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    public void insertAccounts(Accounts a){
        String sql="insert into Accounts values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, a.getUserID());
            st.setString(2, a.getName());
            st.setString(3, a.getPassword());
            st.setString(4, a.getAddress());
            st.setString(5, a.getCity());
            st.setString(6, a.getPhone());
            st.setString(7, a.getAdmin());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void updateAcc(Accounts a){
        String sql="UPDATE Accounts SET Name =?,Password=?,Address=?,City =?,Phone=?,Admin=?\n" +
                    "WHERE UserID like ?;";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, a.getName());
            st.setString(2, a.getPassword());
            st.setString(3, a.getAddress());
            st.setString(4, a.getCity());
            st.setString(5, a.getPhone());
            st.setString(6, a.getAdmin());
            st.setString(7, a.getUserID());
            st.executeUpdate();
        } catch (SQLException e) {
        }
    }
    public List<Products> getAll() {
        String sql = "select p.ProductID,p.ProductName,c.CategoryID,c.CategoryName,p.Price,p.Amount,p.Img\n" +
                    "from Products p\n" +
                    "inner join Categories c\n" +
                    "on p.CategoryID= c.CategoryID";
        List<Products> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setProductID(rs.getInt("productID"));
                p.setProductName(rs.getString("productName"));
                p.setCategoryID(rs.getInt("categoryID"));
                p.setCategoryName(rs.getString("categoryName"));
                p.setQuantity(rs.getInt("Amount"));
                p.setImg(rs.getString("img"));
                p.setPrice(rs.getString("Price"));
                //p.setPrice(rs.getString("price").substring(0, 2) + "," + rs.getString("price").substring(2, 5) +","+rs.getString("price").substring(5, rs.getString("price").length()));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    public Products getProductByID(int id){
        String sql="select *\n" +
                    "from Products where ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1,id);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return new Products(rs.getInt("productID"), rs.getString("productName"), rs.getInt("CategoryID"), rs.getString("Img"), rs.getString("price"),rs.getInt("Amount"));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void update(Products p){
        String sql="update Products set ProductName=? ,CategoryID=? ,Img=? ,Price=?\n" +
                    "where ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,p.getProductName());
            st.setInt(2,p.getCategoryID());
            st.setString(3,p.getImg());
            st.setString(4,p.getPrice());
            st.setInt(5,p.getProductID());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public List<Products> getByCatID(int id) {
        String sql = "select p.ProductID,p.ProductName,c.CategoryID,c.CategoryName,p.Price,p.Img\n" +
                        "from Products p\n" +
                        "inner join Categories c\n" +
                        "on p.CategoryID= c.CategoryID where p.CategoryID=?";
        List<Products> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setProductID(rs.getInt("productID"));
                p.setProductName(rs.getString("productName"));
                p.setCategoryID(rs.getInt("categoryID"));
                p.setCategoryName(rs.getString("categoryName"));
                p.setImg(rs.getString("img"));
                p.setPrice(rs.getString("Price"));
                //p.setPrice(rs.getString("price").substring(0, 2) + "," + rs.getString("price").substring(2, 5) +","+rs.getString("price").substring(5, rs.getString("price").length()));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public List<InfoPC> getInfoPC(int id) {
        String sql = "select p.ProductID,p.ProductName,p.Img,i.CPU,i.Main,i.RAM,i.VGA,i.SSD,i.Nguon,i.VoCase,p.Price \n" +
                    "from Products p\n" +
                    "inner join InfoPC i\n" +
                    "on p.ProductID = i.ProductID where p.ProductID = ?";
        List<InfoPC> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                InfoPC i = new InfoPC();
                i.setProductID(rs.getInt("productID"));
                i.setProductName(rs.getString("productName"));
                i.setImg(rs.getString("img"));
                i.setCpu(rs.getString("cpu"));
                i.setMain(rs.getString("main"));
                i.setRam(rs.getString("ram"));
                i.setVga(rs.getString("vga"));
                i.setSsd(rs.getString("ssd"));
                i.setNguon(rs.getString("nguon"));
                i.setVocase(rs.getString("vocase"));
                i.setPrice(rs.getString("Price"));
                //i.setPrice(rs.getString("price").substring(0, 2) + "," + rs.getString("price").substring(2, 5) +","+rs.getString("price").substring(5, rs.getString("price").length()));
                list.add(i);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    public List<InfoLab> getInfoLab(int id) {
        String sql = "select p.ProductID,p.ProductName,p.Img,i.CPU,i.GPU,i.Manhinh,i.Hedieuhanh,i.RAM,i.SSD,i.HDD,i.Lan\n" +
                    ",I.WLan,i.Congketnoi,i.Banphim,i.Pin,i.Kichthuoc,i.Trongluong,p.Price \n" +
                    "from Products p\n" +
                    "inner join InfoLab i \n" +
                    "on p.ProductID = i.ProductID where p.ProductID = ?";
        List<InfoLab> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                InfoLab i = new InfoLab();
                i.setProductID(rs.getInt("productID"));
                i.setProductName(rs.getString("productName"));
                i.setImg(rs.getString("img"));
                i.setCpu(rs.getString("cpu"));
                i.setGpu(rs.getString("gpu"));
                i.setManhinh(rs.getString("manhinh"));
                i.setHedieuhanh(rs.getString("hedieuhanh"));
                i.setRam(rs.getString("ram"));
                i.setSsd(rs.getString("ssd"));
                i.setHdd(rs.getString("hdd"));
                i.setLan(rs.getString("lan"));
                i.setWlan(rs.getString("wlan"));
                i.setCongketnoi(rs.getString("congketnoi"));
                i.setBanphim(rs.getString("banphim"));
                i.setPin(rs.getString("pin"));
                i.setKichthuoc(rs.getString("kichthuoc"));
                i.setTrongluong(rs.getString("trongluong"));
                i.setPrice(rs.getString("Price"));
                //i.setPrice(rs.getString("price").substring(0, 2) + "," + rs.getString("price").substring(2, 5) +","+rs.getString("price").substring(5, rs.getString("price").length()));
                list.add(i);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    public List<Products> searchByName(String key) {
        List<Products> list = new ArrayList<>();
        String sql = " select p.ProductID,p.ProductName,c.CategoryID,c.CategoryName,p.Price,p.Img\n" +
                    "from Products p\n" +
                    "inner join Categories c\n" +
                    "on p.CategoryID= c.CategoryID where p.ProductName like ? or c.CategoryName like ?";
        
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%"+key+"%");
            st.setString(2, "%"+key+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Products p = new Products();
                p.setProductID(rs.getInt("productID"));
                p.setProductName(rs.getString("productName"));
                p.setCategoryID(rs.getInt("categoryID"));
                p.setCategoryName(rs.getString("categoryName"));
                p.setImg(rs.getString("img"));
                p.setPrice(rs.getString("Price"));
                //p.setPrice(rs.getString("price").substring(0, 2) + "," + rs.getString("price").substring(2, 5) +","+rs.getString("price").substring(5, rs.getString("price").length()));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    public void insertP(Products d){
        String sql="insert into Products values(?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, d.getProductID());
            st.setString(2, d.getProductName());
            st.setInt(3, d.getCategoryID());
            st.setString(4, d.getImg());
            st.setString(5, d.getPrice());
            
            st.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void insertIL(InfoLab i){
        String sql="insert into InfoLab values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, i.getProductID());
            st.setString(2, i.getCpu());
            st.setString(3, i.getGpu());
            st.setString(4, i.getManhinh());
            st.setString(5, i.getHedieuhanh());
            st.setString(6, i.getRam());
            st.setString(7, i.getSsd());
            st.setString(8, i.getHdd());
            st.setString(9, i.getLan());
            st.setString(10, i.getWlan());
            st.setString(11, i.getCongketnoi());
            st.setString(12, i.getBanphim());
            st.setString(13, i.getPin());
            st.setString(14, i.getKichthuoc());
            st.setString(15, i.getTrongluong());
            
            st.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void delete(int id){
        String sql = "delete from Products where ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public List<Products> getListByPage(List<Products> list,
            int start,int end){
        ArrayList<Products> arr=new ArrayList<>();
        for(int i=start;i<end;i++){
            arr.add(list.get(i));
        }
        return arr;
    }
    public void addOrder(Accounts c, Cart cart){
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            //add order
            String sql="insert into Orders values(?,?,?)";
            PreparedStatement st= connection.prepareStatement(sql);
            st.setString(1, c.getUserID());
            st.setString(2, date);
            st.setDouble(3, cart.getTotalMoney());
            st.executeUpdate();
            //lay id cua order vua add
            String sql1="select top 1 OrderID from Orders order by OrderID desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            //add bang OrderDetails
            if(rs.next()){
                int oid = rs.getInt("OrderID");
                for(Item i : cart.getItems()){
                    String sql2="insert into OrderDetails values (?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getProduct().getProductID());
                    st2.setInt(4, i.getQuantity());
                    st2.setDouble(3, i.getPrice());
                    st2.executeUpdate();
                }
            }
            //cap nhat lai  so luong san pham
            String sql3 = "update Products set Amount=Amount-? where ProductID=?";
            PreparedStatement st3 = connection.prepareStatement(sql3);
            for(Item i : cart.getItems()){
                st3.setInt(1, i.getQuantity());
                st3.setInt(2, i.getProduct().getProductID());
                st3.executeUpdate();
            }
            
        } catch (SQLException e) {
        }
    }
    public List<Thongke> getThongke() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        String sql ="select c.CategoryName, sum(od.Quantity) as SumQuantity, sum(o.TotalPrice) as SumPrice\n" +
                    "from OrderDetails od inner join Products p on od.ProductID=p.ProductID\n" +
                    "inner join Orders o on od.OrderID=o.OrderID inner join Categories c on c.CategoryID=p.CategoryID\n" +
                    "where o.OrderDate like '2022-03-16' \n" +
                    "group by c.CategoryName";
        List<Thongke> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, date);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Thongke t = new Thongke();
                t.setCategoryName(rs.getString("CategoryName"));
                t.setSumQuantity(rs.getInt("SumQuantity"));
                t.setSumPrice(rs.getDouble("SumPrice"));
                list.add(t);
            }
        } catch (SQLException e) {
        }
        
        return list;
    }
    public static void main(String[] args) {
        DAO d = new DAO();
        System.out.println(d.getThongke());
    }


}
