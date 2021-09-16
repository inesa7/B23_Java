package day53_Interface.WebDriverTask;

public class OperaDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Opera Driver - navigating to: "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Opera Driver locating element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("Opera driver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("Opera Driver - quit");
    }

    @Override
    public void close() {
        System.out.println("Opera Driver - closing the tab");
    }
}
