# Loja Online Simplificada

## Descrição

loja online simplificada utilizando Java Spring Boot, RabbitMQ e MySQL. O sistema simula uma loja onde produtos podem ser comprados e o processo de pagamento é assíncrono. O uso do RabbitMQ é fundamental para garantir a comunicação entre diferentes partes do sistema, como o gerenciamento de pedidos e o processamento de pagamento.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot** (para desenvolvimento da API RESTful)
- **RabbitMQ** (para comunicação assíncrona entre sistemas)
- **Spring Data JPA** (para persistência de dados)
- **MySQL** (banco de dados utilizado)
- **IntelliJ IDEA** (IDE utilizada para o desenvolvimento)
- **Docker** (para rodar o RabbitMQ e o MySQL)
- **WSL** (se estiver utilizando Windows)

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
  - **configurations**: Configuração do RabbitMQ, MySQL e do Spring Boot.
  
- **src/main/resources**:
  - **application.properties**: Configurações do Spring Boot, RabbitMQ e MySQL.

## Como Rodar

### 1. Pré-requisitos
- **JDK 21** ou superior.
- **RabbitMQ** e **MySQL** instalados e em execução localmente (via Docker).
- **Docker** instalado.
- **WSL** (se estiver utilizando Windows).
- **Maven** ou **Gradle** (dependendo da sua preferência para gerenciar dependências).

### 2. Rodando o Projeto

Clone o repositório:

```bash
git clone https://github.com/Supiidu/StoreAPI  
cd StoreAPI
````
 ##  Configuração do RabbitMQ e MySQL com Docker
   
Antes de rodar o projeto, é necessário ter o RabbitMQ e o MySQL em execução. Você pode iniciar ambos com o Docker utilizando o seguinte comando:

```bash
docker-compose up -d

docker-compose.yml:
```

Se tiver alguma dúvida ou sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request!
