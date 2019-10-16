package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.SettingsCaseUserStep;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsCaseTest extends TestBase {

    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected SettingsCaseUserStep settingsCaseUserStep = new SettingsCaseUserStep(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void settingsCaseTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        authorizationUserSteps.changePassword(passOld);
        authorizationUserSteps.shouldBeAuthorizationScreen();
        settingsCaseUserStep.addContact();
    }

}
