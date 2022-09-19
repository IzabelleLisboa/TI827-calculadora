
package calculator;


class Divide {

    static void dividir() {
        LeDados r = new LeDados();
        r.lerValores("Insira o primeiro valor", "Insira o segundo valor");
        System.out.println("Divisão: " + (r.valor1 / r.valor2));
    }
    
}
