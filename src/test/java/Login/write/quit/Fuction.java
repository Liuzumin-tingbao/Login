package Login.write.quit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fuction {
    public static void LoginTest(WebDriver wb,String email,String pwd){
        wb.get("http://127.0.0.1:5000/login");
        wb.findElement(ElementPage.EmailInput).sendKeys(email);
        wb.findElement(ElementPage.PwdInput).sendKeys(pwd);
        wb.findElement(ElementPage.LoginButton).click();
    }
    public static void LogoutTest(WebDriver wb){
        wb.findElement(ElementPage.LogoutButton).click();
    }
    public static void PostTest(WebDriver wb,String email,String pwd) throws InterruptedException {
        wb.findElement(By.xpath("/html/body/header/div/div/div/strong/a")).click();
        wb.findElement(By.xpath("//*[@id=\"new_post_link\"]")).click();

        Thread.sleep(3000);
        wb.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("12345");
        wb.findElement(By.xpath("//*[@id=\"slug\"]")).sendKeys("12345");
        wb.findElement(By.xpath("//*[@id=\"body\"]")).sendKeys("123456767889");
        wb.findElement(By.xpath("//*[@id=\"new_post_form\"]/div/form/p[2]/input")).click();
    }
    public static void Register(WebDriver wb,String email,String pwd) throws InterruptedException {
        wb.get("http://127.0.0.1:5000/login");
        wb.findElement(By.xpath("/html/body/section/div/div/div/form/p[4]/a")).click();
        Thread.sleep(2000);
        wb.findElement(ElementPage.EmailInput).sendKeys(email);
        wb.findElement(ElementPage.PwdInput).sendKeys(pwd);
        wb.findElement(ElementPage.PwdInputReappear).sendKeys(pwd);
        wb.findElement(ElementPage.RegisterButton).click();
    }
}
