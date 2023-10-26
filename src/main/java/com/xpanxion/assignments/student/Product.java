package com.xpanxion.assignments.student;
public class Product {
    private int pid;
    private String name;
    private double cost;

    public Product(int pid, String name, double cost){
        this.pid = pid;
        this.name = name;
        this.cost = cost;
    }

    public int getPid(){
        return pid;
    }

    public String getName(){
        return name;
    }

    public double getCost(){
        return cost;
    }

}