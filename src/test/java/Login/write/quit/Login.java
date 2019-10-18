package Login.write.quit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
    WebDriver wb;
    @DataProvider(name = "TestLogin")
    public Object[][] data1(){
        return new Object[][]{{"aaa@qq.com","pwd111"}};
    }
    @BeforeMethod
    public void OpenChrome() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","E:\\IDEAProject\\drivers\\chromedriver.exe");
        wb = new ChromeDriver();
    }
    @Test(dataProvider = "TestLogin")
    public void LoginWeb(String a,String b) throws InterruptedException {
        //注册
        Fuction.Register(wb, a,b);
        Thread.sleep(3000);
        //登陆
        Fuction.LoginTest(wb,a,b);
        //发帖
        Thread.sleep(2000);

        Fuction.PostTest(wb,a,b);
        Thread.sleep(3000);
        //退出
        Fuction.LogoutTest(wb);
    }
    @AfterMethod
    public void CloseChrome(){
        wb.quit();
    }
}
