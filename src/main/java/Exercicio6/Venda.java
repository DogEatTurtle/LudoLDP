package Exercicio6;

import java.util.Date;
import java.util.List;

/**
 * 
 *   <h1>Classe Venda </h1>
 *
* 
*
* @author João Rosa
* @version 1.0
* @since 2022-03-20
* 
* 
*/

public class Venda {
    int numVenda;
    Date dataVenda;
    float valor;
    List<Artigos> artigos;
    List<Servicos> servicos;
    
    
     /** geter da variável valor
      * 
      * @return 
      */   
        
        
        public float getValor(){
        return valor;
        }
        
        
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
        
        
        
     /** geter da variável dataVenda
      * 
      * @return 
      */ 
        
        
        public Date getData(){
        return dataVenda;
        }
   }

