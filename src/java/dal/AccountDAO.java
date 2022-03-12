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

/**
 *
 * @author anhqu
 */
public class AccountDAO extends DBContext{
     public Account login(String user, String pass){
         String sql ="select * from Account\n" +
                "where [user] = ? and pass = ?";
         try {
             PreparedStatement st = connection.prepareStatement(sql);
             
             st.setString(1, user);
             st.setString(2, pass);
             ResultSet rs = st.executeQuery();
             if (rs.next()) {                 
                 return new Account(rs.getInt(1), 
                         rs.getString(2), 
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getString(6),
                         rs.getInt(7));
             }
         } catch (Exception e) {
         }
         return null;
     }
     
      public Account checkAccountExist(String user){
         String sql ="select * from Account\n" +
                "where [user] = ?";
         try {
             PreparedStatement st = connection.prepareStatement(sql);
             
             st.setString(1, user);         
             ResultSet rs = st.executeQuery();
             while (rs.next()) {                 
                 return new Account(rs.getInt(1), 
                          rs.getString(2), 
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getString(6),
                         rs.getInt(7));
             }
         } catch (Exception e) {
         }
         return null;
     }
     
        public void register(String name, String phone,String address, String user, String pass){
         String sql ="insert into Account values (?,?,?,?,?,0);";
         try {
             PreparedStatement st = connection.prepareStatement(sql);             
             st.setString(1, name);
             st.setString(2, phone);
             st.setString(3, address);
             st.setString(4, user);
             st.setString(5, pass);
             
             st.executeUpdate();
             
         } catch (SQLException e) {
         }
         
     }
         public List<Account> getAllaccount(){
            String sql = "select * from Account";
            List<Account> list = new ArrayList<>();
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {                    
                    list.add(new Account(rs.getInt(1),
                             rs.getString(2), 
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getInt(7)));
                }
            } catch (Exception e) {
            }
            return list;
        }
        
        public void BlockAccount(String aid){
            String sql = "update Account set [isAdmin] = -1 where [uID] = ?";
            try {
               PreparedStatement st = connection.prepareStatement(sql);
               st.setString(1, aid);          
               st.executeUpdate();
            } catch (Exception e) {
            }
        }
           public void UnBlockAccount(String aid){
            String sql = "update Account set [isAdmin] = 0 where [uID] = ?";
            try {
               PreparedStatement st = connection.prepareStatement(sql);
               st.setString(1, aid);          
               st.executeUpdate();
            } catch (Exception e) {
            }
        }
        public void UpdateProfile(String name,String phone,String address,String user,String pass, String uid){
            String sql ="update Account set [name] = ?,[phone] = ? ,[address] = ? , [user] = ? ,[pass]= ? \n" +
                "where [uID] = ?";
            try {
             PreparedStatement st = connection.prepareStatement(sql);             
             st.setString(1, name);
             st.setString(2, phone);
             st.setString(3, address);
             st.setString(4, user);
             st.setString(5, pass);
             st.setString(6, uid);
             st.executeUpdate();
             
         } catch (SQLException e) {
         }
        }
         public Account getAccountByuid(String uid){
            String sql = "select * from Account where [uID] = ?";          
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1, uid);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {        
                    return (new Account(rs.getInt(1),
                             rs.getString(2), 
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getInt(7)));
                }
            } catch (Exception e) {
            }
           return null; 
        }
  
}
