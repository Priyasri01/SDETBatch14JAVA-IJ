package GroupProject02;

public interface IWebDriver {

    String getTitle();
     void open();
     void close();

}

interface TakesScreenshot {

    void getScreenshot();

}
interface RemoteWebDriver extends TakesScreenshot,IWebDriver{

    void navigate();




}
