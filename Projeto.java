public class Projeto{
    private String nome;
    private int[] dias;
    private int prazo;
    public Tarefa[] listaDeTarefas;
    private Membro[] listaDeMembros;
    private Calendario calendario;
    private Reuniao[] listaDeReunioes;
    private Gerenciador gerenciador;
    public Projeto(String nome, int prazo, Gerenciador gerenciador){
        this.nome = nome;
        this.dias = new int[50];
        this.listaDeTarefas = new Tarefa[50];
        this.listaDeMembros = new Membro[50];
        this.listaDeReunioes = new Reuniao[50];
        gerenciador.addProjeto(this);
        this.calendario = new Calendario(2,gerenciador.getMes(),gerenciador.getAno(),prazo,3);//Concertar calendario, o dia aqui ta influenciando
        
        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] != null && listaDeTarefas[x].getResponsavel() != null) {
                this.listaDeMembros[x] = listaDeTarefas[x].getResponsavel();
            }
        }
    }
    public String getNome(){
        return nome;
    }
    
    public String getReunioes(){
        for(int x = 0; x < listaDeReunioes.length; x++){ 
            if(listaDeReunioes[x] != null){
                dias[x] = listaDeReunioes[x].getDia();
            }else{
                break;
            }
    }
        System.out.println("\n");
        calendario.preencherCalend();
        calendario.imprimirCalenReunioes(dias);
        return"";
        
    }
    public void addTarefa(Tarefa tarefa){
        for(int x = 0; x < listaDeTarefas.length; x++){
            if(listaDeTarefas[x] == null){
                listaDeTarefas[x] = tarefa;
                break;
            }
            
        }
    }
    public void addReuniao(Reuniao reuniao){
        for(int x = 0; x < listaDeReunioes.length; x++){
            if(listaDeReunioes[x] == null){
                listaDeReunioes[x] = reuniao;
                break;
            }
            
        }
    }

    public void addDias(int dia){
        for(int x = 0; x < dias.length; x++){
            if(dias[x] == 0){
                dias[x] = dia;
                break;
            }
            
        }
    }


    public void addMembro(Membro membro){
        for(int x = 0; x < listaDeMembros.length; x++){
            if(listaDeMembros[x] == null){
                listaDeMembros[x] = membro;
                break;
            }
            
        }
    }
    
    public String getTarefas(){
        String a = "";
        for(int x = 0; x < listaDeTarefas.length; x++){
            if(listaDeTarefas[x] == null){
                break;
            }
            else{
                a +=  listaDeTarefas[x].getNome() + " | ";
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
                a +=  listaDeMembros[x].getNome() + " | ";
            }
    
        }
        
        return a;
    
    }
    
    public String toString(){
        return "    Calendario de reuniões" + this.getReunioes() +"\n\n" + "Projeto: " + nome  +  "\n _______________ \n" +  "Tarefas: " + this.getTarefas() + "\n _______________ \n" + "Membros: " + this.getMembros();
    }
}