package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFactoryTest {

    @Test
    void deveRetornarExcecaoDeRelatorioInexistente(){
        try {
            IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("Setor");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Relatório inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDeRelatorioInvalido(){
        try {
            IRelatorio relatorio = RelatorioFactory.getInstance().obterRelatorio("Venda");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Relatório inválido", e.getMessage());
        }
    }
}