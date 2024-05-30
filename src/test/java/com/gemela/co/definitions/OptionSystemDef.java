package com.gemela.co.definitions;

import com.gemela.co.steps.OptionSystemStep;
import com.gemela.co.steps.validations.ValidationStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class OptionSystemDef {

    @Steps(shared = true)
    OptionSystemStep optionSystemStep;

    @Steps(shared = true)
    ValidationStep validationStep;

    @When("Selecciono el menu Opciones del sistema")
    public void selecciono_el_menu_opciones_del_sistema() {
        optionSystemStep.clickbtnOption();
    }


    /**
     * Botones y seleccion de HISTORIA CLINICA*/
    @When("Selecciono HISTORIA CLINICA")
    public void selecciono_historia_clinica() {
        optionSystemStep.clickbtnHClinica();
    }
    @When("selecciono Consultas Médicas")
    public void selecciono_consultas_médicas() {
        optionSystemStep.clickBtnHCConsMedicas();
    }
    @When("selecciono Concepto de aptitud laboral")
    public void selecciono_Concepto_de_aptitud_laboral() {
        optionSystemStep.clickBtnHCAptLaboral();
    }

    @When("selecciono Acta inclusion programa rehabilitacion")
    public void selecciono_Acta_inclusion_programa_rehabilitacion() {
        optionSystemStep.clickBtnHCAIProgramRehabilitacion();
    }

    @When("selecciono Notas")
    public void selecciono_Notas() {
        optionSystemStep.clickBtnHCNotas();
    }

    @When("selecciono Incapacidades")
    public void selecciono_Incapacidades() {
        optionSystemStep.clickBtnHCIncapacidades();
    }

    @When("selecciono Seguimiento")
    public void selecciono_Seguimiento() {
        optionSystemStep.clickBtnHCSeguimiento();
    }

    @Then("selecciono Consulta Incap. Temp.")
    public void selecciono_ConsultaIncap_Temp() {
        optionSystemStep.clickBtnHCConsIncapTemp();
    }

    /**
     * Reporte AT botones y acciones*/
    @When("Selecciono Reporte AT")
    public void selecciono_reporte_at() {
        optionSystemStep.clickBtnReportAT();
    }

    @When("Selecciono Registro de Siniestro")
    public void selecciono_registro_de_siniestro() {
        optionSystemStep.clickBtnReportATRegSiniestro();
        Assert.assertTrue(validationStep.regSiniestro());
    }
}
