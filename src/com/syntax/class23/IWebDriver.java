package com.syntax.class23;

public interface IWebDriver {

    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElements();
}
class ChormeDriver implements IWebDriver{ // when we want to implement the interface  in the class then we use "implements keyword"
    static String name="Google Chrome";
    @Override

    public void openBrowser() {

        System.out.println("We can open the chorme Browser by using " +name);
    }

    @Override
    public void closeBrowser() {

        System.out.println("closing the " + name);

    }

    @Override
    public void maximizeWindow() {

        System.out.println(" Maximize the " + name);

    }

    @Override
    public void findElements() {

        System.out.println("we can find the elements with the help of " + name);

    }
}
class FireFox implements IWebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the firefox ");
    }

    @Override
    public void closeBrowser() {

        System.out.println("closing the FireFox");


    }

    @Override
    public void maximizeWindow() {
        System.out.println(" Maximize the FireFox");
    }

    @Override
    public void findElements() {

        System.out.println("we can find the elements with the help of FirFox");

    }
}