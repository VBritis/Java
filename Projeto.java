public class Projeto{
    private String nome;
    private String dataDeTermino;
    private String dataDeInicio;
    private Tarefa[] listaDeTarefas;
    private Membro[] listaDeMembros;
    public Projeto(String nome, String dataDeTermino, String dataDeInicio, Tarefa[] listaDeTarefas, Membro[] listaDeMembros){
        this.nome = nome;
        this.dataDeTermino = dataDeTermino;
        this.dataDeInicio = dataDeInicio;
        this.listaDeTarefas = listaDeTarefas;
        this.listaDeMembros = new Membro[50];
        
        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] != null && listaDeTarefas[x].getResponsavel() != null) {
                this.listaDeMembros[x] = listaDeTarefas[x].getResponsavel();
            }
        }
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
            if(listaDeTarefas[x] == null){
                break;
            }
            else{
                a +=  listaDeTarefas[x].getNome() + ",";
            }
    
        }
        
        return a;
    }

    public String getMembros(){
        String a = "";
        for(int x = 0; x < listaDeMembros.length; x++){
            if(listaDeMembros[x] == null){
                break;
            }
            else if(listaDeMembros[x] != listaDeMembros[x+1]){
                a +=  listaDeMembros[x].getNome() + ",";
            }
    
        }
        
        return a;
    
    }
    public String toString(){
        return "\n"  + "Projeto: " + nome + "\n _______________ \n"  + this.getData() +  "\n _______________ \n" +  "Tarefas: " + this.getTarefas() + "\n _______________ \n" + "Membros " + this.getMembros();
    }
}