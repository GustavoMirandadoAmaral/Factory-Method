package org.example;

public class RelatorioFactory {

    private RelatorioFactory() {};
    private static RelatorioFactory instance = new RelatorioFactory();
    public static RelatorioFactory getInstance() {
        return instance;
    }

    public IRelatorio obterRelatorio(String relatorio){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Relatorio" + relatorio);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Relatório inexistente");
        }
        if (!(objeto instanceof IRelatorio)){
            throw new IllegalArgumentException("Relatório inválido");
        }
        return (IRelatorio) objeto;
    }
}
