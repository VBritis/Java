public class Reuniao {
    private int data;
    private int hora;
    private Membro[] participantes;
    private String assunto;

    public Reuniao(int data, int hora, Membro[] participantes, String assunto){
        this.data = data;
        this.hora = hora;
        this.participantes = participantes;
        this.assunto = assunto;
    }

    public int getData(){
        return data;
    }
    
    public int getHora(){
        return hora;
    }
    
    public Membro[] getParticipantes(){
        return participantes;
    }
    
    public String getAssunto(){
        return assunto;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public void setHora(int hora){
        this.hora = hora;
    }
    
    public void setParticipantes(Membro[] participantes){
        this.participantes= participantes;
    }
    
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }
}
