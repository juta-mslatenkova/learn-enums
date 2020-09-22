enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumsFixed {

    public static void main(String[] args) {
        enumMethods();
    }

    private static void enumMethods() {
        for (Season s : Season.values()) {
            System.out.println("Season " + s.name() + " " + s.ordinal());
        }

        Season spring = Season.valueOf("SPRING");
    }

}
