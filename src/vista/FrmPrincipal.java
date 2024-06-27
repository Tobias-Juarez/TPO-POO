package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal  extends JFrame {
    private JPanel pnlPrincipal;
    private JTextField txtUsuario;
    private JTextField txtContraseña;
    private JButton iniciarSesionButton;
    private JLabel usuarioLabel;
    private JLabel contraseñaLabel;
    private JButton crearUsuarioButton;

    private FrmPrincipal self;

    public FrmPrincipal(String titulo) {
        super(titulo);
        setContentPane(pnlPrincipal);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        asociarEventos();
        this.self = this;
    }
    private void asociarEventos() {
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmMenu frame = new FrmMenu(self, "Menú");
                frame.setVisible(true);
            }
        });
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAltaUsuario frame = new FrmAltaUsuario(self, "Crear Usuario");
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal("Sistema de Gestión de Laboratorio");

        frame.setVisible(true);

    }
}
