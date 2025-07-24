package day20.example3;

public class ExecutingBrowsers
{
    public static void main(String[] args) {
        Browser br= new Browser();
        String browserName =br.launchBrowser("Safari");
        System.out.println(browserName);
    }
}
