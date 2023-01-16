# NextTasks

**Número da Lista**: Não se aplica<br>
**Conteúdo da Disciplina**: Algoritmos Ambiciosos<br>

## Alunos
|Matrícula | Aluno |
| -- | -- |
| 19/0010606 | Artur de Sousa Vieira |
| 18/0145363 |  Yan Andrade de Sena  |

## Sobre 
O objetivo do NextTask é apresentar uma interface direta e simples de utilizar, que tem a função de mostrar uma lista de prioridade conforme as tarefas são cadastradas. Para isso é utilizado o algoritmo ambicioso que vê qual tem a menor data de entrega e a partir disso calcula a prioridade das tarefas. 

## Screenshots

### Pagina inicial (Campos não preenchidos)

![Campos não preenchidos](assets-readme/Imagem-sem-nada-preenchido.png) 

### Pagina inicial (Campos preenchidos)

![Campos preenchidos](assets-readme/Imagem-com-campos-preenchidos.png) 

### Tela após tarefa adicionada

![Tarefa adicionada](assets-readme/Imagem-com-tarefa-adicionada.png) 

## Instalação 
**Linguagem**: Java, Typescript<br>
**Framework**: Springboot, Angular<br>

Para rodar o nosso projeto localmente, deverá ter instalado Java (versão 11), Node (versão 16) e Maven(Versão 3.8). Também sugerimos a instalação de uma IDE, o Intellij, já que o mesmo facilita rodar projetos Java.

Para rodar o backend (sem IDE) basta acessar o diretório pokegraph_backend e rodar o comando:

```
mvn spring-boot:run 
```

Para rodar o backend (com a IDE) instalada basta apertar o botão "▶" no método main da classe ``br.com.nexttasks.NextTasksApplication``.

Para rodar o frontend basta ir no diretório pokegraph_frontend e rodar o comando:

```
npm i 
```

Para baixar as dependências e em seguida execute o comando:

```
npm run start
```

A aplicação estará disponível no endereço:

```
http://localhost:4200
```

## Uso 
Para a utilizaçao devemos preencher os campos com o nome da tarefa, a data de entrega e o tempo necessário para elaboração da mesma e em seguida apertar o botão: ``"Adicionar"``.

Após isso vai aparecer logo abaixo do formulário todas as tarefas

## Outros 

### Download Apresentação

Segue o Link para download da [Apresentação do projeto](assets-readme/apresentacao-pokegraph.mp4).<br>
(Para download, clique no link e depois nas opções *Download* ou *View Raw*)
