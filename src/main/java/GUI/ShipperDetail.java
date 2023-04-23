/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import model.Shipper;
import service.ShipperService;
import service.impl.ShipperServiceImpl;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hi
 */
public class ShipperDetail extends javax.swing.JFrame {

    /**
     * Creates new form ShipperDetail
     */

    private ShipperService shipperService = new ShipperServiceImpl();

    public ShipperDetail() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnListShipper = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListShipper = new javax.swing.JTable();
        txfListShipper = new javax.swing.JTextField();
        btnBackShipper = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel();

        for (String s : new String [] {
                "STT", "ID Shipper", "Tên shipper", "SĐT", "Email"
        }) {
            model.addColumn(s);
        }

        List<Shipper> shippers = shipperService.getAll();

        for (Shipper shipper : shippers) {
            model.addRow(new Object[] {
                    shippers.indexOf(shipper) + 1,
                    shipper.getShipperId(),
                    shipper.getShipperName(),
                    shipper.getPhoneNumber(),
                    shipper.getEmail()
            });
        }

        tblListShipper.setModel(model);
        tblListShipper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblListShipper);

        txfListShipper.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfListShipper.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfListShipper.setText("Danh sách Shipper");
        txfListShipper.setEditable(false);

        javax.swing.GroupLayout pnListShipperLayout = new javax.swing.GroupLayout(pnListShipper);
        pnListShipper.setLayout(pnListShipperLayout);
        pnListShipperLayout.setHorizontalGroup(
            pnListShipperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListShipperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListShipperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfListShipper)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnListShipperLayout.setVerticalGroup(
            pnListShipperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListShipperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfListShipper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBackShipper.setText("Quay lại");
        btnBackShipper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackShipperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackShipper))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(pnListShipper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackShipper)
                .addGap(28, 28, 28)
                .addComponent(pnListShipper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackShipperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackShipperActionPerformed
        // quay lai trang chu
        Start start = new Start();
        start.setLocationRelativeTo(null);
        start.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBackShipperActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShipperDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShipperDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShipperDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShipperDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ShipperDetail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnBackShipper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnListShipper;
    private javax.swing.JTable tblListShipper;
    private javax.swing.JTextField txfListShipper;
    // End of variables declaration//GEN-END:variables
}
