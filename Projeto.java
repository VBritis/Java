public class Projeto {
    private String nome;                    // Declaração de variável para o nome do projeto
    private int[] dias;                     // Array para armazenar dias específicos do projeto
    private int prazo;                      // Prazo de conclusão do projeto
    public Tarefa[] listaDeTarefas;         // Array de objetos Tarefa para armazenar as tarefas do projeto
    private Membro[] listaDeMembros;         // Array de objetos Membro para armazenar os membros do projeto
    private Calendario calendario;          // Objeto Calendario para gerenciar datas e reuniões
    private Reuniao[] listaDeReunioes;      // Array de objetos Reuniao para armazenar as reuniões do projeto
    private Gerenciador gerenciador;        // Referência ao gerenciador geral do sistema
    private Analise analise;                // Objeto de análise associado ao projeto

    public Projeto(String nome, int prazo, Gerenciador gerenciador) {
        this.analise = new Analise(listaDeTarefas, this);  // Inicialização da análise associada ao projeto
        this.nome = nome;                   // Inicialização do nome do projeto
        this.dias = new int[50];            // Inicialização do array de dias com tamanho fixo 50
        this.listaDeTarefas = new Tarefa[50]; // Inicialização do array de tarefas com tamanho fixo 50
        this.listaDeMembros = new Membro[50]; // Inicialização do array de membros com tamanho fixo 50
        this.listaDeReunioes = new Reuniao[50]; // Inicialização do array de reuniões com tamanho fixo 50
        this.gerenciador = gerenciador;     // Atribuição do gerenciador passado como parâmetro
        this.prazo = prazo;                 // Atribuição do prazo de conclusão do projeto

        gerenciador.addProjeto(this);       // Adiciona este projeto ao gerenciador global

        // Inicialização do calendário associado ao projeto
        this.calendario = new Calendario(2, gerenciador.getMes(), gerenciador.getAno(), 0, 3);

        // Preenche a lista de membros do projeto com base nas tarefas existentes
        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] != null && listaDeTarefas[x].getResponsavel() != null) {
                this.listaDeMembros[x] = listaDeTarefas[x].getResponsavel();
            }
        }
    }

    // Métodos getters para retornar informações específicas do projeto
    public String getNome() {
        return nome;
    }

    public int getPrazo() {
        return prazo;
    }

    public String getReunioes() {
        int mes = 0;
        for (int x = 0; x < listaDeReunioes.length; x++) {
            if (listaDeReunioes[x] != null) {
                dias[x] = listaDeReunioes[x].getDia();
                mes = listaDeReunioes[x].getMes();
            } else {
                break;
            }
        }
        System.out.println("\n");
        calendario.preencherCalend();   // Preenche o calendário com as reuniões
        calendario.imprimirCalenReunioes(dias, mes); // Imprime o calendário de reuniões
        return "";
    }

    public Membro getMembro(String nome) {
        for (int z = 0; z < listaDeMembros.length; z++) {
            if (listaDeMembros[z] != null && listaDeMembros[z].getNome().equals(nome)) {
                return listaDeMembros[z];   // Retorna o membro pelo nome
            }
        }
        return null;
    }

    public String getMembrosinfo() {
        String a = "\n";
        for (int z = 0; z < listaDeMembros.length; z++) {
            if (listaDeMembros[z] != null) {
                a += listaDeMembros[z].toString() + "\n"; // Retorna informações dos membros
            }
        }
        return a;
    }

    public String getReunioesinfo() {
        String a = "\n";
        for (int z = 0; z < listaDeReunioes.length; z++) {
            if (listaDeReunioes[z] != null) {
                a += listaDeReunioes[z].toString() + "\n"; // Retorna informações das reuniões
            }
        }
        return a;
    }

    public String getTarefasinfo() {
        String a = "\n";
        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] == null) {
                break;
            } else {
                a += listaDeTarefas[x].toString() + "\n"; // Retorna informações das tarefas
            }
        }
        return a;
    }

    public void addTarefa(Tarefa tarefa) {
        // Verifica se a tarefa já existe na lista
        for (int i = 0; i < listaDeTarefas.length; i++) {
            if (listaDeTarefas[i] != null && listaDeTarefas[i].getNome().equals(tarefa.getNome())) {
                System.out.println("Tarefa já existe no projeto.");
                return; // Não adiciona se já existe
            }
        }

        // Adiciona a tarefa à lista
        for (int i = 0; i < listaDeTarefas.length; i++) {
            if (listaDeTarefas[i] == null) {
                listaDeTarefas[i] = tarefa;
                return;
            }
        }
        System.out.println("Não foi possível adicionar a tarefa. Lista cheia.");
    }

    public void addReuniao(Reuniao reuniao) {
        for (int x = 0; x < listaDeReunioes.length; x++) {
            if (listaDeReunioes[x] == null) {
                listaDeReunioes[x] = reuniao;   // Adiciona uma nova reunião à lista
                break;
            }
        }
    }

    public void addDias(int dia) {
        for (int x = 0; x < dias.length; x++) {
            if (dias[x] == 0) {
                dias[x] = dia;  // Adiciona dias específicos ao projeto
                break;
            }
        }
    }

    public void addMembro(Membro membro) {
        // Verifica se o membro já existe na lista
        for (int i = 0; i < listaDeMembros.length; i++) {
            if (listaDeMembros[i] != null && listaDeMembros[i].getNome().equals(membro.getNome())) {
                System.out.println("Membro já existe no projeto.");
                return; // Não adiciona se já existe
            }
        }

        // Adiciona o membro à lista
        for (int i = 0; i < listaDeMembros.length; i++) {
            if (listaDeMembros[i] == null) {
                listaDeMembros[i] = membro;
                return;
            }
        }
        System.out.println("Não foi possível adicionar o membro. Lista cheia.");
    }

    public String getTarefas() {
        String a = "";
        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] == null) {
                break;
            } else {
                a += listaDeTarefas[x].getNome() + " | "; // Retorna nomes das tarefas
            }
        }
        return a;
    }

    public String getMembros() {
        String a = "";
        for (int x = 0; x < listaDeMembros.length; x++) {
            if (listaDeMembros[x] == null) {
                break;
            } else {
                a += listaDeMembros[x].getNome() + " | "; // Retorna nomes dos membros
            }
        }
        return a;
    }

    // Método toString para representação textual do projeto
    public String toString() {
        String separator = "=================================================";
        String newline = "\n";
        String line = " _______________________________________ ";
    
        String result = newline;
        result += "    Calendario de reuniões" + newline + separator;
        result += getReunioes() + newline + newline;

        result += "Final project details:" + newline + newline;
    
        result += "Projeto: " + nome + newline;
        result += line + newline;

        result += "Tarefas: " + getTarefas() + newline;
        result += line + newline;
        result += "Membros: " + getMembros() + newline;
        
        
        return result;
    }
}
