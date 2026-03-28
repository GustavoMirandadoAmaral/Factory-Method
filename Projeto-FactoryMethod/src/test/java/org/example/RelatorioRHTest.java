package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioRHTest {

    @Test
    void deveGerarRelatiorioDeRH() {
        IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("RH");
        assertEquals("Relatório do RH gerado", relatorio.gerar());
    }

    @Test
    void deveApagarRelatiorioDeRH() {
        IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("RH");
        assertEquals("Relatório do RH apagado", relatorio.apagar());
    }
}