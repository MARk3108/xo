import java.util.Scanner;

public class Str1ng {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        char[][] a = new char[3][3];
        int colvo = 0;
        empty(a);
        vvod(s, a, colvo);
        vivod(a);
        ckeckWin(a);
    }
    private static void empty(char[][] a){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a[i][j]='|';
            }
        }
    }

    private static void vivod(char[][] a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void vvod(Scanner s, char[][] a, int colvo) {
        int x;
        int y;
        while (colvo < 9) {
            x = s.nextInt();
            y = s.nextInt();
            while (x>2||y>2){
                System.out.println("Введи заново");
                x = s.nextInt();
                y = s.nextInt();
            }
            while(a[x][y]!='|'){
                System.out.println("Введи заново");
                x = s.nextInt();
                y = s.nextInt();
            }
            if (colvo % 2 == 0) {
                a[x][y] = 'x';
            } else {
                a[x][y] = 'o';
            }
            vivod(a);
            colvo++;
        }
    }

    private static void ckeckWin(char[][] a) {
        for (int i = 0; i < 3; i++) {
            if (a[i][0] == a[i][1] && a[i][0] == a[i][2]){
                if (a[i][0]=='x') {
                    System.out.println("X win");
                }else{
                    System.out.println("O win");
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            if (a[0][j] == a[1][j] && a[0][j] == a[2][j]){
                if (a[0][j]=='x') {
                    System.out.println("X win");
                }else{
                    System.out.println("O win");
                }
            }
        }
        if ((a[0][0]==a[1][1]&&a[1][1]==a[2][2])||(a[0][2]==a[1][1]&&a[1][1]==a[2][0])){
            if (a[1][1]=='x'){
                System.out.println("X win");
            }else{
                System.out.println("O win");
            }
        }
    }
}