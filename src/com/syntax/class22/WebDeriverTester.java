package com.syntax.class22;

public class WebDeriverTester {
    public static void main(String[] args) {

       /*     Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/

        /*
        Chrome chrome = new Chrome();
        FireFox firefox= new FireFox();
        Safari safari= new Safari();

        WebDriver[] browser = {chrome,firefox,safari} //note from  line 20 to 24  we made shorter way as single line 32.
         */

 /*
        Creating objects of all Child classes and storing them in an array of
        type Web driver we can do this bcause upcasting allows us to do this
         */


       // Chrome chrome = (Chrome)new WebDriver(); This is down casting, we will get error

        WebDriver[] browsers = {new Chrome(), new Safari(), new FireFox()}; //this is polymorphism  by using upcasting
        for (WebDriver browser : browsers
        ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
            System.out.println("**************************************************");
        }

        for (int i = 0; i < browsers.length; i++) {

            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();

            System.out.println("**************************************************");
        }


    }


}





