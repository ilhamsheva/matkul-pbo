package com.kuliah.child;

import com.kuliah.implement.Phone;

public class Iphone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Iphone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("iPhone volume: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("iPhone volume: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
