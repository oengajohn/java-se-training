package com.systechafrica.part2.staticclasses.nestedpackage;

import static com.systechafrica.part2.staticclasses.ATMUtils.maskCardNumber;

public class NestedPackageClassDemo {
    public static void main(String[] args) {
        String cardNumber = "1234567892456789";
        System.out.println(maskCardNumber(cardNumber));//XXXXXXXXXXXX6789
    }
}
