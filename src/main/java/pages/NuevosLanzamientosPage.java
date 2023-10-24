package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NuevosLanzamientosPage {

    private WebDriver driver;
    private By nuevosLanzamientosTitle = By.id("Nuevos-lanzamientos");


    public NuevosLanzamientosPage(WebDriver driver){
        this.driver = driver;
    }

    public String getNuevosLanzamientosTitle() {
        return driver.findElement(nuevosLanzamientosTitle).getText();
    }


}
