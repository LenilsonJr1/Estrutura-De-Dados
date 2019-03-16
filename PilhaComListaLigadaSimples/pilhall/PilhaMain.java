
package pilha;


public class PilhaMain {

    public static void main(String[] args) throws PilhaVaziaException{
        Pilha1 pilha = new Pilha1();
        //pilha.top();
        
        pilha.push(5);
        pilha.push(7);
        pilha.push(12);
        System.out.println("o topo é "+pilha.top() +" "+"O anterior é "+pilha.getTopo().getProximo().getValor());
        pilha.pop();
        
       
        
        
        System.out.println("o topo é "+pilha.top() +" "+"O anterior é "+pilha.getTopo().getProximo().getValor());
        pilha.pop();
        System.out.println("o topo é "+pilha.top() +" "+"O anterior é "+pilha.getTopo().getProximo().getValor());
        //System.out.println("esse é o valor do top LLL"+pilha.getTopo().getAnterior().getValor());
     
       int n = 20;
       int i = 4;
       int f = 3;
        
        int d = (n - i + f) % n;
        
        
        
        
     System.out.printf("%d",d);
     
     d = (d+1)%20;
     
    System.out.printf("%d",d);
        
       
        
        
       
       
        
        
    }
    
}
