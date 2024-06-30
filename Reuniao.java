class Reuniao {
    private int dia;
    private int mes;
    private int ano;
    private Membro[] participantes;
    private String assunto;
    private Projeto projeto;

    public Reuniao(int dia, int mes, int ano, String assunto, Projeto projeto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.participantes = new Membro[50];
        this.assunto = assunto;
        this.projeto = projeto;
        projeto.addReuniao(this);
        projeto.addDias(dia);
    }

    public void addParticipante(Membro membro) {
        for (int x = 0; x < participantes.length; x++) {
            if (participantes[x] == null) {
                participantes[x] = membro;
                break;
            }
        }
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

    public Membro[] getParticipantes() {
        return participantes;
    }

    public String getAssunto() {
        return assunto;
    }
}