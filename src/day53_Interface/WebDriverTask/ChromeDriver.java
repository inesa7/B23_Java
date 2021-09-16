package day53_Interface.WebDriverTask;

public class ChromeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("Chrome Driver - navigating to: "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chrome Driver locating element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("Chrome driver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("Chrome Driver - quit");
    }

    @Override
    public void close() {
        System.out.println("Chrome Driver - closing the tab");
    }


}
