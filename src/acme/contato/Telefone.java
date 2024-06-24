package acme.contato;

public class Telefone {
    private int codigoPais;
    private int codigoArea;
    private int numero;

    public Telefone(int codigoArea, int codigoPais, int numero) {
        this.codigoArea = codigoArea;
        this.codigoPais = codigoPais;
        this.numero = numero;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "+" + codigoPais + " (" + codigoArea + ") " + numero;
    }
}

