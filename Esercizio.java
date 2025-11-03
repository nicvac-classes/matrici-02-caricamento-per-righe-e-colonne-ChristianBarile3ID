import java.util.Scanner;

public class Esercizio {

   

    public static void riempiPerRighe(int[][] M, int n, int m) {
        int i, j, numero;
        i = 0;
        j = 0;
        numero = 1;
        while (i<n) {
            j = 0;
            while (j<m) {
                M[i][j] = numero;
                ++numero;
                ++j;
            }
            ++i;
        }
    }

    public static void riempiPerColonne(int[][] M, int n, int m) {
        int i, j, numero;
        i = 0;
        j = 0;
        numero = 1;
        while (j<m) {
            i = 0;
            while (i<n) {
                M[i][j] = numero;
                ++numero;
                ++i;
            }
            ++j;
        }
    }

    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner (System.in);
        System.out.println("Inserire il numero di righe da cui è composta la matrice: ");
        do {
            n = Integer.parseInt(in.nextLine());
        } while (n<0);
        System.out.println("Inserire il numero di colonne da cui è composta la matrice: ");
        do {
            m = Integer.parseInt(in.nextLine());
        } while (m<0);
        int [][] M = new int [n][m];
        riempiPerRighe(M, n, m);
        UtilsMatrice.visualizza(M);
        System.out.println();
        riempiPerColonne(M, n, m);
        UtilsMatrice.visualizza(M);
    }
}