
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner B=new Scanner(System.in);
System.out.println("inter the numbers of time PLS");
        int h=B.nextInt();
        int m=B.nextInt();
        int s=B.nextInt();

        Clock now=new Clock();

        now.setClock(h,m,s);

        JOptionPane.showMessageDialog(null,"The Clock show !! : "+ now  );


    }
}



