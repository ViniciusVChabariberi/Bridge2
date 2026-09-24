package implementacao;

import java.util.List;

/**
 * Implementação concreta: sabe "desenhar" o conteúdo no formato HTML.
 */
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML] <ul>");
        for (String item : dados) {
            System.out.println("         <li>" + item + "</li>");
        }
        System.out.println("       </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] Arquivo relatorio.html gerado e pronto para publicação.\n");
    }
}
