package br.calebe.ticketmachine.core;
// nome da aluna: Bruna Zakaib Pessoa
/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor; // Comissão: modificador de acesso diferente da documentação
    protected int quantidade;  // Comissão: modificador de acesso diferente da documentação

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
