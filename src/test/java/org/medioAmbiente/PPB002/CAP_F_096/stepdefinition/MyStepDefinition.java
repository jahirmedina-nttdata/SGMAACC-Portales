package org.medioAmbiente.PPB002.CAP_F_096.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_096.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF096 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF096 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF096 - Ubicarse en el apartado ÚLTIMAS INCORPORACIONES AL CATÁLOGO")
    public void Ubicarse_En_El_Apartado_ULTIMAS_INCORPORACIONES_AL_CATÁLOGO() throws InterruptedException {
        myStep.ubicarseApartado();
    }

    @Y("^PPB002-CAPF096 - Posicionar el puntero encima del card")
    public void Posicionar_El_Puntero_Encima_Del_Card() throws InterruptedException {
        myStep.posicionarPuntero();
    }

    @Y("^PPB002-CAPF096 - Arrastrar hacia la izquierda")
    public void Arrastrar_Hacia_La_Izquierda() throws InterruptedException {
        myStep.arrastrarAlaIzquierda();
    }

    @Y("^PPB002-CAPF096 - Arrastrar hacia la derecha")
    public void Arrastrar_Hacia_La_Derecha() throws InterruptedException {
        myStep.arrastrarAlaDerecha();
    }

    @Y("^PPB002-CAPF096 - Clickar flecha derecha")
    public void Clickar_Flecha_Derecha() throws InterruptedException {
        myStep.clickarFlechaDerecha();
    }

    @Y("^PPB002-CAPF096 - Clickar flecha izquierda")
    public void Clickar_Flecha_Izquierda() throws InterruptedException {
        myStep.clickarFlechaIzquierda();
    }

    @Y("^PPB002-CAPF096 - Accede a cualquier enlace")
    public void Accede_A_Cualquier_Enlace() throws InterruptedException {
        myStep.accederEnlace();
    }

    @Entonces("^PPB002-CAPF096 - Validar acceso correcto")
    public void Validar_Acceso_Correcto() throws InterruptedException {
        myStep.validarAccesoCorrecto();
    }

}

