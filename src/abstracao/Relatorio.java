package abstracao;

import implementacao.FormatoExportacao;

/**
 * Classe abstrata do lado da Abstração (Bridge).
 * Mantém uma referência à interface FormatoExportacao (a "ponte") em vez de
 * conhecer qualquer implementação concreta. A dependência é sempre injetada
 * via construtor — nunca instanciada aqui com "new".
 */
public abstract class Relatorio {

    protected FormatoExportacao exportador;

    protected Relatorio(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    /**
     * Permite trocar o formato de exportação em tempo de execução,
     * sem alterar a lógica de geração do relatório.
     */
    public void setExportador(FormatoExportacao exportador) {
        this.exportador = exportador;
    }

    public abstract void gerarRelatorio();
}
