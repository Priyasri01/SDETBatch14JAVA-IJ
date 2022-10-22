package GroupProject02;

public class WDriverTester {
    public static void main(String[] args) {

     RemoteWebDriver[] webDriver = { new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};


        for(RemoteWebDriver webdriver : webDriver){

          System.out.println(webdriver.getTitle());
           webdriver.navigate();  //we can't use polymorphism for IwebDriver, because  this  interface don't have all the methods. so created upcasting for Remotewebdriver , beacuse it has "is/A Relationship so we created upcasting for remoteDriver.
           webdriver.open();
           webdriver.getScreenshot();
           webdriver.close();
            System.out.println("*****************************************************");
        }


    }
}
