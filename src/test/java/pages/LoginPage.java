package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;

    private String URL = "https://automationpratice.com.br/";
    private By botao_login_home = By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a");
    private By campo_email = By.id("user");
    private By campo_senha = By.id("password");
    private By botao_login_login = By.id("btnLogin");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.manage().window().maximize();
        driver.get(URL);
        esperarElementoEstarPresente(botao_login_home, 10);
        driver.manage().deleteAllCookies();
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[1]/a")).isDisplayed());
    }

    public void clicarBotaoLoginHome() {
        driver.findElement(By.cssSelector(".fa.fa-user")).click();
    }

    public void preencherCampoEmail(String email) {
        esperarElementoEstarPresente(botao_login_login, 10);
        driver.findElement(campo_email).sendKeys(email);
    }

    public void preencherCampoSenha(String senha) {
        driver.findElement(campo_senha).sendKeys(senha);
    }

    public void clicarBotaoLoginPaginaLogin() {
        driver.findElement(botao_login_login).click();
    }

    public void mensagemLoginRealizado() {
        String texto_login_realizado = driver.findElement(By.className("swal2-title")).getText();
        Assert.assertEquals("Login realizado", texto_login_realizado);
        System.out.println(texto_login_realizado);
    }

    public String mensagemLoginFalha() {
        String texto_login_falha = driver.findElement(By.xpath("//*[@id=\"login_area\"]/div/div/div/div/div[1]/span")).getText();
        Assert.assertEquals("E-mail inválido.", texto_login_falha);
        System.out.println(texto_login_falha);
        return texto_login_falha;
    }

    public String mensagemLoginSenhaInvalida() {
        String texto_login_falha_senha = driver.findElement(By.xpath("//*[@id=\"login_area\"]/div/div/div/div/div[2]/span")).getText();
        Assert.assertEquals("Senha inválida.", texto_login_falha_senha);
        System.out.println(texto_login_falha_senha);
        return texto_login_falha_senha;
    }

}
