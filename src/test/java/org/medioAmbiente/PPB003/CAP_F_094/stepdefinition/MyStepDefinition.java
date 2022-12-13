package org.medioAmbiente.PPB003.CAP_F_094.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_094.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF094 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF094 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF094 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF094 - Acceder a contenido web$")
    public void Acceder_A_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Y("^PPB003-CAPF094 - Acceder a carpeta Avisos$")
    public void Acceder_A_Carpeta_Avisos()throws InterruptedException {
        myStep.accederCarpetaAvisos();
    }

    @Y("^PPB003-CAPF094 - Copiar Resumen a descripcion$")
    public void Copiar_Resumen_A_Descripcion()throws InterruptedException {
        myStep.copiarResumenADescripcion();
    }

    @Y("^PPB003-CAPF094 - Clickar Publicar$")
    public void Clickar_Publicar()throws InterruptedException {
        myStep.clickarPublicar();
    }

    @Entonces("^PPB003-CAPF094 - Validar cambio$")
    public void Validar_Cambio()throws InterruptedException {
        myStep.validarCambio();
    }

    @Y("^PPB003-CAPF094 - Copiar Descripcion a Resumen$")
    public void Copiar_Descripcion_A_Resumen()throws InterruptedException {
        myStep.copiarDescripcionAResumen();
    }
}

