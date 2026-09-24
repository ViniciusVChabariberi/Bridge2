package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;
import implementacao.FormatoExportacao;

/**
 * Classe principal de execução — comprova o desacoplamento entre
 * Abstração e Implementação promovido pelo padrão Bridge.
 *
 * Nenhuma classe de "abstracao" instancia diretamente um exportador
 * concreto: toda a montagem dos objetos acontece aqui, no Cliente,
 * e é injetada via construtor.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Rotina 1: Relatório de Vendas em PDF ===");
        FormatoExportacao exportadorPDF = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(exportadorPDF);
        relatorioVendas.gerarRelatorio();

        System.out.println("=== Rotina 2: Mesmo relatório de Vendas, trocado em tempo de execução para Excel ===");
        FormatoExportacao exportadorExcel = new ExportadorExcel();
        relatorioVendas.setExportador(exportadorExcel);
        relatorioVendas.gerarRelatorio();

        System.out.println("=== Rotina 3: Relatório de RH em HTML ===");
        FormatoExportacao exportadorHTML = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(exportadorHTML);
        relatorioRH.gerarRelatorio();
    }
}
