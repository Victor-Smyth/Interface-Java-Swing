import javax.swing.*;
import java.awt.event.*;

public class Section2 extends JFrame {
    private JPanel section2;
    private JLabel opcoes;

    public Section2() {
        setContentPane(section2);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Criar um JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Opção 1");
        JMenuItem menuItem2 = new JMenuItem("Opção 2");
        JMenuItem menuItem3 = new JMenuItem("Opção 3");

        // Adicionar os itens de menu ao JPopupMenu
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);

        // Adicionar um ouvinte de mouse à JLabel "opcoes" para exibir o menu pop-up quando o botão direito do mouse for clicado
        opcoes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupMenu.show(opcoes, e.getX(), e.getY());
                }
            }
        });
    }

    public static void main(String[] args) {
        new Section2();
    }
}

