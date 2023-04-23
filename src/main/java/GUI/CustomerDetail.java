/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

/**
 *
 * @author hi
 */
public class CustomerDetail extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetail1
     */
    public CustomerDetail() {
        initComponents();
    }
    
    private CustomerService customerService = new CustomerServiceImpl();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListCustomer = new javax.swing.JTable();
        txfListCustomer = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnBackCustomer = new javax.swing.JButton();

        btnDeleteCustomer.addActionListener(evt -> deleteCustomer(evt));
        btnUpdateCustomer.addActionListener(this::updateCustomer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        List<Customer> customers = new ArrayList<>();
        customers = customerService.getAllCustomers();
        DefaultTableModel model = new DefaultTableModel();
        for (String s : new String[]{
                "STT", "Mã KH", "Tên KH", "SĐT", "Giới tính", "Email", "Địa chỉ", "Ngày sinh"
        }) {
            model.addColumn(s);
        }

        for (Customer customer : customers) {
            model.addRow(new Object[]{customers.indexOf(customer)+1, customer.getCustomerId(),
                    customer.getCustomerName(), customer.getPhoneNumber(), customer.getGender(),
                    customer.getEmail(), customer.getAddress(), customer.getDateOfBirth()});
        }

        tblListCustomer.setModel(model);
        tblListCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblListCustomer);

        txfListCustomer.setEditable(false);
        txfListCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfListCustomer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfListCustomer.setText("Danh sách khách hàng");

        btnAddCustomer.setText("Thêm");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnUpdateCustomer.setText("Sửa");
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setText("Xóa");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                    .addComponent(txfListCustomer)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCustomer)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnUpdateCustomer)
                    .addComponent(btnDeleteCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfListCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBackCustomer.setText("Quay lại");
        btnBackCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCustomerActionPerformed(evt);
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
                        .addComponent(btnBackCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackCustomer)
                .addGap(63, 63, 63)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateCustomer(ActionEvent actionEvent) {
        String cusName = edit.getTxfCustName().getText();
        String gender = edit.getTxfCustGender().getText();
        String dob = edit.getTxfDob().getText().trim();
        if (!dob.contains("/")) {
            //return sai định dạng
            Component[] components = jPanel3.getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    ((JTextField) component).setText("");
                }
            }
            JOptionPane.showConfirmDialog(this, "Nhập sai định dạng ngày sinh", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
        String []dob1 = dob.split("/");
        java.sql.Date date = null;
        try {
            date = new Date(Integer.parseInt(dob1[2]), Integer.parseInt(dob1[1]), Integer.parseInt(dob1[0]));

        } catch (NumberFormatException e) {

        }
        String phoneNumber = edit.getTxfPhoneNum().getText();
        String email = edit.getTxfEmail().getText();
        String address = edit.getTxfAddress().getText();

        if (notEmpty(cusName, gender, phoneNumber, email, address)) {
            Customer customer = new Customer(0, cusName, gender, date, phoneNumber, email, address);
            customerService.addCustomer(customer);
            //add customer success
            JOptionPane.showConfirmDialog(this, "Thêm mới thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
        } else {
            //nhap sai dinh dang
            JOptionPane.showConfirmDialog(this, "Các trường không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }

    }

    private boolean notEmpty(String ...status) {
        for (String s : status) {
            if (s.isEmpty()) return false;
        }
        return true;
    }

    private void deleteCustomer(ActionEvent evt) {
        int index = tblListCustomer.getSelectedRow();
        int customerId = (Integer)  tblListCustomer.getValueAt(index, 1);
        boolean isSuccess = customerService.removeCustomer(customerId);
        if (isSuccess) {
            //xoa thanh cong
            JOptionPane.showConfirmDialog(this, "Xóa thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
        } else {
            //xoa that bai
            JOptionPane.showConfirmDialog(this, "Xóa thất bại", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
        refresh();
    }

    public void refresh() {
        List<Customer> customers = new ArrayList<>();
        customers = customerService.getAllCustomers();
        DefaultTableModel model = new DefaultTableModel();
        for (String s : new String[]{
                "STT", "Mã KH", "Tên KH", "SĐT", "Giới tính", "Email", "Địa chỉ", "Ngày sinh"
        }) {
            model.addColumn(s);
        }

        for (Customer customer : customers) {
            model.addRow(new Object[]{customers.indexOf(customer)+1, customer.getCustomerId(),
                    customer.getCustomerName(), customer.getPhoneNumber(), customer.getGender(),
                    customer.getEmail(), customer.getAddress(), customer.getDateOfBirth()});
        }

        tblListCustomer.setModel(model);
    }

    private void btnBackCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCustomerActionPerformed
        // quay lai trang chu
        Start start = new Start();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackCustomerActionPerformed
    AddCustomer edit1;
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        // TODO add your handling code here:
        edit1 = new AddCustomer(this);
        edit1.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    EditCustomer edit;
    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
        // TODO add your handling code here:
        int index = tblListCustomer.getSelectedRow();
        int customerId = (Integer)  tblListCustomer.getValueAt(index, 1);
        Customer customer = customerService.getCustomerById(customerId);

        edit = new EditCustomer(this);
        edit.setTxfIdCust(customer.getCustomerId()+"");
        edit.getTxfIdCust().setEditable(false);
        edit.setTxfAddress(customer.getAddress());
        edit.setTxfCustGender(customer.getGender());
        edit.setTxfDob(customer.getDateOfBirth().toString());
        edit.setTxfCustName(customer.getCustomerName());
        edit.setTxfEmail(customer.getEmail());
        edit.setTxfPhoneNum(customer.getPhoneNumber());
        edit.setVisible(true);
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBackCustomer;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListCustomer;
    private javax.swing.JTextField txfListCustomer;
    // End of variables declaration//GEN-END:variables
}
