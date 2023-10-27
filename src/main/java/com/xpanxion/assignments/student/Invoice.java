package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base {
    private int id;
    private double total;
    private ArrayList<Product> prodList = new ArrayList<>();

    public Invoice(int id){
        super(id);
    }

    public void addProduct(Product prod){
        prodList.add(prod);
    }

    public void calculateTotal(){
        for (int i = 0; i < prodList.size(); i++){
            total += prodList.get(i).getCost();
        }
    }

    public double getTotalCost(){
        calculateTotal();
        return total;
    }
}
