public class Emprestimo {
    
    public static int getAvista() {
        return 1;
    }
    
    public static int getDuasParcelas() {
        return 2;
    }
    
    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaAvista() {
        return 0.2;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        
        if (parcelas == 1){
            double valorFinal = valor + (valor * getTaxaAvista());
            System.out.println("Valor final do emprestimo para 1 parcelas: R$ "+valorFinal);
        
        } else if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do emprestimo para 2 parcelas: R$ "+valorFinal);
        
        } else if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do emprestimo para 3 parcelas: R$ "+valorFinal);
        
        } else {
            System.out.println("Infelizmente só podemos parcelar até 3.");
        
        }
        
    }

}
