
package calculator;


class IMC {

    static void calculaIMC() {
        LeDados r = new LeDados();
        r.lerValores();
        r.IMC = r.valor1 / (r.valor2 * r.valor2);
        System.out.println ("IMC:"+ r.IMC );
        
        if (r.IMC <= 18.5){
        System.out.println ("IMC: Abaixo do peso" );
        }
        else if ((r.IMC < 25.0) && (r.IMC<= 30.0)){
        System.out.println ("IMC: Peso normal" ); 
        } 
        else if (r.IMC < 30.0 && (r.IMC<= 34.9)) {
        System.out.println ("IMC: Obesidade Grau I" ); 
        } 
        else if (r.IMC < 35.0 && (r.IMC<= 39.9)) {
        System.out.println ("IMC: Obesidade Grau II" ); 
        }
        else if (r.IMC<= 40.0) {
        System.out.println ("IMC: Obesidade Grau II" ); 
        }
    }
}
