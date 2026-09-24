package implementacao;

import java.util.List;

/**
 * Interface do lado da Implementação (Bridge).
 * Define o contrato que qualquer formato de exportação precisa cumprir,
 * independente de qual tipo de relatório está sendo gerado.
 */
public interface FormatoExportacao {

    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}
