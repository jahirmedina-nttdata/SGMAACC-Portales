package org.medioAmbiente.PPB003.CAP_F_092.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_092.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF092 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF092 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF092 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF092 - Acceder al Contenido Web$")
    public void Acceder_Al_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Entonces("^PPB003-CAPF092 - Validar listado$")
    public void Validar_Listado()throws InterruptedException {
        myStep.validarListado();
    }
}

