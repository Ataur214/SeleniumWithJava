package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;

    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.quit();
    }

    public static void main(String[] args) {

        BaseTest test = new BaseTest();
        test.setup();

    }
}
