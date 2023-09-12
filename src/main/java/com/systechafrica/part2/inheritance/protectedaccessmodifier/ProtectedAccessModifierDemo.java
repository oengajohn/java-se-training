package com.systechafrica.part2.inheritance.protectedaccessmodifier;

import com.systechafrica.part2.inheritance.protectedaccessmodifier.nomenclature.kingdom.Kingdom;

public class ProtectedAccessModifierDemo {
    
    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        // kingdom.sampleMethod();  ! Does not compile
    }
}
