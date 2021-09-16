package day53_Interface.WebDriverTask;

public class AutomationTesting {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.findElement("XPath");
        driver.getTitle();
        driver.close();
        driver.quit();

        System.out.println("---------------------------");

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.mozilla.org/en-US/firefox/");
        driver2.findElement("XPath");
        driver2.getTitle();
        driver2.close();
        driver2.quit();

        System.out.println("---------------------------");

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.opera.com/");
        driver3.findElement("XPath");
        driver3.getTitle();
        driver3.close();
        driver3.quit();

        System.out.println("---------------------------");

        EdgeDriver driver4 = new EdgeDriver();
        driver4.get("https://www.opera.com/");
        driver4.findElement("XPath");
        driver4.getTitle();
        driver4.close();
        driver4.quit();

        System.out.println("---------------------------");

        WebDriver driver5 = new ChromeDriver();
        driver5.get("www.amazon.com");

        System.out.println("---------------------------");

        WebDriver driver6 = getDriver("firefox");
        driver6.get("firefox");

        //   WebDriver driver7 = new ChromeDriver();


    }


    public static WebDriver getDriver(String name) {

        switch (name) {
            case "chrome":
                return new ChromeDriver();

            case "firefox":
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Invalid Browser name");

        }

    }
}



