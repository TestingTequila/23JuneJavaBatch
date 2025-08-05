package day27;

public class ECommApplication {
    public ECommApplication login() {
        System.out.println("App Login...");
        return new ECommApplication();
    }

    public ECommApplication login(String un, String pw) {
        System.out.println("App Login with Username as " + un + " and password as " + pw);
        return new ECommApplication();
    }

    public ECommApplication login(String un, int otp) {
        System.out.println("App Login with Username as " + un + " and OTP as " + otp);
        return this;
    }

    public ECommApplication doSearch(String brandName) {
        System.out.println("Search product using brand name as : " + brandName);
        return this;
    }

    public ECommApplication doSearch(String brandName, double price) {
        System.out.println("Search product using brand name as : " + brandName + " with a price as " + price);
        return this;
    }

    public ECommApplication doSearch(String brandName, String productName,  double price) {
        System.out.println("Search product using brand name as : " + brandName + " with a price as " + price + " and product name as " + productName);
        return this;
    }

    public  ECommApplication addToCart(String productName)
    {
        System.out.println("Adding " + productName + " to my cart");
        return this;
    }

    public  ECommApplication doPayment(String ccNumber, int cvv)
    {
        System.out.println("Making payment using Credit Card Number as : " + ccNumber + " and CVV as: " + cvv);
        return this;
    }

    public  ECommApplication doPayment(String paypalId, String password)
    {
        System.out.println("Making payment using paypal Account : " + paypalId + " and password as: " + password);
        return this;
    }

    public  ECommApplication doPayment(String amazonPay)
    {
        System.out.println("Making payment using Amazon API : " + amazonPay);
        return this;
    }

    public ECommApplication generateOrder()
    {
         int orderId= 546546;
        System.out.println("Generate Order Id: " + orderId);
        return this;
    }

    public  ECommApplication logOut()
    {
        System.out.println("Logging out of the Application....");
        return this;
    }
}
