package smoke;

import org.junit.BeforeClass;
import org.junit.Test;
import autotest.steps.AuthorizationUserSteps;

/**
 * Авторизация в неавторизованном режиме
 */


public class AuthorizationTest extends TestBase {

    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void authorizationTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, passOld);
    }

}
