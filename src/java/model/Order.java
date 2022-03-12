/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.List;

/**
 *
 * @author anhqu
 */
public class Order {
    private int id;
    private int cusid; 
    private double Total; 

    public Order() {
    }

    public Order(int id, int cusid, double Total) {
        this.id = id;
        this.cusid = cusid;
        this.Total = Total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", cusid=" + cusid + ", Total=" + Total + '}';
    }

   
}
