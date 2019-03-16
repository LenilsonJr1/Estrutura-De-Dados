package filall;

public class No {
    private int valor;
    private No proximo;
    
    public void No(){
        this.valor   =  0 ; 
        this.proximo =  null;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
          
}
