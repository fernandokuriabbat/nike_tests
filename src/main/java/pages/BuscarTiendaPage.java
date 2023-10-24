package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.Normalizer;

public class BuscarTiendaPage {

    private WebDriver driver;
    private By searchLocationField = By.id("ta-Location_input");
    private By firstResultListBox = By.xpath("//li[@class='result'][1]");

    public BuscarTiendaPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchAndSelectFirstOption(String expectedCity) {
        driver.findElement(searchLocationField).sendKeys(expectedCity);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.presenceOfElementLocated(firstResultListBox));

        wait.until((WebDriver d) -> {
            String text = removeAccents(d.findElement(firstResultListBox).getText().toLowerCase());
            System.out.println("Current text of firstResultListBox: " + text);
            return !text.equals("loading...") && text.contains(removeAccents(expectedCity.toLowerCase()));
        });

        driver.findElement(firstResultListBox).click();
    }

    public String getSearchBoxAddedText(){
        return driver.findElement(searchLocationField).getAttribute("value");
    }

    public String removeAccents(String text) {
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }


}
