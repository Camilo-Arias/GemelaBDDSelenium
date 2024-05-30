package com.gemela.co.steps;

import com.gemela.co.pages.HConsultMedPages;
import com.gemela.co.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HConsultMedStep extends HConsultMedPages {


    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void bordearElemento(WebElement webLocalizador) {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px dashed green'",
                    element(webLocalizador));
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.background='#8fcc99'",
                    element(webLocalizador));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void quitarBordearElemento(WebElement webLocalizador) {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border=''",
                    element(webLocalizador));
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.background=''",
                    element(webLocalizador));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Step("Click en el boton tipo de identificación")
    public void clickbtnselectTyCCHC() {
        waitForElementToBeVisible(typeDocumentHC);
        bordearElemento(typeDocumentHC);
        typeDocumentHC.click();
    }

    @Step("Click en el boton tipo de identificación Incapacidades")
    public void clickbtnselectTyCCHCInc() {
        waitForElementToBeVisible(typeDocumentHCInc);
        typeDocumentHCInc.click();
    }

    @Step("Click en el input de numero de identificación")
    public void clickInpNroIdentificacionHC(String nroIdenti) {
        quitarBordearElemento(typeDocumentHC);
        waitForElementToBeVisible(inputDocumentHC);
        inputDocumentHC.sendKeys(nroIdenti);
    }

    @Step("Click en el input de numero de identificación Incapacidades")
    public void clickInpNroIdentificacionHCInc(String nroIdenti) {
        waitForElementToBeVisible(inputDocumentHCInc);
        inputDocumentHCInc.sendKeys(nroIdenti);
    }

    @Step("Click en el boton de Buscar")
    public void clickSearchHT() {
        btnSearch.click();
    }

//    @Step("Click en Ver historia Clinica")
//    public void clickVrHClinica() {
//        vrHistClin.click();
//    }
}
