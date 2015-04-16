package com.javarush.test.level16.lesson13.home09;

import java.io.IOException;

/**
 * Created by User on 16.04.15.
 */
public class Read3Strings extends Thread
{
    private String result = "";
    @Override
    public void run()
    {
        try {
            String s1 = Solution.reader.readLine();
            String s2 = Solution.reader.readLine();
            String s3 = Solution.reader.readLine();
            this.result = s1+" "+s2+" "+s3;
        }
        catch (IOException e) {
            
        }
    }

    public String getResult()
    {
        return result;
    }
}
