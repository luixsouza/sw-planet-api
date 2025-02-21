# Testes

## Visão Geral
Este projeto implementa uma camada de testes para garantir a qualidade e confiabilidade da aplicação. Foram adicionados testes unitários e testes de integração para validar os componentes e suas interações.

## Tecnologias Utilizadas
- **JUnit**: Framework para testes unitários em Java.
- **Mockito**: Biblioteca para criação de mocks e simulação de dependências.
- **Spring Boot Test**: Suporte para testes de integração em aplicações Spring Boot.

## Estrutura dos Testes
Os testes estão organizados em duas camadas principais:

### 1. Testes Unitários
Os testes unitários validam o comportamento isolado de cada componente. Eles garantem que classes e métodos individuais funcionam conforme esperado.

- **Localização**: `src/test/java/com/compass/sw_planet_api`
- **Framework**: JUnit
- **Mocks Utilizados**: Mockito

### 2. Testes de Integração
Os testes de integração verificam a interação entre múltiplos componentes do sistema, garantindo que funcionam corretamente em conjunto.

- **Localização**: `src/test/java/com/compass/sw_planet_api`
- **Framework**: Spring Boot Test
- **Banco de Dados de Teste**: H2

## Como Executar os Testes
Para rodar os testes, utilize o seguinte comando no terminal:
```sh
mvn test
```
Ou, caso esteja usando Gradle:
```sh
gradle test
```