package abstracao;

import implementacao.FormatoExportacao;

import java.util.Arrays;
import java.util.List;

/**
 * Abstração refinada: novo relatório de desempenho de RH.
 * Note que nenhuma classe de exportação precisou ser alterada
 * para que este novo tipo de relatório passasse a existir (OCP).
 */
public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        String titulo = "Relatório de Desempenho de RH - Setembro/2026";
        List<String> dados = Arrays.asList(
                "Ana Souza - Meta atingida: 104%",
                "Carlos Lima - Meta atingida: 92%",
                "Beatriz Alves - Meta atingida: 118%"
        );

        exportador.desenharCabecalho(titulo);
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }
}
