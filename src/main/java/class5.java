public class class5 {
    public static void main(String[] args) {
        int i=1;
        int counter=0;
        do {
            i++;
            if ((i == 2) || (i == 3) || (i == 5) || (i == 7))
                System.out.println(i);
            else if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0))
            { System.out.println(i);
              counter++;}
        } while (counter!=21);
    }
}
