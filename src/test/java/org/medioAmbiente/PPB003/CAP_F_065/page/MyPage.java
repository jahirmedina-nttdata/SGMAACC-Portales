package org.medioAmbiente.PPB003.CAP_F_065.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/noticias-detalle/-/asset_publisher/pUmOGVAxEAjQ/content/el-milano-real-anida-en-c-c3-b3rdoba/20151")


public class MyPage extends PageObject {

    @FindBy(xpath = "//p[@class=\"evr-subtitle\"]")
    private WebElementFacade Titulo;

    @FindBy(xpath = "(//p[@class=\"audio-date evr-detailsnews__date\"])[1]")
    private WebElementFacade Fecha;

    @FindBy(xpath = "(//p[@class=\"audio-date evr-detailsnews__date\"]/span[2])[1]")
    private WebElementFacade Categoria;



    public void visualizaFechaYCategoria() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 80)");
        String fechaText = Fecha.getText();
        String categoriaText = Categoria.getText();
        if(fechaText.contains("07 de abril de 2021") && categoriaText.contains("Biodiversidad")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion no valida");
        }
    }

    public void visualizaTituloDeContenido() throws InterruptedException {
        String tituloText = Titulo.getText();
        if(tituloText.contains("El milano real anida en Córdoba")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion no valida");
        }
    }

    public void visualizaTextoDeNoticia() throws InterruptedException {
        List<WebElement> texto = getDriver().findElements(By.xpath("//div[@class=\"evr-detalle__txt evr-detailsnews__txt\"]/p"));
        if (texto.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Texto");
        }
    }

    public void visualizaImagenDeNoticia() throws InterruptedException {
        List<WebElement> imagen = getDriver().findElements(By.xpath("//figure[@class=\"evr-detailsnews__figure evr-modal-selector playimag\"]"));
        if (imagen.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Imagen");
        }
        waitFor(2).second();

    }
}
