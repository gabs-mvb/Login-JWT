# Sistema de Login e Cadastro com JWT

Este projeto é um sistema de login e cadastro utilizando JWT (JSON Web Tokens) para autenticação. Ele foi desenvolvido com Spring Boot e inclui todas as funcionalidades básicas de um sistema de autenticação.

## Funcionalidades

- Cadastro de usuários
- Login de usuários
- Autenticação via JWT
- Proteção de rotas com base no token JWT
- Codificação de senhas com `BCryptPasswordEncoder`

## Pré-requisitos

- JDK 17
- Maven 3.6.0 ou superior

## Tecnologias Utilizadas

- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Hibernate
- Mysql ou H2 Database (para ambiente de desenvolvimento)
- Maven

## Como Rodar o Projeto

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

2. **Compile e execute a aplicação:**
   
```bash
mvn clean install
```

A aplicação estará disponível em http://localhost:8080.

## Endpoints

### Autenticação

- **POST /usuarios/cadastro:** Cadastrar um novo usuário.

  **Requisição:**
  ```json
  {
    "nome": "nome",
    "sobrenome": "sobrenome",
    "email": "example@gmail.com",
    "senha": "senha",
    "telefone": "XXXXXXXXX",
    "cpf": "XXXXXXXXXX"
  }

  ```
- **POST /usuarios/login:** login de usuário.

  **Requisição:**
  ```json
  {
    "email": "example@gmail.com",
    "senha": "senha"
  }

## Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

