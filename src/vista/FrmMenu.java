package vista;

import javax.swing.*;
import java.awt.*;

public class FrmMenu extends JDialog {
    private JPanel pnlPrincipal;

    public FrmMenu(Window owner, String titulo) {
        super(owner, titulo);
        setContentPane(pnlPrincipal);
        setModal(true);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
