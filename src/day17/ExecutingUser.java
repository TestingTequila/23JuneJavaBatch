package day17;

public class ExecutingUser {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Ravi";
        u1.age = 32;
        u1.city = "New Delhi";

        User u2 = new User();
        u2.name = "Anjali";
        u2.age = 24;
        u2.city = "NY";

        User u3 = new User();
        u3.name = "Kareem";
        u3.age = 42;
        u3.city = "Ohio";

        System.out.println(u1.name +", " + u1.age +", " + u1.city);
        System.out.println(u2.name +", " + u2.age +", " + u2.city);
        System.out.println(u3.name +", " + u3.age +", " + u3.city);


        System.out.println("================u1=u2======================");

        u1=u2; //u1 has broken its original connection and is pointing where u2 is pointing

        System.out.println(u1.name +", " + u1.age +", " + u1.city);//Anjali
        System.out.println(u2.name +", " + u2.age +", " + u2.city);//Anjali
        System.out.println(u3.name +", " + u3.age +", " + u3.city);//Kareem

        System.out.println("================u2=u3======================");
        u2=u3; //u2 will break its original connection and will start pointing where u3 is pointing
        System.out.println(u1.name +", " + u1.age +", " + u1.city);//Anjali
        System.out.println(u2.name +", " + u2.age +", " + u2.city);//Kareem
        System.out.println(u3.name +", " + u3.age +", " + u3.city);//Kareem

        System.out.println("================u3=u1======================");
        u3=u1; //u3 will break its original connection and will start pointing where u1 is pointing
        System.out.println(u1.name +", " + u1.age +", " + u1.city); //Anjali
        System.out.println(u2.name +", " + u2.age +", " + u2.city); //Kareem
        System.out.println(u3.name +", " + u3.age +", " + u3.city); //Anjali


        //An object can be referred by multiple reference variable
        //if you don't want reference variable to break its connection and point to some other
        // object, make the object as final while creating it.
    }
}
