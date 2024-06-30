import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private int dia;
    private int mes;
    private int ano;
    private List<Projeto> projetos;

    public Gerenciador(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.projetos = new ArrayList<>();
    }

    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void addProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public Projeto getProjeto(String nome) {
        for (Projeto projeto : projetos) {
            if (projeto.getNome().equalsIgnoreCase(nome)) {
                return projeto;
            }
        }
        return null;
    }
}