package vista.menu.practicas;

import controller.Laboratorio;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import utils.TablePractica;

public class FrmAltaPractica extends JDialog {

  private JPanel pnlPrincipal;
  private JTextField txtCodigo;
  private JTextField txtNombre;
  private JTextField txtGrupo;
  private JTextField txtDemora;
  private JButton crearPracticaButton;
  private JLabel lblDemora;
  private JLabel lblGrupo;
  private JLabel lblNombre;
  private JLabel lblCodigo;

  public FrmAltaPractica(Window owner, String titulo, Laboratorio laboratorio,
      TablePractica tableModel) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    asociarEventos(laboratorio, tableModel);
  }

  private void asociarEventos(Laboratorio laboratorio, TablePractica tableModel) {
    crearPracticaButton.addActionListener(e -> {
      String codigo = txtCodigo.getText();
      String nombre = txtNombre.getText();
      String grupo = txtGrupo.getText();
      String demoraInput = txtDemora.getText();
      try {
        int demora=Integer.parseInt(demoraInput);
        if (codigo.isEmpty() || nombre.isEmpty() || grupo.isEmpty() || demoraInput.isEmpty()) {
          JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (laboratorio.existePractica(codigo)) {
          JOptionPane.showMessageDialog(this, "Ya existe una practica con ese codigo", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
          laboratorio.altaPractica(codigo, nombre, grupo, demora);
          tableModel.add(codigo, nombre, grupo, demora);
          JOptionPane.showMessageDialog(this, "Practica creada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
          dispose();
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "La demora debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
      }
    });
  }

}
