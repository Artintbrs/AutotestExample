package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.MenuApplicationUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Авторизация после изменения пароля в настройках профиля
 */

public class AuthorizationAfterChangePasswordTest extends TestBase {

    private String houseName = "Дом";

    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected MenuApplicationUserSteps menuApplicationUserSteps = new MenuApplicationUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void authorizationAfterChangePasswordTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, passOld);
        authorizationUserSteps.changePassword(pass);
        menuApplicationUserSteps.logOut();
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
    }

}
