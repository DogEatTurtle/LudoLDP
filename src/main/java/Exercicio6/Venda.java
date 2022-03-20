package Exercicio6;

import java.util.Date;
import java.util.List;

public class Venda {
    int numVenda;
    Date dataVenda;
    float valor;
    List<Artigos> artigos;
    
    
    /**
     *@author João Rosa
     * @version 1.0
     * @since 2022-03-20
     */
    
    
    /**seter da variável valor
     *@param valor
    */
    
    
        public void setValor(float valor){
        this.valor = valor;
        }
        
        
        
    /** seter da variável dataVenda
        * @param data 
     */
        
        
        public void setData(Date data){
        this.dataVenda = data;
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

