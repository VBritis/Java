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
        this.assunto = assunto;
        this.projeto = projeto;
        this.participantes = new Membro[50]; // Inicialização do array de participantes
        projeto.addReuniao(this); // Adiciona esta reunião ao projeto
        projeto.addDias(dia); // Adiciona os dias da reunião ao projeto
    }

    public void addParticipante(Membro membro) {
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] == null) {
                participantes[i] = membro;
                break;
            }
        }
    }

    public String getParticipantes() {
        StringBuilder participantesStr = new StringBuilder();
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i] != null) {
                participantesStr.append(participantes[i].getNome());
                participantesStr.append(", ");
            }
        }
        return participantesStr.toString();
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

    public String getAssunto() {
        return assunto;
    }

    public String toString() {
        return "Assunto: " + getAssunto() + "\n" +
               "Participantes: " + getParticipantes() + "\n" +
               "Data: " + dia + "/" + mes + "/" + ano;
    }
}
