package org.medioAmbiente.PPB003.CAP_F_083.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_083.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF083 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF083 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF083 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF083 - Clickar añadir Favorito$")
    public void Clickar_Añadir_Favorito()throws InterruptedException {
        myStep.clikarAñadirFavoritos();
    }

    @Entonces("^PPB003-CAPF083 - Validar Favorito añadido$")
    public void Validar_Favorito_Añadido()throws InterruptedException {
        myStep.validarAñadido();
    }

    @Y("^PPB003-CAPF083 - Clickar eliminar favorito$")
    public void Clickar_Eliminar_Favorito()throws InterruptedException {
        myStep.clickarEliminarFavorito();
    }
}

