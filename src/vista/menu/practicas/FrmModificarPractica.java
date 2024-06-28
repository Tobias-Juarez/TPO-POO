package vista.menu.practicas;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmModificarPractica extends JDialog {

  private JPanel pnlPrincipal;
  private JLabel lblCodigo;
  private JTextField txtCodigo;
  private JLabel lblNombre;
  private JTextField txtNombre;
  private JLabel lblGrupo;
  private JTextField txtGrupo;
  private JLabel lblDemora;
  private JTextField txtDemora;
  private JLabel lblTipoValor;
  private JComboBox cbTipoValor;
  private JButton modificarPracticaButton;

  public FrmModificarPractica(Window owner, String titulo) {
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

