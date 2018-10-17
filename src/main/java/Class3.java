public class Class3 {
    public static void main(String[] args) {
        int i = 0;
        int counter = 0;
        do {
            i = i + 2;
            if ((i % 7 == 0) && (i % 3 != 0)) {
                System.out.println(i);
                counter++;
            }
        }while (counter != 10) ;

        }
    }