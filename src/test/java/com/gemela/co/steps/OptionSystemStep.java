package com.gemela.co.steps;

//import com.gemela.co.pages.LoginPage;
import com.gemela.co.pages.OptionSystemPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class OptionSystemStep extends OptionSystemPage {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    @Step("Click en el boton OPCIONES DEL SISTEMA")
    public void clickbtnOption() {
        waitForElementToBeVisible(btnOption);
        btnOption.click();
    }

    @Step("Click en el boton HISTORIA CLINICA")
    public void clickbtnHClinica() {
        waitForElementToBeVisible(btnHClinica);
        btnHClinica.click();
    }

    @Step("Click en el boton HC -> Consultas Médicas")
    public void clickBtnHCConsMedicas() {
        btnHCConsMedicas.click();
    }

    @Step("Click en el boton HC -> Concepto de Aptitud Laboral")
    public void clickBtnHCAptLaboral() {
        btnHCAptLaboral.click();
    }

    @Step("Click en el boton HC -> Acta inclusion programa rehabilitacion")
    public void clickBtnHCAIProgramRehabilitacion() {
        btnHCAIProgramRehabilitacion.click();
    }

    @Step("Click en el boton HC -> Notas")
    public void clickBtnHCNotas() {
        btnHCNotas.click();
    }

    @Step("Click en el boton HC -> Incapacidades")
    public void clickBtnHCIncapacidades() {
        btnHCIncapacidades.click();
    }

    @Step("Click en el boton HC -> Seguimiento")
    public void clickBtnHCSeguimiento() {
        btnHCSeguimiento.click();
    }

    @Step("Click en el boton HC -> Consulta Incap. Temp.")
    public void clickBtnHCConsIncapTemp() {
        btnHCConsIncapTemp.click();
    }

    @Step("Click en el boton AUTORIZACIONES")
    public void clickBtnAutorizaciones() {
        btnAutorizaciones.click();
    }

    @Step("Click en el boton AUT -> Autorizaciones")
    public void clickBtnAutAutorizaciones() {
        btnAutAutorizaciones.click();
    }

    @Step("Click en el boton AUT -> Informe autorizaciones")
    public void clickBtnAutInfoAutorizaciones() {
        btnAutInfoAutorizaciones.click();
    }

    @Step("Click en el boton AUT -> Reporte Recobro")
    public void clickBtnAutReporRecobro() {
        btnAutReporRecobro.click();
    }

    @Step("Click en el boton AUT -> Auditoria medica")
    public void clickBtnAutAudiMedica() {
        btnAutAudiMedica.click();
    }

    @Step("Click en el boton AUT -> Notas")
    public void clickBtnAutNotas() {
        btnAutNotas.click();
    }

    @Step("Click en el boton CALIFICACION")
    public void clickBtnCalificacion() {
        btnCalificacion.click();
    }

    @Step("Click en el boton CAL -> Evaluación Origen")
    public void clickBtnCalEvaOrigen() {
        btnCalEvaOrigen.click();
    }

    @Step("Click en el boton CAL -> CAL. PERDIDA DE CAPACIDAD LAB DEC. 917")
    public void clickBtnCal917() {
        btnCal917.click();
    }

    @Step("Click en el boton CAL -> CAL. PERDIDA DE CAPACIDAD LAB DEC. 1507")
    public void clickBtnCal1507() {
        btnCal1507.click();
    }

    @Step("Click en el boton CAL -> Concepto medico de origen")
    public void clickBtnCalConcepMedOrigen() {
        btnCalConcepMedOrigen.click();
    }

    @Step("Click en el boton CAL -> Casos pendientes grupo interdisciplinar")
    public void clickBtnCalCsPendiGrpInterdisciplinar() {
        btnCalCsPendiGrpInterdisciplinar.click();
    }

    @Step("Click en el boton CAL -> casos calificados por grupo interdiscipl")
    public void clickBtnCalCsCalifGrpInterdiscipl() {
        btnCalCsCalifGrpInterdiscipl.click();
    }

    @Step("Click en el boton CAL -> Solicitud calificacion juntas")
    public void clickBtnCalSoliCalfJuntas() {
        btnCalSoliCalfJuntas.click();
    }

    @Step("Click en el boton CAL -> Calificacion junta-EPS")
    public void clickBtnCalJuntaEPS() {
        btnCalJuntaEPS.click();
    }

    @Step("Click en el boton ENCUESTAS")
    public void clickBtnEncuentas() {
        btnEncuentas.click();
    }

    @Step("Click en el boton ENC -> Encuestas")
    public void clickBtnEncEncuestas() {
        btnEncEncuestas.click();
    }

    @Step("Click en el boton INFORMES")
    public void clickBtnInformes() {
        btnInformes.click();
    }

    @Step("Click en el boton INF -> Informe")
    public void clickBtnInfGestion() {
        btnInfGestion.click();
    }

    @Step("Click en el boton INF -> Informe PCL Presunta")
    public void clickBtnInfPCLPresunta() {
        btnInfPCLPresunta.click();
    }

    @Step("Click en el boton INF -> Informe traslado de casos")
    public void clickBtnInftrasCasos() {
        btnInftrasCasos.click();
    }

    @Step("Click en el boton MEDICINA LABORAL EMPRESARIAL")
    public void clickBtnMedLabEmpresarial() {
        btnMedLabEmpresarial.click();
    }

    @Step("Click en el boton MEDLABEMP -> SEGUIMIENTO DE CASOS DE ATEL")
    public void clickBtnMedLabEmpSegATEL() {
        btnMedLabEmpSegATEL.click();
    }

    @Step("Click en el boton MEDLABEMP -> SEGUIMIENTO CASOS SEVEROS")
    public void clickBtnMedLabEmpSegSeveros() {
        btnMedLabEmpSegSeveros.click();
    }

    @Step("Click en el boton MEDLABEMP -> INFORME")
    public void clickBtnMedLabEmpSegInforme() {
        btnMedLabEmpSegInforme.click();
    }

    @Step("Click en el boton MEDLABEMP -> INFORME EMPRESARIAL")
    public void clickBtnMedLabEmpInfEmpresarial() {
        btnMedLabEmpInfEmpresarial.click();
    }

    @Step("Click en el boton PARAM. MEDICINA EMPRESARIAL")
    public void clickBtnParaMedEmpresarial() {
        btnParaMedEmpresarial.click();
    }

    @Step("Click en el boton PARMEDEMP -> Asignación casos especiales")
    public void clickBtnParaMedEmpAsigCsEspeciales() {
        btnParaMedEmpAsigCsEspeciales.click();
    }

    @Step("Click en el boton PARMEDEMP -> Configuracion seguimiento regional")
    public void clickBtnParaMedEmpConfigSegRegional() {
        btnParaMedEmpConfigSegRegional.click();
    }

    @Step("Click en el boton REPORTE AT")
    public void clickBtnReportAT() {
        btnReportAT.click();
    }

    @Step("Click en el REPAT -> Registro de Siniestro")
    public void clickBtnReportATRegSiniestro() {
        btnReportATRegSiniestro.click();
    }
}
