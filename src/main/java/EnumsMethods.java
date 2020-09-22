enum Season3 {
    SPRING {
        public void printHours() {
            System.out.println("09-20p.m.");
        }
    }, SUMMER {
        public void printHours() {
            System.out.println("08-22p.m.");
        }
    }, AUTUMN, WINTER;

    public  void printHours() {
        System.out.println("09-20p.m.");
    }
}

public class EnumsMethods {
    public static void main(String[] args) {
        Season3.AUTUMN.printHours();
    }
}
