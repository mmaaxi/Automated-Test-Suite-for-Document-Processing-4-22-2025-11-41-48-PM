package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("estoy en la página de carga de archivos")
    public void estoy_en_la_página_de_carga_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("selecciono un archivo en formato PDF/DOCX dentro del límite de 50 MB")
    public void selecciono_un_archivo_en_formato_pdf_docx_dentro_del_límite_de_50_mb() {
        page.uploadFile("path/to/your/file.pdf");
    }

    @Then("el archivo se carga exitosamente y muestra la vista previa con el nombre, tamaño y tipo")
    public void el_archivo_se_carga_exitosamente_y_muestra_la_vista_previa_con_el_nombre_tamaño_y_tipo() {
        Assert.assertTrue(page.isFileUploadedSuccessfully());
        Assert.assertEquals("file.pdf", page.getFileName());
        Assert.assertTrue(page.getFileSize() <= 50_000_000);
        Assert.assertEquals("PDF", page.getFileType());
    }
}