package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.SauceDemoLoginService;

public class SauceDemoLoginSteps extends PageSteps {

    @Given("que el usuario abre la página de SauceDemo")
    public void abrirSauceDemo() {
        SauceDemoLoginService.openLoginPage();
    }

    @When("el usuario ingresa el usuario {string}")
    public void ingresarUsuario(String username) {
        SauceDemoLoginService.enterUsername(username);
    }

    @When("el usuario ingresa la contraseña {string}")
    public void ingresarContrasena(String password) {
        SauceDemoLoginService.enterPassword(password);
    }

    @When("el usuario presiona el botón de login")
    public void presionarBotonLogin() {
        SauceDemoLoginService.clickLoginButton();
    }

    @Then("el sistema muestra la página de productos")
    public void verificarPaginaProductos() {
        SauceDemoLoginService.verifyUserIsLoggedIn();
    }

    @Then("el título de la página es {string}")
    public void verificarTituloPagina(String expectedTitle) {
        SauceDemoLoginService.verifyProductsTitle(expectedTitle);
    }

    @Then("el sistema muestra el mensaje de error {string}")
    public void verificarMensajeError(String expectedMessage) {
        SauceDemoLoginService.verifyErrorMessage(expectedMessage);
    }
}

