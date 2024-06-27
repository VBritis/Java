public class GerenciadorDeProjetos {
        private Projeto[] listaProjetos;
        
    
        public  GerenciadorDeProjetos(){
            listaProjetos = new Projeto[50];
    
    
        }
        public void addProjeto(Projeto projeto){
                for(int x = 0; x < listaProjetos.length; x++){
                    if(listaProjetos[x] == null){
                        listaProjetos[x] = tarefa;
                        break;
                    }
                    
                }
            }
    
        public String getTarefa(String nome, String responsavel, int id){
            for(int z = 0; z < listaProjetos.length; z++){
                if(listaProjetos[z].getNome() == nome ){
                    return listaProjetos[z].toString();
                }
                else if(listaProjetos[z].getResponsavel().getNome() == responsavel){ //Corrigir, quando tiver mais de uma tarefa orientada ao mesmo membro
                    return listaProjetos[z].getResponsavel().getTarefas();
                }
                else if(listaProjetos[z].getResponsavel().getId() == id){
                    return listaProjetos[z].toString();
    
                }
            }
            return "Não foi possível encontrar a tarefa em questão";
        }
    }
    
    
        
    
        
    
    
    
} 
    

