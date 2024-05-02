package com.gemela.co.definitions;

import com.gemela.co.pages.ReporteATPage;
import com.gemela.co.steps.ReporteATStep;
import com.gemela.co.steps.validations.ValidationStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReporteATDef extends ReporteATPage {

    @Steps(shared = true)
    ReporteATStep datosAfiliadoATStep;

    @Steps(shared = true)
    ValidationStep validationStep;

    @When("Ingreso tipo de documento {string}")
    public void ingreso_tipo_de_documento_cc(String TypeDocument) {
        datosAfiliadoATStep.clickbtnselectTyCC();
        WebElement selTypeDocument = find(By.xpath("//option[.='"+TypeDocument+"']"));
        selTypeDocument.click();
    }

    @When("Ingreso {string} and {string} and {string} and {string}")
    public void ingreso_and_and_and(String nIdentification, String month, String year, String day) {
        datosAfiliadoATStep.clickInpNroIdentificacion(nIdentification);
        datosAfiliadoATStep.clickbtnFechaAT();
        datosAfiliadoATStep.selectYear(year);
        datosAfiliadoATStep.selectMonth(month);
        datosAfiliadoATStep.selectDay(day);
    }

    @When("Selecciono consultar")
    public void selecciono_consultar() {
        datosAfiliadoATStep.clickbtnConsultar();
    }

    @When("Selecciono el boton seleccionar del primer registro")
    public void selecciono_el_boton_seleccionar_del_primer_registro() {
        datosAfiliadoATStep.clickSelectEmpresa();
    }

    @When("Selecciono generar reporte")
    public void selecciono_generar_reporte() {
        datosAfiliadoATStep.clickBtnGenReporte();
//        Assert.assertTrue(validationStep.listAT());
    }

    @Then("el sistema trae el listado de siniestros")
    public void el_sistema_trae_el_listado_de_siniestros() {
        Assert.assertTrue(validationStep.btnNextListAT());
//        Serenity.takeScreenshot();
    }

//    @Then("Prueba")
//    public void Prueba() {
////        Assert.assertTrue(validationStep.listAT());
//        Serenity.takeScreenshot();
//    }

}
