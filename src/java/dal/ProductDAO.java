/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Category;
import model.Product;

/**
 *
 * @author anhqu
 */
public class ProductDAO extends DBContext{
  
    public  List<Product> getAllProduct(){
        List<Product> list = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3), 
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
     public  List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>();
        String sql = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (SQLException e) {
        }
        return list;
    }
     
     public  List<Product> getProductbyCID(String cid){
        List<Product> list = new ArrayList<>();
        String sql = "select * from product \n" +
                      "where cateID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, cid);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3), 
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (SQLException e) {
        }
        return list;
    } 
     
      public Product getProductbyID(String id){
        String sql = "select * from product \n" +
                      "where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {                
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3), 
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8));
            }
        } catch (SQLException e) {
        }
        return null;
    } 
     public  List<Product> SearchbyName(String txt){
        List<Product> list = new ArrayList<>();
        String sql = "select * from product\n" +
                    "where [name] like '%'+ ? +'%' \n" +
                      "order by price" ;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, txt);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3), 
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (SQLException e) {
        }
        return list;
    } 
    
    
        public void deleteProduct(String pid){
            String sql= "delete from  OrderDetail where ProductID = ?\n" +
                            "delete from product where id = ?";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, pid);
                st.setString(2, pid);
                st.executeUpdate();
            } catch (Exception e) {
            }
        }
        public void updateProduct(String pid,String name,String image,String price,String title,String description,String quantity,String categoryID){
            String sql = "update product set  [name] = ?, [image] = ?, price = ?,title = ?,[description] = ?,Quantity = ?, cateID = ?  \n" +
                        "where id = ?";
            try {
              PreparedStatement st = connection.prepareStatement(sql);
              st.setString(1, name);
              st.setString(2, image);
              st.setString(3, price);
              st.setString(4, title);
              st.setString(5, description);
              st.setString(6, quantity);
              st.setString(7, categoryID);             
              st.setString(8, pid);
              st.executeUpdate();
            } catch (Exception e) {
            }
        }
        public void InsertProduct(String name,String image,String price,String title,String description,String quantity,String categoryID){
            String sql = "insert into [product] ([name],"
                    + " [image], "
                    + "[price], "
                    + "[title], "
                    + "[description], "
                    + "[Quantity], "
                    + "[cateID]) "
                    + "VALUES (? , ?, ?, ?, ?,?, ?)";
            try {
              PreparedStatement st = connection.prepareStatement(sql);
              st.setString(1, name);
              st.setString(2, image);
              st.setString(3, price);
              st.setString(4, title);
              st.setString(5, description);
              st.setString(6, quantity);
              st.setString(7, categoryID);           
              st.executeUpdate();
            } catch (Exception e) {
            }
        }
       
     public List<Product> getAllProductByPage(List<Product> list, int start, int end){
        ArrayList<Product> arr = new ArrayList<>();
        for(int i = start; i < end; i++){
            arr.add(list.get(i));
        }
        return arr;
    }
  
      public  List<Product> getAllProductRandom(){
        List<Product> list = new ArrayList<>();
        String sql = "SELECT TOP 4 * FROM product\n" +
                     "ORDER BY 3";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3), 
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (SQLException e) {
        }
        return list;
    }
}
