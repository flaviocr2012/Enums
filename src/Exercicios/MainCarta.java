package Exercicios;

public class MainCarta {
    public static void main(String[] args) {
        Cartas cartas = Cartas.J;
//        System.out.println(cartas.getValorcarta());

        Cartas[] arr = Cartas.values();
        for (Cartas c : arr) {
//            System.out.println(c);
        }

        if (cartas == Cartas.Q) {
            System.out.println(cartas);
        } else if (cartas == Cartas.K) {
            System.out.println(cartas);
        } else {
            System.out.println(cartas);
        }


        cartas.setValorcarta(13);
        System.out.println(cartas.getValorcarta());


    }
}
