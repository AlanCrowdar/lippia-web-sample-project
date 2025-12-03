package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.SauceDemoConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SauceDemoCartService extends ActionManager {

    private static WebElement cartBadgeElement() {
        return getElement(SauceDemoConstants.CART_BADGE);
    }

    public static void addBackpackToCart() {
        click(SauceDemoConstants.BACKPACK_ADD_BUTTON);
    }

    public static void removeBackpackFromCartFromInventory() {
        click(SauceDemoConstants.BACKPACK_REMOVE_BUTTON);
    }

    public static String getCartBadgeText() {
        try {
            return cartBadgeElement().getText();
        } catch (Exception e) {
            return "";
        }
    }

    public static boolean isCartBadgeVisible() {
        try {
            return cartBadgeElement().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static void verifyCartBadgeEquals(String expected) {
        Assert.assertEquals(getCartBadgeText(), expected,
                "El contador del carrito no coincide con el valor esperado.");
    }

    public static void verifyCartBadgeEmpty() {
        Assert.assertFalse(isCartBadgeVisible(),
                "El contador del carrito debería estar vacío o no visible.");
    }
}

