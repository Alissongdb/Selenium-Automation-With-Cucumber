package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Dado("clico no botao Cadastro da pagina principal")
    public void clico_no_botao_cadastro_da_pagina_principal() {
        cadastroPage.acessarAplicacao();
        cadastroPage.clicarBotaoCadastro();
    }

    @Quando("preencho o campo nome com (.*)$")
    public void preencho_o_campo_nome_com_alisson(String nome) {

        cadastroPage.preencherCampoNome(nome);
    }

    @Quando("preencho o campo email do cadastro com (.*)$")
    public void preencho_o_campo_email_do_cadastro(String email) {
        System.out.println("E-mail recebido: " + email);
        cadastroPage.preencherCampoEmailCadastro(email);
    }

    @Quando("preencho o campo senha do cadastro com (.*)$")
    public void preencho_o_campo_senha_do_cadastro(String senha) {
        System.out.println("Senha recebida: " +senha);
        cadastroPage.preencherCampoPassword(senha);

    }
    @Quando("nao informo nenhum dado no campo nome")
    public void nao_informo_nenhum_dado_no_campo_nome() {
        cadastroPage.preencherCampoNomeVazio();
    }
    @Quando("clico no botao Cadastrar")
    public void clico_no_botao_cadastrar() {
        cadastroPage.clicarBotaoRegistrar();
    }
    @Entao("deve ser aberto uma janela popup com a mensagem Cadastro realizado")
    public void deve_ser_aberto_uma_janela_popup_com_a_mensagem_cadastro_realizado() {

    }

    @Entao("deve ser apresentada a mensagem O campo nome deve ser prenchido")
    public void deve_ser_apresentada_a_mensagem_o_campo_nome_deve_ser_prenchido() {

    }

    @Entao("deve ser apresentada a mensagem O campo e-mail deve ser prenchido corretamente")
    public void deve_ser_apresentada_a_mensagem_o_campo_e_mail_deve_ser_prenchido_corretamente() {

    }


    @Entao("deve ser apresentada a mensagem O campo senha deve ter pelo menos {int} dígitos")
    public void deve_ser_apresentada_a_mensagem_o_campo_senha_deve_ter_pelo_menos_dígitos(Integer int1) {

    }


    }









