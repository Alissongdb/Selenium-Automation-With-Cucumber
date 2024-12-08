# Automação de Testes com Selenium e Cucumber

Este repositório contém a automação de testes para o site **Automation Practice** usando **Selenium** e **Cucumber**. A automação realiza testes de login, incluindo casos de sucesso e falha.

# Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para a automação.
- **Selenium WebDriver**: Biblioteca para automação de testes em navegadores.
- **Cucumber**: Framework para testes automatizados baseados em BDD (Behavior Driven Development).
- **JUnit**: Framework para execução dos testes.

# Estrutura do Projeto

# 1. runner/RunCucumberTest.java
Este arquivo contém a configuração principal para rodar os testes com o Cucumber. Ele utiliza o **SafariDriver** como navegador.

# 2. pages/LoginPage.java
A classe `LoginPage` contém os métodos de interação com os elementos da página de login, como preencher os campos de e-mail e senha, clicar no botão de login e verificar mensagens de sucesso ou falha.

# 3. steps/LoginSteps.java
Contém as implementações das etapas (steps) do Cucumber, mapeando as ações descritas no arquivo de features.

# 4. features/login.feature
Este arquivo contém os cenários de teste no formato **Gherkin**, descrevendo os testes de login, com cenários de sucesso e falha.

# Requisitos

- **Java 17** ou superior.
- **Maven** (para gerenciar dependências).
- **Selenium WebDriver**.
- **Cucumber**.
- **Safari** (para rodar os testes no navegador Safari).

# Como Rodar os Testes

# 1. Clone o repositório

git clone https://github.com/seu-usuario/automacao-tests.git

# 2. Baixe as dependências
Execute o comando abaixo para baixar as dependências com o Maven:

mvn clean install

# 3. Execute os testes
Para rodar os testes, execute o comando abaixo:

mvn test
Os resultados dos testes serão gerados em target/reports/, com relatórios em formato JSON e HTML.

# Como Funciona

Cucumber executa os cenários descritos no arquivo .feature (em Gherkin), com os passos definidos em LoginSteps.java.
Selenium WebDriver interage com o navegador (Safari, neste caso) e executa as ações descritas (preencher campos, clicar em botões, etc).
JUnit gerencia a execução dos testes e gera os relatórios de saída.
