package smoke;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AuthorizationTest.class,
        AuthorizationAfterChangePasswordTest.class,
        CreateNewHouseWithoutWiFiTest.class,
        CreateNewHouseWithWiFiTest.class,
        SwitchingHousesTest.class,
        RenameHouseTest.class,
        SettingsCaseTest.class,
        AddFamilyMembersFromContactTest.class,
        AddFamilyMembersEmailTest.class,
        AddWiFiTest.class,
        EditWiFiTest.class,
        DeleteWiFiTest.class
})

public class SmokeSuiteTest {
}
