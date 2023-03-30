package model;

import java.util.ArrayList;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.ProductInterface;
import model.Product;

import model.ProductsInterface;

public class ProductsContainer extends UnicastRemoteObject implements ProductsInterface{
    private ArrayList<ProductInterface> prods =  new ArrayList<ProductInterface>();

    public ProductsContainer()throws RemoteException{
        super();
        ProductInterface prodts;

        prodts = new Product();
        prodts.setName("iphone");
        prodts.setPrice(100);
        prodts.setDescription("a mobile and smart phone");
        prodts.setAvailableQuantity(500);
        this.addToProducts(prodts);

        prodts = new Product();
        prodts.setName("toothpaste");
        prodts.setPrice(20);
        prodts.setDescription("for teeth");
        prodts.setAvailableQuantity(3);
        this.addToProducts(prodts);
    }

    public void addToProducts(ProductInterface prod){
        this.prods.add(prod);
    }

    public void displayProducts(){
        System.out.println("List of items available and their corresponding information");
        int i = 1;
        for (ProductInterface prod : prods){

            System.out.println("Item" + i);
            System.out.println(" "+prod.getName());
            System.out.println(" "+prod.getAvailableQuantity());
            System.out.println(" "+prod.getDescription());
            System.out.println(" "+prod.getPrice());

             System.out.println("\n");
             i++;
        }
    }

    public Product getProduct(String name, int quantity){
        Product productTobeReturned = new Product();

        for(ProductInterface prod: prods){
            if(name == prod.getName() && quantity <= prod.getAvailableQuantity()){
                productTobeReturned = (Product)prod;

                //updated quantity
                int newQuantity = prod.getAvailableQuantity() - quantity;
                productTobeReturned.setAvailableQuantity(newQuantity);
                return productTobeReturned;
            }
        }
        return null;
    }
    
    
}