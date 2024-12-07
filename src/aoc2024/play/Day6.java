package aoc2024.play;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day6 {

    static int rowSize = 130;
    static int colSize = 130;

    public static void main(String[] args) {
        String input = "src/aoc2024/input/files/day6_ip.txt";
        day6part1(input);
    }

    private static void day6part1(String input) {
        int[][] twoDarr = new int[rowSize][colSize];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input))) {
            String guardPosition = loadAndFindGuardsPosition(bufferedReader, twoDarr);
            String[] guardPositions = guardPosition.split(",");
            guardTraversal(guardPositions[0], guardPositions[1], twoDarr);
            countX(twoDarr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String loadAndFindGuardsPosition(BufferedReader br, int[][] twoDarr) throws IOException {
        String line;
        String guardPosition = null;
        int i = 0;
        while ((line = br.readLine()) != null && i < rowSize) {
            for (int j = 0; j < colSize; j++) {
                twoDarr[i][j] = line.charAt(j);
                if (twoDarr[i][j] == '^') {
                    guardPosition = (i + "," + j);
                }
            }
            i++;
        }
        System.out.println("guard found at position: (" + guardPosition + ")");
        return guardPosition;
    }

    private static void guardTraversal(String guardPosX, String guardPosY, int[][] twoDarr) {
        int x = Integer.parseInt(guardPosX);
        int y = Integer.parseInt(guardPosY);
        boolean up = false, right = false, down = false, left = false;

        while (x > 0 && y >= 0 && x < rowSize && y < colSize) {
            if (x == 0 || x == rowSize || y == colSize) {
                break;
            } else if (twoDarr[x][y] == '^' && makeThisDirectionTrue(up)) {
                while (twoDarr[x][y] != '#') {
                    twoDarr[x][y] = 'X';
                    if (x > 0 && twoDarr[x - 1][y] != '#') {
                        x--;
                    } else {
                        up = false;
                        makeThisDirectionTrue(right);
                        break;
                    }
                }
            } else if (y < colSize && twoDarr[x][y] != '#' && right) {
                while (y < colSize && twoDarr[x][y] != '#') {
                    twoDarr[x][y] = 'X';
                    if ((y + 1 < colSize) && twoDarr[x][y + 1] != '#') {
                        y++;
                    } else {
                        right = false;
                        makeThisDirectionTrue(down);
                        break;
                    }
                }
            } else if (x < rowSize && twoDarr[x][y] != '#' && down) {
                while (x < rowSize && twoDarr[x][y] != '#') {
                    twoDarr[x][y] = 'X';
                    if ((x + 1 < rowSize) && twoDarr[x + 1][y] != '#') {
                        x++;
                    } else {
                        down = false;
                        makeThisDirectionTrue(left);
                        break;
                    }
                }
            } else if (y > 0 && twoDarr[x][y - 1] != '#' && left) {
                while (y > 0 && twoDarr[x][y - 1] != '#') {
                    twoDarr[x][y] = 'X';
                    if ((y - 1 >= 0) && twoDarr[x][y - 1] != '#') {
                        y--;
                    } else {
                        left = false;
                        makeThisDirectionTrue(up);
                        break;
                    }
                }
            } else if (x > 0 && twoDarr[x - 1][y] != '#' && up) {
                while (x > 0 && twoDarr[x - 1][y] != '#') {
                    twoDarr[x][y] = 'X';
                    if ((x - 1 >= 0) && twoDarr[x - 1][y] != '#') {
                        x--;
                    } else {
                        up = false;
                        makeThisDirectionTrue(right);
                        break;
                    }
                }
            }
        }
    }

    private static boolean makeThisDirectionTrue(boolean anyDirection) {
        anyDirection = true;
        return anyDirection;
    }

    private static void countX(int[][] twoDarr) {
        int travelled = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (twoDarr[i][j] == 'X') {
                    travelled++;
                }
            }
        }
        System.out.println("Total travelled: " + travelled);
    }
}
