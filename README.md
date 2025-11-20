# Gestao-de-Empresas-backend

## Estrutura do projeto

```
├── 📁 backend
│   ├── 📁 .mvn
│   │   └── 📁 wrapper
│   │       └── 📄 maven-wrapper.properties
│   ├── 📁 Gestao-De-Empresas
│   │   ├── 📁 src
│   │   │   ├── 📁 main
│   │   │   │   ├── 📁 java
│   │   │   │   │   └── 📁 com
│   │   │   │   │       └── 📁 example
│   │   │   │   │           └── ☕ Main.java
│   │   │   │   └── 📁 resources
│   │   │   └── 📁 test
│   │   │       └── 📁 java
│   │   └── ⚙️ pom.xml
│   ├── 📁 src
│   │   ├── 📁 main
│   │   │   ├── 📁 java
│   │   │   │   └── 📁 com
│   │   │   │       └── 📁 aceleradev
│   │   │   │           └── 📁 backend
│   │   │   │               └── ☕ BackendApplication.java
│   │   │   └── 📁 resources
│   │   │       ├── 📁 static
│   │   │       ├── 📁 templates
│   │   │       ├── 📄 application-test.properties
│   │   │       ├── 📄 application.properties
│   │   │       └── ⚙️ application.yml
│   │   └── 📁 test
│   │       └── 📁 java
│   │           └── 📁 com
│   │               └── 📁 aceleradev
│   │                   └── 📁 backend
│   │                       └── ☕ BackendApplicationTests.java
│   ├── 📁 untitled
│   │   ├── 📁 src
│   │   │   ├── 📁 main
│   │   │   │   ├── 📁 java
│   │   │   │   │   └── 📁 com
│   │   │   │   │       ├── 📁 aceleradev
│   │   │   │   │       └── ☕ Main.java
│   │   │   │   └── 📁 resources
│   │   │   └── 📁 test
│   │   │       └── 📁 java
│   │   └── ⚙️ pom.xml
│   ├── ⚙️ .gitattributes
│   ├── ⚙️ .gitignore
│   ├── 📝 HELP.md
│   ├── 📄 mvnw
│   ├── 📄 mvnw.cmd
│   └── ⚙️ pom.xml
└── 📝 README.md
```


### Pastas principais

- **`backend/`**  
  Pasta raiz do projeto backend em Java com Spring Boot e Maven.

- **`backend/src/main/java/com/aceleradev/backend/`**  
  Contém o código-fonte principal da aplicação Spring Boot.
    - **`BackendApplication.java`**: classe principal da aplicação, ponto de entrada (`main`) do Spring Boot.

- **`backend/src/main/resources/`**  
  Contém arquivos de configuração e recursos da aplicação.
    - **`application.properties` / `application.yml`**: arquivos de configuração da aplicação (banco de dados, portas, profiles etc).
    - **`application-test.properties`**: configurações específicas para o ambiente de teste.
    - **`static/`**: arquivos estáticos (CSS, JS, imagens), se necessário.
    - **`templates/`**: templates de visualização (por exemplo, Thymeleaf), se utilizados.

- **`backend/src/test/java/com/aceleradev/backend/`**  
  Contém os testes automatizados da aplicação.
    - **`BackendApplicationTests.java`**: classe de testes base da aplicação.

- **`backend/.mvn/`**  
  Arquivos relacionados ao Maven Wrapper, permitindo rodar o projeto sem Maven instalado globalmente.
    - **`maven-wrapper.properties`**: configurações do Maven Wrapper.

- **`backend/pom.xml`**  
  Arquivo de configuração Maven principal do projeto. Define dependências, plugins e configurações de build.

- **`backend/Gestao-De-Empresas/`**  
  Projeto Maven adicional (módulo) com sua própria estrutura `src` e `pom.xml`. Pode ser um módulo antigo, um experimento ou um subprojeto relacionado à gestão de empresas.

- **`backend/untitled/`**  
  Outro projeto Maven separado, possivelmente criado para testes/investigações. Também possui sua própria estrutura `src` e `pom.xml`.

- **`.gitignore` / `.gitattributes`**  
  Arquivos de configuração do Git para ignorar arquivos/pastas e ajustar atributos de commits.

- **`mvnw` / `mvnw.cmd`**  
  Scripts do Maven Wrapper para rodar o Maven via linha de comando em Linux/Mac (`mvnw`) ou Windows (`mvnw.cmd`).

- **`README.md`**  
  Arquivo de documentação principal do projeto. Contém visão geral, instruções de uso e detalhes da estrutura.
