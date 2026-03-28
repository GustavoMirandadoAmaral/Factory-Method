package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFinanceiroTest {

    @Test
    void deveGerarRelatiorioDeFinanceiro() {
        IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("Financeiro");
        assertEquals("Relatório do financeiro gerado", relatorio.gerar());
    }

    @Test
    void deveApagarRelatiorioDeFinanceiro() {
        IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("Financeiro");
        assertEquals("Relatório do financeiro apagado", relatorio.apagar());
    }
}