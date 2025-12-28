
import java.util.Random;
import java.util.Scanner;



public class matrixi_satir_sutunlarindaki_en_buyuk_kucuk {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Matrixin satır sayısını giriniz :");
        int n = input.nextInt();
        System.out.print("Matrixin sütun sayısını giriniz :");
        int m = input.nextInt();
        int[][] matrix = new int [n][m]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rnd.nextInt(100)+1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t"+matrix[i][j]+" ");
            }
            
            System.out.println();
        }
        System.out.println();
        
        int[] sutun_en_buyuk = new int [m];
        int [] sutun_en_kucuk = new int [m];
        for (int i = 0; i < n; i++) {
            int enb_sutun = matrix[0][i];
            int enk_sutun = matrix[0][i];
            for (int j = 0; j < m; j++) {
                if (enb_sutun < matrix[j][i]) {
                    enb_sutun = matrix[j][i];
                }
                if (enk_sutun > matrix[j][i]) {
                    enk_sutun = matrix[j][i];
                }
            }
            sutun_en_buyuk[i] = enb_sutun;
            sutun_en_kucuk[i] = enk_sutun;
        }
        
        System.out.print("Sütunlardaki en büyük elemanlar :");
        for (int i = 0; i < m; i++) {
            System.out.print(sutun_en_buyuk[i]+" ");
        }
        System.out.println();
        System.out.print("Sütunlardaki en küçük elemanlar :");
        for (int i = 0; i < m; i++) {
            System.out.print(sutun_en_kucuk[i]+" ");
        }
        
        int [] satir_en_buyuk = new int[n];
        int [] satir_en_kucuk = new int[n];
        for (int i = 0; i < n; i++) {
            int enb_satir = matrix[i][0];
            int enk_satir = matrix[i][0];
            for (int j = 0; j < m; j++) {
                if (enb_satir < matrix[i][j]) {
                    enb_satir = matrix[i][j];
                }
                if (enk_satir > matrix[i][j]) {
                    enk_satir = matrix[i][j];
                }
            }
            satir_en_buyuk[i] = enb_satir;
            satir_en_kucuk[i] = enk_satir;
        }
        
        System.out.println();
        System.out.print("Satırlardaki en büyük elemanlar :");
        for (int i = 0; i < n; i++) {
            System.out.print(satir_en_buyuk[i]+" ");
        }
        System.out.println();
        System.out.print("Satırlardaki en küçük elemanlar :");
        for (int i = 0; i < n; i++) {
            System.out.print(satir_en_kucuk[i]+" ");
        }
    }

}
