package vista.menu.practicas;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmAltaPractica extends JDialog {

  private JPanel pnlPrincipal;
  private JTextField txtCodigo;
  private JTextField txtNombre;
  private JTextField txtGrupo;
  private JTextField txtDemora;
  private JComboBox cbTipoValor;
  private JButton modificarPracticaButton;
  private JLabel lblDemora;
  private JLabel lblGrupo;
  private JLabel lblNombre;
  private JLabel lblTipoValor;
  private JLabel lblCodigo;

  public FrmAltaPractica(Window owner, String titulo) {
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
