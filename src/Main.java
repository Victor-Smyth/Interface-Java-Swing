import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel telaDeLogin;
    private JLabel titulo;
    private JTextField nome;
    private JPasswordField password;
    private JButton cancelar;
    private JLabel usuario;
    private JLabel senha;
    private JButton enviar;


    public Main() {
        //Configurações da Janela!
        setContentPane(telaDeLogin);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Ir para outra Janela!
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Section2();
            }
        });

        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
