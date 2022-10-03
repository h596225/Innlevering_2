package Matriser;

    public class Matriser {

        // a)
        public static void skrivUt(int[][] matrise) {

            for (int i[] : matrise) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }
        }

        // b)
        public static String tilStreng(int[][] matrise) {

            String Streng = "";
            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < matrise[i].length; j++) {
                    Streng += matrise[i][j] + " ";
                }
                Streng += "\n";
            }
            return Streng;
        }

        // c)
        public static int[][] skaler(int tall, int[][] matrise) {

            int[][] skalert = new int[matrise.length][matrise[0].length];
            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < matrise[i].length; j++) {
                    skalert[i][j] = matrise[i][j] * tall;
                }
            }
            return skalert;
        }

        // d)
        public static boolean erLik(int[][] a, int[][] b) {

            if (a.length != b.length) {
                return false;
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i].length != b[i].length) {
                    return false;
                }
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        // e)
        public static int[][] speile(int[][] matrise) {

            int[][] speilet = new int[matrise.length][matrise[0].length];
            for (int i = 0; i < matrise.length; i++) {
                for (int j = 0; j < matrise[i].length; j++) {
                    speilet[i][j] = matrise[j][i];
                }
            }
            return speilet;
        }

        // f)
        public static int[][] multipliser(int[][] a, int[][] b) {
            return null;
        }
    }
