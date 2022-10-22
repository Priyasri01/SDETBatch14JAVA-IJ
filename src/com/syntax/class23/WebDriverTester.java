package com.syntax.class23;

public class WebDriverTester {

    public static void main(String[] args) {

        IWebDriver[] webDriver ={new ChormeDriver(),new FireFox()};

        for(int i=0; i< webDriver.length; i++){

            webDriver[i].openBrowser();
            webDriver[i].closeBrowser();
            webDriver[i].maximizeWindow();
            webDriver[i].findElements();

            System.out.println("**************************************************");
        }

    }
}
