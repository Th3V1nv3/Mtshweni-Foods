package mtsweni.sh;

import java.util.ArrayList;

public class Product 
{
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double total(ArrayList<Product> products)
    {
        double finalTotal = 0;
        for (Product product : products) {
            finalTotal = finalTotal + (product.getPrice()*product.getQuantity());
        }
        
        return finalTotal;
    }
    public int numProducts(ArrayList<Product> products)
    {
        int num = 0;
        for (Product product : products) {
            num = num + product.getQuantity();
        }
        return num;
    }
    
}
