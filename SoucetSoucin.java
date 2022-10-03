
import java.util.Scanner;

public class SoucetSoucin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cislo1;
        int cislo2;
        
        System.out.print("zadejte 1.èíslo : ");
        cislo1=sc.nextInt();
        System.out.print("zadejte 2.èíslo : ");
        cislo2=sc.nextInt();
        
        
        System.out.print("souèet èísel " + cislo1 + " a " + cislo2 + " se rovná : ");
        System.out.println( cislo1 + cislo2 );
        
        System.out.print("násobek èísel " + cislo1 + " a " + cislo2 + " se rovná : ");
        System.out.println( cislo1 * cislo2 );
        
    }
}