package com.codingdojo.model;

public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public String name() {
    	return this.name;
    }
    public double price() {
    	return this.price;
    }
}