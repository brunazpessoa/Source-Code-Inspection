// nomes das alunas: Bruna Zakaib Pessoa e Yasmin Mendes de Souza
package br.calebe.ticketmachine.core;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda; 

    public Troco(int valor) { //Controle: condição do laço não altera a variável de controle, causando loop infinito.
        // Comissão: construtor acaba implementando toda lógica de cálculo do troco em vez de apenas inicializar o objeto.
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0) {
            count++;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (valor % 50 != 0) {
            count++;
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0) {
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0) {
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(2, count); // Dados: índice do vetor incorreto, sobrescrevendo posição já utilizada para nota de 5.
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {  

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() { // Dados: acesso a índice inválido do vetor, pois o tamanho do vetor é 6 (índices 0 a 5).
            for (int i = 6; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() { // Controle: condição lógica incorreta impede a execução do loop, pois ret inicia como null.
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) { // Dados: acesso a índice inválido do vetor, pois o vetor possui índices de 0 a 5.
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() { // Excesso: implementação não remove de fato um elemento, apenas chama next(), tornando o método redundante.
            next();
        }
    }
}
