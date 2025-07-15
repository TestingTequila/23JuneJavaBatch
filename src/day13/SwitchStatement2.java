package day13;

public class SwitchStatement2
{
    public static void main(String[] args) {
        String browserName = "Chrome";
        switch (browserName)
        {
            case "IE":
                System.out.println("Launch Internet Explorer browser...");
                break;
            case "Edge":
                System.out.println("Launch Edge browser...");
                break;
            case "Chrome":
                System.out.println("Launch Chrome browser...");
                break;
            case "Safari":
                System.out.println("Launch Safari browser...");
                break;
            case "Firefox":
                System.out.println("Launch Firefox browser...");
                break;
            default:
                System.out.println("PLease provide a valid browser name....");
        }
    }
}
