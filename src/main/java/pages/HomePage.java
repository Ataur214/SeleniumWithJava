package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

   private WebDriver driver;
   private By formauthenticationLin = By.linkText("Form Authentication");

   public HomePage(WebDriver driver){
      this.driver = driver;
   }

   private void clickLink(String linkText){
      driver.findElement(By.linkText(linkText)).click();
   }

   public LoginPage clickformauthenticationLin(){
      clickLink("Form Authentication");
      return new LoginPage(driver);
   }

   public HoversPage hoverOnImage(){
      clickLink("Hovers");
      return new HoversPage(driver);
   }
}
