public class Calendario {
    private int [][] calendario;     // Matriz para representar o calendário
    private int inicio;              // Dia da semana em que o mês começa (1 para Domingo, 2 para Segunda, etc.)
    private int dia;                 // Dia atual no calendário
    private int prazo;               // Prazo relacionado ao calendário
    private int mes;                 // Mês atual no calendário
    private int ano;                 // Ano atual no calendário

    public Calendario(int dia, int mes, int ano, int prazo, int inicio) {
        this.calendario = new int[6][7];   // Inicialização da matriz do calendário com 6 linhas e 7 colunas
        this.dia = dia;                    // Inicialização do dia
        this.mes = mes;                    // Inicialização do mês
        this.ano = ano;                    // Inicialização do ano
        this.inicio = inicio;              // Inicialização do dia de início da semana
        this.prazo = prazo;                // Inicialização do prazo

    }

    public void setData(int dia, int mes) {
        this.dia = dia;    // Define um novo dia e mês no calendário
        this.mes = mes;
    }

    public void atual() {
        if (this.prazo + this.dia > diasMes()) { // Verifica se o prazo + dia ultrapassam o número de dias do mês
            this.dia = (this.prazo + this.dia) - diasMes(); // Ajusta o dia para o próximo mês
            this.mes += 1;  // Incrementa o mês
        }
        if (this.mes > 12) { // Verifica se o mês ultrapassa 12 (Dezembro)
            this.mes = 1;   // Reinicia o mês para Janeiro
            this.ano += 1;  // Incrementa o ano
        }
    }

    public void preencherCalend() {
        int dia = 1;
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (linha == 0 && coluna < inicio - 1) {
                    this.calendario[linha][coluna] = 0;  // Preenche os dias vazios no início da semana
                } else if (dia <= diasMes()) {
                    this.calendario[linha][coluna] = dia; // Preenche os dias do mês
                    dia++;
                } else {
                    this.calendario[linha][coluna] = 0;   // Preenche os dias vazios no final do mês
                }
            }
        }
    }

    public void imprimirCalen() {
        System.out.println("  Dom Seg Ter Qua Qui Sex Sáb");

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (this.calendario[linha][coluna] == 0) {
                    System.out.print("    ");  // Imprime espaços para dias vazios
                } else if (this.calendario[linha][coluna] == this.dia) {
                    System.out.print(" |" + this.dia + "|"); // Marca o dia atual com delimitadores
                } else {
                    System.out.printf("%4d", this.calendario[linha][coluna]); // Imprime o dia formatado
                }
            }
            System.out.println();
        }
        System.out.println("            Mês:" + this.mes); // Imprime o mês atual
    }

    public void imprimirCalenReunioes(int[] dias, int mes) {
        System.out.println("  Dom Seg Ter Qua Qui Sex Sáb");

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (this.calendario[linha][coluna] == 0) {
                    System.out.print("    "); // Imprime espaços para dias vazios
                } else {
                    boolean isDiaReuniao = false;
                    for (int dia : dias) {
                        if (this.calendario[linha][coluna] == dia) {
                            isDiaReuniao = true;  // Marca se o dia é uma reunião
                            break;
                        }
                    }

                    if (isDiaReuniao) {
                        System.out.printf(" |%2d|", this.calendario[linha][coluna]); // Marca o dia da reunião
                    } else {
                        System.out.printf("%4d", this.calendario[linha][coluna]); // Imprime o dia formatado
                    }
                }
            }
            System.out.println();
        }

        System.out.println("            Mês: " + mes); // Imprime o mês associado às reuniões
    }

    public static boolean anoBi(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                return ano % 400 == 0; // Verifica se o ano é bissexto
            } else {
                return true; // Ano bissexto
            }
        } else {
            return false; // Ano não bissexto
        }
    }

    public int diasMes() {
        if (this.mes == 2) {
            return anoBi(this.ano) ? 29 : 28; // Retorna o número de dias de Fevereiro (considerando bissexto)
        }
        int[] meses31 = {1, 3, 5, 7, 8, 10, 12};
        int[] meses30 = {4, 6, 9, 11};

        for (int mes : meses31) {
            if (this.mes == mes) {
                return 31; // Retorna 31 dias para os meses com 31 dias
            }
        }
        for (int mes : meses30) {
            if (this.mes == mes) {
                return 30; // Retorna 30 dias para os meses com 30 dias
            }
        }
        return -1; // Retorna -1 se o mês não for reconhecido (erro)
    }

}
