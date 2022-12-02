package org.medioAmbiente.PPB003.CAP_F_069.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_xuiFeabBAtlI\"]//h1/a")
    private WebElementFacade Aqui;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_nombreUsuario\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_email\"]")
    private WebElementFacade Email;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_password1\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_password2\"]")
    private WebElementFacade Confirmar_Password;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_nombre\"]")
    private WebElementFacade Nombre;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_apellidos\"]")
    private WebElementFacade Apellidos;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_codigoPostal\"]")
    private WebElementFacade Codigo_Postal;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_fmAlta\"]//div[6]/label")
    private WebElementFacade Acepto_Terminos;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_submit\"]")
    private WebElementFacade Registrarme;

    @FindBy(xpath = "//*[@id=\"_altaUsuarioModule_INSTANCE_I3v4fzzXutpK_emailHelper\"]/div")
    private WebElementFacade Alerta;
    public void clickarAqui() throws InterruptedException {
        Aqui.click();
    }

    public void rellenarFormulario() throws InterruptedException {
        Usuario.sendKeys("automatizador_qa");
        Email.sendKeys("automatizadorqa30@gmail.com");
        Password.sendKeys("@utomatizador*30");
        Confirmar_Password.sendKeys("@utomatizador*30");
        Nombre.sendKeys("Juan");
        Apellidos.sendKeys("Perez");
        Codigo_Postal.sendKeys("52003");
        Acepto_Terminos.click();
        Registrarme.click();
    }

    public void rellenarCamposInvalidos() throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/registro");
        Usuario.sendKeys("analista_qa");
        Email.sendKeys("analista30");
        Password.sendKeys("@utomatizador*30");
        Confirmar_Password.sendKeys("@utomatizador*30");
        Nombre.sendKeys("Michael");
        Apellidos.sendKeys("Perez");
        Codigo_Postal.sendKeys("52003");
        Acepto_Terminos.click();
        Registrarme.click();

        String validacion = Alerta.getText();
        if(validacion.equals("Por favor, introduzca una dirección de correo electrónico válida.")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion valida");
        }
    }
}
