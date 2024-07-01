# Projeto de Gerenciamento de Projetos

Este projeto consiste em um sistema de gerenciamento de projetos desenvolvido em Java, com foco na organização de tarefas, membros, e reuniões.

## Classes Principais

### Projeto

A classe `Projeto` representa um projeto no sistema. Aqui está uma visão geral dos principais métodos e funcionalidades:

#### Atributos

- `nome`: Nome do projeto.
- `dias`: Array de inteiros para armazenar dias relevantes para o projeto.
- `prazo`: Prazo do projeto em dias.
- `listaDeTarefas`: Array de objetos `Tarefa`, representando as tarefas do projeto.
- `listaDeMembros`: Array de objetos `Membro`, representando os membros envolvidos no projeto.
- `calendario`: Objeto `Calendario` para gerenciar datas e reuniões.
- `listaDeReunioes`: Array de objetos `Reuniao`, representando as reuniões do projeto.
- `gerenciador`: Objeto `Gerenciador` responsável pelo gerenciamento do projeto.
- `analise`: Objeto `Analise` para realizar análises das tarefas do projeto.

#### Métodos Principais

- `Projeto(String nome, int prazo, Gerenciador gerenciador)`: Construtor que inicializa um projeto com um nome, prazo e gerenciador. Também inicializa estruturas como `listaDeTarefas`, `listaDeMembros` e `calendario`.
- `getNome()`: Retorna o nome do projeto.
- `getPrazo()`: Retorna o prazo do projeto em dias.
- `getReunioes()`: Retorna uma representação das reuniões do projeto.
- `getMembro(String nome)`: Retorna um membro específico do projeto pelo nome.
- `getMembrosinfo()`: Retorna informações dos membros do projeto.
- `getReunioesinfo()`: Retorna informações das reuniões do projeto.
- `getTarefasinfo()`: Retorna informações das tarefas do projeto.
- `addTarefa(Tarefa tarefa)`: Adiciona uma nova tarefa ao projeto, verificando se ela já existe.
- `addReuniao(Reuniao reuniao)`: Adiciona uma nova reunião ao projeto.
- `addDias(int dia)`: Adiciona um novo dia relevante ao projeto.
- `addMembro(Membro membro)`: Adiciona um novo membro ao projeto.
- `getTarefas()`: Retorna uma representação das tarefas do projeto.
- `getMembros()`: Retorna uma representação dos membros do projeto.
- `toString()`: Retorna uma representação textual detalhada do projeto.

### Calendario

A classe `Calendario` é responsável pela gestão de datas e reuniões dentro do projeto. Aqui estão os principais aspectos:

#### Atributos

- `calendario`: Matriz bidimensional para representar o calendário.
- `inicio`: Dia da semana em que o calendário começa.
- `dia`, `mes`, `ano`: Variáveis para representar a data atual no calendário.
- `prazo`: Prazo relacionado ao calendário.
- `mes`, `ano`: Mês e ano relacionados ao calendário.

#### Métodos Principais

- `Calendario(int dia, int mes, int ano, int prazo, int inicio)`: Construtor que inicializa o calendário com uma data inicial, prazo, e início da semana.
- `setData(int dia, int mes)`: Define a data atual no calendário.
- `atual()`: Atualiza a data no calendário, levando em consideração o prazo e ajustando o mês e ano conforme necessário.
- `preencherCalend()`: Preenche o calendário com dias do mês, considerando o início da semana e os dias do mês.
- `imprimirCalen()`: Imprime o calendário completo.
- `imprimirCalenReunioes(int[] dias, int mes)`: Imprime o calendário marcando os dias de reunião.

### Tarefa

A classe `Tarefa` representa uma tarefa dentro do projeto. Aqui estão os detalhes principais:

#### Atributos

- `nome`: Nome da tarefa.
- `descricao`: Descrição detalhada da tarefa.
- `responsavel`: Membro responsável pela execução da tarefa.
- `prazo`: Prazo para conclusão da tarefa.
- `status`: Estado atual da tarefa.
- `gerenciador`: Gerenciador associado à tarefa.
- `projeto`: Projeto ao qual a tarefa pertence.

#### Métodos Principais

- `Tarefa(String nome, String descricao, Membro responsavel, int prazo, int status, Projeto projeto, Gerenciador gerenciador)`: Construtor que inicializa uma tarefa com nome, descrição, responsável, prazo, status, projeto e gerenciador.
- Métodos getters e setters para os atributos da tarefa.
- `toString()`: Retorna uma representação textual detalhada da tarefa.

