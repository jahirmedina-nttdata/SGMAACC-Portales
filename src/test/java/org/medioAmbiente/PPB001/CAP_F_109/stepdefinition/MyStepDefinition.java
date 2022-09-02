package org.medioAmbiente.PPB001.CAP_F_109.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_109.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF109 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF109 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF109 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF109 - Acceder contenido web$")
    public void Acceder_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Y("^PPB001-CAPF109 - Añadir categoria$")
    public void Añadir_Categoria()throws InterruptedException {
    }

    @Y("^PPB001-CAPF109 - Relacionar contenido$")
    public void Relacionar_Contenido()throws InterruptedException {
    }

    @Y("^PPB001-CAPF109 - Eliminar categoria$")
    public void Eliminar_Categoria()throws InterruptedException {
    }

    @Y("^PPB001-CAPF109 - Eliminar contenido$")
    public void Eliminar_Contenido()throws InterruptedException {
    }
}

