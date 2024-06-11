package org.example.co.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OptionSystemPage extends PageObject {

    @FindBy(xpath = "//a[.='OPCIONES DEL SISTEMA']")
    protected WebElement btnOption;

        @FindBy(xpath = "(//a[.='HISTORIA CLINICA'])[2]")
        protected WebElement btnHClinica;

            @FindBy(xpath = "//a[.='Consultas médicas']")
            protected WebElement btnHCConsMedicas;

            @FindBy(xpath = "//a[.='Concepto de aptitud laboral']")
            protected WebElement btnHCAptLaboral;

            @FindBy(xpath = "//a[.='Acta inclusion programa rehabilitacion']")
            protected WebElement btnHCAIProgramRehabilitacion;

            @FindBy(xpath = "(//a[.='Notas'])[1]")
            protected WebElement btnHCNotas;

            @FindBy(xpath = "//a[.='Incapacidades']")
            protected WebElement btnHCIncapacidades;

            @FindBy(xpath = "//a[.='Seguimiento']")
            protected WebElement btnHCSeguimiento;

            @FindBy(xpath = "//a[.='Consulta Incap. Temp.']")
            protected WebElement btnHCConsIncapTemp;

        @FindBy(xpath = "//a[.='AUTORIZACIONES']")
        protected WebElement btnAutorizaciones;

            @FindBy(xpath = "//a[.='Autorizaciones']")
            protected WebElement btnAutAutorizaciones;

            @FindBy(xpath = "//a[.='Informe autorizaciones']")
            protected WebElement btnAutInfoAutorizaciones;

            @FindBy(xpath = "//a[.='Reporte Recobro']")
            protected WebElement btnAutReporRecobro;

            @FindBy(xpath = "//a[.='Auditoria medica']")
            protected WebElement btnAutAudiMedica;

            @FindBy(xpath = "(//a[.='Notas'])[2]")
            protected WebElement btnAutNotas;

        @FindBy(xpath = "//a[.='CALIFICACION']")
        protected WebElement btnCalificacion;

            @FindBy(xpath = "//a[.='Evaluación Origen']")
            protected WebElement btnCalEvaOrigen;

            @FindBy(xpath = "//a[.='CAL. PERDIDA DE CAPACIDAD LAB   DEC. 917']")
            protected WebElement btnCal917;

            @FindBy(xpath = "//a[.='CAL. PERDIDA DE CAPACIDAD LAB   DEC.1507']")
            protected WebElement btnCal1507;

            @FindBy(xpath = "//a[.='Concepto medico de origen']")
            protected WebElement btnCalConcepMedOrigen;

            @FindBy(xpath = "//a[.='Casos pendientes grupo interdisciplinar']")
            protected WebElement btnCalCsPendiGrpInterdisciplinar;

            @FindBy(xpath = "//a[.='Casos calificados por grupo interdiscipl']")
            protected WebElement btnCalCsCalifGrpInterdiscipl;

            @FindBy(xpath = "//a[.='Solicitud calificacion juntas']")
            protected WebElement btnCalSoliCalfJuntas;

            @FindBy(xpath = "//a[.='Calificacion junta-EPS']")
            protected WebElement btnCalJuntaEPS;

        @FindBy(xpath = "//a[.='ENCUESTAS']")
        protected WebElement btnEncuentas;

            @FindBy(xpath = "//a[.='Encuestas']")
            protected WebElement btnEncEncuestas;

        @FindBy(xpath = "//a[.='INFORMES']")
        protected WebElement btnInformes;

            @FindBy(xpath = "//a[.='Informe de gestion']")
            protected WebElement btnInfGestion;

            @FindBy(xpath = "//a[.='Informe PCL Presunta']")
            protected WebElement btnInfPCLPresunta;

            @FindBy(xpath = "//a[.='Informe traslado de casos']")
            protected WebElement btnInftrasCasos;

        @FindBy(xpath = "//a[.='MEDICINA LABORAL EMPRESARIAL']")
        protected WebElement btnMedLabEmpresarial;

            @FindBy(xpath = "//a[.='SEGUIMIENTO DE CASOS DE ATEL']")
            protected WebElement btnMedLabEmpSegATEL;

            @FindBy(xpath = "//a[.='SEGUIMIENTO CASOS SEVEROS']")
            protected WebElement btnMedLabEmpSegSeveros;

            @FindBy(xpath = "//a[.='INFORME']")
            protected WebElement btnMedLabEmpSegInforme;

            @FindBy(xpath = "//a[.='INFORME EMPRESARIAL']")
            protected WebElement btnMedLabEmpInfEmpresarial;

        @FindBy(xpath = "//a[.='PARAM. MEDICINA EMPRESARIAL']")
        protected WebElement btnParaMedEmpresarial;

            @FindBy(xpath = "//a[.='Asignación casos especiales']")
            protected WebElement btnParaMedEmpAsigCsEspeciales;

            @FindBy(xpath = "//a[.='Configuracion seguimiento regional']")
            protected WebElement btnParaMedEmpConfigSegRegional;

        @FindBy(xpath = "//a[.='REPORTE AT']")
        protected WebElement btnReportAT;

            @FindBy(xpath = "//a[.='Registro de Siniestro']")
            protected WebElement btnReportATRegSiniestro;

}
