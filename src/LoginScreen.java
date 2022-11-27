import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 26 17:54:29 CST 2022
 */



/**
 * @author Daniel Oropeza Manzano
 */
public class LoginScreen extends JFrame{

    public LoginScreen() {

        initComponents();
        setTitle("Iniciar Sesion");
        setContentPane(MainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Daniel Oropeza Manzano
        MainPanel = new JPanel();
        lbImageLogin = new JLabel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();
        button3 = new JButton();

        //======== MainPanel ========
        {
            MainPanel.setBackground(new Color(0xffff99));
            MainPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,MainPanel. getBorder( )) ); MainPanel. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            MainPanel.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[355,fill]",
                // rows
                "[95]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- lbImageLogin ----
            lbImageLogin.setIcon(new ImageIcon(getClass().getResource("/Icons/user.png")));
            MainPanel.add(lbImageLogin, "cell 0 0 2 1,alignx center,growx 0");

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/Icons/driver-license.png")));
            MainPanel.add(label1, "cell 0 1");

            //---- textField1 ----
            textField1.setBackground(Color.white);
            MainPanel.add(textField1, "cell 1 1");

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/Icons/padlock.png")));
            MainPanel.add(label2, "cell 0 2");

            //---- textField2 ----
            textField2.setBackground(Color.white);
            MainPanel.add(textField2, "cell 1 2");

            //---- button2 ----
            button2.setText("Iniciar Sesion");
            button2.setBackground(Color.darkGray);
            button2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 14));
            MainPanel.add(button2, "cell 0 3 2 1");

            //---- button3 ----
            button3.setText("Salir");
            button3.setForeground(Color.magenta);
            button3.setEnabled(false);
            button3.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
            button3.setBackground(Color.darkGray);
            MainPanel.add(button3, "cell 0 4 2 1");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    public static void main(String[] args) {







    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Daniel Oropeza Manzano
    private JPanel MainPanel;
    private JLabel lbImageLogin;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
