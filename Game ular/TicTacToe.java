import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char player;

    public TicTacToe() {
        board = new char[3][3];
        player = 'X';
        initBoard();
    }

    public void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isBoardFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public boolean isWinner(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public void switchPlayers() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    public boolean play(int row, int col) {
        if (board[row][col] != '-') {
            System.out.println("This cell is occupied! Try another!");
            return false;
        } else {
            board[row][col] = player;
            return true;
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.print("Player " + player + "'s turn. Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            if (play(row, col)) {
                if (isWinner(player)) {
                    printBoard();
                    System.out.println("Congratulations! Player " + player + " wins!");
                    break;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a tie!");
                    break;
                } else {
                    switchPlayers();
                }
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
}
