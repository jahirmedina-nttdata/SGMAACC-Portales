package org.medioAmbiente.PPB003.CAP_F_009.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_009.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF009 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF009 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF009 - Autenticarse$")
    public void Autenticarse() throws InterruptedException, URISyntaxException {
        myStep.autenticarse();
    }

    @Y("^PPB003-CAPF009 - Clickar Añadir Favoritos$")
    public void Clickar_Añadir_Favoritos()throws InterruptedException {
        myStep.clickarFavoritos();
    }

    @Entonces("^PPB003-CAPF009 - Verifica cambio de color del icono$")
    public void Verifica_Cambio_De_Color_Del_Icono()throws InterruptedException {
        myStep.verificarIcono();
    }
}

