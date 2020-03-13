/**
 * Classe para configurar linhas de uma tabela.
 * @author Rafael Mourao Cerqueira Figueiredo
 */
class Linha extends ElementosTabela{
    // private static final char[] delimitadores = {'-', };
    private int posicao;

    /**
     * Construtor padrao
     */
    public Linha(){
        this(-1); //Posicao nao atribuida
    }
    public Linha(int pos){
        this(pos, 1, '_', 'C'); //Configuracao default
    }
    /**
     * Construtor de linha.
     * @param pos posicao da linha na tabela. Se nenhum valor for dado, sera atribuido o valor -1
     * @param tamanho tamanho da linha. DEVE SER NUMERO IMPAR. Se nenhum valor for dado, sera atribuido o valor 1.
     * @param delimitador delimitador da linha na tabela. Se nenhum valor for dado, sera atribuido o valor -1
     * @param alinhamento
     */
    public Linha(int pos, short tamanho, char delimitador, char alinhamento){
        this.pos = pos;
        this.tamanho = tamanho;
        this.delimitador = delimitador;
        this.alinhamento = Character.toUpperCase(alinhamento);
    }
}