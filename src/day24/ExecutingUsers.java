package day24;

public class ExecutingUsers {
    public static void main(String[] args) {
        User u1 = new User("Jason", 24, "jason.roger@janbask.com", "test@1234", 567657); //Call the default constructor
        System.out.println(u1.name);//Jason
        System.out.println(u1.age);//24
        System.out.println(u1.email);//jason.roger@janbask.com
        System.out.println(u1.password);//test@1234
        System.out.println(u1.phone);//

        System.out.println("==============================================");
        User u2 = new User("kerrie.wright@janbask.com", "test@4321");
        System.out.println(u2.name);//null
        System.out.println(u2.age); //0
        System.out.println(u2.email);//kerrie.wright@janbask.com
        System.out.println(u2.password);//test@4321
        System.out.println(u2.phone);//0

        System.out.println("==============================================");

        User u3 = new User("Lee", 34, 765745);
        System.out.println(u3.name);//Lee
        System.out.println(u3.age); //34
        System.out.println(u3.email);//null
        System.out.println(u3.password);//null
        System.out.println(u3.phone);//765745

    }
}
