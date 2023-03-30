package model;

import java.util.Scanner;
import java.util.ArrayList;

import model.Account;

import model.ProductInterface;
import model.Product;

import model.ProductsInterface;
import model.ProductsContainer;

public class Cart {
    private Account buyer;
    private ArrayList<ProductInterface> cart =  new ArrayList<ProductInterface>();

    public void setBuyer(String name){

    }
    public void addToCart(ProductInterface prd){
        this.cart.add(prd);
    }

}