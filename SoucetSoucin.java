
import java.util.Scanner;

public class SoucetSoucin {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cislo1;
        int cislo2;
        
        System.out.print("zadejte 1.��slo : ");
        cislo1=sc.nextInt();
        System.out.print("zadejte 2.��slo : ");
        cislo2=sc.nextInt();
        
        
        System.out.print("sou�et ��sel " + cislo1 + " a " + cislo2 + " se rovn� : ");
        System.out.println( cislo1 + cislo2 );
        
        System.out.print("n�sobek ��sel " + cislo1 + " a " + cislo2 + " se rovn� : ");
        System.out.println( cislo1 * cislo2 );
        
    }
}