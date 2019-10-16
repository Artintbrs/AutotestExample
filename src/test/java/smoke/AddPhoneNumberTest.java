package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.ProfileUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Добавить телефонный номер
 */

public class AddPhoneNumberTest extends TestBase {

    private String phoneNumber = "8005553535";

    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected ProfileUserSteps profileUserSteps = new ProfileUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void addPhoneNumberTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        profileUserSteps.getProfileSettings();
        profileUserSteps.sholdBeProfileSettings();
        profileUserSteps.addPhone(phoneNumber);
    }
}
