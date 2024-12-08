# language: pt

@cadastro
Funcionalidade: Realizar cadastro no site

  @cadastro-sucesso-campos-validos
  Cenario: Realizar cadastro com sucesso

    Dado que estou no site Automation Pratice
    E clico no botao Cadastro da pagina principal
    Quando preencho o campo nome com alisson
    E preencho o campo email do cadastro com alissondalbosco@hotmail.com
    E preencho o campo senha com 123456
    E clico no botao Cadastrar
    Entao deve ser aberto uma janela popup com a mensagem Cadastro realizado

  @cadastro-falha-nome-invalido
  Cenario: Realizar cadastro com falha nome invalido

    Dado que estou no site Automation Pratice
    E clico no botao Cadastro da pagina principal
    Quando nao informo nenhum dado no campo nome
    E preencho o campo email do cadastro com alissondalbosco@hotmail.com
    E preencho o campo senha do cadastro com 123456
    E clico no botao Cadastrar
    Entao deve ser apresentada a mensagem O campo nome deve ser prenchido

  @cadastro-falha-email-invalido
  Cenario: Realizar cadastro com falha email invalido

    Dado que estou no site Automation Pratice
    E clico no botao Cadastro da pagina principal
    Quando preencho o campo nome com alisson
    E preencho o campo email do cadastro com emailinvalido
    E preencho o campo senha com 123456
    E clico no botao Cadastrar
    Entao deve ser apresentada a mensagem O campo e-mail deve ser prenchido corretamente

  @cadastro-falha-senha-invalida
  Cenario: Realizar cadastro com falha senha invalida

    Dado que estou no site Automation Pratice
    E clico no botao Cadastro da pagina principal
    Quando preencho o campo nome com alisson
    E preencho o campo email do cadastro com alissondalbosco@hotmail.com
    E preencho o campo senha com 123
    E clico no botao Cadastrar
    Entao deve ser apresentada a mensagem O campo senha deve ter pelo menos 6 dígitos