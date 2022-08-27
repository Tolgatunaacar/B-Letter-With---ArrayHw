public class Main {
    public static void main(String[] args) {
        String[][] str = new String[6][3];

        for (int i = 0; i < str.length;i++){
            for (int k = 0; k < str[i].length; k++){
                if (i == 0 && k != 2){
                    str[i][k] = " * ";
                } else if (k == 0 ) {
                    str[i][k] = " * ";
                } else if (k == 1 && (i == 2 || i == 3 || i == 5 )) {
                    str[i][k] = " * ";
                } else if ( k == 2 && (i==1 || i == 4)) {
                    str[i][k] = " * ";
                } else
                    str[i][k] = "  ";
            }
        }


        for (String[] row : str){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
