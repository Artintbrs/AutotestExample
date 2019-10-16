package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.HouseholdUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddWiFiTest extends TestBase {

    private String name = "TestWiFi";


    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected HouseholdUserSteps householdUserSteps = new HouseholdUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void addWiFiTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        householdUserSteps.shouldBeApartmentScreen();
        householdUserSteps.OpenManageHouseScreen();
        householdUserSteps.addWifi(pass, name);
        householdUserSteps.checkWiFi(name, 1);
    }
}
