package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    public HoversPage(WebDriver driver) { this.driver = driver;}
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    private By header = By.tagName("h5");

    public WebElement hoverOverFigure(int index){
        WebElement figure =  driver.findElements(figureBox).get(index);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return figure.findElement(boxCaption);
    }

    public String figureCaption(WebElement element){
        return element.findElement(header).getText();
    }
}
