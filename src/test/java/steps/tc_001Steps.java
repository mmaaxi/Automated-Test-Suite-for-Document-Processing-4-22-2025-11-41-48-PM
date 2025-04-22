package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navegarAPaginaDeCarga();
    }

    @When("El usuario selecciona la opción 'cargar documentos'")
    public void elUsuarioSeleccionaOpcionCargarDocumentos() {
        page.seleccionarCargarDocumentos();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void elSistemaMuestraOpcionParaCargaUnicaYMultiple() {
        Assert.assertTrue(page.opcionesDeCargaVisibles());
    }

    @When("El usuario elige 'carga en un solo archivo'")
    public void elUsuarioEligeCargaEnUnSoloArchivo() {
        page.seleccionarCargaUnSoloArchivo();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void seHabilitaUnUnicoRecuadro() {
        Assert.assertTrue(page.unicoRecuadroHabilitado());
    }

    @When("El usuario elige 'cargar documentos por separado'")
    public void elUsuarioEligeCargarDocumentosPorSeparado() {
        page.seleccionarCargaPorSeparado();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void seMuestranMultiplesRecuadros() {
        Assert.assertTrue(page.multiplesRecuadrosVisibles());
    }
}