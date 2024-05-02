package com.gemela.co.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReporteATPage extends PageObject {

    @FindBy(id = "tipo_identificacion")
    protected WebElement selectTyCC;

    @FindBy(id = "nro_identificacion")
    protected WebElement nroIdentificacion;

    @FindBy(id = "fecha_AT")
    protected WebElement fechaAT;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    protected WebElement btnSelectMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    protected WebElement btnSelectYear;

    @FindBy(xpath = "//input[@value='Consultar']")
    protected WebElement btnConsultar;

    //Luego de consultar aparecerá empresas asociadas a empleado

    @FindBy(xpath = "//input[@type='radio']")
    protected WebElement selectEmpresa;

    @FindBy(xpath = "//input[@value='Generar reporte']")
    protected WebElement btnGenReporte;

    @FindBy(id = "result_consulta_afiliado_AT")
    protected WebElement listAT;

}
