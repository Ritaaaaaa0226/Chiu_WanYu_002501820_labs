/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author wanyuchiu
 */
public class MasterOrderList {
    ArrayList<Order> orderlist;

    public MasterOrderList() {      
        orderlist = new  ArrayList<Order>();
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
    
    public void addnewOrder(Order order){
        this.orderlist.add(order);
    }
    
    
}
