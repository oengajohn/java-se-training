package com.systechafrica.variables;

public class InstanceVsClassVariables {

    static String message = "Hello, World!";
    String message2 = "Hello, World!";

    String output ;

    public static void main(String[] args) {

        SampleClass vc = new SampleClass();
        System.out.println(SampleClass.name); // recommended way
        System.out.println(vc.age);
    }
    public void test(){
        System.out.println(message);
        System.out.println(message2);
        output = "Hello, World!";

    }
    public static void test2(){
        System.out.println(message);
        // System.out.println(message2); //! cannot compile cannot access variables which are not static
    }
    //?  An instance variable declared within the class can only be accessed inside NON STATIC methods of the class  and 
    //?  if you have to access them then you need to create an instance of the class

}
