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
import model.Cart;
import model.Item;
import model.Order;
import model.OrderDetail;

/**
 *
 * @author anhqu
 */
public class OrderDAO extends DBContext {

    public void addOrder(Account a, Cart c) {
        String sql = "insert into [Order] values (?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, a.getId());
            st.setDouble(2, c.getTotalMoney());
            st.executeUpdate();
            // lay ra id cua order vua add

            String sqll = "select top 1 id from [Order] order by id desc";
            PreparedStatement st1 = connection.prepareStatement(sqll);
            ResultSet rs = st1.executeQuery();
            //add vao bang Orderdetail
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : c.getItems()) {
                    String sql2 = "insert into [OrderDetail] values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getProduct().getId());
                    st2.setInt(3, i.getQuantity());
                    st2.setDouble(4, i.getPrice());
                    st2.executeUpdate();

                }
            }
        } catch (Exception e) {
        }
    }
    public void updatequantity(int quantity, int id){
        String sql = "update product set Quantity = ? where id = ?";
        try {
             PreparedStatement st = connection.prepareStatement(sql);
             st.setInt(1, quantity);
             st.setInt(2, id);
             st.executeUpdate();
        } catch (Exception e) {
        }
    }
 public Order getNewestOrd() {
        String sql = "SELECT TOP 1 * FROM [Order] ORDER BY id DESC";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order();
                o.setId(rs.getInt(1));
                o.setCusid(rs.getInt(2));
                o.setTotal(rs.getDouble(3));
            
                return o;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

 public List<OrderDetail> getByOrderID(int oid) {
        List<OrderDetail> list = new ArrayList<>();
        String sql = "SELECT * FROM OrderDetail WHERE OrderID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                OrderDetail od = new OrderDetail();
                od.setOid(rs.getInt(1));
                od.setPid(rs.getInt(2));
                od.setQuantity(rs.getInt(3));
                od.setPrice(rs.getDouble(4));
               
                list.add(od);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
