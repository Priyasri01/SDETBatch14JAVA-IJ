package GroupProject02;

public class ChromeDriver implements RemoteWebDriver{
    @Override
    public String getTitle() {
        return "google";
    }

    @Override
    public void navigate() {

        System.out.println("Navigate the  Google page ");

    }

    @Override
    public void open() {

        System.out.println("Opening the Google browser by using URL");

    }


    @Override
    public void getScreenshot() {

        System.out.println("Google screen shoot");

    }


    @Override
    public void close() {

        System.out.println("Closing the Google  browser by using x button");

    }
}
class  FireFoxDriver implements RemoteWebDriver{


    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void navigate() {

        System.out.println("Navigate the  Firefox page ");

    }

    @Override
    public void open() {

        System.out.println("Opening the Firefox browser by using URL");

    }

    @Override
    public void getScreenshot() {

        System.out.println("Firefox screen shoot");

    }

    @Override
    public void close() {

        System.out.println("Closing the Firefox the browser by using x button");

    }


}
class SafariDriver implements RemoteWebDriver{

    @Override
   public String getTitle(){
        return "Safari";
    }

    @Override
    public void navigate(){

        System.out.println("Navigate the  Safari page ");

    }

    @Override
    public void open(){

        System.out.println("Opening the Safari browser by using URL");


    }

    @Override
    public void getScreenshot() {

        System.out.println("Safari screen shoot");

    }

    @Override
    public void close() {

        System.out.println("Closing the Safari browser by using x button");

    }
}
