package dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Provides login data sets used by login tests.
 * Each row represents one test case with three values:
 * username, password, and expectedResult.
 */
public class LoginDataProvider {

    /**
     * Returns test data for login tests.
     * @return Object[][] where each entry is {username, password, expectedResult}
     * expectedResult values:
     *   - "success": valid credentials expected to log in
     *   - "error": invalid credentials expected to show an error
     *   - "validation": missing values expected to trigger validation messages
     */
    @DataProvider(name="loginData")
    public Object[][] getLoginData(){
        // Test cases: {username, password, expectedResult}
        return new Object[][]{
            {"Admin", "admin123", "success"},
            {"Admin", "Wrongpass", "error"},
            {"wrongAdmin", "admin123", "error"},
            {"wrongadmin", "wrongpass", "error"},
            {"", "admin123", "validation"},
            {"Admin", "", "validation"},
            {"","", "validation"}
        };
    }
}
