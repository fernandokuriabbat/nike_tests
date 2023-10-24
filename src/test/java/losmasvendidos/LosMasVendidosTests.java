package losmasvendidos;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LosMasVendidosTests extends BaseTests {

    @Test
    public void redirectLosMasVendidos(){
        var losMasVendidosPage = homePage.clickLosMasVendidos();
        assertTrue(losMasVendidosPage.getLosMasVendidosTitle().contains("Los más vendidos"),
                "Title text is incorrect");
    }
}
