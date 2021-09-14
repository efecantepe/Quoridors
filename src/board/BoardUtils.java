package board;

public class BoardUtils {

    public final static int ROW_TILES = 9;
    public final static int HEIGHT_TILES = 9;
    public final static boolean[][] LAST_ROW_FOR_WHITE = setRow(8);
    public final static boolean[][] LAST_ROW_FOR_BLACK = setRow(0);

    public static boolean[][] setRow(int rowCount){
        boolean [][] result = new boolean [ROW_TILES][HEIGHT_TILES];
        for(int a = 0; a < 9; a++){
            result[rowCount][a] = true;
        }
        return result;
    }
}
