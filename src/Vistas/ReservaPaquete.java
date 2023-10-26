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
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
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

    private double temp = 0;
    private String temporada = "";
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ReservaPaquete() {
        initComponents();
        armarCabecera();
        cargarTabla();
        jComboBox1.setSelectedIndex(-1);
        habilitar();
        habilitarCliente(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/vacaciones.jpg"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel12 = new javax.swing.JLabel();
        jlPersonas = new javax.swing.JTextField();
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
        jlidPaq = new javax.swing.JLabel();
        jtxCosto = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jfechaDesde = new com.toedter.calendar.JDateChooser();
        jfechaHasta = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbnew = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Reserva de Paquete");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad de Personas:");
        jLabel12.setOpaque(true);

        jlPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jlPersonasKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Importe Total del Paquete:");
        jLabel13.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jLabel4.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Apellido:");
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        jLabel6.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("DNI:");
        jLabel7.setOpaque(true);

        jtfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoKeyTyped(evt);
            }
        });

        jtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniKeyTyped(evt);
            }
        });

        jtfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoKeyTyped(evt);
            }
        });

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Abonar: ");
        jLabel11.setOpaque(true);

        radioSino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioSino.setText("Si / No");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Busqueda por: ");
        jLabel2.setOpaque(true);

        jtfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBuscarKeyReleased(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_icon.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Reserva de Paquete:");
        jLabel3.setOpaque(true);

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("$");
        jLabel9.setOpaque(true);

        jlidPaq.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlidPaq.setText("Id Paquete");
        jlidPaq.setOpaque(true);

        jtxCosto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtxCosto.setText("importe");
        jtxCosto.setOpaque(true);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "País Turistico", "Fechas de Reserva" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Hasta");
        jLabel8.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Desde");
        jLabel1.setOpaque(true);

        jbnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        jbnew.setText("Nuevo");
        jbnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlidPaq))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                            .addComponent(jtfDni))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbnew, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioSino)
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxCosto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbSalir)
                                        .addGap(19, 19, 19))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jfechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jfechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbBuscar)))))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jfechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jfechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jlPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jlidPaq))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbnew)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(radioSino)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jtxCosto)
                    .addComponent(jbSalir))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        //Agregar
        int idP = Integer.parseInt(this.jlidPaq.getText());
        int cantP = Integer.parseInt(jlPersonas.getText());
        double importe = Double.parseDouble(jtxCosto.getText());
        boolean okVacio = control();
        String apell = jtfApellido.getText();
        String nomb = jtfNombre.getText();
        boolean abonar = radioSino.isSelected();
        if (okVacio) {
            int tel = 0;
            int dniC = 0; // Valor por defecto en caso de error en la conversión
            try {
                tel = Integer.parseInt(jtfTelefono.getText());
                dniC = Integer.parseInt(jtfDni.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El campo 'Teléfono' o 'DNI' debe ser un número válido.");
                return;  // Salir del método si hay un error
            }
            Cliente cliente = new Cliente(nomb, apell, tel, dniC, PaqueteDatos.buscarPaquetePorId(idP), cantP, importe, abonar);
            ClientesDatos.guardarCliente(cliente);
        }
        limpiarTodo();
        habilitarCliente(false);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private boolean control() {
        if (jtfApellido.getText().isEmpty() || jtfNombre.getText().isEmpty() || this.jtfTelefono.getText().isEmpty() || this.jtfDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No deben quedar campos vacíos");
            return false;
        }
        return true;
    }

    private void jtfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyReleased
        habilitarCampo();
        String pais = this.jtfBuscar.getText();
        modelo.setRowCount(0);
        for (Paquete paq : PaqueteDatos.busquedaPaquetexPais(pais)) {
            if (paq.getCiuDestino().getPais().toLowerCase().startsWith(pais.toLowerCase())) {
                int idP = paq.getIdPaquete();
                String ciuOrigen = paq.getCiuOrigen().getNombre();
                Transporte trans = paq.getPasaje().getTipoTransporte();
                String ciuDestino = paq.getCiuDestino().getNombre();
                TipoAlojamiento aloja = paq.getAlojamiento().getAlojamiento();
                importe(paq);
                modelo.addRow(new Object[]{idP, ciuOrigen, trans, ciuDestino, aloja, paq.getAlojamiento().getFechaIngreso(), paq.getAlojamiento().getFechaSalida(), Math.round(temp * 100.0) / 100.0, temporada});
            }
        }
    }//GEN-LAST:event_jtfBuscarKeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        habilitarCampo();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnewActionPerformed
        // Nuevo
        try {
            habilitarCliente(true);
            int filaSelec = this.jTable.getSelectedRow();
            if (filaSelec != -1 && !this.jlPersonas.getText().isEmpty()) {
                Double imp = Double.valueOf(jTable.getValueAt(filaSelec, 7).toString());
                double impTotal = imp * Double.parseDouble(this.jlPersonas.getText().toString());
                jtxCosto.setText(Math.round(impTotal*100.0)/100.0 + "");
                int idP = Integer.parseInt(jTable.getValueAt(filaSelec, 0).toString());
                this.jlidPaq.setText(idP + "");
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila o Ingresar un número en cantidad de Personas");
                habilitarCliente(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "En la casilla de Cantidad de Personas solo ingrese Números POSITIVOS", "Loco Fíjate", JOptionPane.ERROR_MESSAGE);
            habilitarCliente(false);
            this.jlPersonas.setText("");
        }
    }//GEN-LAST:event_jbnewActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        // para que los text field no tome numeros
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoKeyTyped
        // para que los text field no tome numeros
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfApellidoKeyTyped

    private void jtfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoKeyTyped
        char c = evt.getKeyChar();
        // Verifica si el carácter es un dígito (0-9)
        if (!Character.isDigit(c)) {
            evt.consume();  // Si no es un dígito, consumir el evento
        }
    }//GEN-LAST:event_jtfTelefonoKeyTyped

    private void jtfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniKeyTyped
        char c = evt.getKeyChar();
        // Verifica si el carácter es un dígito (0-9)
        if (!Character.isDigit(c)) {
            evt.consume();  // Si no es un dígito, consumir el evento
        }
    }//GEN-LAST:event_jtfDniKeyTyped

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // Buscar por fechas
        Date fechaDesde = this.jfechaDesde.getDate();
        Date fechaHasta = this.jfechaHasta.getDate();
        java.sql.Date sqlDateIng = new java.sql.Date(fechaDesde.getTime());
        java.sql.Date sqlDateSal = new java.sql.Date(fechaHasta.getTime());
        modelo.setRowCount(0);
        try {
            if (fechaDesde != null && fechaHasta != null) { // hay que revisar los campos vacios <Condicion>
                if (!fechaDesde.after(fechaHasta)) {
                    for (Paquete paq : PaqueteDatos.busquedaPaquetexFecha(sqlDateIng, sqlDateSal)) {
                        int idP = paq.getIdPaquete();
                        String ciuDestino = paq.getCiuDestino().getNombre();
                        Transporte trans = paq.getPasaje().getTipoTransporte();
                        importe(paq);
                        String ciuOrigen = paq.getCiuOrigen().getNombre();
                        TipoAlojamiento aloj = paq.getAlojamiento().getAlojamiento();
                        modelo.addRow(new Object[]{idP, ciuOrigen, trans, ciuDestino, aloj, paq.getAlojamiento().getFechaIngreso(), paq.getAlojamiento().getFechaSalida(), Math.round(temp * 100.0) / 100.0, temporada});
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La Fecha de ingreso DEBE SER anterior a la fecha de salida", "Error", JOptionPane.ERROR_MESSAGE);
                    limpiarFecha();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Deben quedar campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
                limpiarFecha();
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No Deben quedar campos Vacíos " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            limpiarFecha();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jlPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlPersonasKeyTyped
         char c = evt.getKeyChar();
        // Verifica si el carácter es un dígito (0-9)
        if (!Character.isDigit(c)) {
            evt.consume();  // Si no es un dígito, consumir el evento
        }
    }//GEN-LAST:event_jlPersonasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbnew;
    private com.toedter.calendar.JDateChooser jfechaDesde;
    private com.toedter.calendar.JDateChooser jfechaHasta;
    private javax.swing.JTextField jlPersonas;
    private javax.swing.JLabel jlidPaq;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfBuscar;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JLabel jtxCosto;
    private javax.swing.JRadioButton radioSino;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID Paquete");
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
        for (Paquete paq : PaqueteDatos.listarPaquete()) {
            int idP = paq.getIdPaquete();
            String ciuDestino = paq.getCiuDestino().getNombre();
            Transporte trans = paq.getPasaje().getTipoTransporte();
            importe(paq);
            String ciuOrigen = paq.getCiuOrigen().getNombre();
            TipoAlojamiento aloj = paq.getAlojamiento().getAlojamiento();
            modelo.addRow(new Object[]{idP, ciuOrigen, trans, ciuDestino, aloj, paq.getAlojamiento().getFechaIngreso(), paq.getAlojamiento().getFechaSalida(), Math.round(temp * 100.0) / 100.0, temporada});

        }
        //Permite Ordenar las columnas de la tabla
        TableRowSorter<DefaultTableModel> orden = new TableRowSorter<>(modelo);
        jTable.setRowSorter(orden);
    }

    private void limpiarFecha() {
        this.jfechaDesde.setDate(null);
        this.jfechaHasta.setDate(null);
    }

    private void limpiarTodo() {
        jtfDni.setText("");
        jtfTelefono.setText("");
        this.jtfApellido.setText("");
        this.jtfNombre.setText("");
        this.jlPersonas.setText("");
        this.jlidPaq.setText("");
        this.jtxCosto.setText("");
        this.radioSino.setSelected(false);
    }

    private void importe(Paquete paq) {
        LocalDate fIng = paq.getAlojamiento().getFechaIngreso();
        LocalDate fSal = paq.getAlojamiento().getFechaSalida();
        int dias = (int) ChronoUnit.DAYS.between(fIng, fSal);
        double impTrans = paq.getPasaje().getImporte();
        double impAloja = paq.getAlojamiento().getImporteDiario();
        double importe = impTrans + impAloja * dias;
        if (fIng.getMonth() == Month.JANUARY || fIng.getMonth() == Month.JULY) {
            temp = importe * 1.3;
            temporada = "Alta";
        } else if (fIng.getMonth() == Month.FEBRUARY || fIng.getMonth() == Month.JUNE) {
            temp = importe * 1.15;
            temporada = "Media";
        } else {
            temp = importe;
            temporada = "Baja";
        }
    }

    private void habilitarCampo() {
        int op = jComboBox1.getSelectedIndex();

        switch (op) {
            case 0:
                jtfBuscar.setEnabled(true);
                jfechaDesde.setEnabled(false);
                jfechaHasta.setEnabled(false);
                jbBuscar.setEnabled(false);
                break;
            case 1:
                jfechaDesde.setEnabled(true);
                jfechaHasta.setEnabled(true);
                jtfBuscar.setEnabled(false);
                jbBuscar.setEnabled(true);
                break;

        }

    }

    private void habilitar() {
        jtfBuscar.setEnabled(false);
        jfechaDesde.setEnabled(false);
        jfechaHasta.setEnabled(false);
        jbBuscar.setEnabled(false);
    }

    private void habilitarCliente(boolean ok) {
        this.jtfNombre.setEnabled(ok);
        this.jtfApellido.setEnabled(ok);
        this.jtfTelefono.setEnabled(ok);
        this.jtfDni.setEnabled(ok);
        this.radioSino.setEnabled(ok);
        this.jbAgregar.setEnabled(ok);
    }

}
