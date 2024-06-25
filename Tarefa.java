public class Tarefa {
    private String nome;
    private String descricao;
    private Membro responsavel;
    private int prazo;
    private int status;
    private GerenciadorDeTarefas gerenciador;

    public Tarefa(String nome, String descricao, Membro responsavel, int prazo, int status, GerenciadorDeTarefas gerenciador){
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.prazo = prazo;
        this.status = status;
        this.gerenciador = gerenciador;
        responsavel.addTarefa(this);
        gerenciador.addTarefa(this);
    }

    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public Membro getResponsavel(){
        return responsavel;
    }
    
    public int getPrazo(){
        return prazo;
    }
    
    public int getStatus(){
        return status;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setResponsavel(Membro responsavel){
        this.responsavel = responsavel;
    }
    
    public void setPrazo(int prazo){
        this.prazo = prazo;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    public String toString(){
        return "Tarefa: " + nome + "\n _______________ \n" + "Descrição: "  + descricao +  "\n _______________ \n" +  "Responsável: " + responsavel.getNome() + "\n _______________ \n" + "Prazo: " + prazo + "\n _______________ \n" + "Status: " + status;

    }


}
