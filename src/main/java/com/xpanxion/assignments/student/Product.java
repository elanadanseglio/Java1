package com.xpanxion.assignments.student;

public class Product extends Base {
    private int pid;
    private String name;
    private double cost;

    public Product(int pid, String name, double cost){
        super(pid);
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