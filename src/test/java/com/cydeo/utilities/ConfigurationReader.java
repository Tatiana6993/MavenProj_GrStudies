package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

 /*
    In this class we woll be creating the re-usable logic to read from
    configuration
    properties file
     */

    //1.-Create the Properties object (create object)
    //make it private so its not accesible from outside of the class and static to be used inna static method

    private static Properties properties = new Properties();

    //creating a static block
    static{
        //2-Open file using FileInputStream
        try{
            FileInputStream file = new FileInputStream("configuration.properties");

            //3-Load the "properties" object with "file" (load properties)
            properties.load(file);

            //close the file in the memory, it has been alrwady loaded in thr object
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH");
            e.printStackTrace();
        }
    }



    //create a utility method to use the object to read
    //4- Use "properties"object to read from the fie (read properties)
    public  static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
