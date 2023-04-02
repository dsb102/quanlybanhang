/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Hưng Cuốn
 */
public class Start extends javax.swing.JFrame {
    /**
     * Creates new form Start
     */
    public Start() {
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

        btnListCustomer = new javax.swing.JButton();
        btnOrderManagement = new javax.swing.JButton();
        btnListEmployee = new javax.swing.JButton();
        btnListShipper = new javax.swing.JButton();
        btnListProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnListCustomer.setText("Danh sách khách hàng");
        btnListCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCustomerActionPerformed(evt);
            }
        });

        btnOrderManagement.setText("Quản lý đơn hàng");
        btnOrderManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderManagementActionPerformed(evt);
            }
        });

        btnListEmployee.setText("Danh sách nhân viên");
        btnListEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListEmployeeActionPerformed(evt);
            }
        });

        btnListShipper.setText("Danh sách shipper");
        btnListShipper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListShipperActionPerformed(evt);
            }
        });

        btnListProduct.setText("Danh sách sản phẩm");
        btnListProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrderManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(btnListShipper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnListCustomer)
                .addGap(30, 30, 30)
                .addComponent(btnListEmployee)
                .addGap(37, 37, 37)
                .addComponent(btnListShipper)
                .addGap(28, 28, 28)
                .addComponent(btnListProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnOrderManagement)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCustomerActionPerformed
        //chuyen sang man hinh danh sach khach hang
        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListCustomerActionPerformed

    private void btnOrderManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderManagementActionPerformed
        // chuyen sang man hinh hien thi danh sach don hang
        ListOrder listOrder = new ListOrder();
        listOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderManagementActionPerformed

    private void btnListEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListEmployeeActionPerformed
        // chuyen sang man hinh danh sach nhan vien
        EmployeeDetail employeeDetail = new EmployeeDetail();
        employeeDetail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListEmployeeActionPerformed

    private void btnListShipperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListShipperActionPerformed
        // chuyen sang danh sach shipper
        ShipperDetail shipperDetail = new ShipperDetail();
        shipperDetail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListShipperActionPerformed

    private void btnListProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListProductActionPerformed
        // chuyen sang man hinh danh sach san pham
        ProductDetail productDetail = new ProductDetail();
        productDetail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListProductActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListCustomer;
    private javax.swing.JButton btnListEmployee;
    private javax.swing.JButton btnListProduct;
    private javax.swing.JButton btnListShipper;
    private javax.swing.JButton btnOrderManagement;
    // End of variables declaration//GEN-END:variables
}
