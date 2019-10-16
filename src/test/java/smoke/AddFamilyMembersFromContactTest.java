package smoke;

import autotest.steps.AuthorizationUserSteps;
import autotest.steps.HouseholdUserSteps;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Добавить членов семьи (Выбрать из контактов. Доступ на просмотр)
 */

public class AddFamilyMembersFromContactTest extends TestBase {

    private String email = "test@mail.com";


    protected AuthorizationUserSteps authorizationUserSteps = new AuthorizationUserSteps(driver);
    protected HouseholdUserSteps householdUserSteps = new HouseholdUserSteps(driver);

    @BeforeClass
    public static void beforeTest(){
    }

    @Test
    public void addFamilyMembersFromContactTest() {
        authorizationUserSteps.shouldBeAuthorizationScreen();
        authorizationUserSteps.logInUser(login, pass);
        householdUserSteps.shouldBeApartmentScreen();
        householdUserSteps.OpenManageHouseScreen();
        householdUserSteps.addFamilyMembers();
        householdUserSteps.addFamilyMembersFromContact(email);
        householdUserSteps.checkFamilyMembers(email,"Observe");
    }

}
