public class Main{
    public static void main(String[]args){
        Gerenciador g1 = new Gerenciador(27,6,2024);
        Membro m1 = new Membro("Vittor Britis", 24108438, null, "Ceo");
        Membro m2 = new Membro("João 03", 24208742, null, "Vice-Pres");
        Projeto p1 = new Projeto("Trabalho Final",20 ,g1);
        Tarefa t1 = new Tarefa("Codar", "Codar o projeto final", m1, 30, 30, p1, g1);
        Tarefa t2 = new Tarefa("Relatorio", "Terminar Relatorio",m1,15,50, p1, g1);
        Tarefa t3 = new Tarefa("Artigo", "Terminar artigo",m2,15,50, p1, g1);
        Reuniao r1 = new Reuniao(12, 5, null, "Economia ecologica", p1);
        Reuniao r2 = new Reuniao(23, 5, null, "Sustentabilidade ecologica", p1);
        Reuniao r3 = new Reuniao(27, 5, null, "Sustentabilidade ecologica", p1);


        Analise a1 = new Analise(null, p1);
        


        System.out.println("=================================================");
        System.out.println("      SISTEMA DE GERENCIAMENTO DE PROJETOS");
        System.out.println("=================================================");
        System.out.println();
        System.out.println("Projeto: ");
        System.out.println("Descrição: " );
        System.out.println("Data de Início: " );
        System.out.println("Data de Término: " );
        System.out.println();
        System.out.println("Equipe:");
        System.out.println();
        System.out.println("Tarefas do Projeto:");
      
            System.out.println("-------------------------------------------------");
            System.out.println("Título: " );
            System.out.println("Descrição: " );
            System.out.println("Prazo: " );
            System.out.println("Concluída: "  );
            System.out.println("Atribuída a: ") ;
        
        System.out.println("=================================================");
        System.out.println(g1.getProjeto("Trabalho Final"));
        System.out.println(a1.relatorioProjeto(p1));

        
    }



}