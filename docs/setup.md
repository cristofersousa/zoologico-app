## Resumo

Um Zoológico pretende implantar suas instalações na cidade de Joinville, por conta disso
eles necessitam mapear quais animais irão receber. Como a administração, não possui um sistema
eles solicitaram pois não possuem um sistema, segue os requisitos:

1. Cadastrar os animais no sistema usando mySQL;
2. Atualizar as informações dos animais cadastrados;
3. Remover informações de animais que houvessem erro de registro;
4. Leitura de todos os animais cadastrados no sistema;

Para essa fase inicial, eles desejam que sejam salvo as seguintes informações: 

```
id;             // Identificador único (usado no banco de dados)
nome;           // Nome do animal
tipo;           // Tipo de animal (ex: Mamífero, Felino, Réptil, etc.)
habitat;        // Habitat (ex: Terrestre, Aquático, Aéreo)
alimentacao;    // Tipo de alimentação (ex: Herbívoro, Carnívoro, Onívoro)
origem;         // Origem geográfica do animal (ex: África, América do Sul)
peso;           // Peso do animal em quilos
idade;          // Idade do animal em anos
classificacao;  // Classificação biológica (ex: Felidae, Canidae)
```
### Conceitos 

É de suma importância que durante o desenvolvimento desse programa, o aluno tenha vivência e domínio sobre os conceitos:

 - Entidades
 - Modificadores
 - Herança
 - Encapsulamento
 - Polimofismo
 - Design Patterns(Singleton/DAO)
 
### Setup & Instalação
 
Dado a premissa do que já foi abordado em aula, estarei deixando um guia de ferramentas que possam auxiliar durante o 
desenvolvimento, lembrando que não é obrigatório ter todas mas elas poderão lhe apoiar e são ferramentas mais condizentes
do que adota-se no mercado de trabalho frente  á área de Desenvolvimento de Sistemas.o Desenvolvimentoirei colocar alguns programas que entendo como facilitador para o estudo de vocês com as tecnologias

> Links mencionados abaixo são para Windows X64

`Ferramentas: `

1. Java(JDK) 23 ou superior: [link](https://download.oracle.com/java/23/latest/jdk-23_windows-x64_bin.exe)
2. JetBrains Intellij IDEA: [link](https://www.jetbrains.com/idea/)
3. MySQL 9 ou superior: [link](https://dev.mysql.com/downloads/file/?id=531675)
4. DBeaver Community: [link](https://dbeaver.io/files/dbeaver-ce-latest-x86_64-setup.exe)
5. SDK: [link](https://sdkman.io/install/#windows-installation)

## Instalação

> 1. Configuração do JDK

1. Após a instalação do JDK precisa lembrar de adicionar as variáveis de ambiente no PATH
2. Para testar se está tudo ok, após a configuração, no prompt de comando (cmd), digite:

```
java -v
```

> 3. Configuração do MySQL

1. Após a instalação do MySQL, precisa lembrar de adicionar as variáveis de ambiente no PATH
2. Para testar se está tudo ok, após a configuração, no prompt de comando (cmd), digite:

```
mysql -u root -p
```
3. Ele irá solicitar a senha que você configurou, insira ela e deverá ver o prompt, dessa forma:

```sql
 mysql >
```
4. Crie uma database para validar se está funcionando normalmente:
```sql 
CREATE DATABASE zoologicoDB;

USE zoologicoDB;

CREATE TABLE animais (
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         nome VARCHAR(50),
                         habitat VARCHAR(50),
                         alimentacao VARCHAR(50)
);
```

> 4. Configuração do DBeaver

DBeaver é semelhante ao MySQL Workbench, basicamente após ter criado sua database no mySQL agora basta conectar seu 
DBeave á ele, para isso siga as instruções abaixo:

1. Clique no icone da tomada `Conectar a Database`
2. Selecionar mySQL como SGBD
3. Adicionar as informações na janela:

```
database: zooplogicoDB
user: root
password: <aquela que você configurou na instalação> 
```
4. Clique na opção testar conexão, se mostrar sucesso ok.
4.1. Caso tenha mostrado falha, você pode ter recebido uma mensagem como `“Public Key Retrieval is not allowed”` 
4.2.  Clique na aba `Driver properties ou Propriedades do Driver` que fica depois dessa que você informou as
configurações ou de usuario e senha, e procure pela opção *allowPublickKeyRetrieval* ela estará com a opção false, 
altere para true.
5. Feito isso, retorne para a aba Main e faça a opção de testar conectivdade.




## Configuração

> JetBrains
1. Criar um projeto Java com Maven
2. 
2. 