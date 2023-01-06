package org.medioAmbiente.PPB002.CAP_F_019.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_019.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF019 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF019 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF019 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF019 - Ubicarse en el listado$")
    public void Ubicarse_En_El_Listado() throws InterruptedException{
        myStep.ubicarseEnListado();
    }

    @Y("^PPB002-CAPF019 - Posicionar cursos en listado$")
    public void Posicionar_Cursos_En_Listado() throws InterruptedException{
        myStep.posicionarCursosEnListado();
    }

    @Y("^PPB002-CAPF019 - Clickar en colabora$")
    public void Clickar_En_Colabora() throws InterruptedException{
        myStep.clickarEnColabora();
    }
}

