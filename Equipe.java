public class Equipe {
    private Membro[] integrantes;
    private Projeto projeto;

    public Equipe(Membro[] integrantes, Projeto projeto){
        this.integrantes = integrantes;
        this.projeto = projeto;
    }

    public String getIntegrantes(){
        String a = "";
        for(int x = 0; x < integrantes.length; x++){
            a += integrantes[x] ;
        }
        return a;
    }
    public Projeto getProjeto(){
        return projeto;
    }
    public void setIntegranetes(Membro[] integrantes){
        this.integrantes = integrantes;
    }
    public void setProjeto(Projeto projeto){
        this.projeto = projeto;
    }




}
