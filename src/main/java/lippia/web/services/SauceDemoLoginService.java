    package lippia.web.services;

    import com.crowdar.core.actions.ActionManager;
    import lippia.web.constants.SauceDemoConstants;
    import org.testng.Assert;
    import org.openqa.selenium.WebElement;

    public class SauceDemoLoginService extends ActionManager {

        public static void openLoginPage() {
            GoogleHomeService.navegarWeb();
        }

        public static void enterUsername(String username) {
            setInput(SauceDemoConstants.USERNAME_INPUT, username);
        }

        public static void enterPassword(String password) {
            setInput(SauceDemoConstants.PASSWORD_INPUT, password);
        }

        public static void clickLoginButton() {
            click(SauceDemoConstants.LOGIN_BUTTON);
        }

        private static WebElement productsTitleElement() {
            return getElement(SauceDemoConstants.PRODUCTS_TITLE);
        }

        private static WebElement errorMessageElement() {
            return getElement(SauceDemoConstants.ERROR_MESSAGE);
        }

        public static String getProductsTitle() {
            return productsTitleElement().getText();
        }

        public static String getErrorMessage() {
            return errorMessageElement().getText();
        }

        public static void verifyProductsTitle(String expectedTitle) {
            Assert.assertEquals(getProductsTitle(), expectedTitle,
                    "El título de la página de productos no es el esperado.");
        }

        public static void verifyUserIsLoggedIn() {
            Assert.assertFalse(getProductsTitle().isEmpty(),
                    "El usuario no se encuentra en la página de productos.");
        }

        public static void verifyErrorMessage(String expectedMessage) {
            Assert.assertEquals(getErrorMessage(), expectedMessage,
                    "El mensaje de error no es el esperado.");
        }
    }
