package day20.example3;

public class Browser2
{
    public  String launchBrowser(String browserName)
    {
        String myBrowser = browserName + " : Is not a valid Browser Name...";

        if(browserName.equals("Chrome"))
        {
            myBrowser= "Launch Chrome Browser ";
        }
        else if(browserName.equals("Firefox"))
        {
            myBrowser = "Launch Firefox Browser";
        }
        else if(browserName.equals("Edge"))
        {
            myBrowser =  "Launch Edge Browser";
        }

        else if(browserName.equals("IE"))
        {
            myBrowser =  "Launch IE Browser";
        }

        else if(browserName.equals("Safari"))
        {
            myBrowser =  "Launch Safari Browser";
        }

        return myBrowser;
    }
}
