package navigation;

import base.BaseTests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NavigationTests extends BaseTests {

    /*************************************************
     * NOTE: These tests do not assert anything.
     * In the video, we used this code to demonstrate
     * window management
     *************************************************/

//    @Test
//    public void testNavigator(){
//        homePage.clickDynamicLoading().clickExample1();
//        getWindowManager().goBack();
//        getWindowManager().refreshPage();
//        getWindowManager().goForward();
//        getWindowManager().goTo("https://google.com");
//    }
//
//    @Test
//    public void testSwitchTab(){
//        homePage.clickMultipleWindows().clickHere();
//        getWindowManager().switchToTab("New Window");
//    }

    @Test
    public void testNikeHomeButton(){
        var losMasVendidosPage = homePage.clickLosMasVendidos();
        var homePage = losMasVendidosPage.clickNikeHomeButton();
        String currentUrl = homePage.getCurrentUrl();
        assertEquals("https://www.nike.com/mx/", currentUrl);
    }

    @Test
    public void testJordanHomeButton(){
        var losMasVendidosPage = homePage.clickLosMasVendidos();
        var homePage = losMasVendidosPage.clickJordanHomeButton();
        String currentUrl = homePage.getCurrentUrl();
        assertEquals("https://www.nike.com/mx/jordan", currentUrl);
    }
}


