package vista.menu.sucursales;

import java.awt.Window;
import javax.swing.*;

public class FrmBajaSucursal extends JDialog{

  private JPanel pnlPrincipal;
    private JLabel lblSucursal;
    private JTextField txtIdSucursal;
    private JButton darDeBajaButton;

    public FrmBajaSucursal(Window owner, String titulo) {
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

