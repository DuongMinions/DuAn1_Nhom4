/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DuAnNhom4_view;

import DuAnNhom4_model.LoaiSanPham;
import DuAnNhom4_repository.LoaiSanPham_repository;
import DuAnNhom4_repository.vSanPham_repository;
import DuAnNhom4_service.Imp.LoaiSanPham_sevrice;
import DuAnNhom4_service.Imp.SanPham_service;
import DuAnNhom4_service.Imp.vSanPham_service;
import DuAnNhom4_viewmodel.vSanPham;
import java.awt.Image;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class QuanLySanPham extends javax.swing.JPanel {
    
    private DefaultComboBoxModel molBox;
    LoaiSanPham_sevrice LSP = new LoaiSanPham_sevrice();
    SanPham_service SP = new SanPham_service();
    vSanPham_service SP2 = new vSanPham_service();
    vSanPham_repository SP1 = new vSanPham_repository();
    List<vSanPham> listSP0;
    List<LoaiSanPham> listLoaiSP;
    DefaultTableModel mol;
    String strHinhAnh = null;
    int index;
    List<vSanPham> listVsp;
    
    public QuanLySanPham() {
        initComponents();
        fillToTable((ArrayList<vSanPham>) SP2.getAllVSP());
        addLSP((ArrayList<LoaiSanPham>) LSP.getAllLoaiSP());
    }
    
    public void addLSP(ArrayList<LoaiSanPham> listSP) {
        cboTen.removeAllItems();
        listSP = (ArrayList<LoaiSanPham>) LoaiSanPham_sevrice.getAllLoaiSP();
        for (int i = 0; i < listSP.size(); i++) {
            cboTen.addItem(listSP.get(i).getTenLoai().toString());
        }
        
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
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnformChiTiet = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        cboTen = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtChatLieu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        cboMauSac = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboSize = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Giá bán :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Tên loại SP :");

        btnSua.setBackground(new java.awt.Color(102, 102, 102));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnformChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnformChiTiet.setText("Chi tiết loại SP");
        btnformChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnformChiTietActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Giá nhập :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Số lượng : ");

        btnHuy.setBackground(new java.awt.Color(102, 102, 102));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiply.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        cboTen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTenItemStateChanged(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(102, 102, 102));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sp.png"))); // NOI18N
        btnThem.setText("Thêm SP");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Size :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Màu sắc : ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Chất liệu :");

        lblHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnh.setToolTipText("");
        lblHinhAnh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã SP : ");

        cboMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trắng", "Xám", "Ðen", "Ðỏ ", "Thắm", "Thẫm", "Cam", "Da cam", "Nâu", "Vàng", "Kem", "Vàng", "Be", "Xanh", "Xanh lá cây", "Xanh lục", "Lục", "Xanh lục đậm", "Xanh lơ  ", "Xanh mòng két\txanh", "Xanh da trời", "Thiên thanh", "Xanh dương", "Xanh nước biển", "Xanh lam", "Lam", "Tím" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên SP :");

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL", "2XL", "3XL" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("ID loại SP :");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnformChiTiet)
                                .addGap(37, 37, 37)
                                .addComponent(btnThem)
                                .addGap(39, 39, 39)
                                .addComponent(btnSua)
                                .addGap(34, 34, 34)
                                .addComponent(btnHuy)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSoLuong)
                                            .addComponent(txtTenSP)
                                            .addComponent(cboSize, 0, 190, Short.MAX_VALUE))))
                                .addGap(151, 151, 151)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(8, 8, 8))
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtGiaNhap))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboTen, 0, 190, Short.MAX_VALUE)
                                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel14))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cboTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnformChiTiet)
                    .addComponent(btnSua)
                    .addComponent(btnHuy))
                .addGap(15, 15, 15))
        );

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Size", "Màu sắc", "Chất liệu", "Giá nhập", "Giá bán", "Loại sản phẩm", "Hình ảnh", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTable.setEditingColumn(2);
        tblTable.setEditingRow(2);
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboTenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTenItemStateChanged
        if (cboTen.getItemCount() > 0) {
            String ID = cboTen.getSelectedItem().toString();
            LoaiSanPham lsp = LoaiSanPham_repository.getLoaiSPbymaloai(ID);
            txtID.setText(lsp.getIDLoaiSanPham());
            fillToTable((ArrayList<vSanPham>) SP2.getAllVSP());
        }
    }//GEN-LAST:event_cboTenItemStateChanged

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        ArrayList<vSanPham> listTim = (ArrayList<vSanPham>) SP1.timKiem(txtTimKiem.getText());
        fillToTable(listTim);       
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        vSanPham vsp = getModel();
        try {

//            if (listVsp.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "List ko còn dữ liệu để sửa");
//                return;
//            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            vSanPham_service.suaSP(vsp);
            fillToTable((ArrayList<vSanPham>) SP2.getAllVSP());
            JOptionPane.showMessageDialog(this, "update thanh cong");
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi update");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        clearForm();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        vSanPham vsp1 = getModel();
        try {
            if (check()) {
                vSanPham_service.themSP(vsp1);
                fillToTable((ArrayList<vSanPham>) SP2.getAllVSP());
                JOptionPane.showMessageDialog(this, "Thêm thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi sửa");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        try {
            JFileChooser jfc = new JFileChooser("C:\\Users\\Dell\\Desktop\\DuAN1\\DUAN1\\src\\img");
            jfc.showOpenDialog(null);
            File fire = jfc.getSelectedFile();
            Image img = ImageIO.read(fire);
            strHinhAnh = fire.getName();
            lblHinhAnh.setText("");
            int width = lblHinhAnh.getWidth();
            int height = lblHinhAnh.getHeight();
            lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
       try {
            index = tblTable.getSelectedRow();
            showDetail((ArrayList<vSanPham>) SP2.getAllVSP());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Click!");
        }
    }//GEN-LAST:event_tblTableMouseClicked

    private void btnformChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnformChiTietActionPerformed
        new LoaiSP().setVisible(true);
    }//GEN-LAST:event_btnformChiTietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnformChiTiet;
    private javax.swing.JComboBox<String> cboMauSac;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JComboBox<String> cboTen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtChatLieu;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void fillToTable(ArrayList<vSanPham> listVsp) {
        try {
//            listVsp = (ArrayList<vSanPham>) vSanPham_service.getAllVSP();
            mol = (DefaultTableModel) tblTable.getModel();
            mol.setRowCount(0);
            for (int i = 0; i < listVsp.size(); i++) {
                Object[] data = new Object[]{i + 1, listVsp.get(i).getMaSanPham(), listVsp.get(i).getTenSanPham(), listVsp.get(i).getSoLuong(),
                    listVsp.get(i).getSize(), listVsp.get(i).getMauSac(), listVsp.get(i).getChatLieu(), listVsp.get(i).getGiaNhap(),
                    listVsp.get(i).getGiaBan(), listVsp.get(i).getTenLoai(), listVsp.get(i).getHinhAnh(), listVsp.get(i).TrangThai()};
                mol.addRow(data);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            //  Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private void showDetail(ArrayList<vSanPham> listVsp) {
        vSanPham vsp = listVsp.get(index);
        txtMaSP.setText(vsp.getMaSanPham());
        txtTenSP.setText(vsp.getTenSanPham());
        txtSoLuong.setText(String.valueOf(vsp.getSoLuong()));
        txtChatLieu.setText(vsp.getChatLieu());
        txtGiaNhap.setText(String.valueOf(vsp.getGiaNhap()));
        txtGiaBan.setText(String.valueOf(vsp.getGiaBan()));
        cboSize.setSelectedItem(vsp.getSize());
        cboMauSac.setSelectedItem(vsp.getMauSac());
        cboTen.setSelectedItem(vsp.getTenLoai());
        if (vsp.getHinhAnh().equalsIgnoreCase("No Avatar")) {
            lblHinhAnh.setText("No Avatar");
            lblHinhAnh.setIcon(null);
        } else {
            lblHinhAnh.setText("");
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/" + vsp.getHinhAnh()));
            Image img = imgIcon.getImage();
            int width = lblHinhAnh.getWidth();
            int height = lblHinhAnh.getHeight();
            img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            lblHinhAnh.setIcon(imgIcon);
        }
    }
    public vSanPham getModel() {
        vSanPham vsp = new vSanPham();
        vsp.setMaSanPham(txtMaSP.getText());
        vsp.setTenSanPham(txtTenSP.getText());
        vsp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        vsp.setChatLieu(txtChatLieu.getText());
        vsp.setGiaNhap(BigDecimal.valueOf(Double.valueOf(txtGiaNhap.getText())));
        vsp.setGiaBan(BigDecimal.valueOf(Double.valueOf(txtGiaBan.getText())));
        vsp.setSize(cboSize.getSelectedItem().toString());
        vsp.setMauSac(cboMauSac.getSelectedItem().toString());
        vsp.setTenLoai(cboTen.getSelectedItem().toString());
        vsp.setIdloaisp(txtID.getText());
        if (strHinhAnh == null) {
            vsp.setHinhAnh("No Avatar");
        } else {
            vsp.setHinhAnh(strHinhAnh);
        }
        return vsp;
    }
    
    private void clearForm() {
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtSoLuong.setText("");
        txtChatLieu.setText("");
        txtGiaNhap.setText("");
        txtGiaBan.setText("");
        lblHinhAnh.setIcon(null);
        
    }
    
    public boolean check() {
        if (txtMaSP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã SP");
            return false;
        }
//        for (vSanPham vsp : listVsp) {
//            if (vsp.getMaSanPham().equalsIgnoreCase(txtMaSP.getText())) {
//                JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại");
//                return false;
//            }
//        }
        if (txtTenSP.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên SP");
            return false;
        }
        if (txtSoLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng");
            return false;
        }
        int soluong;
        try {
            soluong = Integer.parseInt(txtSoLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng phải nhập bằng số");
        }
        if (txtChatLieu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Chất liệu");
            return false;
        }
        
        if (txtGiaNhap.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá nhập");
            return false;
        }
        if (txtGiaBan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá bán");
            return false;
        }
        return true;
    }
    
        
}
