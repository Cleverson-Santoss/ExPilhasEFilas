public class FilaImpressao {
    private Fila fila;
    private int numeroDocumentos;

    public FilaImpressao(int capacidade) {
        this.fila = new Fila(capacidade);
        this.numeroDocumentos = 0;
    }

    public void adicionarDocumento(Documento documento) {
        fila.enfileirar(documento);
        numeroDocumentos++;
        System.out.println("Documento adicionado: " + documento.getNome());
    }

    public void imprimirProximo(){
        if (fila.estaVazia()) {
            System.out.println("Nenhum documento para imprimir.");
            return;
        }

        Documento documento = (Documento) fila.desenfileirar();
        numeroDocumentos--;

        System.out.println("Imprimindo documento: " + documento.toString());
        System.out.println("Documento impresso com sucesso.");
    }

    public void mostrarFila(){
        if (fila.estaVazia()) {
            System.out.println("Fila de impressão vazia.");
            return;
        }

        System.out.println("=== FILA DE IMPRESSÃO ===");
        System.out.println("Número de documentos: " + numeroDocumentos);

        Documento proximo = (Documento) fila.verInicio();
        if (proximo != null) {
            System.out.println("Próximo documento: " + proximo.toString());
            
        }
    }

}
