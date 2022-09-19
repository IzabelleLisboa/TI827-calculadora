
package calculator;


class Soma {

    static void somar() {
        LeDados r = new LeDados();
        r.lerValores("Insira o primeiro valor","Insira o segundo valor");
        System.out.println("Soma: " + (r.valor1 + r.valor2));
        
    }
    
}
