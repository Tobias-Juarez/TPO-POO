package vista.menu.sucursales;

import java.awt.Window;
import javax.swing.*;

public class FrmModificarSucursal extends JDialog {


  private JPanel pnlPrincipal;
    private JLabel lblId;
    private JTextField txtIdSucursal;
    private JLabel lblDireccion;
    private JTextField txtDireccion;
    private JLabel lblNumero;
    private JTextField txtNumero;
    private JButton modificarSucursalButton;

    public FrmModificarSucursal(Window owner, String titulo) {
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
