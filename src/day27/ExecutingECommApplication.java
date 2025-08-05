package day27;

public class ExecutingECommApplication
{
    public static void main(String[] args) {
        ECommApplication eComm= new ECommApplication();
//        eComm.login("jason.roger@janbask.com", "test@1234");
//        eComm.doSearch("Samsung");
//        eComm.addToCart("Samsung Mobile");
//        eComm.doPayment("4534534", "565");
//        eComm.generateOrder();
//        eComm.logOut();

        eComm.login("jason.roger@janbask.com", "Test@1234").doSearch("Search").doPayment("54654654", "test@1234").logOut();
        eComm.login().doSearch("Apple").logOut();

    }
}
