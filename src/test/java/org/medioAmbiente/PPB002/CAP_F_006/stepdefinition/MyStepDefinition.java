package org.medioAmbiente.PPB002.CAP_F_006.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_006.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF006 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF006 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF006 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF006 - Visualizar contenido relacionado$")
    public void Visualizar_Contenido_Relacionado() throws InterruptedException{
        myStep.visualizarContenidoRelacionado();
    }

    @Y("^PPB002-CAPF006 - Posicionar punto en Texto$")
    public void Posicionar_Punto_En_Texto() throws InterruptedException{
        myStep.posicionarPuntero();
    }

    @Y("^PPB002-CAPF006 - Clickar texto de Imagen$")
    public void Clickar_Texto_De_Imagen() throws InterruptedException{
        myStep.clickarEnlace();
    }


}

