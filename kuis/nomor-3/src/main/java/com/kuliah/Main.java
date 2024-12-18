package com.kuliah;

import com.kuliah.child.Iphone;
import com.kuliah.child.Oppo;
import com.kuliah.child.Samsung;
import com.kuliah.child.Xiaomi;
import com.kuliah.implement.Phone;
import com.kuliah.parent.PhoneUser;

public class Main {
    public static void main(String[] args) {
        // Array of phones
        Phone[] phones = {new Xiaomi(), new Iphone(), new Samsung(), new Oppo()};

        // For-each loop to interact with each phone
        for (Phone phone : phones) {
            PhoneUser user = new PhoneUser(phone);

            System.out.println("\n--- Testing " + phone.getClass().getSimpleName() + " ---");
            user.turnOnThePhone();
            user.makePhoneLouder();
            user.makePhoneLouder();
            user.makePhoneSilent();
            user.turnOffThePhone();
        }
    }
}
