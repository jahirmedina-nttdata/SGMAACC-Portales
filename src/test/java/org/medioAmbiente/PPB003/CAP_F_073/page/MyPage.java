package org.medioAmbiente.PPB003.CAP_F_073.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[1]/div/div/h1/a")
    private WebElementFacade Planifica_Visitas;

    @FindBy(xpath = "//*[@id=\"portlet_visitasmodule_INSTANCE_61L1Y8gTGInZ\"]/div/div/div/div/section/div/div/div/div/h1")
    private WebElementFacade Validar_Permiso;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_visitaSelect\"]")
    private WebElementFacade Validar_Listado;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
    }

    public void clikarPlanificaVisita() throws InterruptedException {
        Planifica_Visitas.click();
    }

    public void validarPermiso() throws InterruptedException {
        String validar = Validar_Permiso.getText();
        if(validar.equals("Visitas")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se encuentra autenticado");
        }
    }

    public void validarListado() throws InterruptedException {
        Validar_Listado.click();
        String validar = Validar_Listado.getAttribute("title");
        if(validar.equals("visita-select")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No muestra lista de visitas");
        }
    }
}
