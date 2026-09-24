package implementacao;

import java.util.List;

/**
 * Implementação concreta: sabe "desenhar" o conteúdo no formato Excel (XLSX).
 */
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[EXCEL] Célula A1 mesclada e em negrito -> " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[EXCEL] Preenchendo linhas da planilha:");
        int linha = 2;
        for (String item : dados) {
            System.out.println("       A" + linha + ": " + item);
            linha++;
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[EXCEL] Arquivo relatorio.xlsx salvo com sucesso.\n");
    }
}
