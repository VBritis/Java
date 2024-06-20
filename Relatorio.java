public class Relatorio {
    private Projeto projeto;
    private int data;
    private String descricao;
    private String status;

    public Relatorio(Projeto projeto, int data, String descricao, String status) {
        this.projeto = projeto;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

