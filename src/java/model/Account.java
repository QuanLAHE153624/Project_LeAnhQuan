/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anhqu
 */
public class Account {
    private int id;
    private String name;
    private String phone;
    private String address;       
    private String user;
    private String pass;
    private int isAdmin;
  

    public Account() {
    }

    public Account(int id, String name, String phone, String address, String user, String pass, int isAdmin) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.user = user;
        this.pass = pass;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", user=" + user + ", pass=" + pass + ", isAdmin=" + isAdmin + '}';
    }

    
   

    
    
}
