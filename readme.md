````
zoologico
│
├── src
│   ├── main
│   │   └── java
│   │       └── org
│   │           └── zoologico
│   │               ├── Animal.java
│   │               ├── Felino.java
│   │               ├── Mamifero.java
│   │               ├── AnimalDAO.java
│   │               ├── Conexao.java
│   │               └── Main.java
└── pom.xml


````


### Estrutura do Projeto
O projeto será organizado nas seguintes classes:

- Animal - Classe que representa um animal no zoológico.
- Felino e Mamifero - Classes que herdam de Animal.
- AnimalDAO - Classe responsável pelas operações CRUD no banco de dados.
- Conexao - Classe que gerencia a conexão com o banco de dados.
- Main - Classe que contém o ponto de entrada do programa, onde testamos as operações CRUD.