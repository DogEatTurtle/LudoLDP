package Exercicio6;

import java.util.Date;
import java.util.List;

public class Venda {
    int numVenda;
    Date dataVenda;
    float valor;
    List<Artigos> artigos;
    
    
    /**seter da variável valor
     *@param valor
    */
    
    
        public void setValor(float valor){
        this.valor = valor;
        }
        
        
        
    /** seter da variável dataVenda
        * @param dt 
     */
        
        
        public void setData(Date dt){
        this.dataVenda = dt;
        }
        
        
        
     /** geter da variável valor
      * 
      * @return 
      */   
        
        
        public float getValor(){
        return valor;
        }
        
     /** geter da variável dataVenda
      * 
      * @return 
      */ 
        
        
        public Date getData(){
        return dataVenda;
        }
   }

