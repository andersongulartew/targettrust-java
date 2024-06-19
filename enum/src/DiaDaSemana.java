public enum DiaDaSemana {
    DOMINGO("domingo"), SEGUNDA("segunda"), TERCA("terça"),QUARTA("quarta"),QUINTA("quinta"),SEXTA("sexta"),SABADO("sabado");

    private String nome;
    DiaDaSemana(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
