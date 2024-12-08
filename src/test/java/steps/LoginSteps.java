package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);

    @Dado("que estou no site Automation Pratice")
    public void que_estou_no_site_automation_pratice() {
        loginPage.acessarAplicacao();
    }
    @Dado("clico no botao Login da pagina principal")
    public void clico_no_botao_login_da_pagina_principal() {

        loginPage.clicarBotaoLoginHome();
    }
    @Quando("preencho o campo email com (.*)$")
    public void preencho_o_campo_email(String email) {
        System.out.println("E-mail recebido: " + email);
        loginPage.preencherCampoEmail(email);
    }
    @Quando("preencho o campo senha com (.*)$")
    public void preencho_o_campo_senha(String senha) {
        System.out.println("Senha recebida: " +senha);
        loginPage.preencherCampoSenha(senha);

    }
    @Quando("clico no botao Login")
    public void clico_no_botao_login() {

        loginPage.clicarBotaoLoginPaginaLogin();
    }
    @Entao("deve ser aberto uma janela popup com a mensagem Login realizado")
    public void deve_ser_aberto_uma_janela_popup_com_a_mensagem_login_realizado() {
        loginPage.mensagemLoginRealizado();
    }

    @Entao("deve ser apresentada a mensagem E-mail inválido.")
    public void deveSerApresentadaAMensagemEmailInvalido() {
        loginPage.mensagemLoginFalha();
    }

    @Entao("deve ser apresentada a mensagem Senha inválida.")
    public void deveSerApresentadaAMensagemSenhaInvalida() {
        loginPage.mensagemLoginSenhaInvalida();
    }
}
