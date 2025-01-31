package org.example;

public class Product {
    private String name; 
    private double price;



    private int count;
    public int getCount() {
        return count;
    }

    public void addCount(int newCount){
        count += newCount;

    }

    public boolean removeCount(int delCount) {
        if ((count - delCount) > 0) {
            count -= delCount;
            return true;
        }
        return false;
    }
 
     public Product(String name, double price) {
         this.name = name;
         this.price = price;
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
 }
