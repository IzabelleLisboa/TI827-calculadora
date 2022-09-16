
package calculator;


class Divide {

    static void dividir() {
        LeDados r = new LeDados();
        r.lerValores();
        System.out.println("Divisão: " + (r.valor1 / r.valor2));
    }
    
}
