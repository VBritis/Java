public class Membro {
    private String nome;
    private int id;
    private Tarefa[] lista;
    private String cargo;

    public Membro(String nome, int id, Tarefa[] lista, String cargo){
        if(lista == null){
            lista = new Tarefa[50];
        }
        this.nome = nome;
        this.id = id;
        this.lista = lista;
        this.cargo = cargo;
    }
    public String getNome(){
        return nome;
    }
    
    public int getId(){
        return id;
    }
    
    public Tarefa[] getLista(){
        return lista;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setLista(Tarefa[] lista){
        this.lista = lista;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void addTarefa(Tarefa tarefa){
        for(int x = 0; x < lista.length; x++){
            if(lista[x] == null){
                lista[x] = tarefa;
            }
        }
    }
    public String getTarefas(){
        String a = "";
        for(int x = 0; x < lista.length; x++){
            if(lista[x].equals(null)){
                break;
            }
            else{
                a += lista[x];
            }
        }
        return a;
    
    }
    
    public String toString(){
        return "Nome: " + nome + "\n _______________ \n" + "Id: "  + id +  "\n _______________ \n" +  "Lista de Tarefas: " + this.getTarefas() + "\n _______________ \n" + "Cargo: " + cargo;

    }



}
