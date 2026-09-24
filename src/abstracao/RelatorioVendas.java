package abstracao;

import implementacao.FormatoExportacao;

import java.util.Arrays;
import java.util.List;

/**
 * Abstração refinada: relatório de vendas legado do sistema.
 */
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        String titulo = "Relatório de Vendas - Setembro/2026";
        List<String> dados = Arrays.asList(
                "Notebook Gamer - R$ 12.500,00",
                "Monitor Ultrawide - R$ 8.300,00",
                "Teclado Mecânico - R$ 1.750,00"
        );

        exportador.desenharCabecalho(titulo);
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }
}
