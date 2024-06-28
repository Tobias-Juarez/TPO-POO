package vista.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

import controller.AtencionAlPublico;
import controller.Laboratorio;
import controller.SistemaDeGestion;
import model.RolUsuario;
import vista.FrmPrincipal;
import vista.menu.pacientes.FrmPacientes;
import vista.menu.peticiones.FrmPeticiones;
import vista.menu.practicas.FrmPracticas;
import vista.menu.resultados.FrmResultados;
import vista.menu.sucursales.FrmSucursales;
import vista.menu.usuarios.FrmUsuarios;

public class FrmMenu extends JDialog {
    private JPanel pnlPrincipal;
    private JButton pacientesButton;
    private JButton practicasButton;
    private JButton sucursalesButton;
    private JButton peticionesButton;
    private JButton resultadosButton;
    private JButton usuariosButton;
    private FrmMenu self;


    public FrmMenu(Window owner, String titulo, RolUsuario rol, SistemaDeGestion sistemaDeGestion, Laboratorio laboratorio, AtencionAlPublico atencionAlPublico) {
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
        pacientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmPacientes frame = new FrmPacientes(self, "Pacientes");
                frame.setVisible(true);
            }
        });
        sucursalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmSucursales frame = new FrmSucursales (self, "Sucursales");
                frame.setVisible(true);

            }
        });
        practicasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmPracticas frame = new FrmPracticas(self, "Practicas");
                frame.setVisible(true);

            }
        });
        peticionesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmPeticiones frame = new FrmPeticiones(self, "Peticiones");
                frame.setVisible(true);

            }
        });
        resultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmResultados frame = new FrmResultados(self, "Resultados");
                frame.setVisible(true);

            }
        });
        usuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmUsuarios frame = new FrmUsuarios(self, "Usuarios");
                frame.setVisible(true);

            }
        });
    }
}
