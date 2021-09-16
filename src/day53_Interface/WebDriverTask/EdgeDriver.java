package day53_Interface.WebDriverTask;

public class EdgeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Edge Driver - navigating to: "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Edge Driver locating element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("Edge driver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("Edge Driver - quit");
    }

    @Override
    public void close() {
        System.out.println("Edge Driver - closing the tab");
    }
}
