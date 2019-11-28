package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;

/**
 * @author Marília  created on 27/11/2019
 */
public final class Negociacao {


    private final double preco;
    private final int qualidade;
    private final LocalDateTime data;

    public Negociacao(double preco, int qualidade, LocalDateTime data) {
        this.preco = preco;
        this.qualidade = qualidade;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public int getQualidade() {
        return qualidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getVolume(){
        return this.qualidade * this.preco;
    }
}
