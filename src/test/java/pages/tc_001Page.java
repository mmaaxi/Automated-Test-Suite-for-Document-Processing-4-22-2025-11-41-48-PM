package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By cargarDocumentosOption = By.id("cargarDocumentos");
    By opcionUnicoArchivo = By.id("unicoArchivo");
    By opcionMultipleArchivos = By.id("multipleArchivos");
    By unicoRecuadro = By.id("recuadroUnico");
    By multiplesRecuadros = By.className("recuadroMultiple");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCarga() {
        driver.get("https://ejemplo.com/carga-documentos");
    }

    public void seleccionarCargarDocumentos() {
        driver.findElement(cargarDocumentosOption).click();
    }

    public boolean opcionesDeCargaVisibles() {
        return driver.findElement(opcionUnicoArchivo).isDisplayed() && 
               driver.findElement(opcionMultipleArchivos).isDisplayed();
    }

    public void seleccionarCargaUnSoloArchivo() {
        driver.findElement(opcionUnicoArchivo).click();
    }

    public boolean unicoRecuadroHabilitado() {
        return driver.findElement(unicoRecuadro).isDisplayed();
    }

    public void seleccionarCargaPorSeparado() {
        driver.findElement(opcionMultipleArchivos).click();
    }

    public boolean multiplesRecuadrosVisibles() {
        return driver.findElements(multiplesRecuadros).size() > 0;
    }
}