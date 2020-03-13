import java.io.Scanner;

/**
 * Classe para criar tabelas usando ASCII
 * @author Rafael Mourao Cerqueira Figueiredo
 */
public class Tabela{
    //Atributos das Tabelas - Cabecalho:
    private boolean capslock;
    private char tipoCabecalho;
    //Atributos das Tabelas - Design Geral:
    private int tamLinhas;
    private int tamColunas;

    //Atributos Estaticos:
    public static final char[] tiposCabecalhos = {'H', 'V', 'D', '0'};
    /**
     * Define se um dado caractere corresponde a um tipo de cabecalho valido.
     * @param c caractere a ser avaliado
     * @return TRUE caso seja um tipo de cabecalho valido, FALSE caso nao
     */
    public static boolean cabecalhoValido(char c){
        boolean valido = false;
        for(int i=0; i<tiposCabecalhos.length && !valido; i++)
            if(tiposCabecalhos[i] == c) valido = true;
        return valido;
    }
    public static void imprimirTiposCabecalhos(){
        System.out.println("Tipos de Cabeçalhos:");
        System.out.printf("[%c] - Cabeçalho Horizontal\n", tiposCabecalhos[0]);
        System.out.printf("[%c] - Cabeçalho Vertical\n", tiposCabecalhos[1]);
        System.out.printf("[%c] - Cabeçalho Duplo (Horizontal e Vertical)\n", tiposCabecalhos[2]);
        System.out.printf("[%c] - SEM Cabeçalho\n", tiposCabecalhos[3]);
    }

    /**
     * Construtor de Tabela. Gera uma tabela settando as configuracoes DEFAULT da classe.
     */
    public Tabela(){
        //
    }

    //SETTER'S && GETTER'S:
    public void setTipoCabecalho(char tipoCabecalho){
        if(Tabela.cabecalhoValido(tipoCabecalho)) this.tipoCabecalho = tipoCabecalho;
        else{
            System.out.println("Erro! Não foi possível realizar a alteração: \'" + tipoCabecalho + "\' não corresponde a um tipo de cabeçalho válido!");
            Tabela.imprimirTiposCabecalhos();
            System.out.println("\nO tipo de cabeçalho da tabela permanece sendo ["+this.tipoCabecalho+"]");
        }
    }
    public char getTipoCabecalho(){
        return this.tipoCabecalho;
    }
}
