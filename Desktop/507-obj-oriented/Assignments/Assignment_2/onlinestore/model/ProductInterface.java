package model;


public interface ProductInterface {
    public void setPrice(double price);

    public void setDescription(String description);

    public void setName(String name);

    public void setAvailableQuantity(int availableQuantity);

    //getters
    public double getPrice();

    public String getDescription();

    public String getName();

    public int getAvailableQuantity();
}