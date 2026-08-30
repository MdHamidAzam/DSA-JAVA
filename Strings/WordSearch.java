package Strings;

public class WordSearch {
    public static boolean dfs(char[][] board, String word, int r, int c, int index, boolean[][] visited) {
        if(index == word.length()) return true;

        if(r<0 || r>=board.length ||
            c<0 || c>=board[0].length ||
            visited[r][c] || 
            board[r][c] != word.charAt(index)) return false;

        visited[r][c] = true;

        boolean found = dfs(board, word, r+1, c, index+1, visited) || 
                        dfs(board, word, r-1, c, index+1, visited) || 
                        dfs(board, word, r, c+1, index+1, visited) || 
                        dfs(board, word, r, c-1, index+1, visited);

        visited[r][c] = false;
        return found;
    }
    public static boolean wordSearch(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for(int r=0; r<rows; r++) {
            for(int c=0; c<cols; c++) {
                if(dfs(board, word, r, c, 0, visited)) return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        char[][] board = {  {'A','B','C','E'},
                            {'S','F','C','S'},
                            {'A','D','E','E'}
                        };

        System.out.println(wordSearch(board, "ABCCED"));
    }
}
