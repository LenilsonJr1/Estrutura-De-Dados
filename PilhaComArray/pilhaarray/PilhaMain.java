
package pilhaarray;


public class PilhaMain {

    public static void main(String[] args)throws PilhaVaziaException {
        Pilha pilha = new Pilha();
     
        pilha.push(0);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        
        System.out.println("esse é o valor do top "+pilha.getTopo());
        
        pilha.push(5);
        
        System.out.println("esse é o valor do top "+pilha.getTopo());
        
        pilha.pop();
        
        
        System.out.println("esse é o valor do top "+pilha.getTopo());
      
        
    }
    
}
