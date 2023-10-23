import java.util.Scanner;

public class bingschmorp {
    public static void main(String[] args)
    {
        Scanner tgb = new Scanner(System.in);
        System.out.println("GIVE TAL PLS");
        int tal = tgb.nextInt();

        for(int i = 0; i <=10; i++) {
            System.out.println(tal + "*" + i + "=" + i*tal);
        }

    }
}


