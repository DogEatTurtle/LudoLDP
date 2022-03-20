package Exercicio6;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 *   <h1>Classe VendaArtigos </h1>
 *  
*
* @author Bruno
* @version 1.0
* @since 2022-03-20
* 
* 
*/

public class VendaArtigos extends Venda {
    
    /**
     *
     * @param dataVenda
     * @param valor
     */
    public VendaArtigos(Date dataVenda, float valor){
            artigos = new ArrayList<>();
            this.dataVenda = dataVenda;
            this.valor = valor;
            numVenda++;
        }
    
    /*Adiciona artigos ao array*
     *
     * @param art
     */

    /**
     *
     * @param art
     */

    public void addArtigos(Artigos art){
            artigos.add(art);
        }
    
    /*Remove artigos*
     *
     * @param art
     */

    /**
     *
     * @param art
     */

    public void removeArtigos(Artigos art){
            artigos.remove(art);
        }
    
    /*Retorna os artigos do array*
     *
     * @return
     */

    /**
     *
     * @return
     */

    public List getArtigos(){
            return artigos;
        }    
}
