package caneta;

public class Main {
    public static void main (String[] args) {
        caneta c1 = new caneta();
        c1.setModelo("BIC");  //Valor de Modelo(m)
        c1.setPonta(0.5f);  //Valor de Ponta(p)
        c1.status();        //Mostra os valores no terminal
    }
}
