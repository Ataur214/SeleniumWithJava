package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNamefield = By.id("username");
    private By passwordfield = By.id("password");
    private By loginButton = By.cssSelector("form button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUsername(String username){
        driver.findElement(userNamefield).sendKeys(username);
    }

    public void inputPasswrod(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
