/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wanyuchiu
 */
public class Product {
    private String name;
    private int price;
    private int id;
    
    //private static int count = 0;
    private ArrayList<Feature> featureValues;
    private static int count = 0;

    

    public Product() {
        count++;
        id = count;
        featureValues = new ArrayList<Feature>();
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatureValues() {
        return featureValues;
    }

    public void setFeatureValues(ArrayList<Feature> featureValues) {
        this.featureValues = featureValues;
    }

   
    public Feature addNewFeature() {
        
        Feature newFeature = new Feature();
        featureValues.add(newFeature);
        return newFeature;
    }

    public ArrayList<Feature> getFeatures() {
        return featureValues;
    }

    @Override
    public String toString() {
        return name;
    }
}