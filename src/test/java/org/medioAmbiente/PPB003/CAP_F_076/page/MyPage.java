package org.medioAmbiente.PPB003.CAP_F_076.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[1]/div/div/h1/a")
    private WebElementFacade Planifica_Visitas;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_editar-58472162\"]")
    private WebElementFacade Editar_Visita;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_title\"]")
    private WebElementFacade Nombre_Visita;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_dateTo\"]")
    private WebElementFacade Fecha_Hasta;

    @FindBy(xpath = "//button[text()=\"Guardar\"]")
    private WebElementFacade btnGuardar;

    @FindBy(xpath = "//*[@id=\"portlet_visitasmodule_INSTANCE_61L1Y8gTGInZ\"]//div[3]/section//span")
    private WebElementFacade Validar_Modificacion;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        Planifica_Visitas.click();
    }

    public void clikarEditarVisita() throws InterruptedException {
        Editar_Visita.click();
    }

    public void modificarVisita() throws InterruptedException {
        Nombre_Visita.clear();
        Nombre_Visita.sendKeys("EL MARTINETE");
        Fecha_Hasta.clear();
        btnGuardar.click();
    }

    public void validarModificacion() throws InterruptedException {
        waitFor(2).second();
        String validar = Validar_Modificacion.getText();
        if (validar.contains("EL MARTINETE")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No coincide con la modificacion");
        }
    }
}
