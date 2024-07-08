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
    private FrmModificarPacienteDNI self;


    public FrmModificarPacienteDNI(Window owner, String titulo, AtencionAlPublico atencionAlPublico, TablePaciente tableModel)
    {
        super(owner, titulo);
        setContentPane(panel1);
        setModal(true);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        asociarEventos(atencionAlPublico, tableModel);
    }

    private void asociarEventos(AtencionAlPublico atencionAlPublico, TablePaciente tableModel)
    {
       confirmarButton.addActionListener(new ActionListener()
       {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String documento = textDni.getText();
                if(AtencionAlPublico.getInstance().existePaciente(Integer.parseInt(documento)))
                {
                    FrmModificarPaciente frame = new FrmModificarPaciente(self, "Modificar Paciente", atencionAlPublico, tableModel, AtencionAlPublico.getInstance().getPacientes().get(Integer.parseInt(documento)));
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