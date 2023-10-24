package features;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
@Log4j2
public class TestExercice {

    //Les driver
    private static final String URL ="https://www.saucedemo.com/";
    WebDriver driver;

    //Methode before
    @BeforeMethod
    public void setup (){
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println(URL + " -> opened successfully");

    }

    @Test
    public void testSwag(){
        //Arrange
        String user = "standard_user";
        String pwd = "secret_sauce";
        String titleExpected = "Your Cart";

        //Act
        LoginPage lp = new LoginPage(driver);
        CartPage cp = lp.inputUsername(user)
          .inputPassword(pwd)
          .login()
          .addButton()
          .cartButton();

        //Assert
        Assert.assertEquals(cp.getTitle(),titleExpected, "Wrong Page");
    }

    @AfterMethod
    public void resultScreenshot (ITestResult result){
        if (result.getStatus()== ITestResult.FAILURE){
            File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String name= "scrennshot.png";
            try {
                FileUtils.copyFile(scrFile, new File("test-output/screenshots/" + name));
            } catch (IDException e) {
                Log.error ("Screenshot failed");
                throw new RuntimeException(e);
            }
        }
    }
    public void teardown(){
        driver.quit();
        System.out.println("Teardown successful !");
    }

}
