package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("^El usuario ha cargado los documentos necesarios en el sistema$")
    public void elUsuarioHaCargadoDocumentos() {
        page.loadDocuments();
    }

    @When("^El usuario procesa los documentos$")
    public void elUsuarioProcesaDocumentos() {
        page.processDocuments();
    }

    @Then("^El sistema genera el 'Slip de salida'$")
    public void elSistemaGeneraSlip() {
        Assert.assertTrue(page.isSlipGenerated());
    }

    @And("^Los documentos originales y datos extraídos son guardados en el historial de la solicitud$")
    public void documentosGuardadosEnHistorial() {
        Assert.assertTrue(page.isDataStoredInHistory());
    }
}