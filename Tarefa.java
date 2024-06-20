public class Tarefa {
    private String nome;
    private String descricao;
    private Membro responsavel;
    private String prazo;
    private String status;

    public Tarefa(String nome, String descricao, Membro responsavel, String prazo, String status){
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.prazo = prazo;
        this.status = status;
        responsavel.addTarefa(this);
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
    
    public String getPrazo(){
        return prazo;
    }
    
    public String getStatus(){
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
    
    public void setPrazo(String prazo){
        this.prazo = prazo;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String toString(){
        return "Tarefa: " + nome + "\n _______________ \n" + "Descrição: "  + descricao +  "\n _______________ \n" +  "Responsável: " + responsavel.getNome() + "\n _______________ \n" + "Prazo: " + prazo + "\n _______________ \n" + "Status: " + status;

    }


}
