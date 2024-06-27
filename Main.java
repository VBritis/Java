public class Main{
    public static void main(String[]args){
        Gerenciador g1 = new Gerenciador(27,6,2024);
        Membro m1 = new Membro("Vittor Britis", 24108438, null, "Ceo");
        Membro m2 = new Membro("João 03", 24208742, null, "Vice-Pres");
        Projeto p1 = new Projeto("Trabalho Final",20 ,g1);
        Tarefa t1 = new Tarefa("Codar", "Codar o projeto final", m1, 30, 30, p1, g1);
        Tarefa t2 = new Tarefa("Relatorio", "Terminar Relatorio",m1,15,50, p1, g1);
        Tarefa t3 = new Tarefa("Artigo", "Terminar artigo",m2,15,50, p1, g1);

        
        
        System.out.println(g1.getProjeto("Trabalho Final"));
        
       

        
    }



}