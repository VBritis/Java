public class Tarefa {
    private String nome;           // Nome da tarefa
    private String descricao;      // Descrição da tarefa
    private Membro responsavel;    // Membro responsável pela tarefa
    private int prazo;             // Prazo para conclusão da tarefa
    private int status;            // Status atual da tarefa
    private Gerenciador gerenciador;  // Gerenciador associado à tarefa
    private Projeto projeto;       // Projeto ao qual a tarefa pertence

    public Tarefa(String nome, String descricao, Membro responsavel, int prazo, int status, Projeto projeto, Gerenciador gerenciador) {
        this.nome = nome;                   // Inicializa o nome da tarefa
        this.descricao = descricao;         // Inicializa a descrição da tarefa
        this.responsavel = responsavel;     // Inicializa o responsável pela tarefa
        this.prazo = prazo;                 // Inicializa o prazo da tarefa
        this.status = status;               // Inicializa o status da tarefa
        this.gerenciador = gerenciador;     // Inicializa o gerenciador associado
        responsavel.addTarefa(this);        // Adiciona a tarefa à lista de tarefas do responsável
        projeto.addTarefa(this);            // Adiciona a tarefa à lista de tarefas do projeto
        gerenciador.addTarefa(this);        // Adiciona a tarefa ao gerenciador
        projeto.addMembro(responsavel);     // Adiciona o responsável como membro do projeto
        gerenciador.addProjeto(projeto);    // Adiciona o projeto ao gerenciador
    }

    // Métodos getters e setters para os atributos da classe

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Membro getResponsavel() {
        return responsavel;
    }

    public int getPrazo() {
        return prazo;
    }

    public int getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResponsavel(Membro responsavel) {
        this.responsavel = responsavel;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    // Método toString para representar a tarefa como uma String formatada

    public String toString() {
        return "Tarefa: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Responsável: " + responsavel.getNome() + "\n" +
               "Prazo: " + prazo + "\n" +
               "Status: " + status;
    }
}
