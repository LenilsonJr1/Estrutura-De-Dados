
package pilhall;


public class Pilha1 {
private No topo ;
private int total;
 
 

public Pilha1(){
     this.topo = null;
     this.total = 0;
     
 }

public void push( int valor ){ 
  if(topo == null){
     No no1 = new No(valor,null);
     topo = no1;
     total++;
     }
  else{
       No no2 = new No(valor,topo);
       topo = no2;
       total++;
     }

}
    
public int top()throws PilhaVaziaException{
     if(topo == null){
         throw new PilhaVaziaException("A pilha está vazia!!");    
     }
        return topo.getValor();
 }
    


    
public boolean isEmpty(){
       return (topo == null);
       
   }

public int  pop()throws PilhaVaziaException{
     if(topo == null){
         throw new PilhaVaziaException("A pilha está vazia!!");
       }
     
    No aux = topo;
         
    int nun = aux.getValor();
         
    topo =  aux.getProximo();
         
    aux.setProximo(null);
    
    total--;

       return nun;    
 }

public int size(){
        return total;
    }
    
public No getTopo() {
        return topo;
    }

public void setTopo(No topo) {
        this.topo = topo;
    }
  
    
   
}