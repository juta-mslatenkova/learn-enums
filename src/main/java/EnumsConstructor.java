enum SeasonConstructor {
    // TODO constructors: implicitly private (you cannot extend the enum)
    SPRING("medium"), SUMMER("high"), AUTUMN("medium"), WINTER("low");

    private String expectedVisitors;

    SeasonConstructor(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

public class EnumsConstructor {

    public static void main(String[] args) {
        SeasonConstructor.SUMMER.printExpectedVisitors();
    }
}