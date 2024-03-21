import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Board implements ActionListener{
    JButton[] button = new JButton[9];
    players playerPanel = new players();
    private TicTacToe ticTacToe;
    JButton[] test = grid();

    Board(TicTacToe ticTacToe){
        this.ticTacToe = ticTacToe;
    }
    public JPanel getboard(){
        JPanel board = new JPanel();
        board.setBounds(95, 150, 400, 350);
        board.setBackground(Color.gray);
        for(int i = 0; i < 9; i++){
            board.add(test[i]);
        }
        board.setLayout(new GridLayout(3,3));
        return board;
    }

    private JButton[] grid(){
        for(int i = 0; i < 9; i++){
            button[i] = new JButton();
            button[i].setFont(new Font("Arial", Font.BOLD, 30));
            button[i].setFocusable(false);
            button[i].addActionListener(this);
        }
        return button;
    }

    private void check(){
        if((button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[6].getText() == "X" && button[4].getText() == "X" && button[2].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        if((button[3].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 1 WINS");
        }
        //P2
        if((button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[6].getText() == "O" && button[4].getText() == "O" && button[2].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        if((button[3].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O")){
            for(int i = 0; i < 9; i++){
                button[i].setEnabled(false);
            }
            JOptionPane.showMessageDialog(null, "Player 2 WINS");
        }
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 9; i++){
            if(playerPanel.first_turn()){
                if(e.getSource() == button[i] && button[i].getText().isEmpty()){
                    button[i].setText("X");
                    playerPanel.switchTurn();
                    ticTacToe.updatePlayerTurn();
                    check();
                }
            }else{
                if(e.getSource() == button[i] && button[i].getText().isEmpty()){
                    button[i].setText("O");
                    playerPanel.switchTurn();
                    ticTacToe.updatePlayerTurn();
                    check();
                }
            }
        }
    }

}
