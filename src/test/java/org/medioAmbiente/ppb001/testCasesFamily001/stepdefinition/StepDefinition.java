package org.medioAmbiente.ppb001.testCasesFamily001.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.ppb001.testCasesFamily001.step.Step;

public class StepDefinition {

    @Steps
    private Step step;

    @Given("^PPB001_Family001 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @When("^PPB001_Family001 - Se haya cargado la web$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        step.cargarPagina();
    }


    @And("^PPB001_Family001 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        step.aceptarCookies();
    }

    @And("^PPB001_Family001 - Limpiar$")
    public void Limpiar() throws InterruptedException {
        step.limpiarCampos();
    }

    @And("^PPB001_Family001 - Buscar$")
    public void Buscar() throws InterruptedException {
        step.buscar();

    }

    @And("^PPB001_Family001 - Buscar por palabras \"([^\"]*)\"$")
    public void Buscar_por_palabras(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")) {
            step.escribirBuscarPorPalabras(entradaTexto);
        }
    }

    @And("^PPB001_Family001 - Seleccionar Tipos de Espacios Naturales \"([^\"]*)\"$")
    public void Seleccionar_Tipos_de_Espacios_Naturales(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            step.clickDropDownMenuEspaciosNaturales(entradaTexto);
        }
    }

    @And("^PPB001_Family001 - Seleccionar Provincias \"([^\"]*)\"$")
    public void Seleccionar_Provincias(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            step.clickDropDownProvincias(entradaTexto);
        }
    }

    @And("^PPB001_Family001 - Selecciona un tipo de Equipamento \"([^\"]*)\"$")
    public void Selecciona_un_tipo_de_Equipamento(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            step.clickdropDownMenuTipoEquipamento(entradaTexto);
        }
    }

    @And("^PPB001_Family001 - Es Accesible \"([^\"]*)\"$")
    public void Es_Accesible(String entradaTexto) throws InterruptedException {
        if(entradaTexto.equals("si")){
            step.clickCheckBoxAccesible();
        }
    }

    @And("^PPB001_Family001 - Nombre de Espacio Natural \"([^\"]*)\"$")
    public void Nombre_de_Espacio_Natural(String entradaTexto) throws InterruptedException {
        if(! entradaTexto.equals("none")){
            step.clickDropDownMenuNombreEspacioNatural(entradaTexto);
        }
    }

}


