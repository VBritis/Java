public class GerenciadorDeProjetos {
        private Projeto[] listaProjetos;
        
    
        public  GerenciadorDeProjetos(){
            listaProjetos = new Projeto[50];
    
    
        }
        public void addProjeto(Projeto projeto){
                for(int x = 0; x < listaProjetos.length; x++){
                    if(listaProjetos[x] == null){
                        listaProjetos[x] = projeto;
                        break;
                    }
                    
                }
            }
    
        public String getProjeto(String nome){
            for(int z = 0; z < listaProjetos.length; z++){
                if(listaProjetos[z].getNome() == nome ){
                    return listaProjetos[z].toString();
                }
            }
            return "Não foi possível encontrar a tarefa em questão";
        
    }
    
    
        
    
        
    
    
    
} 
    

