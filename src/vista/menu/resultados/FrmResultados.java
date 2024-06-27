package vista.menu.resultados;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vista.menu.practicas.FrmAltaPractica;

public class FrmResultados extends JDialog {
  private JPanel pnlPrincipal;
  private JButton crearResultadoButton;
  private JButton modificarResultadoButton;
  private JButton eliminarResultadoButton;
  private FrmResultados self;

  public FrmResultados(Window owner, String titulo) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    this.self = this;
    asociarEventos();
  }

  private void asociarEventos() {
    crearResultadoButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmAltaResultados frame = new FrmAltaResultados(self,"Alta Resultados");
        frame.setVisible(true);

      }
    });
    modificarResultadoButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmModificarResultados frame = new FrmModificarResultados(self,"Modificar Resultados");
        frame.setVisible(true);
      }
    });
    eliminarResultadoButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmBajaResultados frame = new FrmBajaResultados(self,"Baja Resultados");
        frame.setVisible(true);
      }
    });
  }

}
