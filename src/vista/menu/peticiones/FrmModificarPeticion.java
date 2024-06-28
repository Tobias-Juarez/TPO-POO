package vista.menu.peticiones;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmModificarPeticion extends JDialog {

  private JPanel pnlPrincipal;
  private JLabel lblId;
  private JTextField txtId;
  private JLabel lblObraSocial;
  private JTextField txtObraSocial;
  private JLabel lblFechaCarga;
  private JTextField txtFechaCarga;
  private JLabel lblFechaEntrega;
  private JTextField txtFechaEntrega;
  private JLabel lblEstado;
  private JTextField txtEstado;
  private JButton ModificarPeticionButton;

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
