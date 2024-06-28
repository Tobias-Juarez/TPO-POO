package vista.menu.peticiones;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmAltaPeticion extends JDialog {

  private JPanel pnlPrincipal;
  private JTextField txtId;
  private JTextField txtObraSocial;
  private JTextField txtFechaCarga;
  private JTextField txtFechaEntrega;
  private JTextField txtEstado;
  private JButton altaDePeticionButton;
  private JLabel lblEstado;
  private JLabel lblFechaEntrega;
  private JLabel lblFechaCarga;
  private JLabel lblObraSocial;
  private JLabel lblId;

  public FrmAltaPeticion(Window owner, String titulo) {
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
