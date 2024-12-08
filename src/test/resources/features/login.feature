# language: pt

  @login
  Funcionalidade: Realizar login no site

    @login-sucesso-senha-valida
    Cenario: Realizar login com sucesso senha valida

      Dado que estou no site Automation Pratice
      E clico no botao Login da pagina principal
      Quando preencho o campo email com alissondalbosco@hotmail.com
      E preencho o campo senha com 123456
      E clico no botao Login
      Entao deve ser aberto uma janela popup com a mensagem Login realizado

    @login-falha-senha-invalida
    Cenario: Realizar login com falha senha invalida

      Dado que estou no site Automation Pratice
      E clico no botao Login da pagina principal
      Quando preencho o campo email com alissondalbosco@hotmail.com
      E preencho o campo senha com 123
      E clico no botao Login
      Entao deve ser apresentada a mensagem Senha inválida.

    @login-sucesso-login-valido
    Cenario: Realizar login com sucesso login valido

      Dado que estou no site Automation Pratice
      E clico no botao Login da pagina principal
      Quando preencho o campo email com alissondalbosco@hotmail.com
      E preencho o campo senha com 123456
      E clico no botao Login
      Entao deve ser aberto uma janela popup com a mensagem Login realizado

    @login-falha-login-invalido
    Cenario: Realizar login com falha login invalido

      Dado que estou no site Automation Pratice
      E clico no botao Login da pagina principal
      Quando preencho o campo email com emailinvalido
      E preencho o campo senha com 123456
      E clico no botao Login
      Entao deve ser apresentada a mensagem E-mail inválido.