package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;

    private String URL = "https://automationpratice.com.br/";
    private By botao_cadastro = By.xpath("//*[@id=\"top_header\"]/div/div/div[2]/div/ul/li[2]/a/i");
    private By preenche_nome = By.id("user");
    private By preenche_password = By.id("password");
    private By preenche_email = By.xpath("//*[@id=\"email\"]");
    private By botao_registrar = By.id("btnRegister");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.manage().window().maximize();
        driver.get(URL);
        esperarElementoEstarPresente(botao_cadastro, 10);
        driver.manage().deleteAllCookies();
    }


    public void clicarBotaoCadastro() {
        esperarElementoEstarPresente(botao_cadastro, 10);
        driver.findElement(botao_cadastro).click();
    }

    public void preencherCampoNome(String nome) {
        esperarElementoEstarPresente(preenche_nome, 10);
        driver.findElement(preenche_nome).sendKeys(nome);
    }

    public void preencherCampoEmailCadastro(String email) {
        esperarElementoEstarPresente(preenche_email, 15);
        driver.findElement(preenche_email).sendKeys(email);
    }

    public void preencherCampoPassword(String password) {
        driver.findElement(preenche_password).sendKeys(password);
    }

    public void preencherCampoNomeVazio() {
        esperarElementoEstarPresente(preenche_nome, 10);
        driver.findElement(preenche_nome).sendKeys(" ");
    }

    public void clicarBotaoRegistrar() {
        esperarElementoEstarPresente(botao_registrar, 10);
        driver.findElement(botao_registrar).click();
    }

}
