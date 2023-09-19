package com.systechafrica.part2.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        ThreePinPlug mc = new MobileCharger();
        ThreePinPlug lc = new LaptopCharger();

        mc.plugIn();
        mc.plugOut();

        lc.plugIn();
        lc.plugOut();

        Square sq = new Square();
        System.out.println(sq.calculateArea(5, 5));
        System.out.println(sq.calculatePerimeter(5, 5));
        // System.out.println(Square.MY_NAME);
        // System.out.println(Square.MY_NAME_Full);
        System.out.println(sq.sum(2,3));

        UserController uc = new UserControllerImpl();
        User user = new User("001","Mhusika");
        User createdUser = uc.createUser(user);
        
        System.out.println(createdUser);
    }
}
