# Sistema de Gerenciamento de Clientes, Fornecedores e Lojas

Este projeto é um sistema de gerenciamento baseado em arquitetura REST para manipulação de dados de **Clientes**, **Fornecedores** e **Lojas**. Ele utiliza **Spring Boot** e segue boas práticas de separação de responsabilidades com Controllers, DTOs e Services.

---

## 📋 Funcionalidades

- Gerenciamento de **Clientes**
  - Criar, listar, buscar por ID e deletar.
- Gerenciamento de **Fornecedores**
  - Criar, listar, buscar por ID e deletar.
- Gerenciamento de **Lojas**
  - Criar, listar, buscar por ID e deletar.

---

## 🚀 Tecnologias Utilizadas

- **Java 11+**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (ou outro banco configurável)
- **Maven**

---

## 📂 Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/   # Controllers REST
│   │   ├── dto/          # Objetos DTO
│   │   ├── service/      # Serviços
│   │   ├── entity/       # Entidades 
│   │   ├── repository/   # Repositórios 
│   │   └── DemoApplication.java  # Classe principal
└── test/ ...             # Testes
```

---

## 📌 Endpoints

### Clientes (`/clientes`)

| Método HTTP | Endpoint         | Descrição                     |
|-------------|------------------|-------------------------------|
| `POST`      | `/`              | Criação de um cliente.        |
| `GET`       | `/`              | Listagem de todos os clientes.|
| `GET`       | `/{id}`          | Busca de um cliente por ID.   |
| `DELETE`    | `/{id}`          | Exclusão de um cliente por ID.|

### Fornecedores (`/fornecedores`)

| Método HTTP | Endpoint         | Descrição                        |
|-------------|------------------|----------------------------------|
| `POST`      | `/`              | Criação de um fornecedor.        |
| `GET`       | `/`              | Listagem de todos os fornecedores.|
| `GET`       | `/{id}`          | Busca de um fornecedor por ID.   |
| `DELETE`    | `/{id}`          | Exclusão de um fornecedor por ID.|

### Lojas (`/lojas`)

| Método HTTP | Endpoint         | Descrição                     |
|-------------|------------------|-------------------------------|
| `POST`      | `/`              | Criação de uma loja.          |
| `GET`       | `/`              | Listagem de todas as lojas.   |
| `GET`       | `/{id}`          | Busca de uma loja por ID.     |
| `DELETE`    | `/{id}`          | Exclusão de uma loja por ID.  |

---

## 🛠 Configuração e Execução

### Pré-requisitos

1. **Java 11+** instalado.
2. **Maven** configurado no ambiente.
3. Banco de dados **H2** (ou outro banco configurado).

### Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd <PASTA_DO_PROJETO>
   ```
2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
3. Acesse a aplicação em:  
   ```
   http://localhost:8080
   ```

---

## 🛠 Detalhes Técnicos

### DTOs

- **ClienteDTO**
  ```json
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@example.com"
  }
  ```

- **FornecedorDTO**
  ```json
  {
    "id": 1,
    "nome": "Fornecedor A",
    "contato": "contato@example.com"
  }
  ```

- **LojaDTO**
  ```json
  {
    "id": 1,
    "nome": "Loja X",
    "endereco": "Rua das Flores, 123"
  }
  ```

### Exceções

- Quando um recurso não é encontrado, uma exceção `RuntimeException` é lançada com a mensagem apropriada.

---

## 📄 Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto.
2. Crie uma branch para a sua funcionalidade:
   ```bash
   git checkout -b minha-funcionalidade
   ```
3. Faça suas alterações e envie um pull request.

---

## 📝 Licença

Este projeto é distribuído sob a licença **MIT**. Sinta-se à vontade para usá-lo e modificá-lo. 😊

--- 
