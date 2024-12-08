# Automação de Testes com Selenium e Cucumber

Este repositório contém a automação de testes para o site **Automation Practice** usando **Selenium** e **Cucumber**. A automação realiza testes de login, cadastro, incluindo casos de sucesso e falha.

# Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para a automação.
- **Selenium WebDriver**: Biblioteca para automação de testes em navegadores.
- **Cucumber**: Framework para testes automatizados baseados em BDD (Behavior Driven Development).
- **JUnit**: Framework para execução dos testes.

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

Cucumber executa os cenários descritos no arquivo .feature (em Gherkin), com os passos definidos nos arquivos da pasta steps.
Selenium WebDriver interage com o navegador (Safari, neste caso) e executa as ações descritas (preencher campos, clicar em botões, etc).
JUnit gerencia a execução dos testes e gera os relatórios de saída.
