public class Reuniao {
    private int dia;
    private int mes;
    private Membro[] participantes;
    private String assunto;
    private Projeto projeto;

    public Reuniao(int dia, int mes, Membro[] participantes, String assunto, Projeto projeto){
        this.dia = dia;
        this.mes = mes;
        this.participantes = participantes;
        this.assunto = assunto;
        projeto.addReuniao(this);

    }

    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public Membro[] getParticipantes(){
        return participantes;
    }
    
    public String getAssunto(){
        return assunto;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setParticipantes(Membro[] participantes){
        this.participantes= participantes;
    }
    
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
}
