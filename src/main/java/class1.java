public class class1 {

    public static void main(String[] args) {
        int i = 0;
        int counter = 0;
        do {
            i++;
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println(i);
                counter++;
            }

          } while (counter != 5) ;
    }
}