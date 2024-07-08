package vista.menu.pacientes;

import controller.AtencionAlPublico;
import utils.TablePaciente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrmModificarPacienteDNI extends JDialog {

    private JPanel panel1;
    private JTextField textDni;
    private JButton confirmarButton;
    private JLabel frmBanner;
    private JLabel txtLabel;

    public FrmModificarPacienteDNI(Window owner, String titulo, AtencionAlPublico atencionAlPublico, TablePaciente tableModel)
    {
        super(owner, titulo);
        setContentPane(panel1);
        setModal(true);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        asociarEventos();
    }

    private void asociarEventos()
    {
       confirmarButton.addActionListener(new ActionListener()
       {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String documento = textDni.getText();
                if(AtencionAlPublico.getInstance().existePaciente(Integer.parseInt(documento)))
                {
                    FrmModificarPaciente frame = new FrmModificarPaciente(this, "Modificar Paciente",AtencionAlPublico, TablePaciente);
                    frame.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El paciente buscado no existe");
                }
            }
       });
    }
}