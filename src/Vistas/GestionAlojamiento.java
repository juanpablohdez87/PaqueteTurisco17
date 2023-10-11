package Vistas;

import Datos.AlojamientoDatos;
import Datos.CiudadDatos;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Servicio;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionAlojamiento extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna != 0 && columna != 6) {
                return true;
            } else {
                return false;
            }
        }
    };

    /**
     * Creates new form GestionAlojamiento
     */
    public GestionAlojamiento() {
        initComponents();
        textMod(false);
        cagarComboxSer();
        cagarComboxCiu();
        armarCabezera();
        modelo.setRowCount(0);
        cargarTabla();
        jTable1.setSelectionBackground(Color.green);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcCiuDestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcServicio = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jtImporteDiario = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jcCiuBuscar = new javax.swing.JComboBox<>();
        jdateFechaIngre = new com.toedter.calendar.JDateChooser();
        jdateFechaSalida = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Ciudad");

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Gestion De Alojamiento");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Ciudad Destino");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Fecha de ingreso");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Servicio");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Busqueda por Ciudad");

        jbModificar.setText("Actualizar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Fecha de Salida");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Importe Diario $");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jcCiuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiuBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jbNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbAgregar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcCiuDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtImporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdateFechaIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jdateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jcCiuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcCiuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbNuevo)
                                    .addComponent(jbAgregar))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jcCiuDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jcServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdateFechaIngre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtImporteDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // Nuevo
        textMod(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // Agregar
        try {
            if (this.jtImporteDiario.getText().isEmpty() || this.jdateFechaIngre.getDate() == null || this.jdateFechaSalida.getDate() == null) {
                JOptionPane.showMessageDialog(null, "No debe quedar campos vacíos", "Loco Fíjate", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Ciudad ciu = (Ciudad) this.jcCiuDestino.getSelectedItem();
            java.util.Date fIng = this.jdateFechaIngre.getDate(); // Obtener la fecha de ingreso como java.util.Date
            java.util.Date fSal = this.jdateFechaSalida.getDate(); // Obtener la fecha de salida como java.util.Date
             if (fIng.after(fSal)) {
                JOptionPane.showMessageDialog(null, "La fecha de ingreso tiene que ser antes de la fecha de salida", "Loco Fíjate", JOptionPane.ERROR_MESSAGE);
                limpiar();
                return;
            }
            Servicio ser = (Servicio) this.jcServicio.getSelectedItem();
            double imp = Double.parseDouble(this.jtImporteDiario.getText());
            boolean est = true;
            // Convertir java.util.Date a java.sql.Date
            java.sql.Date sqlDateIng = new java.sql.Date(fIng.getTime());
            java.sql.Date sqlDateSal = new java.sql.Date(fSal.getTime());
            // Crear un objeto Alojamiento usando las fechas convertidas a java.sql.Date
            Alojamiento alojamiento = new Alojamiento(ciu, sqlDateIng.toLocalDate(), sqlDateSal.toLocalDate(), ser, imp, est);
            AlojamientoDatos.alojamientoGuardar(alojamiento);
            limpiar();
            modelo.setRowCount(0);
            cargarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Solo números " + e.getMessage(), "Date cuenta capo solo NUMEROS", JOptionPane.ERROR_MESSAGE);
        }
        textMod(false);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Eliminar
        int filaSelecionada = this.jTable1.getSelectedRow();
        if (filaSelecionada != -1) { // Verifica si se ha seleccionado una fila válida
            int idAlo = Integer.parseInt(modelo.getValueAt(filaSelecionada, 0).toString());
            AlojamientoDatos.eliminarAlojamiento(idAlo);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila antes de Eliminar Ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }
        modelo.setRowCount(0);
        cargarTabla();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // Modificar
        int filaSelecionada = this.jTable1.getSelectedRow();
        if (filaSelecionada != -1) { // Verifica si se ha seleccionado una fila válida
            int idAlo = Integer.parseInt(modelo.getValueAt(filaSelecionada, 0).toString());
            String ciu = modelo.getValueAt(filaSelecionada, 1).toString();
            // Convierte las cadenas de fecha a objetos LocalDate
            String ciuI = modelo.getValueAt(filaSelecionada, 2).toString();
            LocalDate ciuInicio = LocalDate.parse(ciuI);
            String ciuS = modelo.getValueAt(filaSelecionada, 3).toString();
            LocalDate ciuSalida = LocalDate.parse(ciuS);
            Servicio ser = (Servicio) modelo.getValueAt(filaSelecionada, 4);
            double imp = Double.parseDouble(modelo.getValueAt(filaSelecionada, 5).toString());
            String est = modelo.getValueAt(filaSelecionada, 6).toString();
            AlojamientoDatos.modificarAlojamiento(new Alojamiento(idAlo, CiudadDatos.buscarCiudad(ciu), ciuInicio, ciuSalida, ser, imp, activo1(est)));
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila antes de intentar actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        modelo.fireTableDataChanged();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jcCiuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCiuBuscarActionPerformed
        // BuscarCombox
        modelo.setRowCount(0);
        Ciudad ciuSelecionada = (Ciudad) this.jcCiuBuscar.getSelectedItem();
        for (Alojamiento alo : AlojamientoDatos.listaAlojamientosxCiudadActiva()) {

            if (alo.getCiuDestino().getNombre().equalsIgnoreCase(ciuSelecionada.getNombre())) {
                modelo.addRow(new Object[]{alo.getIdAlojamiento(), alo.getCiuDestino().getNombre(), alo.getFechaIngreso(), alo.getFechaSalida(), alo.getServicio(), alo.getImporteDiario(), activo(alo.isEstado())});

            }

        }
    }//GEN-LAST:event_jcCiuBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JComboBox<Ciudad> jcCiuBuscar;
    private javax.swing.JComboBox<Ciudad> jcCiuDestino;
    private javax.swing.JComboBox<Servicio> jcServicio;
    private com.toedter.calendar.JDateChooser jdateFechaIngre;
    private com.toedter.calendar.JDateChooser jdateFechaSalida;
    private javax.swing.JTextField jtImporteDiario;
    // End of variables declaration//GEN-END:variables

    private void textMod(boolean ok) {
        this.jtImporteDiario.setEditable(ok);
        this.jcCiuDestino.setEnabled(ok);
        this.jcServicio.setEnabled(ok);
        this.jdateFechaIngre.setEnabled(ok);
        this.jdateFechaSalida.setEnabled(ok);

    }

    private void armarCabezera() {
        modelo.addColumn("IdAlojamiento");
        modelo.addColumn("ciuDestino");
        modelo.addColumn("fechaIngreso");
        modelo.addColumn("fechaSalida");
        modelo.addColumn("servicio");
        modelo.addColumn("importeDiario");
        modelo.addColumn("Activo");
        this.jTable1.setModel(modelo);
    }

    private void limpiar() {
        this.jtImporteDiario.setText("");
        this.jdateFechaIngre.setDate(null);  // Establece la fecha de ingreso como null
        this.jdateFechaSalida.setDate(null);  // Establece la fecha de salida como null
    }

    private String activo(boolean ok) {
        if (ok) {
            return "Si";
        }
        return "No";
    }

    private boolean activo1(String ok) {
        if (ok.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

    private void cargarTabla() {
        for (Alojamiento alo : AlojamientoDatos.listaAlojamientosxCiudadActiva()) {

            int id = alo.getIdAlojamiento();
            String ciu = alo.getCiuDestino().getNombre();
            Date fIng = Date.valueOf(alo.getFechaIngreso().toString());
            Date fSal = Date.valueOf(alo.getFechaSalida().toString());
            Servicio ser = alo.getServicio();
            double imp = alo.getImporteDiario();
            boolean est = alo.isEstado();
            modelo.addRow(new Object[]{id, ciu, fIng, fSal, ser, imp, activo(est)});

        }
    }

    private void cagarComboxSer() {
        this.jcServicio.addItem(Servicio.BASICO);
        this.jcServicio.addItem(Servicio.COMPLETO);
        this.jcServicio.addItem(Servicio.TODO_INCLUIDO);
    }

    private void cagarComboxCiu() {
        for (Ciudad ciu : CiudadDatos.listarCiu()) {
            if (ciu.isEstado() == true) {
                this.jcCiuDestino.addItem(ciu);
                this.jcCiuBuscar.addItem(ciu);
            }
        }
    }

//    private void borrarFila(Alojamiento alo) {
//        int f = this.jTable1.getRowCount() - 1;
//        for (; f >= 0; f--) {
//            if (alo.getCiuDestino() == null) {
//                modelo.removeRow(f);
//            }
//        }
//    }

}//Fin class
