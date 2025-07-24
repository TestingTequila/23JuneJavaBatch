package day20.example3;

public class Browser
{
    public  String launchBrowser(String browserName)
    {
        if(browserName.equals("Chrome"))
        {
            return "Launch Chrome Browser ";
        }
        else if(browserName.equals("Firefox"))
        {
            return "Launch Firefox Browser";
        }
        else if(browserName.equals("Edge"))
        {
            return "Launch Edge Browser";
        }

        else if(browserName.equals("IE"))
        {
            return "Launch IE Browser";
        }

        else if(browserName.equals("Safari"))
        {
            return "Launch Safari Browser";
        }

        return browserName + " : Is not a valid Browser Name...";
    }
}
