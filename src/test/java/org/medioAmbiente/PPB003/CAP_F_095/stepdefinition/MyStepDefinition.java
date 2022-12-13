package org.medioAmbiente.PPB003.CAP_F_095.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_095.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF095 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF095 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF095 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF095 - Acceder al menu Publicaciones$")
    public void Acceder_Al_Menu_Publicaciones()throws InterruptedException {
        myStep.accederPublicaciones();
    }

    @Y("^PPB003-CAPF095 - Configurar paginador$")
    public void Configurar_Paginador()throws InterruptedException {
        myStep.configurarPaginador();
    }

    @Y("^PPB003-CAPF095 - Recargar pagina$")
    public void Recargar_Pagina()throws InterruptedException {
        myStep.recargarPagina();
    }
}

