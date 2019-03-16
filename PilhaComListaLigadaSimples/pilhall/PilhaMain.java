
package pilha;

public class PilhaMain {

    public static void main(String[] args) throws PilhaVaziaException{

        Pilha1 pilha = new Pilha1();
        
        
        pilha.push(5);
        pilha.push(7);
        pilha.push(12);
      
        
        System.out.println("o topo é "+pilha.top() +" "+"O Proximo é "+pilha.getTopo().getProximo().getValor());

        pilha.pop();

        System.out.println("o topo é "+pilha.top() +" "+"O Proximo é"+pilha.getTopo().getProximo().getValor());
        
  
    }
    
}
