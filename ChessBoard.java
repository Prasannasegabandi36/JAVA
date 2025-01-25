public class ChessBoard {
    public static  boolean isValidMove(String start, String end){
        int startCol = start.charAt(0) - 'A';
        int startRow = start.charAt(1) - '1';
        int endCol= end.charAt(0) -'A';
        int endRow = end.charAt(1) -'1';
        return (startRow == endRow) || (startCol == endCol) ||
               (Math.abs(startRow - endRow) ==  Math.abs(startCol-endCol));

    }
    public static void moveQueen(String start, String end){
        if(isValidMove(start,end)) {
            System.out.println("Queen moves from "+ start+ "to" + end );
        } else {
            System.out.println("Invalid moves from "+ start+ "to" + end );
        }
    }
    public static void main(String args[]){
        String start = "D4";
        String end = "G7";
        moveQueen(start, end);
    }
    



} 

