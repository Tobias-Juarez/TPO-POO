package vista;

import controller.SistemaDeGestion;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Usuario;
import vista.menu.FrmMenu;

public class FrmPrincipal  extends JFrame {
    private JPanel pnlPrincipal;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JButton iniciarSesionButton;
    private JLabel usuarioLabel;
    private JLabel contraseñaLabel;
    private JButton crearUsuarioButton;

    private FrmPrincipal self;
    private SistemaDeGestion sistemaDeGestion = new SistemaDeGestion();

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
                String usuario = txtUsuario.getText();
                String password = txtPassword.getText();
                if(sistemaDeGestion.getUsuarios().stream().anyMatch(u -> u.getUsuario().equals(usuario) && u.getPassword().equals(password))) {
                    FrmMenu frame = new FrmMenu(self, "Menú");
                    frame.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "El usuario o contraseña no existe");
                }
            }
        });
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmCrearUsuario frame = new FrmCrearUsuario(self, "Crear Usuario",sistemaDeGestion.getUsuarios());
                frame.setVisible(true);
                Usuario nuevoUsuario = frame.getUsuario();
                sistemaDeGestion.altaUsuario(nuevoUsuario);
            }
        });
    }
    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal("Sistema de Gestión de Laboratorio");

        frame.setVisible(true);

    }
}
