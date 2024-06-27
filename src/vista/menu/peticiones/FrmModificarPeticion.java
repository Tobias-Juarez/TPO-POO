package vista.menu.peticiones;

import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrmModificarPeticion extends JDialog {

  private JPanel pnlPrincipal;
  public FrmModificarPeticion(Window owner, String titulo) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    asociarEventos();
  }

  private void asociarEventos() {
  }

}
