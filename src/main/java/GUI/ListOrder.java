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
public class ListOrder extends javax.swing.JFrame {
    
    private final Start start = new Start();

    /**
     * Creates new form ListOrder
     */
    public ListOrder() {
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

        jPanel1 = new javax.swing.JPanel();
        pnBill = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        lbBillCustomerName = new javax.swing.JLabel();
        lbBillEmployeeName = new javax.swing.JLabel();
        lbBillProductName = new javax.swing.JLabel();
        lbBillOrderDate = new javax.swing.JLabel();
        lbBillDeleveryDate = new javax.swing.JLabel();
        lbBillQuantity = new javax.swing.JLabel();
        lbBillTotalPrice = new javax.swing.JLabel();
        lbBillShipPrice = new javax.swing.JLabel();
        lbBillPhoneNum = new javax.swing.JLabel();
        txfBillCustname = new javax.swing.JTextField();
        txfBillShipPrice = new javax.swing.JTextField();
        txfBillPhoneNum = new javax.swing.JTextField();
        txfBillProductName = new javax.swing.JTextField();
        txfBillEmployeeName = new javax.swing.JTextField();
        txfBillOrderDate = new javax.swing.JTextField();
        txfBillQuantity = new javax.swing.JTextField();
        txfBillDeleveryDate = new javax.swing.JTextField();
        txfBillTotalPrice = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        pnOrder = new javax.swing.JPanel();
        txfOrder = new javax.swing.JTextField();
        lbIDProduct = new javax.swing.JLabel();
        txfOrderIdProduct = new javax.swing.JTextField();
        lbOrderIdCustomer = new javax.swing.JLabel();
        txfOrderIdCustomer = new javax.swing.JTextField();
        lbOrderQuantity = new javax.swing.JLabel();
        txfOrderQuantity = new javax.swing.JTextField();
        lbOrderDate = new javax.swing.JLabel();
        txfDeleveryDate = new javax.swing.JTextField();
        lbDeleveryDate = new javax.swing.JLabel();
        txfOrderDate = new javax.swing.JTextField();
        lbOrderIdShipper = new javax.swing.JLabel();
        txfOrderIdShipper = new javax.swing.JTextField();
        lbOrderIdEmployee = new javax.swing.JLabel();
        txfOrderIdEmployee = new javax.swing.JTextField();
        btnAddToBill = new javax.swing.JButton();
        btnAddToListOrder = new javax.swing.JButton();
        pnListbill = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListBill = new javax.swing.JTable();
        txfListBill = new javax.swing.JTextField();
        pnListOrder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListOrder = new javax.swing.JTable();
        jTextField20 = new javax.swing.JTextField();
        btnBackListOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Hóa đơn");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        lbBillCustomerName.setText("Tên khách hàng");

        lbBillEmployeeName.setText("Tên nhân viên");

        lbBillProductName.setText("Tên sản phẩm");

        lbBillOrderDate.setText("Ngày đặt hàng");

        lbBillDeleveryDate.setText("Ngày giao hàng");

        lbBillQuantity.setText("Số lượng");

        lbBillTotalPrice.setText("Tổng tiền");

        lbBillShipPrice.setText("Tiền ship");

        lbBillPhoneNum.setText("SĐT");

        txfBillQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBillQuantityActionPerformed(evt);
            }
        });

        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnPayment.setText("Thanh toán");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBillLayout = new javax.swing.GroupLayout(pnBill);
        pnBill.setLayout(pnBillLayout);
        pnBillLayout.setHorizontalGroup(
            pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBillLayout.createSequentialGroup()
                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBillLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBillCustomerName)
                                    .addComponent(lbBillPhoneNum)))
                            .addComponent(lbBillEmployeeName)
                            .addComponent(lbBillProductName)
                            .addComponent(lbBillOrderDate)
                            .addComponent(lbBillDeleveryDate)
                            .addComponent(lbBillQuantity)
                            .addComponent(lbBillShipPrice)
                            .addComponent(lbBillTotalPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfBillPhoneNum, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillProductName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillOrderDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillDeleveryDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillShipPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfBillCustname))))
                .addContainerGap())
            .addGroup(pnBillLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pnBillLayout.setVerticalGroup(
            pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBillCustomerName)
                    .addComponent(txfBillCustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillPhoneNum))
                .addGap(12, 12, 12)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbBillEmployeeName)
                    .addComponent(txfBillEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillProductName))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillOrderDate))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillDeleveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillDeleveryDate))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillQuantity))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillShipPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillShipPrice))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfBillTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBillTotalPrice))
                .addGap(18, 18, 18)
                .addGroup(pnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txfOrder.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfOrder.setText("Đặt hàng");

        lbIDProduct.setText("ID sản phẩm ");

        lbOrderIdCustomer.setText("ID Khách hàng");

        lbOrderQuantity.setText("Số lượng");

        lbOrderDate.setText("Ngày đặt hàng");

        lbDeleveryDate.setText("Ngày giao hàng");

        lbOrderIdShipper.setText("ID Shipper");

        lbOrderIdEmployee.setText("ID Nhân viên");

        btnAddToBill.setText("Thêm vào hóa đơn");
        btnAddToBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToBillActionPerformed(evt);
            }
        });

        btnAddToListOrder.setText("Thêm vào giỏ hàng");
        btnAddToListOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOrderLayout = new javax.swing.GroupLayout(pnOrder);
        pnOrder.setLayout(pnOrderLayout);
        pnOrderLayout.setHorizontalGroup(
            pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOrderLayout.createSequentialGroup()
                        .addComponent(btnAddToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddToListOrder)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txfOrder)
                    .addGroup(pnOrderLayout.createSequentialGroup()
                        .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIDProduct)
                            .addComponent(lbOrderIdCustomer)
                            .addComponent(lbOrderQuantity)
                            .addComponent(lbOrderDate)
                            .addComponent(lbDeleveryDate)
                            .addComponent(lbOrderIdShipper)
                            .addComponent(lbOrderIdEmployee))
                        .addGap(24, 24, 24)
                        .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfOrderIdProduct)
                            .addComponent(txfOrderIdCustomer)
                            .addComponent(txfOrderQuantity)
                            .addComponent(txfOrderDate)
                            .addComponent(txfDeleveryDate)
                            .addComponent(txfOrderIdShipper)
                            .addComponent(txfOrderIdEmployee))))
                .addContainerGap())
        );
        pnOrderLayout.setVerticalGroup(
            pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIDProduct)
                    .addComponent(txfOrderIdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrderIdCustomer)
                    .addComponent(txfOrderIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOrderQuantity))
                .addGap(22, 22, 22)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrderDate)
                    .addComponent(txfOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDeleveryDate)
                    .addComponent(txfDeleveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrderIdShipper)
                    .addComponent(txfOrderIdShipper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOrderIdEmployee)
                    .addComponent(txfOrderIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddToBill, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToListOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblListBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Tên NV", "Tên KH", "Tên Shipper", "Ngày tạo"
            }
        ));
        jScrollPane1.setViewportView(tblListBill);

        txfListBill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfListBill.setText("Danh sách hóa đơn");

        javax.swing.GroupLayout pnListbillLayout = new javax.swing.GroupLayout(pnListbill);
        pnListbill.setLayout(pnListbillLayout);
        pnListbillLayout.setHorizontalGroup(
            pnListbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListbillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfListBill)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnListbillLayout.setVerticalGroup(
            pnListbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListbillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfListBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblListOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane2.setViewportView(tblListOrder);

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Danh sách giỏ hàng");

        javax.swing.GroupLayout pnListOrderLayout = new javax.swing.GroupLayout(pnListOrder);
        pnListOrder.setLayout(pnListOrderLayout);
        pnListOrderLayout.setHorizontalGroup(
            pnListOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField20)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        pnListOrderLayout.setVerticalGroup(
            pnListOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnListbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnListOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnListbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnListOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );

        btnBackListOrder.setText("Quay lại");
        btnBackListOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackListOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackListOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackListOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // huy thanh toan
        JOptionPane.showConfirmDialog(this, "Hủy thành công");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // xu ly logic va hien popup thong bao thanh toan thanh cong
        //check dieu kien, neu dung thong bao thanh cong
        if (true){
            JOptionPane.showConfirmDialog(this, "Thanh toán thành công");
        }else{
            JOptionPane.showConfirmDialog(this, "Thanh toán thất bại");
        }
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void txfBillQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBillQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBillQuantityActionPerformed

    private void btnBackListOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackListOrderActionPerformed
        // quay lai trang chinh
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackListOrderActionPerformed

    private void btnAddToBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToBillActionPerformed
        // xu ly logic va hien popup thong bao them vao hoa don thanh cong
        //check dieu kien, neu dung thong bao thanh cong
        if (true){
            JOptionPane.showConfirmDialog(this, "Thêm vào hóa đơn thành công");
        }else{
            JOptionPane.showConfirmDialog(this, "Thêm vào hóa đơn thất bại");
        }
        
    }//GEN-LAST:event_btnAddToBillActionPerformed

    private void btnAddToListOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListOrderActionPerformed
        // xu ly logic va hien popup thong bao them gio hang thanh cong
        //check dieu kien, neu dung thong bao thanh cong
        if (true){
            JOptionPane.showConfirmDialog(this, "Thêm vào giỏ hàng thành công");
        }else{
            JOptionPane.showConfirmDialog(this, "Thêm vào giỏ hàng thất bại");
        }
    }//GEN-LAST:event_btnAddToListOrderActionPerformed

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
            java.util.logging.Logger.getLogger(ListOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToBill;
    private javax.swing.JButton btnAddToListOrder;
    private javax.swing.JButton btnBackListOrder;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JLabel lbBillCustomerName;
    private javax.swing.JLabel lbBillDeleveryDate;
    private javax.swing.JLabel lbBillEmployeeName;
    private javax.swing.JLabel lbBillOrderDate;
    private javax.swing.JLabel lbBillPhoneNum;
    private javax.swing.JLabel lbBillProductName;
    private javax.swing.JLabel lbBillQuantity;
    private javax.swing.JLabel lbBillShipPrice;
    private javax.swing.JLabel lbBillTotalPrice;
    private javax.swing.JLabel lbDeleveryDate;
    private javax.swing.JLabel lbIDProduct;
    private javax.swing.JLabel lbOrderDate;
    private javax.swing.JLabel lbOrderIdCustomer;
    private javax.swing.JLabel lbOrderIdEmployee;
    private javax.swing.JLabel lbOrderIdShipper;
    private javax.swing.JLabel lbOrderQuantity;
    private javax.swing.JPanel pnBill;
    private javax.swing.JPanel pnListOrder;
    private javax.swing.JPanel pnListbill;
    private javax.swing.JPanel pnOrder;
    private javax.swing.JTable tblListBill;
    private javax.swing.JTable tblListOrder;
    private javax.swing.JTextField txfBillCustname;
    private javax.swing.JTextField txfBillDeleveryDate;
    private javax.swing.JTextField txfBillEmployeeName;
    private javax.swing.JTextField txfBillOrderDate;
    private javax.swing.JTextField txfBillPhoneNum;
    private javax.swing.JTextField txfBillProductName;
    private javax.swing.JTextField txfBillQuantity;
    private javax.swing.JTextField txfBillShipPrice;
    private javax.swing.JTextField txfBillTotalPrice;
    private javax.swing.JTextField txfDeleveryDate;
    private javax.swing.JTextField txfListBill;
    private javax.swing.JTextField txfOrder;
    private javax.swing.JTextField txfOrderDate;
    private javax.swing.JTextField txfOrderIdCustomer;
    private javax.swing.JTextField txfOrderIdEmployee;
    private javax.swing.JTextField txfOrderIdProduct;
    private javax.swing.JTextField txfOrderIdShipper;
    private javax.swing.JTextField txfOrderQuantity;
    // End of variables declaration//GEN-END:variables
}
