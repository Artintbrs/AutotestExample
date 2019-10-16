package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.HouseholdUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

public class EditWiFiTest extends TestBase {

    private String name = "TestWiFi";

    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected HouseholdUserSteps householdUserSteps = new HouseholdUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void editWiFiTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        householdUserSteps.shouldBeApartmentScreen();
        householdUserSteps.OpenManageHouseScreen();
        householdUserSteps.editWifi(pass, name, 1);
        householdUserSteps.checkEditWifi(name, 1);
    }
}
