package implementacao;

import java.util.List;

/**
 * Implementação concreta: sabe "desenhar" o conteúdo no formato PDF.
 */
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] Cabeçalho gerado com fonte serifada -> " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[PDF] Renderizando corpo do documento em páginas A4:");
        for (String linha : dados) {
            System.out.println("       • " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Arquivo relatorio.pdf finalizado e pronto para download.\n");
    }
}
