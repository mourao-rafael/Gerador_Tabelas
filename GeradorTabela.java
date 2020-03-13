import java.io.*;

/**
 * Interface para gerar e imprimir uma tabela usando ASCII
 * @author Rafael Mourao Cerqueira Figueiredo.
 */
public static class GeradorTabela{
    //Atributos:
    private static Tabela tabela;
    private static Scanner leitor = new Scanner(System.in);

    //Metodos:
    /**
     * Rotina para gerar uma nova tabela.
     * @return String com a tabela criada | ou | NULL, caso a operacao seja abortada.
     */
    public static String novaTabela(){
        System.out.println("\tGERAR NOVA TABELA:\t");
        configCabecalho();
    }

    /**
     * Rotina de configuracao do cabecalho
     * @return short < 0, caso operacao abortada; short > 0 caso a operacao seja concluida com sucesso.
     */
    private static short configCabecalho(){
        short status = 1;
        char tipoCab = '\0';
        do{
            Tabela.imprimirTiposCabecalhos();
            System.out.println("\n[Q] - Abortar configuração");
            System.out.print("Digite uma opção, ou digite [Q] para abortar: ");
            tipoCab = Character.toUpperCase( leitor.nextLine().charAt(0) ); //Extrair apenas o primeiro caractere

            if(Tabela.cabecalhoValido(tipoCab)) tabela.setTipoCabecalho(tipoCab);
            else if(tipoCab == 'Q') status = -1;
            else{
                System.out.println("Erro! \'" + tipoCab + "\' não corresponde a um tipo de cabeçalho válido!\n");
                status = 0;
            }
        }while(status == 0);

        return status;
    }

    /**
     * Metodo para abortar o processo de geracao de tabela.
     */
    private static void abort(){
        tabela = NULL;
        System.out.println("Geracao de tabela abortada.\n");
    }
}