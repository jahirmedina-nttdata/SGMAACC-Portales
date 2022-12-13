package org.medioAmbiente.PPB003.CAP_F_109.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_109.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF109 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF109 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF109 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF109 - Acceder al contenido Web$")
    public void Acceder_Al_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Y("^PPB003-CAPF109 - Buscar contenido Web$")
    public void Buscar_Contenido_Web()throws InterruptedException {
        myStep.buscarContenidoWeb();
    }

    @Y("^PPB003-CAPF109 - Modificar Banner destacado$")
    public void Modificar_Banner_Destacado()throws InterruptedException {
        myStep.modificarBannerDestacado();
    }

    @Y("^PPB003-CAPF109 - Validar modificacion de banner destacado$")
    public void Validar_Modificacion_De_Banner_Destacado()throws InterruptedException {
        myStep.validarModificacionBannerDestacado();
    }

    @Y("^PPB003-CAPF109 - Dejar vacio banner destacado$")
    public void Dejar_Vacio_Banner_Destacado()throws InterruptedException {
        myStep.dejarVacioCampoBannerDestacado();
    }
}

