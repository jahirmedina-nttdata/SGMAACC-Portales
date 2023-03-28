package org.medioAmbiente.PPB002.CAP_F_014.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.html5.LocationContext;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@DefaultUrl("/medioambiente/portal/el-tiempo")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_cmaotAemetModule_INSTANCE_a9pE4goNitHU_complete-view\"]//a")
    private WebElementFacade Enlace;

    public void cargarpagina() throws AWTException {
        Map prefs =new HashMap<String,Object>();
        prefs.put("profile.default_content_setting_values.geolocation",1);
        ChromeOptions options= new ChromeOptions();
        options.setExperimentalOption("prefs",prefs);
        ChromeDriver driver= new ChromeDriver(options);
        ((LocationContext)driver).setLocation(new Location(37.3828300,-5.9731700,0));
       open();
       waitFor(5).second();
        Robot robot = new  Robot();
        try {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void aceptarCookies() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    public void visualizarTiempo() throws InterruptedException {
        List<WebElement> Provincia = getDriver().findElements(By.xpath("//*[@id=\"_cmaotAemetModule_INSTANCE_a9pE4goNitHU_provincia-button\"]"));
        List<WebElement> Municipio = getDriver().findElements(By.xpath("//*[@id=\"_cmaotAemetModule_INSTANCE_a9pE4goNitHU_municipio-button\"]"));
        if (Provincia.size() != 0 && Municipio.size() !=0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Provincia y Municipio");
        }
waitFor(20).second();
    }

    public void clickarEnlace()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        List<WebElement> enlace = getDriver().findElements(By.xpath("//*[@id=\"_cmaotAemetModule_INSTANCE_a9pE4goNitHU_complete-view\"]//a"));
        if (enlace.size() != 0) {
            Enlace.click();
        }else{
        }
    }
}
