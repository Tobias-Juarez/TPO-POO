package vista.menu.sucursales;

import java.awt.Window;
import javax.swing.*;

public class FrmAltaSucursal extends JDialog {

  private JPanel pnlPrincipal;
    private JTextField txtIdSucursal;
  private JTextField txtDireccion;
  private JTextField txtNumero;
  private JButton crearSucursalButton;
  private JLabel lblId;
  private JLabel lblDireccion;
  private JLabel lblNumero;

  public FrmAltaSucursal(Window owner, String titulo) {
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
