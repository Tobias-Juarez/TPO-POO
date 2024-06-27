package vista.menu.practicas;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vista.menu.peticiones.FrmModificarPeticion;

public class FrmPracticas extends JDialog {
  private JPanel pnlPrincipal;
  private JButton crearPracticaButton;
  private JButton modificarPracticaButton;
  private JButton eliminarPracticaButton;
  private FrmPracticas self;

  public FrmPracticas(Window owner, String titulo) {
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
    crearPracticaButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmAltaPractica frame = new FrmAltaPractica(self,"Alta Practica");
        frame.setVisible(true);
      }
    });
    modificarPracticaButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmModificarPractica frame = new FrmModificarPractica(self,"Modificar Practica");
        frame.setVisible(true);
      }
    });
    eliminarPracticaButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmBajaPractica frame = new FrmBajaPractica(self,"Baja Practica");
        frame.setVisible(true);
      }
    });
  }

}
