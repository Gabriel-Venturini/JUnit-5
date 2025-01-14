# Testes Unitários com JUnit 5

## Sobre o Projeto

Este projeto consiste em uma calculadora simples implementada em Java, com a finalidade de demonstrar o uso de testes unitários utilizando JUnit 5.

## Visão Geral

JUnit 5 é um framework de testes automatizados para a linguagem Java que permite escrever e executar testes unitários de forma eficaz. É uma ferramenta importante para garantir a qualidade do software e detectar erros de código antes de executá-los em produção.
Os testes unitários são parte fundamental do desenvolvimento de software a fim de garantir a qualidade do produto final.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de diretórios:

```
lib/
├── junit-platform-console-standalone-1.11.2.jar
screenshots/
├── erro-teste.png
├── sem-erros.png
src/
├── main/
│   └── java/
│       └── Calculadora.java
├── test/
│   └── java/
│       └── CalculadoraTest.java
README.md
LICENSE.md
```


### Arquivos Principais:

- **src/main/java/Calculadora.java**: Contém a implementação da classe `Calculadora` com métodos de soma e subtração.
- **src/test/java/CalculadoraTest.java**: Contém os testes unitários para a classe `Calculadora`, utilizando JUnit 5.
- **/lib/junit-platform-console-standalone-1.11.2.jar**: Biblioteca necessária para rodar os testes.
- **/screenshots/**: Pasta com capturas de tela dos resultados de sucesso e falha nos testes.

## Requisitos

* Java 8+
* JUnit 5 (A biblioteca JUnit utilizada no projeto encontra-se no diretório ```lib/```)

## Como Clonar na sua Máquina

``` bash
# HTTPS
git clone https://github.com/Gabriel-Venturini/JUnit-5.git
# GitHub CLI
gh repo clone Gabriel-Venturini/JUnit-5
```


## Licença para uso
Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.