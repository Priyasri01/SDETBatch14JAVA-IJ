package com.syntax.class22;

public class WebDriver {

    public void startBrowser(){

        System.out.println("Starting the Browser");
    }

    public void test(){

        System.out.println("perfrom the testing");
    }
    public void closeBrowser(){

        System.out.println("closing the browser");
    }
}
class  Chrome extends WebDriver{

    public void startBrowser(){

        System.out.println("Starting the Google Chrome");
    }

    public void test(){

        System.out.println("perfrom the testing on google chrome");
    }
    public void closeBrowser(){

        System.out.println("closing the Google chrome");
    }
}
class FireFox extends WebDriver{

    public void startBrowser(){

        System.out.println("Starting the FireFox ");
    }

    public void test(){

        System.out.println("perfrom the testing on FirFox");
    }
    public void closeBrowser(){

        System.out.println("closing the FireFox ");
    }
}
class Safari extends WebDriver{

    public void startBrowser(){

        System.out.println("Starting the Safari ");
    }

    public void test(){

        System.out.println("perfrom the testing on Safari");
    }
    public void closeBrowser(){

        System.out.println("closing the Safari ");
    }

}