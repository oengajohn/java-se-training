package com.systechafrica.atmmachine;

import com.systechafrica.constants.Constants;

public class ATMMachine {
    public static void main(String[] args) {
        double amount = 350.00;

        double charges = Constants.RATE * amount ;
    }
}
