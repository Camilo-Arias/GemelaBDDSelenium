package org.example.co.utilities;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsWeb extends PageObject {

    /**
     * Metodo para añadir una espera de un componente
     *
     * @param webElement  elemento a esperar
     */
    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /**
     * Metodo que permite bordear y pintar elemento para ser visualizado
     *
     * @param webLocalizador Elemento a resaltar
     * */
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
}
