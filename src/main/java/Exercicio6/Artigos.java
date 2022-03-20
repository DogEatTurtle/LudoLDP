package Exercicio6;

/**
 * 
 *   <h1>Classe Artigos </h1>
 *
* 
*
* @author Bruno
* @version 1.0
* @since 2022-03-20
* 
* 
*/

public class Artigos {
    
    float valorArtigo;
    int codigo;
    String nomeArtigo;
    
    /*Construtor para a criação de artigos*
     *
     * @param nomeArtigo
     * @param valorArtigo
     */
    public Artigos(String nomeArtigo,float valorArtigo){
        this.nomeArtigo = nomeArtigo;
        this.valorArtigo = valorArtigo;
        codigo++;
    }
}
