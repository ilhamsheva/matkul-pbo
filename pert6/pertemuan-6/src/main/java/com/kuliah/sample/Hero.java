package com.kuliah.sample;

class Hero {
    // Atribute
    protected String name;
    private int damage, health;

    // Constructor
    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    // Method setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method setter for damage
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Method setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Method getter for name
    public String getName() {
        return this.name;
    }

    // Method getter for damage
    public int getDamage() {
        return this.damage;
    }

    // Method getter for health
    public int getHealth() {
        return this.health;
    }

    void display() {
        System.out.println("Name    : " + this.name);
        System.out.println("Damage  : " + this.damage);
        System.out.println("Health  :  " + this.health);
    }

    public static void main(String[] args) {
        // buat object
        Hero hero1 = new Hero("Superman", 100, 100);
        Hero hero2 = new Hero("Batman", 90, 100);

        // Menampilkan objek
        System.out.println("Hero Pertama");
        hero1.display();
        System.out.println("Hero Kedua");
        hero2.display();
    }
}