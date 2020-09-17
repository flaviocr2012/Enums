package Exercicios;

public class MainTurno {
    public static void main(String[] args) {
        Turno turno = Turno.MANHA;
//        System.out.println(turno.getTurno());

        turno.setTurno("Tarde");
//        System.out.println(turno.getTurno());

        Turno[] arr = Turno.values();
        for (Turno t : arr) {
//            System.out.println(t);
        }

        if (turno == Turno.NOITE) {
            System.out.println(turno);
        } else if (turno == Turno.MANHA) {
            System.out.println(turno);
        } else {
            System.out.println(turno);
        }
    }
}
