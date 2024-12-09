package com.kuliah.child;

// import package parent
import com.kuliah.parent.Animal;
public class Dog extends Animal{
    // constructor
    public Dog(String nama){
        super(nama);
    }

    // override method
    @Override
    public void speak(){
        System.out.println(nama + " says: Woof!");
    }
}
