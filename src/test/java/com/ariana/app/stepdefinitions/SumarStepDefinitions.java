package com.ariana.app.stepdefinitions;

import com.ariana.app.calculo.Suma;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SumarStepDefinitions {

    private Suma sumador;
    private int resultado;

    @Given("^quiero sumar$")
    public void prepararSumar() {
        sumador = new Suma();
    }

    @When("^sumo (\\d+) mas (\\d+)$")
    public void sumar(int arg1, int arg2) {
        resultado = sumador.sumar(arg1, arg2);
    }

    @Then("^el resultado es (\\d+)$")
    public void verificarResultado(int arg1) {
        Assert.assertEquals(arg1, resultado);
    }

}
