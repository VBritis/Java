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
    
    
    Membro m1 = new Membro("Vittor Britis", 24108438, null, "Ceo");
    Membro m2 = new Membro("João 03", 24208742, null, "Vice-Pres");
    Projeto p1 = new Projeto("Trabalho Final",20 ,g1);
    Tarefa t1 = new Tarefa("Codar", "Codar o projeto final", m1, 30, 30, p1, g1);
    Tarefa t2 = new Tarefa("Relatorio", "Terminar Relatorio",m1,15,50, p1, g1);
    Tarefa t3 = new Tarefa("Artigo", "Terminar artigo",m2,15,50, p1, g1);
    Reuniao r1 = new Reuniao(12, 5, null, "Economia ecologica", p1);
    Reuniao r2 = new Reuniao(23, 5, null, "Sustentabilidade ecologica", p1);
    Reuniao r3 = new Reuniao(27, 5, null, "Sustentabilidade ecologica", p1);
    
        
    
    
    
} 
    

