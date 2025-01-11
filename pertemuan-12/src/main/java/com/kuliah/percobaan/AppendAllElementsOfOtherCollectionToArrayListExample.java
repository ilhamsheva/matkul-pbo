package com.kuliah.percobaan;

import java.util.ArrayList;

public class AppendAllElementsOfOtherCollectionToArrayListExample 
{ 
 
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) { 
 
        //create an ArrayList object 
        ArrayList arrayList = new ArrayList(); 
 
        //Add elements to Arraylist 
        arrayList.add("1"); 
        arrayList.add("2"); 
        arrayList.add("3"); 
 
        //create a new Vector object 
        ArrayList v = new ArrayList(); 
        v.add("4"); 
        v.add("5"); 
 
        //append all elements of Vector to ArrayList 
        arrayList.addAll(v); 
 
        //display elements of ArrayList 
 
        System.out.println("After appending all elements of Vector, ArrayList contains.."); 
 
    for (int i = 0; i < arrayList.size(); i++) { 
            System.out.println(arrayList.get(i)); 
        } 
    } 
} 