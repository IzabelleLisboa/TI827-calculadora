
package calculator;


class Multiplica {

    static void multiplicar() {
        LeDados r = new LeDados();
        r.lerValores("Insira o primeiro valor","Insira o segundo valor");
        System.out.println("Multiplicação: " + (r.valor1 * r.valor2));
    }
    
}
