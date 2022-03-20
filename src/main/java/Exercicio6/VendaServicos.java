package Exercicio6;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 *   <h1>Classe VendaServicos </h1>
 *
* 
*
* @author Bruno
* @version 1.0
* @since 2022-03-20
* 
* 
*/

public class VendaServicos extends Venda{
    
    /**
     *
     * @param dataVenda
     * @param valor
     */
    public VendaServicos(Date dataVenda, float valor){
            
            servicos = new ArrayList<>();
            this.dataVenda = dataVenda;
            this.valor = valor;
            numVenda++;
        }
    
    /**
     *
     * @return
     */
    public int getNumVenda() {
        return numVenda;
    }
    
    /**
     *
     * @param numVenda
     */
    public void setNumVenda(int numVenda) {
        this.numVenda = numVenda;
    }
    
    /**
     *
     * @return
     */
    public Date getDataVenda() {
        return dataVenda;
    }
    
    /**
     *
     * @param dataVenda
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    @Override
    public float getValor() {
        return valor;
    }
    
    @Override
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    /**
     *
     * @return
     */
    public List<Servicos> getArtigos() {
        return servicos;
    }
    
    /**
     *
     * @param servicos
     */
    public void setServicos(List<Servicos> servicos) {
        this.servicos = servicos;
    }
}
