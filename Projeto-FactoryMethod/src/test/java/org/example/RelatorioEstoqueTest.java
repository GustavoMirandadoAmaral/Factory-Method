package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioEstoqueTest {

    @Test
    void deveGerarRelatiorioDeEstoque() {
        IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("Estoque");
        assertEquals("Relatório do estoque gerado", relatorio.gerar());
    }

    @Test
    void deveApagarRelatiorioDeEstoque() {
        IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("Estoque");
        assertEquals("Relatório do estoque apagado", relatorio.apagar());
    }
}