package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.SauceDemoCartService;
import lippia.web.services.SauceDemoLoginService;

public class SauceDemoCartSteps extends PageSteps {

    @Given("el usuario se autentica con usuario {string} y contraseña {string}")
    public void loginConCredenciales(String username, String password) {
        SauceDemoLoginService.enterUsername(username);
        SauceDemoLoginService.enterPassword(password);
        SauceDemoLoginService.clickLoginButton();
        SauceDemoLoginService.verifyUserIsLoggedIn();
    }

    @When("el usuario agrega el producto {string} al carrito")
    public void agregarProductoAlCarrito(String productName) {
        // En este TP siempre será "Sauce Labs Backpack"
        SauceDemoCartService.addBackpackToCart();
    }

    @Then("el contador del carrito muestra {string}")
    public void verificarContadorCarrito(String expected) {
        SauceDemoCartService.verifyCartBadgeEquals(expected);
    }

    @Given("el usuario tiene el producto {string} en el carrito")
    public void usuarioTieneProductoEnCarrito(String productName) {
        SauceDemoCartService.addBackpackToCart();
    }

    @When("el usuario elimina el producto {string} del carrito")
    public void eliminarProductoDelCarrito(String productName) {
        SauceDemoCartService.removeBackpackFromCartFromInventory();
    }

    @Then("el contador del carrito está vacío")
    public void verificarContadorCarritoVacio() {
        SauceDemoCartService.verifyCartBadgeEmpty();
    }
}
