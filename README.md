Testes automatizados com RestAsure
Este é um projeto de testes automatizados utilizando a biblioteca RestAsure para realizar testes em serviços web RESTful.

Requisitos
Para executar este projeto, você precisará ter instalado em sua máquina:

Java JDK 11 ou superior
Maven 3.6.3 ou superior
Configuração
Antes de executar os testes, é necessário configurar a URL do serviço que será testado. Essa configuração deve ser realizada no arquivo application.properties, localizado na pasta src/main/resources.

O arquivo deve conter a seguinte propriedade:

arduino
Copy code
restapi.url=https://url.do.servico.rest
Substitua https://url.do.servico.rest pela URL do serviço que será testado.

Executando os testes
Para executar os testes, basta abrir um terminal na raiz do projeto e executar o seguinte comando:

bash
Copy code
mvn clean test
Isso irá baixar as dependências do projeto, compilar o código e executar os testes automatizados.

Caso queira executar apenas um teste específico, basta informar o nome do teste como argumento do comando:

bash
Copy code
mvn clean test -Dtest=NomeDoTeste
Estrutura do projeto
O projeto possui a seguinte estrutura:

css
Copy code
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── empresa
│   │   │           └── teste
│   │   │               └── automatizado
│   │   │                   └── Application.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── empresa
│                   └── teste
│                       └── automatizado
│                           ├── NomeDoTeste.java
│                           └── OutroTeste.java
├── .gitignore
├── pom.xml
└── README.md
A classe Application contém o método principal da aplicação, que inicia o servidor HTTP utilizado nos testes.

Na pasta src/test/java/com/empresa/teste/automatizado estão as classes de testes, onde cada classe representa um conjunto de testes para um determinado recurso do serviço REST.

Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.
