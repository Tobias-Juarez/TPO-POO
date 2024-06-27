package vista.menu.usuarios;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vista.menu.sucursales.FrmAltaSucursal;

public class FrmUsuarios extends JDialog {
  private JPanel pnlPrincipal;
  private JButton crearUsuarioButton;
  private JButton modificarUsuarioButton;
  private JButton eliminarUsuarioButton;
  private FrmUsuarios self;

  public FrmUsuarios(Window owner, String titulo) {
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
    crearUsuarioButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmAltaUsuario frame = new FrmAltaUsuario(self,"Alta Usuario");
        frame.setVisible(true);
      }
    });
    modificarUsuarioButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmModificarUsuario frame = new FrmModificarUsuario(self,"Modificar Usuario");
        frame.setVisible(true);
      }
    });
    eliminarUsuarioButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmBajaUsuario frame = new FrmBajaUsuario(self,"Baja Usuario");
        frame.setVisible(true);
      }
    });
  }

}
