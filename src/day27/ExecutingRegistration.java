package day27;

public class ExecutingRegistration {
    public static void main(String[] args) {
        Registration register = new Registration("Ben", "Fletcher", 33, 5678.87, 'M');
        System.out.println(register.getfName()); //Ben
        System.out.println(register.getlName()); // Fletcher
        System.out.println(register.getAge());   //33
        System.out.println(register.getSalary()); //5678.87
        System.out.println(register.getGender()); //M
        System.out.println(register.getEmailId());//default@janbask.com
        System.out.println(register.getPassword()); //test@1234
        System.out.println(register.getConfirmPassword());//test@12


    }
}
