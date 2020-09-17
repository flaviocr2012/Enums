package TutorialEnums;

public class MainLevel {
    public static void main(String[] args) {
        Level lvl = Level.LOW;

        lvl.setLvlNum(5);
        System.out.println(lvl.getLvlNum());

        Level[] arr = Level.values();
        for (Level e : arr) {
            System.out.println(e);
        }

        if (lvl == Level.LOW) {
            System.out.println(lvl);
        } else if (lvl == Level.MEDIUM) {
            System.out.println(lvl);
        } else {
            System.out.println(lvl);
        }

    }
}
