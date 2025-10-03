public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TRABALHO DE PILHAS E FILAS ===\n");
        
        // Demonstração do Editor de Texto (Pilhas)
        demonstrarEditorTexto();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Demonstração da Fila de Impressão (Filas)
        demonstrarFilaImpressao();
    }
    
    public static void demonstrarEditorTexto() {
        System.out.println("1. DEMONSTRAÇÃO DO EDITOR DE TEXTO (PILHAS)");
        System.out.println("=".repeat(40));
        
        EditorDeTexto editor = new EditorDeTexto(10);

        System.out.println("\n--- Inserindo texto ---");
        editor.inserirTexto("Olá, Lucas!");

        System.out.println("\n--- Inserindo mais texto ---");
        editor.inserirTexto("Bem-vindo ao editor de texto.");

        System.out.println("\n--- Desfazendo último texto ---");
        editor.desfazer();

        System.out.println("\n--- Refazendo último texto ---");
        editor.refazer();
        
        System.out.println("\n--- Refazendo ação ---");
        editor.refazer();

        System.out.println("\n--- Adicionando Texto novo ---");
        editor.inserirTexto("Vamos aprender sobre pilhas e filas.");

        System.out.println("\n--- Desfazendo múltiplas vezes ---");
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();

        System.out.println("\n--- Estado final ---");
        System.out.println("Texto final: " + editor.getTextoAtual());
    }

    public static void demonstrarFilaImpressao() {
        System.out.println("2. DEMONSTRAÇÃO DA FILA DE IMPRESSÃO (FILAS)");
        System.out.println("=".repeat(45));
        
        FilaImpressao filaImpressao = new FilaImpressao(10);
        
        System.out.println("\n--- Adicionando documentos na fila ---");
        filaImpressao.adicionarDocumento(new Documento("Relatório Financeiro Anual", 300));
        filaImpressao.adicionarDocumento(new Documento("Apresentação Comercial", 150));
        filaImpressao.adicionarDocumento(new Documento("Contrato de Prestação de Serviços", 200));
        filaImpressao.adicionarDocumento(new Documento("Currículo Profissional", 80));
        filaImpressao.adicionarDocumento(new Documento("Artigo Científico", 400));
        
        System.out.println("\n--- Estado da fila de impressão ---");
        filaImpressao.mostrarFila();
        
        System.out.println("\n--- Iniciando processo de impressão ---");
        filaImpressao.imprimirProximo();
        filaImpressao.imprimirProximo();
        filaImpressao.imprimirProximo();
        
  
        System.out.println("\n--- Estado da fila após algumas impressões ---");
        filaImpressao.mostrarFila();
        

        System.out.println("\n--- Continuando impressão ---");
        filaImpressao.imprimirProximo();
        filaImpressao.imprimirProximo();
        

        System.out.println("\n--- Tentativa de impressão com fila vazia ---");
        filaImpressao.imprimirProximo();
    }
}
