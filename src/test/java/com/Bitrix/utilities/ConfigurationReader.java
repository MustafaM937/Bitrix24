package com.Bitrix.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1. we created a properties object
    private static Properties properties = new Properties();

    static {


        //2. we got our path and stored it in a string or directly pass into filInputString ojb
        String path = "Configuration.Properties";
        //3. we need to open the file
        try {
            FileInputStream file = new FileInputStream(path);
            //4. we need to load the file to properties obj
            properties.load(file);

            //5. we need to close the file
            file.close();
        } catch (IOException e) {
            System.out.println("Properties file not found...");
        }
    }


    //our own custom method to read/get values from the configuration.properties file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
