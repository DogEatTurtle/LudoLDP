package Exercicio6;

/**
 * 
 *   <h1>Classe Servicos</h1>
 *
* 
*
* @author Bruno
* @version 1.0
* @since 2022-03-20
* 
* 
*/

public class Servicos {
    
    int codigo;
    String tipoServico;
    float valorServico;
    
    
    /*Construtor para a criação de serviços*
     *
     * @param tipoServico
     * @param valorServico
     */
    public Servicos(String tipoServico,float valorServico){
        this.tipoServico = tipoServico;
        this.valorServico = valorServico;
        codigo++;
    }
}
