/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardealershipsystem;

/**
 *
 * @author HP
 */
public class Truck extends Vehicle {
    double payloadCapacity;

    public Truck(double payloadCapacity, String modle, String tradeMark, double price) {
        super(modle, tradeMark, price);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"Truck{" + "payloadCapacity=" + payloadCapacity + '}';
    }
    
    
}
