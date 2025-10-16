package caneta;

public class caneta {
    public String modelo;
    private float ponta;

    public String getModelo() {
    return this.modelo; //pega o modelo da caneta
    }
    public void setModelo(String m) {
        this.modelo = m;   //coloca o modelo da caneta na var m
    }
    public float getPonta() {
        return this.ponta; // pega o número da ponta
    }
    public void setPonta(float p) {
        this.ponta = p;    //coloca o número da ponta na var p
    }
    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ponta:" + this.ponta);
        //mostra os resultados ponta e modelo
    }
}
