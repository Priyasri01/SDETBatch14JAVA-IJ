package com.syntax.class21;

public class BrowserOverriding {

    void openBrowser(){
        System.out.println("Opening a Browser");

    }

    void navigate(){

        System.out.println("Opening the URL");
    }

    void test(){

        System.out.println("Testing the webpage");
    }

    void closeBrowser(){

        System.out.println("closing the browser");
    }
}
class Chorme extends BrowserOverriding {

    @Override
    void openBrowser() {
        System.out.println("Opening the browser in less than 1 sec");

    }
    class Firefox{

        void openBrowser() {
            System.out.println("Opening the browser in less than 1 sec");

        }

    }
}
