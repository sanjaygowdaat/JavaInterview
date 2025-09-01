package LeetcodeEasy;
public class PrintCalendar {
    public static void main(String[] args) {
        int startIndex = 3;
        int[][] calendar = new int[7][5];

        int row; int column; int index;

        for (int i = 1; i <= 31; i++) {
            index = startIndex + i - 1;
            row = index % 7;
            column = index / 7;
            calendar[row][column] = i;
        }
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int i = 0; i < 7; i++) {
            System.out.print(days[i]+" ");
            for (int j = 0; j < 5; j++) {
                if (calendar[i][j] == 0) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%2d", calendar[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
