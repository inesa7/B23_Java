package day47_Recap;

import utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {

    public void method(){

        System.out.println(publicVariable);
        System.out.println(protectedVariable); // protected can be visible only if there is inheritance sub class
        // System.out.println(defaultVariable);
        // System.out.println(privateVariable); //private is not visible outside the class

        publicMethod();
        protectedMethod();
        // defaultMethod(); // default is only visible within the same package
        // privateMethod(); //private is not visible outside the class



    }




}
