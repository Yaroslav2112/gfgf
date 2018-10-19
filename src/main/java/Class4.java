public class Class4 {
    public static void main(String[] args) {
        int i=0;
        int counter=0;
        do
            {
            i++;
            if(((i>9)&&(i<100)&&(i%11==0))||((i>99)&&(i<1000)&&(i%47==0)))
                {System.out.println(i);
                counter++;}
            }
        while (counter!=25);
    }
}
