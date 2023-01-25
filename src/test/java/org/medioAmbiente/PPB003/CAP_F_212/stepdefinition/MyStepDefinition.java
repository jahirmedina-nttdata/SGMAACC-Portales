package org.medioAmbiente.PPB003.CAP_F_212.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_212.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF212 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF212 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF212 - Seleccionar menu QUE PUEDES HACER")
    public void Seleccionar_Menu_QUE_PUEDES_HACER() throws InterruptedException {
        myStep.seleccionarMenu();
    }

    @Y("^PPB003-CAPF212 - Seleccionar submenu ACTIVIDADES$")
    public void Seleccionar_Submenu_ACTIVIDADES() throws InterruptedException {
        myStep.seleccionarSubmenu();
    }

    @Y("^PPB003-CAPF212 - Pulsar en actividad Buceo$")
    public void Pulsar_En_Actividad_Buceo() throws InterruptedException {
        myStep.pulsarActividadBuceo();
    }


    @Y("^PPB003-CAPF212 - Visualiza carrusel$")
    public void Visualiza_Carrusel() throws InterruptedException {
        myStep.visualizarCarrusel();
    }

    @Y("^PPB003-CAPF212 - Pulsa boton pausar carrusel$")
    public void Pulsa_Boton_Pausar_Carrusel() throws InterruptedException {
        myStep.pulsarPausarCarrusel();
    }


    @Y("^PPB003-CAPF212 - Pulsa boton reanudar carrusel$")
    public void Pulsa_Boton_Reanudar_Carrusel() throws InterruptedException {
        myStep.pulsarReanudarCarrusel();
    }

    @Y("^PPB003-CAPF212 - Pulsa boton anterior imagen$")
    public void Pulsa_Boton_Anterior_Imagen() throws InterruptedException {
        myStep.pulsarAnteriorImagen();
    }

    @Y("^PPB003-CAPF212 - Desliza carrusel a la derecha$")
    public void Desliza_Carrusel_A_La_Derecha() throws InterruptedException {
        myStep.deslizarCarruselalaDerecha();
    }

    @Y("^PPB003-CAPF212 - Pulsa boton siguiente imagen$")
    public void Pulsa_Boton_Siguiente_Imagen() throws InterruptedException {
        myStep.pulsarSiguienteImagen();
    }

    @Y("^PPB003-CAPF212 - Desliza carrusel a la izquierda$")
    public void Desliza_Carrusel_A_La_Izquierda() throws InterruptedException {
        myStep.deslizarCarruselalaIzquierda();
    }

    @Y("^PPB003-CAPF212 - Pulsa boton ir a la primera imagen$")
    public void Pulsa_Boton_Ir_A_La_Primera_Imagen() throws InterruptedException {
        myStep.pulsarIrAlaPrimeraImagen();
    }

    @Y("^PPB003-CAPF212 - Pulsa boton ir a la ultima imagen$")
    public void Pulsa_Boton_Ir_A_La_Ultima_Imagen() throws InterruptedException {
        myStep.pulsarIrAlaUltimaImagen();
    }

}

