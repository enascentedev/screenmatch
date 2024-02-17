package br.com.alura.screenmatch.excecao;

public class ErroDeConversaDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaDeAnoException(String mensagem) {
        this.mensagem= mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
