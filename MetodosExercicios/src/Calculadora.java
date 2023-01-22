public class Calculadora {
    
    // SOMA
    public static void soma(double numero1, double numero2) {
        
        double resultado = numero1 + numero2;

        String message = String.format("A soma de %s + %s é %s.", numero1, numero2, resultado);
        System.out.println(message); 
    }
    
    //SUBTRAÇÃO
    public static void subtracao(double numero1, double numero2) {
        
        double resultado = numero1 - numero2;

        String message = String.format("A subtração de %s - %s é %s.", numero1, numero2, resultado);
        System.out.println(message);
    }

    public static void multiplicacao(double numero1, double numero2) {
        
        double resultado = numero1 * numero2;
        
        String message = String.format("A multiplicação de %s X %s é %s.", numero1, numero2, resultado);
        System.out.println(message);
    }

    public static void divisao(double numero1, double numero2) {
        
        double resultado = numero1 / numero2;
        
        String message = String.format("A divisão de %s / %s é %s.", numero1, numero2, resultado);
        System.out.println(message);
    }

}
