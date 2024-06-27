package vista.menu.sucursales;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vista.menu.practicas.FrmAltaPractica;

public class FrmSucursales extends JDialog {
  private JPanel pnlPrincipal;
  private JButton crearSucursalButton;
  private JButton modificarSucursalButton;
  private JButton eliminarSucursalButton;
  private FrmSucursales self;

  public FrmSucursales(Window owner, String titulo) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    asociarEventos();
    this.self = this;
  }

  private void asociarEventos() {
    crearSucursalButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmAltaSucursal frame = new FrmAltaSucursal(self,"Alta Sucursal");
        frame.setVisible(true);
      }
    });
    modificarSucursalButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmModificarSucursal frame = new FrmModificarSucursal(self,"Modificar Sucursal");
        frame.setVisible(true);
      }
    });
    eliminarSucursalButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmBajaSucursal frame = new FrmBajaSucursal(self,"Baja Sucursal");
        frame.setVisible(true);

      }
    });
  }
}
