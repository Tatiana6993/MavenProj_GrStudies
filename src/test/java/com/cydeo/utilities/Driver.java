package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor to remove access to this object

    private Driver(){   //no objects can be created from this class, this constructor
        //can only be called inside thsi class

    }

    //we make the WebDriver private to close the access from the outside of the class
    //we making it static cuz we will use it in a static method and we want it to run before anything else

    private static WebDriver driver;                 //default value = null



    //Create a re-usable utility method which will return the same driver instance once we call it
    // -If an instance doesn't exist , it will create first, and then it will always return same instance.
    public static WebDriver getDriver(){             //singleton logic
        if (driver==null){
            //we will read our browserType fromconfiguration.properties file.
            //this wa we can control which browser is open from outsid eof our code

            String browserType = ConfigurationReader.getProperty("browser");

            // Depending on the browserType returned from the configuration.properties,switch statement will
            // determine the "case" and open the matching browser.

            switch (browserType.toLowerCase()){
                case "chrome":
                  //  WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":
                   // WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "edge":
                  //  WebDriverManager.edgedriver().setup();
                    driver= new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }


        }
        return driver;
    }




    public static void closeDriver(){
        if (driver != null){  //means we had created the driver , we used it
            driver.quit();    //this line will kill the currently existing driver completely,it will not exist going forward
            driver=null;     //instead of non existing we assign the value back no null so that my singleton can
            //create a new one if needed
        }
    }

}
