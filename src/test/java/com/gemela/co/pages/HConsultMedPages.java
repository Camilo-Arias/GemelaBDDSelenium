package com.gemela.co.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HConsultMedPages {

    @FindBy(id = "tipo_identificacion")
    protected WebElement typeDocumentHC;

    @FindBy(id = "tipo_identificacion_1")
    protected WebElement typeDocumentHCInc;

    @FindBy(id = "documento")
    protected WebElement inputDocumentHC;

    @FindBy(id = "documento_1")
    protected WebElement inputDocumentHCInc;

    @FindBy(xpath = "//input[@value='Buscar']")
    protected WebElement btnSearch;

    @FindBy(xpath = "(//input[@value='Registro ML'])[1]")
    protected WebElement rgML1;

    @FindBy(xpath = "(//img[@Alt='Ver Historia Clínica'])[1]")
    protected WebElement vrHistClin;

    @FindBy(xpath = "(//img[@Alt='Ingresar Historia Clínica'])[1]")
    protected WebElement addHistClin;

    @FindBy(xpath = "(//img[@Alt='Generar Reporte'])[1]")
    protected WebElement genReport;

    @FindBy(xpath = "(//input[@value='Registro ML'])[2]")
    protected WebElement rgML2;

    @FindBy(xpath = "//input[@value='Ver Notas']")
    protected WebElement vrNotas;
}
