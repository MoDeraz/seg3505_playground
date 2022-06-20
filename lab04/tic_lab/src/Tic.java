
public class Tic {

    public static String[][] create(int first, int second) {

        String[][] x = new String[first][second];
        
        int i = 0;
        int j = 0;
        while (i < first) {
            while ( j < second) {
                x[i][j] = "_";
                j++;

            }
            i++;
        }

        return x;

    }

    public static int getSize(int i,int j){

        return i*j;
    }

    public static String[][] board(){

        String[][] x = new String[2][2];
        int i = 0;
        int j = 0;
        while (i < 2) {
            while (j < 2) {
                x[i][j] = "_";
                j++;
            }
            i++;
        }

        return x;

    }

}
