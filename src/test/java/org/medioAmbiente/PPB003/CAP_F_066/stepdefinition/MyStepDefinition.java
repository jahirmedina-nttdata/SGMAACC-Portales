package org.medioAmbiente.PPB003.CAP_F_066.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_066.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF066 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF066 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF066 - Visualizar Titulo$")
    public void Visualizar_Titulo()throws InterruptedException {
        myStep.visualizarTitulo();
    }

    @Y("^PPB003-CAPF066 - Visualizar Texto$")
    public void Visualizar_Texto()throws InterruptedException {
        myStep.visualizarTexto();
    }

    @Y("^PPB003-CAPF066 - Visualizar Imagen$")
    public void Visualizar_Imagen()throws InterruptedException {
        myStep.visualizarImagen();
    }

    @Y("^PPB003-CAPF066 - Visualizar campo Fecha$")
    public void Visualizar_Campo_Fecha()throws InterruptedException {
        myStep.visualizarCampoFecha();
    }

    @Y("^PPB003-CAPF066 - Compartir por Facebook$")
    public void Compartir_Por_Facebook()throws InterruptedException {
        myStep.compartirPorFacebook();
    }

    @Y("^PPB003-CAPF066 - Compartir por Twitter$")
    public void Compartir_Por_Twitter()throws InterruptedException {
        myStep.compartirPorTwitter();
    }

    @Y("^PPB003-CAPF066 - Compartir por Pinterest$")
    public void Compartir_Por_Pinterest()throws InterruptedException {
        myStep.compartirPorPinterest();
    }

    @Y("^PPB003-CAPF066 - Compartir por Correo$")
    public void Compartir_Por_Correo()throws InterruptedException {
        myStep.compartirPorCorreo();
    }

}

