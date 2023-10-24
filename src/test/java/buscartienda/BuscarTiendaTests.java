package buscartienda;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BuscarTiendaTests extends BaseTests {

    @Test
    public void testBuscadorBuscarTienda(){

        var buscarTiendaPage = homePage.clickBuscarTienda();
        String expectedCity = "houston";
        buscarTiendaPage.searchAndSelectFirstOption(expectedCity);

        String actualCity = buscarTiendaPage.getSearchBoxAddedText().toLowerCase();
        System.out.println("Actual city in search box: " + actualCity);
        actualCity = buscarTiendaPage.removeAccents(actualCity);

        assertTrue(actualCity.contains(expectedCity), "Actual city does not contain the expected city name.");
    }

}
