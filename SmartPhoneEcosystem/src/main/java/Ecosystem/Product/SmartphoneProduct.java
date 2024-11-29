/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Product;

/**
 *
 * @author sunny
 */
public class SmartphoneProduct {
    // Instance variables
    private String name;
    private int id;
    private double budget;
    private double cost;
    private static int count = 0;

    // Constructor
    public SmartphoneProduct(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.cost = 0.0; 
        ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name;
    }
}

