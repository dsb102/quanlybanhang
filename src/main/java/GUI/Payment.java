/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author hi
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBill = new javax.swing.JPanel();
        txfPayment = new javax.swing.JTextField();
        lbBillCustomerName = new javax.swing.JLabel();
        lbBillEmployeeName = new javax.swing.JLabel();
        lbBillProductName = new javax.swing.JLabel();
        lbBillOrderDate = new javax.swing.JLabel();
        lbBillTotalPrice = new javax.swing.JLabel();
        lbBillPhoneNum = new javax.swing.JLabel();
        txfBillCustname = new javax.swing.JTextField();
        txfBillPhoneNum = new javax.swing.JTextField();
        txfBillEmployeeName = new javax.swing.JTextField();
        txfBillOrderDate = new javax.swing.JTextField();
        txfBillTotalPrice = new javax.swing.JTextField();
        btnPayment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txfPayment.setEditable(false);
        txfPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPayment.setText("Thanh toán");
        txfPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPaymentActionPerformed(evt);
            }
        });

        lbBillCustomerName.setText("Tên khách hàng");

        lbBillEmployeeName.setText("ID nhân viên");

        lbBillProductName.setText("Danh sách sản phẩm");

        lbBillOrderDate.setText("Ngày đặt hàng");

        lbBillTotalPrice.setText("Tổng tiền");

        lbBillPhoneNum.setText("SĐT");

        btnPayment.setText("Thanh toán");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        tblListProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Đơn giá", "Số lượng", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblListProduct);

        javax.swing.GroupLayout pnBillLayout = new javax.swing.GroupLayout(pnBill);
        pnBill.setLayout(pnBillLayout);
        pnBillLayout.setHorizontalGroup(
            pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBillLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(txfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(pnBillLayout.createSequentialGroup()
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBillLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pnBillLayout.createSequentialGroup()
                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBillLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBillLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbBillCustomerName)
                                            .addComponent(lbBillPhoneNum)
                                            .addComponent(lbBillEmployeeName))
                                        .addGap(50, 50, 50)
                                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txfBillPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfBillEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfBillCustname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbBillProductName)
                                    .addGroup(pnBillLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbBillOrderDate)
                                            .addComponent(lbBillTotalPrice))
                                        .addGap(37, 37, 37)
                                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txfBillOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                            .addComponent(txfBillTotalPrice)))))
                            .addGroup(pnBillLayout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnBillLayout.setVerticalGroup(
            pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBillCustomerName)
                    .addComponent(txfBillCustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBillPhoneNum)
                    .addComponent(txfBillPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBillEmployeeName)
                    .addComponent(txfBillEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lbBillProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfBillOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillOrderDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBillTotalPrice)
                    .addComponent(txfBillTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(pnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // thuc hien xac nhan thanh toan va quay ve giao dien ListOrder
        JOptionPane.showConfirmDialog(this, "Xác nhận thanh toán", "Thanh toán", JOptionPane.DEFAULT_OPTION);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void txfPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPaymentActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBillCustomerName;
    private javax.swing.JLabel lbBillEmployeeName;
    private javax.swing.JLabel lbBillOrderDate;
    private javax.swing.JLabel lbBillPhoneNum;
    private javax.swing.JLabel lbBillProductName;
    private javax.swing.JLabel lbBillTotalPrice;
    private javax.swing.JPanel pnBill;
    private javax.swing.JTable tblListProduct;
    private javax.swing.JTextField txfBillCustname;
    private javax.swing.JTextField txfBillEmployeeName;
    private javax.swing.JTextField txfBillOrderDate;
    private javax.swing.JTextField txfBillPhoneNum;
    private javax.swing.JTextField txfBillTotalPrice;
    private javax.swing.JTextField txfPayment;
    // End of variables declaration//GEN-END:variables
}
