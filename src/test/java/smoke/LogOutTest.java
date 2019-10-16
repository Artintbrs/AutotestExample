package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.MenuApplicationUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Выход из приложения
 */

public class LogOutTest extends TestBase {

    protected MenuApplicationUserSteps menuApplicationUserSteps = new MenuApplicationUserSteps(driver);
    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);


    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void logOutTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        menuApplicationUserSteps.shouldBeMenu(login);
        menuApplicationUserSteps.logOut();
        authorizationUserSteps.shouldBeAuthorizationScreen();
    }

}
