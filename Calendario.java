public class Calendario {
    private int [][] calendario;
    private int inicio;
    private int dia;
    private int mes;
    private int ano;
    private int prazo;

    public Calendario(int dia, int mes, int ano, int inicio,int prazo){
        this.calendario = new int[6][7];
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.inicio = inicio;
        this.prazo = prazo;

    }

    public void atual(){
        if(this.prazo + this.dia > diasMes()){
            this.dia = (this.prazo + this.dia) - diasMes() ;
            this.mes += 1;
        }
        if (this.mes > 12) {
            this.mes = 1;
            this.ano += 1;
        }


    }
    public void preencherCalend(){
        int dia = 1;
        for(int linha = 0; linha < 6; linha++){
            for(int coluna = 0; coluna < 7; coluna++){
                if(linha == 0 && coluna < inicio-1){
                    this.calendario[linha][coluna] = 0;
                }
                else if( dia <= diasMes()){
                    this.calendario[linha][coluna] = dia;
                    dia++;
                }
                else{
                    this.calendario[linha][coluna] = 0;
                }
            }
        }

    }
    public void imprimirCalen(){
        System.out.println("  " + "Dom Seg Ter Qua Qui Sex Sáb");

        for(int linha = 0; linha < 6;linha++){
            for(int coluna = 0; coluna < 7; coluna++){
                if(this.calendario[linha][coluna] == 0){
                    System.out.print("    ");
                }
                else if(this.calendario[linha][coluna] == this.dia ){
                     System.out.print(" |" + this.dia + "|"); 
                }
                else{
                    System.out.printf("%4d", this.calendario[linha][coluna]); 
                }

            }
            System.out.println();

        }
        System.out.println("            Mês:" + this.mes);
    }

    public static boolean anoBi(int ano){
        if (ano % 4 == 0){
            if(ano % 100 == 0){
                return ano % 400 == 0;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }


    public int diasMes(){
        if (this.mes == 2){
            return anoBi(this.ano) ? 29 : 28;
        }
        int[] meses31 = {1, 3, 5, 7, 8, 10, 12};
        int[] meses30 = {4, 6, 9, 11};
        
        for(int mes : meses31){
            if(this.mes == mes){
                return 31;
            }
        }
        for(int mes : meses30){
            if(this.mes == mes){
                return 30;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Calendario calendario = new Calendario(25, 12, 2023, 5, 10);
        calendario.atual();
        calendario.preencherCalend();
        calendario.imprimirCalen();
    }
}
