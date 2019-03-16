
package filall;

public class Fila {
   private No inicio;
   private No ultimo;
   private int total;
   
   
   public void fila(){
       this.inicio = null;
       this.ultimo = null ;
       this.total  = 0 ;
       
   }
   
   
   public void enfileirar(int valor){

       if(total == 0 ){
           
            No  no1 =  new No();
            no1.setProximo(null);
            no1.setValor(valor);
            inicio = no1;
            ultimo = no1; 
            total++;
       }
       
       else{
             No no2 =  new No();
   
             ultimo.setProximo(no2);
   
            no2.setProximo(null);
   
            no2.setValor(valor);
   
            ultimo =  no2;
   
            total++;
       }
   }
   
  public int desenfileirar()throws FilaVaziaException{
     if(total == 0){
         throw new FilaVaziaException("A Fila está vazia!!");   
     }

     int aux = inicio.getValor();
     
     No aux2  = new No();
     
     aux2 = inicio;

     inicio = inicio.getProximo();
     
     aux2.setProximo(null);
     
     total--;

     return aux ;
  }
   
   
   public int front()throws FilaVaziaException{
     if(total == 0){
         throw new FilaVaziaException("A Fila está vazia!!");   
     }
       return inicio.getValor();
   }

   
   public int size(){
       return total;
   }
   
   public boolean isEmpty(){
       return (total == 0);
   }
   
   
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}
