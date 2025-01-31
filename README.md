# Loja Online Simplificada - Projeto de Treinamento

## Descrição

Este projeto é parte de um treinamento na Accenture, com o objetivo de criar uma loja online simplificada utilizando Java Spring Boot e RabbitMQ. O sistema simula uma loja onde produtos podem ser comprados e o processo de pagamento é assíncrono. O uso do RabbitMQ é fundamental para garantir a comunicação entre diferentes partes do sistema, como o gerenciamento de pedidos e o processamento de pagamento.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (para desenvolvimento da API RESTful)
- **RabbitMQ** (para comunicação assíncrona entre sistemas)
- **Spring Data JPA** (para persistência de dados)
- **H2 Database** (banco de dados em memória para desenvolvimento)
- **IntelliJ IDEA** (IDE utilizada para o desenvolvimento)

## Funcionalidades

- **Criação de Produtos**: Adicionar, listar e editar produtos disponíveis na loja.
- **Cadastro de Pedidos**: O cliente pode realizar pedidos de produtos e visualizar seu status.
- **Comunicação Assíncrona**: Utilização do RabbitMQ para enviar e processar pedidos de maneira assíncrona.
- **Simulação de Pagamento**: O sistema simula o processo de pagamento com confirmação assíncrona.

## Estrutura do Projeto

- **src/main/java/com/loja**:
  - **controllers**: Contém os controladores REST para expor a API.
  - **models**: Define os modelos de dados como Produto, Pedido e Pagamento.
  - **repositories**: Interfaces para acessar o banco de dados.
  - **services**: Lógica de negócios, incluindo interação com o RabbitMQ.
  - **configurations**: Configuração do RabbitMQ e do Spring Boot.
  
- **src/main/resources**:
  - **application.properties**: Configurações do Spring Boot e RabbitMQ.

## Como Rodar

### 1. Pré-requisitos
- **JDK 17** ou superior.
- **RabbitMQ** instalado e em execução localmente.
- **Maven** ou **Gradle** (dependendo da sua preferência para gerenciar dependências).

### 2. Configuração do RabbitMQ
Antes de rodar o projeto, é necessário ter o RabbitMQ em execução. Você pode iniciar o RabbitMQ com o Docker:

```bash
docker run -d -p 5672:5672 -p 15672:15672 rabbitmq:management
