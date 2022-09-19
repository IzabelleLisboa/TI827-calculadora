
package calculator;


class Subtrai {

    static void subtrair() {
        LeDados r = new LeDados();
        r.lerValores("Insira o primeiro valor","Insira o segundo valor");
        System.out.println("Subtração: " + (r.valor1 - r.valor2));
    }
    
}
