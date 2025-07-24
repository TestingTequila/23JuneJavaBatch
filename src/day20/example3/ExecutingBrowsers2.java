package day20.example3;

public class ExecutingBrowsers2
{
    public static void main(String[] args) {
        Browser2 br= new Browser2();
        String browserName =br.launchBrowser("Tornado");
        System.out.println(browserName);
    }
}
