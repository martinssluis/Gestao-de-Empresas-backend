# Gestao-de-Empresas-backend

API REST para sistema de gestão de empresas desenvolvida com Spring Boot, seguindo arquitetura em camadas.

## 🚀 Tecnologias

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (desenvolvimento)
- **Maven**

## 📁 Estrutura do Projeto

```
backend/
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── Gestao-De-Empresas/
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── com/
│       │   │       └── aceleradev/
│       │   │           └── backend/
│       │   │               ├── config/          # Configurações da aplicação
│       │   │               ├── entities/        # Entidades JPA (Client, etc)
│       │   │               ├── repositories/    # Repositórios Spring Data
│       │   │               ├── resources/       # Controllers REST
│       │   │               ├── services/        # Lógica de negócio
│       │   │               └── BackendApplication.java
│       │   └── resources/
│       │       ├── static/
│       │       ├── templates/
│       │       ├── application.properties
│       │       ├── application-test.properties
│       │       └── application.yml
│       └── test/
│           └── java/
│               └── com/
│                   └── aceleradev/
│                       └── backend/
│                           └── BackendApplicationTests.java
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🏗️ Arquitetura em Camadas

### 📦 **entities/**
Entidades JPA que representam as tabelas do banco de dados.
- `Client.java` - Entidade cliente com anotações JPA (@Entity, @Id, @GeneratedValue)

### 🗄️ **repositories/**
Interfaces que estendem JpaRepository para operações de banco de dados.
- `ClientRepository.java` - Repositório para operações CRUD de Client

### 💼 **services/**
Camada de lógica de negócio com injeção de dependências.
- `ClientService.java` - Serviços relacionados ao Client

### 🌐 **resources/**
Controllers REST que expõem os endpoints da API.
- `ClientResource.java` - Endpoints REST para Client

### ⚙️ **config/**
Classes de configuração da aplicação (database seeding, beans, etc).

## 🔧 Como Executar

### Pré-requisitos
- Java 17+
- Maven 3.x

### Executar a aplicação

#### Via Maven Wrapper (recomendado):
```bash
# Linux/Mac
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

#### Via Maven (se instalado globalmente):
```bash
mvn spring-boot:run
```

### Executar testes
```bash
./mvnw test
```

## 🗃️ Banco de Dados

A aplicação utiliza **H2 Database** em memória para desenvolvimento.

### Acessar H2 Console:
1. Execute a aplicação
2. Acesse: `http://localhost:8080/h2-console`
3. JDBC URL: `jdbc:h2:mem:testdb`
4. Username: `sa`
5. Password: (deixe em branco)

## 📚 Endpoints da API

### Client
- `GET /clients` - Listar todos os clientes
- `GET /clients/{id}` - Buscar cliente por ID
- `POST /clients` - Criar novo cliente
- `PUT /clients/{id}` - Atualizar cliente
- `DELETE /clients/{id}` - Deletar cliente

## 🎯 Funcionalidades Implementadas

- ✅ Entidade Client com JPA
- ✅ Repository Pattern com Spring Data
- ✅ Service Layer com injeção de dependência
- ✅ REST Controllers
- ✅ Database Seeding (dados iniciais)
- ✅ Configuração H2 Database

## 📝 Notas de Desenvolvimento

- O projeto segue o padrão **MVC** (Model-View-Controller)
- Utiliza **Dependency Injection** do Spring
- **Database Seeding** configurado para popular dados iniciais
- Arquivos de configuração em `application.properties` e `application.yml`

## 🤝 Contribuindo

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto é open source e está disponível sob a licença MIT.
