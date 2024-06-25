public class Analise {
    private Tarefa tarefa;
    private Membro responsavel;
    private Calendario calendario;
    private int diaAtual;

    public Analise(Tarefa tarefa, Membro responsavel, Calendario calendario){
        this.tarefa = tarefa;
        this.responsavel = responsavel;
        this.calendario = calendario;
    }
    public void analiseCalendario(){
       int dias = (tarefa.getStatus() * tarefa.getPrazo()) / 100;
       calendario.setData(dias, );

    }
}
