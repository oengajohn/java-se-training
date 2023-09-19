package com.systechafrica.part2.interfaces;

public class MobileCharger implements ThreePinPlug {

    @Override
    public boolean plugIn() {
        System.out.println("mobile charger connected");
        return true;
    }

    @Override
    public boolean plugOut() {
        System.out.println("mobile charger disconnected");
        return true;
    }
    public void printInfo(){
        System.out.println("In the Mobile Charger");
    }

}
