package day53_Interface.WebDriverTask;

public class FirefoxDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("Firefox Driver - navigating to: "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox Driver locating element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("Firefox driver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("Firefox Driver - quit");
    }

    @Override
    public void close() {
        System.out.println("Firefox Driver - closing the tab");
    }
}
