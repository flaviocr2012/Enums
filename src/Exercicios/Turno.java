package Exercicios;

public enum Turno {
    MANHA("manhã"), TARDE("tarde"), NOITE("noite");

    public String Turno;

    Turno(String turno) {
        Turno = turno;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }
}
