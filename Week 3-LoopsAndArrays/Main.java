import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc;
    static PrintWriter pw;

    public static void setIO(String fileName) {
        try {
            File fIn = new File(fileName + ".in");
            pw = new PrintWriter(new FileWriter(fileName + ".out"));
            sc = new Scanner(fIn);
        } catch (IOException e) {
        }
    }

    public static double distance(int[] endpoints) {
        int[] pointOne = { endpoints[0], endpoints[1] }, pointTwo = { endpoints[2], endpoints[3] };
        // distance = sqrt((y2 - y1)^2 + (x2 - x1)^2);
        return Math.sqrt((pointTwo[1] - pointOne[1]) * (pointTwo[1] - pointOne[1])
                + (pointTwo[0] - pointOne[0]) * (pointTwo[0] - pointOne[0]));
    }

    public static void main(String[] args) throws IOException {
        setIO("map");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] grid = new int[r][c];
        int[] endpoints = new int[4];

        int tempCounter = 0;
        // don't replace a old value at a previous index
        // for loop way
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = sc.nextInt();

                if (grid[i][j] == 1) {
                    endpoints[tempCounter] = i; 
                    tempCounter++;

                    endpoints[tempCounter] = j;
                    tempCounter++;
                }
            }
        }

        // while loop way
        int i = 0;
        while (i < grid.length) {
            int j = 0;

            while (j < grid[i].length) {
                grid[i][j] = sc.nextInt();

                if (grid[i][j] == 1) {
                    endpoints[tempCounter] = i;
                    tempCounter++;

                    endpoints[tempCounter] = j;
                    tempCounter++;
                }

                j++;
            }

            i++;
        }

        pw.println(distance(endpoints));

        sc.close();
        pw.close();
    }

}
