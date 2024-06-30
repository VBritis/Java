public class Gerenciador {
    private Tarefa[] listaTarefas;
    private Projeto[] listaProjetos;
    private int dia;
    private int mes;
    private int ano;
    

    public  Gerenciador(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        listaTarefas = new Tarefa[50];
        listaProjetos = new Projeto[50];


    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }


    public void addProjeto(Projeto projeto){
        for(int x = 0; x < listaProjetos.length; x++){
            if(listaProjetos[x] == null){
                listaProjetos[x] = projeto;
                break;
            }
            
        }
    }

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }



    public Projeto getProjeto(String nome){
        for(int z = 0; z < listaProjetos.length; z++){
            if(listaProjetos[z].getNome() == nome ){
                return listaProjetos[z];
            }
        }
        return null;
        
    
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
            else if(listaTarefas[z].getResponsavel().getNome() == responsavel){ //Corrigir, quando tiver mais de uma tarefa orientada ao mesmo membro
                return listaTarefas[z].getResponsavel().getTarefas();
            }
            else if(listaTarefas[z].getResponsavel().getId() == id){
                return listaTarefas[z].toString();

            }
        }
        return "Não foi possível encontrar a tarefa em questão";
    }



}


    

    

