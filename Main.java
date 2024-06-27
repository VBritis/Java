public class Main{
    public static void main(String[]args){
        GerenciadorDeTarefas g1 = new GerenciadorDeTarefas();
        Membro m1 = new Membro("Vittor Britis", 24108438, null, "Ceo");
        Tarefa t1 = new Tarefa("Codar", "Codar o projeto final", m1, 30, 30, g1);
        Tarefa t2 = new Tarefa("Relatorio", "Terminar Relatorio",m1,15,50, g1);
        Tarefa [] tarefas = {t1,t2};
        Projeto p1 = new Projeto("Trabalho Final", "1 de Julho", "15 de Junho", tarefas, null);
        Calendario c1 = new Calendario(20,6 , 2024, 7, 30);
        c1.atual();
        c1.preencherCalend();
        c1.imprimirCalen();
        System.out.println(m1.toString());
        System.out.println(m1.tarefaInfo("Codar"));
        System.out.println(g1.getTarefa(null, "Vittor Britis",0));
       

        
    }



}