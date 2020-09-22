enum Season2 {
    SPRING {
        public void printHours() {
            System.out.println("09-20p.m.");
        }
    }, SUMMER {
        public void printHours() {
            System.out.println("08-22p.m.");
        }
    }, AUTUMN {
        public void printHours() {
            System.out.println("12-18p.m.");
        }
    }, WINTER {
        public void printHours() {
            System.out.println("12-17p.m.");
        }
    };

    public abstract void printHours();
}

public class EnumAbstractMethod {
    public static void main(String[] args) {
        Season2.AUTUMN.printHours();
    }
}
