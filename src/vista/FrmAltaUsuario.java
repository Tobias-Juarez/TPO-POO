package vista;

import model.RolUsuario;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FrmAltaUsuario extends JDialog {

    private JPanel pnlPrincipal;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JComboBox cbRolUsuario;
    private JButton crearUsuarioButton;
    private JTextField txtNombre;
    private JLabel lblNombre;
    private JLabel lblUsuario;
    private JLabel lblPassword;

    private List <RolUsuario> roles = new ArrayList<RolUsuario>();
    private final ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public FrmAltaUsuario(Window owner, String titulo) {
        super(owner, titulo);
        setContentPane(pnlPrincipal);
        setModal(true);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        roles.add(RolUsuario.ADMINISTRADOR);
        roles.add(RolUsuario.RECEPCIONISTA);
        roles.add(RolUsuario.LABORATORISTA);
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addAll(roles);
        cbRolUsuario.setModel(model);
        asociarEventos();


    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    private void asociarEventos() {
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Usuario creado");

                String nombre = txtNombre.getText();
                String usuario = txtUsuario.getText();
                String password = txtPassword.getText();
                RolUsuario rol = (RolUsuario) cbRolUsuario.getSelectedItem();
                if (nombre.isEmpty() || usuario.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
                    return;
                }
                else {
                    if (usuarios.stream().anyMatch(u -> u.getUsuario().equals(usuario))) {
                        JOptionPane.showMessageDialog(null, "El usuario ya existe");
                        return;
                    } else {
                        Usuario nuevoUsuario = new Usuario();
                        nuevoUsuario.setNombre(nombre);
                        nuevoUsuario.setUsuario(usuario);
                        nuevoUsuario.setPassword(password);
                        nuevoUsuario.setRol(rol);
                        usuarios.add(nuevoUsuario);
                        JOptionPane.showMessageDialog(null, "Usuario creado");
                        dispose();
                    }
                }




            }
        });
    }
}
