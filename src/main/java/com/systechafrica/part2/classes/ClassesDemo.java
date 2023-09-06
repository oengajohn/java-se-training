package com.systechafrica.part2.classes;

public class ClassesDemo {
    public static void main(String[] args) {
        ClassesDemo app = new ClassesDemo();
        app.interns();
        // app.calculator();

    }

    public void calculator() {
        // Using methods
        //! constructors are special methods used to create instances of a particular class.
        //! they have same name as the class
        //! they do not have return types
        Calculator calculator = new Calculator();
        calculator.displayWelcomeMessage(); // Calling a method without parameters and return type
        int result = calculator.add(5, 3); // Calling a method with parameters and return type
        System.out.println("The sum is: " + result);
    }

    public void interns() {
        Intern ann = new Intern();
        ann.name = "Annliza";
        ann.email = "";
        ann.phoneNumber = "";
        ann.doAssignment();
        ann.attendClass();

        Intern asule = new Intern("Asule","","");
        asule.doAssignment();
        asule.attendClass();
        System.out.println(asule.name);

        for (int i = 1; i <= 10; i++) {
            Intern intern = new Intern("Intern-"+i, ""+i,""+i);
            System.out.println(intern.name);
        }

    }

    public void carInstances() {
        Car forester = new Car();
        forester.color = "blue";
        forester.speed = 60;

        // drive
        forester.startEngine();
        forester.accelerate();

        Car mercedes = new Car();
        mercedes.color = "grey";
        mercedes.speed = 80;

        // drive
        mercedes.startEngine();
        mercedes.accelerate();

    }
}
