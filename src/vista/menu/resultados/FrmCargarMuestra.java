package vista.menu.resultados;

import model.RolUsuario;

import javax.swing.*;
import java.awt.*;



public class FrmCargarMuestra extends JDialog{
    private JPanel pnlPrincipal;

    public FrmCargarMuestra(Window owner, String titulo) {
        super(owner, titulo);
        setContentPane(pnlPrincipal);
        setModal(true);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);



    }
}
