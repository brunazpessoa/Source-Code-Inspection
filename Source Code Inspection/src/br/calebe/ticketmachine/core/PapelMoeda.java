// nome da aluna: Bruna Zakaib Pessoa
package br.calebe.ticketmachine.core;
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
