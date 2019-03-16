
package filall;


public class FilaLl {

    public static void main(String[] args)throws FilaVaziaException{
        
        Fila fila = new Fila();
        
        fila.enfileirar(5);
        
        fila.enfileirar(6);
        
        fila.enfileirar(7);
         
        System.out.println("O tamanho  da fila é : "+fila.size());
         
        fila.desenfileirar();
         
        System.out.println("O tamanho  da fila é : "+fila.size());
        

        
        System.out.println("O inicio da fila é : "+fila.front());
        
        
        System.out.println("O final da fila é "+fila.getUltimo().getValor());
        
        
    }
    
}
