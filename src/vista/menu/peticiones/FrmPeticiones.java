package vista.menu.peticiones;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.RolUsuario;
import vista.menu.FrmMenu;
import vista.menu.pacientes.FrmAltaPaciente;
import vista.menu.resultados.FrmBajaResultados;

public class FrmPeticiones extends JDialog {
  private JPanel pnlPrincipal;
  private JButton crearPeticionButton;
  private JButton modificarPeticionButton;
  private JButton eliminarPeticionButton;
  private FrmPeticiones self;

  public FrmPeticiones(Window owner, String titulo, RolUsuario rol) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    asociarEventos(rol);
    this.self = this;
  }


  private void asociarEventos(RolUsuario rol) {
    if (rol == RolUsuario.RECEPCIONISTA) {
      eliminarPeticionButton.setEnabled(false);
    }
    crearPeticionButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmAltaPeticion frame = new FrmAltaPeticion(self,"Alta Petición");
        frame.setVisible(true);

      }
    });
    modificarPeticionButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmModificarPeticion frame = new FrmModificarPeticion(self,"Modificar Petición");
        frame.setVisible(true);

      }
    });
    eliminarPeticionButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmBajaPeticion frame = new FrmBajaPeticion(self,"Baja Petición");
        frame.setVisible(true);
      }
    });
  }

}
