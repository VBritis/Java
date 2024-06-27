public class Projeto{
    private String nome;
    private int prazo;
    private Tarefa[] listaDeTarefas;
    private Membro[] listaDeMembros;
    private Calendario calendario;
    private Reuniao[] listaDeReunioes;
    private Gerenciador gerenciador;
    public Projeto(String nome, int prazo ,  Gerenciador gerenciador){
        this.nome = nome;
        this.prazo = prazo;
        this.listaDeTarefas = new Tarefa[50];
        this.listaDeMembros = new Membro[50];
        gerenciador.addProjeto(this);
        this.calendario = new Calendario(gerenciador.getDia(),gerenciador.getMes(),gerenciador.getAno(),prazo,12);
        
        for (int x = 0; x < listaDeTarefas.length; x++) {
            if (listaDeTarefas[x] != null && listaDeTarefas[x].getResponsavel() != null) {
                this.listaDeMembros[x] = listaDeTarefas[x].getResponsavel();
            }
        }
    }
    public String getNome(){
        return nome;
    }z
    
    public String getData(){
        int[] dias = new int[31];
        for(int x =0; x < listaDeReunioes.length; x++){ //Fazer calendario que receba mais de um dia para marcar, lista?
            if(listaDeReunioes[x] != null){
                listaDeReunioes[x].getDia = tarefa;
                break;
        }
        System.out.println("\n");
        calendario.atual();
        calendario.preencherCalend();
        calendario.imprimirCalen();
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
        return "    Calendario de reuniões" + this.getData() +"\n\n" + "Projeto: " + nome  +  "\n _______________ \n" +  "Tarefas: " + this.getTarefas() + "\n _______________ \n" + "Membros: " + this.getMembros();
    }
}