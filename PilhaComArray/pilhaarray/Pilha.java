package pilhaarray;

public class Pilha {
 private int topo;
 private int  elementos[];
    
 
 public Pilha(){
     this.elementos=new int[5];
     this.topo = -1 ;
 }
 
 
 public void push(int nun){ 
     if(topo ==  elementos.length-1){

            int elementos2[];
         
            elementos2 = new int[elementos.length*2];

         for(int l=0 ;l<elementos.length;l++){

             elementos2[l] = elementos[l];
         }
         
         elementos = elementos2;
         
         topo++;
         elementos[topo]=nun;
         
         
     }

     topo++;
    elementos[topo] = nun;
     
    
 }   

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }
    
 public int pop  ()throws PilhaVaziaException{
     if(topo == -1){
         throw new PilhaVaziaException("A pilha está vazia!!");
          
     }
     int nuun = elementos[topo];
     topo--;
     
     return nuun;
   
 }
 
 public boolean isEmpty(){
     
     return (topo == -1);
     
 }
 
 public int top ()throws PilhaVaziaException  {
     if(topo == -1){
         throw new PilhaVaziaException("A pilha está vazia!!");
     }
     
     return elementos[topo];
 }

    
   
}