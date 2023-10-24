package nuevoslanzamientos;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NuevosLanzamientosTests extends BaseTests {

    @Test
    public void redirectNuevosLanzamientos(){
        var nuevosLanzamientosPage = homePage.clickNuevosLanzamientos();
        assertTrue(nuevosLanzamientosPage.getNuevosLanzamientosTitle().contains("Nuevos lanzamientos"),
                "Title text is incorrect");
    }
}
