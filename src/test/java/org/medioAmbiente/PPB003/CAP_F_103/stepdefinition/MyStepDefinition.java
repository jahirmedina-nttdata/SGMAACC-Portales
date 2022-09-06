package org.medioAmbiente.PPB003.CAP_F_103.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_103.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF103 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF103 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF103 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF103 - Acceder al menu Galeria Multimedia$")
    public void Acceder_Al_Menu_Galeria_Multimedia()throws InterruptedException {
        myStep.accederGaleriaMultimedia();
    }

    @Y("^PPB003-CAPF103 - Configurar paginador$")
    public void Configurar_Paginador()throws InterruptedException {
    }

    @Y("^PPB003-CAPF103 - Recargar pagina$")
    public void Recargar_Pagina()throws InterruptedException {
    }
}

