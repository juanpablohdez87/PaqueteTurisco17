package Vistas;

import Datos.ClientesDatos;
import Datos.PaqueteDatos;
import Entidades.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucia
 */
public class RegistrosClientes extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 8) {
                return true;
            } else {
                return false;
            }
        }
    };

    /**
     * Creates new form RegistrosClientes
     */
    public RegistrosClientes() {
        initComponents();
        armarCabezera();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jActualizar = new javax.swing.JButton();
        jrBoton = new javax.swing.JRadioButton();

        setTitle("Resgistros de Clientes");

        jLabel1.setText("Reservas Abonadas");

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

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jActualizar.setText("Actualizar");
        jActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarActionPerformed(evt);
            }
        });

        jrBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEliminar)
                            .addComponent(jActualizar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jrBoton)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrBoton)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jbEliminar)
                        .addGap(124, 124, 124)
                        .addComponent(jActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBotonActionPerformed
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_jrBotonActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Eliminar
        int filaSelecionada = this.jTable.getSelectedRow();
        if (filaSelecionada != -1) { // Verifica si se ha seleccionado una fila válida
            int idC = Integer.parseInt(this.jTable.getValueAt(filaSelecionada, 0).toString());
            ClientesDatos.eliminarCliente(idC);
            modelo.removeRow(filaSelecionada);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila antes de Eliminar Ciudad", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarActionPerformed
        // Actualizar
        int filaSelecionada = this.jTable.getSelectedRow();
        if (filaSelecionada != -1) { // Verifica si se ha seleccionado una fila válida
            int idC = Integer.parseInt(modelo.getValueAt(filaSelecionada, 0).toString());
            String nom = modelo.getValueAt(filaSelecionada, 1).toString();
            String apell = modelo.getValueAt(filaSelecionada, 2).toString();
            int tel = Integer.parseInt(modelo.getValueAt(filaSelecionada, 3).toString());
            int d = Integer.parseInt(modelo.getValueAt(filaSelecionada, 4).toString());
            int idP = Integer.parseInt(modelo.getValueAt(filaSelecionada, 5).toString());
            int cantP = Integer.parseInt(modelo.getValueAt(filaSelecionada, 6).toString());
            double impT = Double.parseDouble(modelo.getValueAt(filaSelecionada, 7).toString());
            boolean abon = Boolean.parseBoolean(modelo.getValueAt(filaSelecionada, 8).toString());
            ClientesDatos.modificarclientes(new Cliente(idC, nom, apell, tel, d, PaqueteDatos.buscarPaquetePorId(idP), cantP, impT, abon));
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila antes de intentar actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        modelo.fireTableDataChanged();
    }//GEN-LAST:event_jActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JRadioButton jrBoton;
    // End of variables declaration//GEN-END:variables

    private void armarCabezera() {
        modelo.addColumn("IdCliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("DNI");
        modelo.addColumn("ID Paquete");
        modelo.addColumn("Cantidad De Personas");
        modelo.addColumn("Importe total");
        modelo.addColumn("Abonado");
        this.jTable.setModel(modelo);
    }

    private void cargarTabla() {
        boolean abonado = this.jrBoton.isSelected();
        modelo.setRowCount(0);
        if (abonado) {
            for (Cliente client : ClientesDatos.listaclientes()) {
                int idC = client.getIdCliente();
                String nom = client.getNombre();
                String apell = client.getApellido();
                int tel = client.getTelefono();
                int dni = client.getDni();
                int idP = client.getPaquete().getIdPaquete();
                int cantP = client.getCantPersonas();
                double impT = client.getImporteTotal();
                boolean abon = client.isAbonado();
                modelo.addRow(new Object[]{idC, nom, apell, tel, dni, idP, cantP, impT, abon});
            }
        } else {
            for (Cliente client : ClientesDatos.listaclientesNoAbonados()) {
                int idC = client.getIdCliente();
                String nom = client.getNombre();
                String apell = client.getApellido();
                int tel = client.getTelefono();
                int dni = client.getDni();
                int idP = client.getPaquete().getIdPaquete();
                int cantP = client.getCantPersonas();
                double impT = client.getImporteTotal();
                boolean abon = client.isAbonado();
                modelo.addRow(new Object[]{idC, nom, apell, tel, dni, idP, cantP, impT, abon});
            }
        }
    }

};