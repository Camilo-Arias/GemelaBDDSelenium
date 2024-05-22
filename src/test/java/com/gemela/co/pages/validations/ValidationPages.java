package com.gemela.co.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidationPages extends PageObject {

    //    Validación inicio y cierre de sesion
    @FindBy(xpath = "//input[@id='loginbtnIni']")
    protected WebElement btnLogin;

    @FindBy(xpath = "//div[@id='botonSalir']")
    protected WebElement divBTNLogout;

    @FindBy(xpath = "//a[.='Salir']")
    protected WebElement btnLogout;

    @FindBy(id = "tipo_identificacion")
    protected WebElement selectTyCC;

    /**
     * Validaciones pagina Historia Clinica*/

    @FindBy(xpath = "(//img[@Alt='Generar Reporte'])[1]")
    protected WebElement genReport;

    @FindBy(xpath = "(//img[@Alt='editar'])[2]")
    protected WebElement genReportIncapacidades;

    @FindBy(id = "listSiniestros_next")
    protected WebElement btnNextListAT;
}
