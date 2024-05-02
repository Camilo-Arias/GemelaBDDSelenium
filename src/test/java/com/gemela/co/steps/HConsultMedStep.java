package com.gemela.co.steps;

import com.gemela.co.pages.HConsultMedPages;
import com.gemela.co.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HConsultMedStep extends HConsultMedPages {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    @Step("Click en el boton tipo de identificación")
    public void clickbtnselectTyCCHC() {
        waitForElementToBeVisible(typeDocumentHC);
        typeDocumentHC.click();

    }

    @Step("Click en el input de numero de identificación")
    public void clickInpNroIdentificacionHC(String nroIdenti) {
        waitForElementToBeVisible(inputDocumentHC);
        inputDocumentHC.sendKeys(nroIdenti);
    }

    @Step("Click en el boton de Buscar")
    public void clickSearchHT() {
        btnSearch.click();
    }
}
