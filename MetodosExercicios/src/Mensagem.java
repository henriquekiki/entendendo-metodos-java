public class Mensagem {
    
    public static void hora(int hora){

        switch(hora){
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoaTarde();;
                break;
            
            default:
                mensagemErro();
        }
        
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
        
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");
        
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
        
    }

    public static void mensagemErro() {
        System.out.println("Hora inválida.\nDigite uma hora entre 00 e 23");
    }
}
