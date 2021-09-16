package day47_Recap.browsersTask;

public class BrowserObjects {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.open(); // opens Chrome browser
        chrome.close();

        Firefox firefox = new Firefox();
        firefox.open(); // opens Firefox browser
        firefox.close();

        Opera opera = new Opera();
        opera.open(); // opens Opera browser
        opera.close();

        Safari safari = new Safari();
        safari.open();
        safari.close();

        Edge edge = new Edge();
        edge.open();
        edge.close();



    }
}
