package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LosMasVendidosPage {

    private WebDriver driver;
    private By losMasVendidosTitle = By.id("Los-más-vendidos");
    private By nikeLogoButton = By.xpath("//div[contains(@class, 'pre-l-logo prl0-sm top-stack-context')]");
    private By jordanLogoButton = By.xpath("//li[contains(@class, 'pre-brand-item')]");

    public LosMasVendidosPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLosMasVendidosTitle() {
        return driver.findElement(losMasVendidosTitle).getText();
    }

    public HomePage clickNikeHomeButton(){
        driver.findElement(nikeLogoButton).click();
        return new HomePage(driver);
    }

    public HomePage clickJordanHomeButton(){
        driver.findElement(jordanLogoButton).click();
        return new HomePage(driver);
    }


}
