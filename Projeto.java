public class Projeto{
    private String nome;
    private String dataDeTermino;
    private String dataDeInicio;
    private Tarefa[] listaDeTarefas;
    public Projeto(String nome, String dataDeTermino, String dataDeInicio, Tarefa[] listaDeTarefas){
        this.nome = nome;
        this.dataDeTermino = dataDeTermino;
        this.dataDeInicio = dataDeInicio;
        this.listaDeTarefas = listaDeTarefas;
    }
    public String getNome(){
        return nome;
    }
    
    public String getData(){
        return "Data: " + dataDeInicio + " || " + dataDeTermino ;
    }
    
    public String getTarefas(){
        String a = "";
        for(int x = 0; x < listaDeTarefas.length; x++){
            a += listaDeTarefas[x] ;
        }
        return a;
    }
    public String toString(){
        return "Projeto: " + nome + "\n _______________ \n" + "Data: "  + this.getData() +  "\n _______________ \n" +  "Tarefas: " + this.getTarefas();
    }

}