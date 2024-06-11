package org.example.co.steps;

import org.example.co.pages.ReporteATPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReporteATStep extends ReporteATPage {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    @Step("Click en el boton tipo de identificación")
    public void clickbtnselectTyCC() {
        selectTyCC.click();
    }

    @Step("Click en el input de numero de identificación")
    public void clickInpNroIdentificacion(String nroIdenti) {
//        nroIdentificacion.click();
        nroIdentificacion.sendKeys(nroIdenti);
    }

    @Step("Click en el boton fecha AT")
    public void clickbtnFechaAT() {
        fechaAT.click();
    }

    @Step("Click en el boton select del mes del calendario")
    public void selectMonth(String month) {
        Select selectmes = new Select(btnSelectMonth);
        selectmes.selectByVisibleText(month);
    }

    @Step("Click en el boton select del año del calendario")
    public void selectYear(String year) {
        Select selectaño = new Select(btnSelectYear);
        selectaño.selectByVisibleText(year);
    }

    //    @Step("Click en el boton select del día del calendario")
    public void selectDay(String day) {
        WebElement daySelect = find(By.xpath("(//a[(@class='ui-state-default')])[" + day + "]"));
        daySelect.click();
    }

    @Step("Click en el boton consultar")
    public void clickbtnConsultar() {
        btnConsultar.click();
    }

    @Step("click en el boton seleccionar del listado de empresas")
    public void clickSelectEmpresa() {
        waitForElementToBeVisible(selectEmpresa);
        selectEmpresa.click();
    }

    @Step("Click en el boton Generar Reporte")
    public void clickBtnGenReporte() {
        waitForElementToBeVisible(btnGenReporte);
        btnGenReporte.click();
    }
}
