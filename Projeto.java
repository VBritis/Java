class Projeto {
    private String nome;
    private int[] dias;
    private int prazo;
    public Tarefa[] listaDeTarefas;
    private Membro[] listaDeMembros;
    private Calendario calendario;
    private Reuniao[] listaDeReunioes;
    private Gerenciador gerenciador;
    private Analise analise;

    public Projeto(String nome, int prazo, Gerenciador gerenciador) {
        this.analise = new Analise(listaDeTarefas, this);
        this.nome = nome;
        this.dias = new int[50];
        this.listaDeTarefas = new Tarefa[50];
        this.listaDeMembros = new Membro[50];
        this.listaDeReunioes = new Reuniao[50];
        this.gerenciador = gerenciador;
        this.prazo = prazo;
        gerenciador.addProjeto(this);
        this.calendario = new Calendario(2, gerenciador.getMes(), gerenciador.getAno(), 0, 3);

        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] != null && listaDeTarefas[x].getResponsavel() != null) {
                this.listaDeMembros[x] = listaDeTarefas[x].getResponsavel();
            }
        }
    }

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
        calendario.preencherCalend();
        calendario.imprimirCalenReunioes(dias, mes);
        return "";
    }

    public Membro getMembro(String nome) {
        for (int z = 0; z < listaDeMembros.length; z++) {
            if (listaDeMembros[z] != null && listaDeMembros[z].getNome().equals(nome)) {
                return listaDeMembros[z];
            }
        }
        return null;
    }

    
    public String getMembrosinfo() {
        String a = "\n";
        for (int z = 0; z < listaDeMembros.length; z++) {
            if (listaDeMembros[z] != null) {
                a += listaDeMembros[z].toString() + "\n";
            }
        }
        return a;
    }

    public String getReunioesinfo() {
        String a = "\n";
        for (int z = 0; z < listaDeReunioes.length; z++) {
            if (listaDeReunioes[z] != null) {
                a += listaDeReunioes[z].toString() + "\n";
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
                a += listaDeTarefas[x].toString() + "\n";
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
                listaDeReunioes[x] = reuniao;
                break;
            }
        }
    }

    public void addDias(int dia) {
        for (int x = 0; x < dias.length; x++) {
            if (dias[x] == 0) {
                dias[x] = dia;
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
                a += listaDeTarefas[x].getNome() + " | ";
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
                a += listaDeMembros[x].getNome() + " | ";
            }
        }
        return a;
    }

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