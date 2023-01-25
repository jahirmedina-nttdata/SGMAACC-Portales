package org.medioAmbiente.PPB003.CAP_F_080.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_080.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF080 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF080 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF080 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF080 - Clickar icono papelera$")
    public void Clickar_Icono_Papelera()throws InterruptedException {
        myStep.clikariconoPapelera();
    }

    @Y("^PPB003-CAPF080 - Clickar cancelar eliminacion$")
    public void Clickar_Cancelar_Eliminacion() throws InterruptedException{

    }

    @Entonces("^PPB003-CAPF080 - Validar ficha eliminada$")
    public void Validar_Ficha_Eliminada()throws InterruptedException {

    }
}

