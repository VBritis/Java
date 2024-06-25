public class GerenciadorDeTarefas {
    private Tarefa[] listaTarefas;
    

    public  GerenciadorDeTarefas(){
        listaTarefas = new Tarefa[50];


    }
    public void addTarefa(Tarefa tarefa){
            for(int x = 0; x < listaTarefas.length; x++){
                if(listaTarefas[x] == null){
                    listaTarefas[x] = tarefa;
                    break;
                }
                
            }
        }

    public String getTarefa(String nome, String responsavel, int id){
        for(int z = 0; z < listaTarefas.length; z++){
            if(listaTarefas[z].getNome() == nome ){
                return listaTarefas[z].toString();
            }
            else if(listaTarefas[z].getResponsavel().getNome() == responsavel){
                return listaTarefas[z].toString();
            }
            else if(listaTarefas[z].getResponsavel().getId() == id){
                return listaTarefas[z].toString();

            }
        }
        return "Não foi possível encontrar a tarefa em questão";
    }
}


    

    

