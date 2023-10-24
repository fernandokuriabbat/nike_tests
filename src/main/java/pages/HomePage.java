package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private By nuevosLanzamientosTitle = By.linkText("Nuevos lanzamientos");
    private By losMasVendidosTitle = By.linkText("Los más vendidos");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public NuevosLanzamientosPage clickNuevosLanzamientos(){
        clickLink("Nuevos lanzamientos");
        return new NuevosLanzamientosPage(driver);
    }

    public LosMasVendidosPage clickLosMasVendidos(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(nuevosLanzamientosTitle)).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(losMasVendidosTitle));
        driver.findElement(losMasVendidosTitle).click();
        return new LosMasVendidosPage(driver);
    }

    public BuscarTiendaPage clickBuscarTienda(){
        clickLink("Buscar tienda");
        return new BuscarTiendaPage(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}