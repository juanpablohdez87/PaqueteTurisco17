package Vistas;

import Datos.ClientesDatos;
import Datos.PaqueteDatos;
import Datos.PasajeDatos;
import Entidades.Ciudad;
import Entidades.Cliente;
import Entidades.Paquete;
import Entidades.Pasaje;
import Entidades.TipoAlojamiento;
import Entidades.Transporte;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Juan
 */
public class ReservaPaquete extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            if (c == 4 || c == 5) {
                return true;
            }
            return false;
        }
    };

//    private class JDateChooserCellEditor extends AbstractCellEditor implements TableCellEditor {
//
//        private JDateChooser dateChooser;
//        private Date selectedDate;
//
//        public JDateChooserCellEditor() {
//            dateChooser = new JDateChooser();
//            dateChooser.setDateFormatString("yyyy-MM-dd"); // Establece el formato de fecha según tus necesidades
//            // Agregar un PropertyChangeListener para capturar la fecha seleccionada
//            dateChooser.addPropertyChangeListener("date", new PropertyChangeListener() {
//                @Override
//                public void propertyChange(PropertyChangeEvent evt) {
//                    if (evt.getPropertyName().equals("date")) {
//                        selectedDate = (Date) evt.getNewValue();
//                        stopCellEditing();
//                    }
//                }
//            });
//        }
//
//        @Override
//        public Object getCellEditorValue() {
//            return selectedDate;
//        }
//
//        @Override
//        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
//            if (value instanceof Date) {
//                selectedDate = (Date) value;
//                dateChooser.setDate(selectedDate);
//            }
//            return dateChooser;
//        }
//    }
//
//    private class DateRenderer extends DefaultTableCellRenderer {
//
//        private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//        @Override
//        protected void setValue(Object value) {
//            if (value instanceof Date) {
//                setText(dateFormat.format((Date) value));
//            } else {
//                super.setValue(value);
//            }
//        }
//    }

    public ReservaPaquete() {
        initComponents();
        armarCabecera();
        cargarTabla();
//        elejirColumanasFechas(4, 5);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtfPersona = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radioSino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jtfBuscar = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel12.setText("Numero de Personas:");

        jLabel13.setText("Importe Total del Paquete:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("DNI:");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel11.setText("Abonar: ");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Reserva de Paquete");

        radioSino.setText("Si / No");

        jLabel2.setText("Buscar Pais: ");

        jbSalir.setText("Salir");

        jbBuscar.setText("Buscar");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        jLabel3.setText("Reserva de Cliente:");

        jLabel9.setText("$");

        jLabel10.setText("Id Paquete");

        jLabel14.setText("importe");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfNombre))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jtfDni)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioSino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbAgregar)))))
                        .addGap(96, 384, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(399, 399, 399))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(radioSino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(jbAgregar))
                .addGap(7, 7, 7)
                .addComponent(jbSalir)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
//        try {
//            int dni = Integer.parseInt(jtfDni.getText());
//            int tel = Integer.parseInt(jtfTelefono.getText());
//            int cantP = Integer.parseInt(jtfPersona.getText());
//            double importe = Double.parseDouble(jtxCosto.getText());
//            if (dni < 0 || tel < 0 || cantP < 0 || importe < 0) {
//                JOptionPane.showMessageDialog(null, "Debe ingresar números positivos");
//                limpiar();
//            }
//            if (jtfApellido.getText().isEmpty() || jtfNombre.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "No debe quedar campos vacíos");
//                return;
//            }
//            String apellido = jtfApellido.getText();
//            String nombre = jtfNombre.getText();
//            int fila = jTable.getSelectedRow();
//            if (fila != -1) {
//
//            } else {
//                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
//            }
//            boolean abonar = radioSino.isSelected();
////            Cliente cliente = new Cliente(nombre, apellido, tel, dni, paquete, cantP, importe * cantP, abonar);
////            ClientesDatos.guardarCliente(cliente);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Para los campos dni,teléfono,cantidad de personas,importe");
//            limpiar();
//        }
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPersona;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JRadioButton radioSino;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        
        modelo.addColumn("Ciudad de Origen");
        modelo.addColumn("Transporte");
        modelo.addColumn("Ciudad de Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Fecha de Ingreso");
        modelo.addColumn("Fecha de Salida");
        modelo.addColumn("Importe");
        modelo.addColumn("Temporada");
        jTable.setModel(modelo);
    }

    private void cargarTabla() {

        double temp = 0;
        String temporada = "";        
        for (Paquete paq : PaqueteDatos.listarPaquete()) {
            int idP = paq.getIdPaquete();
            String ciuDestino = paq.getCiuDestino().getNombre();
            LocalDate fIng = paq.getAlojamiento().getFechaIngreso();
            LocalDate fSal = paq.getAlojamiento().getFechaSalida();
            int dias = (int) ChronoUnit.DAYS.between(fIng, fSal);
            Transporte trans = paq.getPasaje().getTipoTransporte();
            double impTrans = paq.getPasaje().getImporte();
            double impAloja = paq.getAlojamiento().getImporteDiario();
            double importe = impTrans + impAloja * dias;
            
            String ciuOrigen = paq.getCiuOrigen().getNombre();
            TipoAlojamiento aloj = paq.getAlojamiento().getAlojamiento();
            
            
            if (fIng.getMonth() == Month.JANUARY || fIng.getMonth() == Month.JULY) {
                temp = importe * 1.3;
                temporada= "Alta";
            } else if (fIng.getMonth() == Month.FEBRUARY || fIng.getMonth() == Month.JUNE) {
                temp = importe * 1.15;
                temporada= "Media";
            } else {
                temp = importe;
                temporada= "Baja";
            }
            modelo.addRow(new Object[]{ciuOrigen, trans, ciuDestino, aloj, fIng, fSal, Math.round(temp * 100.0) / 100.0, temporada});

        }
        //Permite Ordenar las columnas de la tabla
         TableRowSorter<DefaultTableModel> orden = new TableRowSorter<>(modelo);
         jTable.setRowSorter(orden);
    }

//    private void elejirColumanasFechas(int colum1, int colum2) {
//        JDateChooserCellEditor fechaIngreso = new JDateChooserCellEditor();
//        JDateChooserCellEditor FechaSalida = new JDateChooserCellEditor();
//        this.jTable.getColumnModel().getColumn(colum1).setCellEditor(fechaIngreso);
//        this.jTable.getColumnModel().getColumn(colum2).setCellEditor(FechaSalida);
//        // Configura el renderizador para mostrar las fechas en el formato deseado en la tabla
//        this.jTable.getColumnModel().getColumn(colum1).setCellRenderer(new DateRenderer());
//        this.jTable.getColumnModel().getColumn(colum2).setCellRenderer(new DateRenderer());
//    }

   
    private void limpiar() {
        jtfDni.setText("");
        jtfTelefono.setText("");
        jtfPersona.setText("");
       
    }
}
