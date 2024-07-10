package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.enumerations.StatusFileira;

public class Fileira {

    private Long id;
    private Produto produto;

    private StatusFileira fileira;

    public Fileira(Long id, Produto produto, StatusFileira fileira) {
        this.id = id;
        this.produto = produto;
        this.fileira = fileira;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public StatusFileira getFileira() {
        return fileira;
    }

    public void setFileira(StatusFileira fileira) {
        this.fileira = fileira;
    }

    @Override
    public String toString() {
        return "Fileira{" +
                "id=" + id +
                ", produto=" + produto +
                ", status=" + fileira +
                '}';
    }
}


