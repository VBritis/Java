public class Membro {
    private String nome;
    private int id;
    private Tarefa[] lista;
    private String cargo;

    // Construtor da classe Membro
    public Membro(String nome, int id, Tarefa[] lista, String cargo){
        if(lista == null){
            lista = new Tarefa[50]; // Inicializa a lista de tarefas com tamanho 50 se for nula
        }
        this.nome = nome; // Atribui o nome recebido ao membro
        this.id = id; // Atribui o ID recebido ao membro
        this.lista = lista; // Atribui a lista de tarefas recebida ao membro
        this.cargo = cargo; // Atribui o cargo recebido ao membro
    }

    // Getter para o nome do membro
    public String getNome(){
        return nome;
    }
    
    // Getter para o ID do membro
    public int getId(){
        return id;
    }
    
    // Getter para a lista de tarefas do membro
    public Tarefa[] getLista(){
        return lista;
    }
    
    // Getter para o cargo do membro
    public String getCargo(){
        return cargo;
    }
    
    // Setter para o nome do membro
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Setter para o ID do membro
    public void setId(int id){
        this.id = id;
    }
    
    // Setter para a lista de tarefas do membro
    public void setLista(Tarefa[] lista){
        this.lista = lista;
    }
    
    // Setter para o cargo do membro
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    // Método para adicionar uma nova tarefa à lista do membro
    public void addTarefa(Tarefa tarefa){
        for(int x = 0; x < lista.length; x++){
            if(lista[x] == null){
                lista[x] = tarefa; // Adiciona a tarefa à primeira posição disponível na lista
                break;
            }
        }
    }
    
    // Método para obter uma representação das tarefas do membro em formato de string
    public String getTarefas(){
        String a = "";
        for(int x = 0; x < lista.length; x++){
            if(lista[x] == null){
                break; // Para o loop quando encontrar uma posição nula na lista
            } else {
                a += lista[x].getNome() + " | "; // Concatena os nomes das tarefas separados por " | "
            }
        }
        return a;
    }

    // Método para obter informações detalhadas de uma tarefa específica do membro
    public String tarefaInfo(String nome){
        for(int x = 0; x < lista.length; x++){
            if(lista[x] != null && lista[x].getNome().equals(nome)){
                return lista[x].toString(); // Retorna a representação em string da tarefa encontrada
            }
        }
        return "Não foi encontrada tarefa com este nome associada ao membro";
    }
    
    // Método toString para retornar uma representação em string do membro
    public String toString(){
        return "Nome: " + nome + "\n" +
               "Id: " + id + "\n" +
               "Lista de Tarefas: " + this.getTarefas() + "\n" +
               "Cargo: " + cargo;
    }
}