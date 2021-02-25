package condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int res = 0;
        if (x1 != x2 && y1 != y2 && Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
             res = Math.abs(x1 - x2);
        }
        return res;
    }
}
