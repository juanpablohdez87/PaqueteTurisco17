package Vistas;

import Datos.AlojamientoDatos;
import Datos.CiudadDatos;
import Datos.PaqueteDatos;
import Datos.PasajeDatos;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Paquete;
import Entidades.Pasaje;
import Entidades.TipoAlojamiento;
import Entidades.Transporte;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucia
 */
public class CargarPaquete extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form CargarPaquete
     */
    public CargarPaquete() {
        initComponents();
        cargarComboBox();
        limpiar();
        armarCabecera();
        cargarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/imagTuristica.jpg"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbCiuOrigen = new javax.swing.JComboBox<>();
        jcbCiuDestino = new javax.swing.JComboBox<>();
        jcbAlojamiento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbPasaje = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbCrear = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cargar Paquete");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Ciudad de Origen:");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Ciudad de Destino:");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Alojamiento:");
        jLabel3.setOpaque(true);

        jcbCiuOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiuOrigenActionPerformed(evt);
            }
        });

        jcbCiuDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiuDestinoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Tipo deTransporte:");
        jLabel4.setOpaque(true);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        jbCrear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete2.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Paquetes Predeterminados");
        jLabel5.setOpaque(true);

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCiuOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCiuDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbCrear)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(236, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbCiuOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCiuDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jbCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
       try{
        if (jcbCiuOrigen.getSelectedItem() != null || jcbPasaje.getSelectedItem() != null || jcbAlojamiento.getSelectedItem() != null || jcbCiuDestino.getSelectedItem() != null) {
            Ciudad ciudadOrigen = (Ciudad) jcbCiuOrigen.getSelectedItem();
            Ciudad ciudadDestino = (Ciudad) jcbCiuDestino.getSelectedItem();
            if (ciudadOrigen.equals(ciudadDestino)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar una ciudad distinta a la de origen");
                limpiar();
                return;
            }
            Paquete paquete = new Paquete(ciudadOrigen, ciudadDestino, (Alojamiento) jcbAlojamiento.getSelectedItem(), (Pasaje) jcbPasaje.getSelectedItem());
            PaqueteDatos.guardarPaquete(paquete);
            modelo.setRowCount(0);
            cargarTabla();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No debe quedar campos vacíos");
            limpiar();
        }
       }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "No debe quedar campos vacíos");
            limpiar();
                }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jcbCiuOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiuOrigenActionPerformed
        comboSelecionado();
        Ciudad ciudadSeleccionada = (Ciudad) jcbCiuOrigen.getSelectedItem();
        jcbPasaje.removeAllItems();
        for (Pasaje pas : PasajeDatos.listarPasajesxCiudad(ciudadSeleccionada)) {
            jcbPasaje.addItem(pas);
        }
    }//GEN-LAST:event_jcbCiuOrigenActionPerformed

    private void jcbCiuDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiuDestinoActionPerformed
        comboSelecionado();
        Ciudad ciudadSeleccionada = (Ciudad) jcbCiuDestino.getSelectedItem();

        jcbAlojamiento.removeAllItems();
        for (Alojamiento aloja : AlojamientoDatos.listaAlojamientosxCiudad(ciudadSeleccionada)) {
            jcbAlojamiento.addItem(aloja);
        }
    }//GEN-LAST:event_jcbCiuDestinoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSelecionada = this.jTabla.getSelectedRow();
        if (filaSelecionada != -1) {
            int idP = Integer.parseInt(modelo.getValueAt(filaSelecionada, 0).toString());
            PaqueteDatos.eliminarpaquete(idP);
            modelo.removeRow(filaSelecionada);

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar un paquete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alojamiento> jcbAlojamiento;
    private javax.swing.JComboBox<Ciudad> jcbCiuDestino;
    private javax.swing.JComboBox<Ciudad> jcbCiuOrigen;
    private javax.swing.JComboBox<Pasaje> jcbPasaje;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox() {
        for (Ciudad ciu : CiudadDatos.listarCiuxTrue()) {
            this.jcbCiuOrigen.addItem(ciu);
            this.jcbCiuDestino.addItem(ciu);
        }
        for (Alojamiento aloja : AlojamientoDatos.listaAlojamientosxCiudadActiva()) {
            jcbAlojamiento.addItem(aloja);
        }
        for (Pasaje pas : PasajeDatos.listarPasajesActivos()) {
            jcbPasaje.addItem(pas);
        }
    }

    private void limpiar() {
        jcbCiuOrigen.setSelectedIndex(-1);
        jcbCiuDestino.setSelectedIndex(-1);
        jcbAlojamiento.setSelectedIndex(-1);
        jcbPasaje.setSelectedIndex(-1);
    }

    private void comboSelecionado() {
        if (jcbCiuOrigen.getSelectedItem() != null) {
            jcbPasaje.setEnabled(true);
            jcbCiuDestino.setEnabled(true);
        } else {
            jcbPasaje.setEnabled(false);
            jcbCiuDestino.setEnabled(false);
        }
        if (jcbCiuDestino.getSelectedItem() != null) {
            jcbAlojamiento.setEnabled(true);
        } else {
            jcbAlojamiento.setEnabled(false);
        }
    }

    private void cargarTabla() {
        double temp = 0;
        for (Paquete paq : PaqueteDatos.listarPaquete()) {
            int id = paq.getIdPaquete();
            String ciuOrigen = paq.getCiuOrigen().getNombre();
            String ciuDestino = paq.getCiuDestino().getNombre();
            LocalDate fIng = paq.getAlojamiento().getFechaIngreso();
            LocalDate fSal = paq.getAlojamiento().getFechaSalida();
            int dias = (int) ChronoUnit.DAYS.between(fIng, fSal);
            Transporte trans = paq.getPasaje().getTipoTransporte();
            TipoAlojamiento aloja = paq.getAlojamiento().getAlojamiento();
            double impTrans = paq.getPasaje().getImporte();
            double impAloja = paq.getAlojamiento().getImporteDiario();
            double importe = impTrans + impAloja * dias;
            if (fIng.getMonth() == Month.JANUARY || fIng.getMonth() == Month.JULY) {
                temp = importe * 1.3;
            } else if (fIng.getMonth() == Month.FEBRUARY || fIng.getMonth() == Month.JUNE) {
                temp = importe * 1.15;
            } else {
                temp = importe;
            }
            modelo.addRow(new Object[]{id, ciuOrigen, trans, ciuDestino, aloja, fIng, fSal, Math.round(temp * 100.0) / 100.0});

        }
    }

    private void armarCabecera() {
        modelo.addColumn("id Paquete");
        modelo.addColumn("Ciudad de Origen");
        modelo.addColumn("Transporte");
        modelo.addColumn("Ciudad de Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Fecha de Ingreso");
        modelo.addColumn("Fecha de Salida");
        modelo.addColumn("Importe Total");
        jTabla.setModel(modelo);
    }
}
