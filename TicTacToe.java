import javax.swing.*;
public class TicTacToe extends JFrame{
    private players Player = new players();
    private Board board;
    TicTacToe(){
        this.setTitle("Tic Tac Toe");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        board = new Board(this);
        this.add(Player.firstTurn());
        this.add(board.getboard());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
    
    public void updatePlayerTurn(){
        getContentPane().removeAll();
        getContentPane().add(Player.firstTurn());
        getContentPane().add(board.getboard());
        revalidate();
        repaint();
    }
}
