public class Main {
    public static void main(String[] args) {
         
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(3, 6);
        Calculadora.multiplicacao(3, 6);
        Calculadora.divisao(3, 6);
        
        
        System.out.println("Exercicio mensagem.");
        Mensagem.hora(10);
        Mensagem.hora(14);
        Mensagem.hora(20);
        Mensagem.hora(25);
        

        System.out.println("Exercicio emprestimo.");
        Emprestimo.calcular(1000, 1);
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);

        
    }
}
