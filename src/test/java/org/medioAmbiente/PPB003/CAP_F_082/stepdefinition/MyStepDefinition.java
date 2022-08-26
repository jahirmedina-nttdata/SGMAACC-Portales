package org.medioAmbiente.PPB003.CAP_F_082.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_082.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF082 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF082 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF082 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF082 - Clickar Favoritos$")
    public void Clickar_Favoritos()throws InterruptedException {
        myStep.clikarFavoritos();
    }

    @Entonces("^PPB003-CAPF082 - Valido permisos$")
    public void Valido_Permisos()throws InterruptedException {
        myStep.validarPermiso();
    }

    @Y("^PPB003-CAPF082 - Valido lista de Favoritos$")
    public void Valido_Lista_De_Favoritos()throws InterruptedException {
        myStep.validarFavoritos();
    }
}

