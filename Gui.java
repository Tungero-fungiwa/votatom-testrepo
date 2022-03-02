
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
    private Player player;
    private JLabel popisek;
    private JLabel click_lab;
    private JLabel shop_lab;
    private JLabel auto_lab;
    private JButton click;
    private JButton buy_click;
    private JButton buy_auto;
    public Gui(){
        super("Clicker game");
        this.player= new Player();
        this.popisek= new JLabel(player.toString());
        this.click_lab= new JLabel(player.string_click());
        this.auto_lab= new JLabel(player.string_auto());
        this.shop_lab= new JLabel(player.string_shop());
        this.click= new JButton("Click");
        this.buy_click= new JButton("Buy click");
        this.buy_auto= new JButton("Buy auto");
        setLayout(new FlowLayout());

        add(this.popisek);
        add(this.click_lab);
        add(this.auto_lab);
        add(this.shop_lab);
        add(this.click);
        add(this.buy_click);
        add(this.buy_auto);

        this.buy_click.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    player.buying_click();
                    popisek.setText(player.toString());
                    click_lab.setText(player.string_click());
                    shop_lab.setText(player.string_shop());
                    if(player.get_auto()>0f){
                        player.auto();
                    }

                };
            });
        this.click.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    player.clicking();
                    popisek.setText(player.toString());
                    if(player.get_auto()>0f){
                        player.auto();
                    }
                };
            });
        this.buy_auto.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    player.buying_auto();
                    popisek.setText(player.toString());
                    auto_lab.setText(player.string_auto());
                    if(player.get_auto()>0f){
                        player.auto();
                    }
                    shop_lab.setText(player.string_shop());
                }
        });
        

    }
}