package model;
import java.io.*;

import model.ProductInterface;

public class Product implements java.io.Serializable, ProductInterface{

    private double price;
    private String description;
    private String name;
    private int availableQuantity;


    public void setPrice(double price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAvailableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }

    //getters
    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getAvailableQuantity(){
        return availableQuantity;
    }


}