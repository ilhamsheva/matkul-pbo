package com.kuliah;

import com.kuliah.child.Car;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) {
        // Membuat objek Car
        Car car = new Car("Toyota", 4);
        car.displayInfo("Sedan"); // Output: Brand: Toyota, Type: Sedan, Doors: 4
    }
}
