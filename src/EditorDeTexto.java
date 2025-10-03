public class EditorDeTexto {
    private Pilha pilhaDesfazer;
    private Pilha pilhaRefazer;
    private String textoAtual;

    public EditorDeTexto(int capacidade) {
        this.pilhaDesfazer = new Pilha(capacidade);
        this.pilhaRefazer = new Pilha(capacidade);
        this.textoAtual = "";
    }

    public void inserirTexto(String novoTexto){
        if (textoAtual != null) {
            pilhaDesfazer.empilhar(textoAtual);
        }

        while (!pilhaRefazer.estaVazia()) {
            pilhaRefazer.desempilhar();
        }

        textoAtual = novoTexto;
        System.out.println("Texto inserido: " + textoAtual);
    }

    public void desfazer(){
        if (pilhaDesfazer.estaVazia()) {
            System.out.println("Nada para desfazer.");
            return;
        }

        pilhaRefazer.empilhar(textoAtual);
        textoAtual = pilhaDesfazer.desempilhar();
        System.out.println("Texto atual desfeito: " + textoAtual);
    }

    public void refazer(){
        if (pilhaRefazer.estaVazia()) {
            System.out.println("Nada para refazer.");
            return;
        }

        pilhaDesfazer.empilhar(textoAtual);
        textoAtual = pilhaRefazer.desempilhar();
        System.out.println("Texto atual refeito: " + textoAtual);

    }

    public String getTextoAtual(){
        return textoAtual;
    }
}
