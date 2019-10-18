package Login.write.quit;

import org.openqa.selenium.By;

public class ElementPage {
    //email输入框定位方式
    public static By EmailInput = By.xpath("//*[@id=\"email\"]");
    //password输入框定位方式
    public static By PwdInput = By.xpath("//*[@id=\"password\"]");
    //password输入框重复输入定位方式
    public static By PwdInputReappear = By.xpath("//*[@id=\"cpassword\"]");
    //register注册按钮 定位方式
    public static By RegisterButton = By.xpath("/html/body/section/div/div/div/form/p[2]/input");
    //sign in登陆按钮 定位方式
    public static By LoginButton = By.xpath("/html/body/section/div/div/div/form/p[3]/input");
    //log out退出按钮 定位方式
    public static By LogoutButton = By.xpath("/html/body/header/div/div/div/a[2]");
}
