# TechStore

## Descrição
TechStore é uma aplicação web para gerenciar produtos de uma loja. Utiliza Spring Boot para o backend, Thymeleaf para o frontend e MariaDB como banco de dados.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot**: Framework utilizado para criar a aplicação web.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **MariaDB**: Sistema de gerenciamento de banco de dados relacional.
- **Docker Compose**: Ferramenta para definir e gerenciar multi-containers Docker.
- **Thymeleaf**: Motor de templates utilizado para renderizar as páginas HTML.

### Pré-requisitos
- Docker e Docker Compose instalados.
- JDK 17 ou superior instalado.
- Maven instalado.
  
#### Instruções para Executar o Projeto

1. **Configurar o Docker Compose**:
   - Certifique-se de que o Docker e o Docker Compose estão instalados na sua máquina.
   - Navegue até o diretório onde está localizado o arquivo `compose.yaml` e execute o comando:
     ```sh
     docker-compose up -d
     ```

2. **Verificar o Serviço MariaDB**:
   - Certifique-se de que o serviço MariaDB está em execução corretamente:
     ```sh
     docker-compose ps
     ```
3. **Editar o application.properties**:
   - Preencha o arquivo application.properties com as credenciais do banco cadastradas no composer.yaml   

4. **Executar a Aplicação Spring Boot**:
   - Navegue até o diretório raiz do seu projeto Spring Boot e execute o comando Maven para iniciar a aplicação:
     ```sh
     ./mvnw spring-boot:run
     ```

5. **Acessar a Aplicação**:
   - Abra um navegador web e navegue até `http://localhost:8080` para acessar a página HTML do seu projeto.
