package day25;

public class Browsers
{
    //checkOS
    //checkRAM
    //checkBrowserVersion
    //checkBrowserServices
    //launchBrowser

    private   void checkOS()
    {
        System.out.println("Checking OS.....");
    }
    private  void checkRAM()
    {
        System.out.println("Checking RAM.....");
    }

    private  void checkBrowserVersion()
    {
        System.out.println("Checking browser version.....");
    }

    private  void checkBrowserServices()
    {
        System.out.println("Checking checkBrowserServices.....");
    }

    public  void launchBrowser()
    {
        checkOS();
        checkRAM();
        checkBrowserVersion();
        checkBrowserServices();
        System.out.println("Launch Browser .....");
    }
}
