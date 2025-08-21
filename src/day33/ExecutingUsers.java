package day33;

import java.util.Arrays;

public class ExecutingUsers
{
    public static void main(String[] args) {
        //Users users= new Users();

        //Company company= new Company();

        String language = "Java_Python_C#_Ruby_Java Script";
        String[] programs= language.split("_");
        for (int i=0;i<programs.length; i++)
        {
            if(programs[i].equals("C#"))
            {
                programs[i]="DotNet";
            }
        }


        System.out.println(Arrays.toString(programs));

    }
}
