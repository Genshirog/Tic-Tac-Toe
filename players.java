import javax.swing.*;
import java.awt.*;
import java.util.*;
public class players{
    private static Random random = new Random();
    private static int turn;

    static{
        turn = random.nextInt(2);
    }
    public JPanel getplayerBar(){
        JPanel playerBar = new JPanel();
        playerBar.setBounds(0, 0, 600, 100);
        playerBar.add(player1());
        playerBar.add(player2());
        playerBar.setLayout(null);
        return playerBar;
    }

    private JPanel player1(){
        JPanel player1 = new JPanel();
        player1.setBounds(0,0,300,100);
        player1.setBackground(new Color(150, 0, 0));
        JLabel user = new JLabel("Player 1");
        user.setFont(new Font("Arial", Font.BOLD, 30));
        user.setForeground(Color.BLACK);
        user.setBounds(80, 20, 300, 50);
        player1.add(user);
        player1.setLayout(null);
        return player1;
    }

    private JPanel player2(){
        JPanel player2 = new JPanel();
        player2.setBounds(300,0,300,100);
        player2.setBackground(new Color(0,0,150));
        JLabel user = new JLabel("Player 2");
        user.setFont(new Font("Arial", Font.BOLD, 30));
        user.setForeground(Color.BLACK);
        user.setBounds(80, 20, 300, 50);
        player2.add(user);
        player2.setLayout(null);
        return player2;
    }

    public JPanel player1_Turn(){
        JPanel player1 = new JPanel();
        player1.setBounds(0,0,300,100);
        player1.setBackground(new Color(255, 0, 0));
        JLabel user = new JLabel("Player 1");
        user.setFont(new Font("Arial", Font.BOLD, 30));
        user.setForeground(Color.BLACK);
        user.setBounds(80, 20, 300, 50);
        player1.add(user);
        player1.setLayout(null);
        return player1;
    }

    public JPanel player2_Turn(){
        JPanel player2 = new JPanel();
        player2.setBounds(300,0,300,100);
        player2.setBackground(new Color(0,0,255));
        JLabel user = new JLabel("Player 2");
        user.setFont(new Font("Arial", Font.BOLD, 30));
        user.setForeground(Color.BLACK);
        user.setBounds(80, 20, 300, 50);
        player2.add(user);
        player2.setLayout(null);
        return player2;
    }

    private JPanel getplayerBar_P1(){
        JPanel playerBar = new JPanel();
        playerBar.setBounds(0, 0, 600, 100);
        playerBar.add(player1_Turn());
        playerBar.add(player2());
        playerBar.setLayout(null);
        return playerBar;
    }

    private JPanel getplayerBar_P2(){
        JPanel playerBar = new JPanel();
        playerBar.setBounds(0, 0, 600, 100);
        playerBar.add(player1());
        playerBar.add(player2_Turn());
        playerBar.setLayout(null);
        return playerBar;
    }

    public JPanel firstTurn(){
        if(turn==0){
            return getplayerBar_P1();
        }else{
            return getplayerBar_P2();
        }
    }

    public boolean first_turn(){
        if(turn==0){
            return true;
        }else{
            return false;
        }
    }

    public void switchTurn(){
     if (turn==0){
        turn = 1;
     }else{
        turn = 0;
     }
    }
    
}
