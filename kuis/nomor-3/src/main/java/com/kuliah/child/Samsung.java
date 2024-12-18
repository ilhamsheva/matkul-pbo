package com.kuliah.child;

import com.kuliah.implement.Phone;

public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Samsung volume: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Samsung volume: " + volume);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
