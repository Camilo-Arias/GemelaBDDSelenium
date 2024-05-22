package com.gemela.co.steps.validations;

import com.gemela.co.pages.validations.ValidationPages;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ValidationStep extends ValidationPages {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    //    Validación inicio y cierre de sesion
    @Step("Validar inicio de sesión")
    public boolean loginOk() {
//        WebElement divBTNlogout = find(By.xpath("//div[@id='botonSalir']"));
        return divBTNLogout.isDisplayed();
    }

    @Step("Validar cerrar sesión")
    public boolean logout() {
        return btnLogin.isDisplayed();
    }


    /**
     * Validaciones pagina Historia clinica*/

    @Step("Validar listado HC")
    public boolean btnPdfHC() {
        return genReport.isDisplayed();
    }

    @Step("Validar listado HC Incapacidades")
    public boolean btnPdfHCInc() {
        return genReportIncapacidades.isDisplayed();
    }

    //Reporte Accidentes de trabajo

    @Step("Validar Registro Siniestro")
    public boolean regSiniestro() {
        return selectTyCC.isDisplayed();
    }

    @Step("Validar listado de siniestros AT")
    public boolean btnNextListAT() {
        waitForElementToBeVisible(btnNextListAT);
        return btnNextListAT.isDisplayed();
    }
}
