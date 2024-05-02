package com.gemela.co.definitions;

import com.gemela.co.pages.HConsultMedPages;
import com.gemela.co.steps.HConsultMedStep;
import com.gemela.co.steps.OptionSystemStep;
import com.gemela.co.steps.ReporteATStep;
import com.gemela.co.steps.validations.ValidationStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HConsultMedDef extends HConsultMedPages {

    @Steps(shared = true)
    HConsultMedStep hConsultMedStep;

    @Steps(shared = true)
    ValidationStep validationStep;

    @When("Ingreso tipo de documento HC {string}")
    public void ingreso_tipo_de_documento_hc(String typeDocumentHC) {
        hConsultMedStep.clickbtnselectTyCCHC();
        WebElement selTypeDocument = find(By.xpath("//option[.='"+typeDocumentHC+"']"));
        selTypeDocument.click();
    }
    @When("Ingreso {string}")
    public void ingreso(String numberIdHC) {
        hConsultMedStep.clickInpNroIdentificacionHC(numberIdHC);
    }
    @When("Selecciono buscar")
    public void selecciono_buscar() {
        hConsultMedStep.clickSearchHT();
    }

    @Then("El sistema trae el listado de Historias Clinicas")
    public void El_sistema_trae_el_listado_de_Historias_Clinicas() {
        Assert.assertTrue(validationStep.btnPdfHC());
    }
}
