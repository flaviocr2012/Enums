package Exercicios;

public enum Cartas {
    J(11),
    Q(12),
    K(13),
    A(14);

    public int valorcarta;

    Cartas(int valorcarta) {
        this.valorcarta = valorcarta;
    }

    public int getValorcarta() {
        return valorcarta;
    }

    public void setValorcarta(int valorcarta) {
        this.valorcarta = valorcarta;
    }
}
