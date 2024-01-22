package edu.asu.oop2.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrmBookstoreSystem extends javax.swing.JFrame{

    BookManager bookManager = BookManager.getInstance();

    public FrmBookstoreSystem() {
        initComponents();
        setLocationRelativeTo(null);
        fillTable();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlManage = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        btnDeleteRow = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        pnlAdd = new javax.swing.JPanel();
        cmbType = new javax.swing.JComboBox<>();
        txtPublisher = new javax.swing.JTextField();
        txtYearOfPublication = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblPublicationYear = new javax.swing.JLabel();
        lblPublisher = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlManage.setBackground(new java.awt.Color(204, 204, 255));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Author", "Publication Year", "Publisher", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSearch.setColumnSelectionAllowed(true);
        tblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSearch);
        tblSearch.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblSearch.getColumnModel().getColumnCount() > 0) {
            tblSearch.getColumnModel().getColumn(0).setResizable(false);
            tblSearch.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblSearch.getColumnModel().getColumn(1).setResizable(false);
            tblSearch.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblSearch.getColumnModel().getColumn(2).setResizable(false);
            tblSearch.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblSearch.getColumnModel().getColumn(3).setResizable(false);
            tblSearch.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblSearch.getColumnModel().getColumn(4).setResizable(false);
            tblSearch.getColumnModel().getColumn(4).setPreferredWidth(25);
            tblSearch.getColumnModel().getColumn(5).setResizable(false);
            tblSearch.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        btnDeleteRow.setText("Delete Row");
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        pnlAdd.setBackground(new java.awt.Color(204, 204, 255));

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physical", "Digital" }));

        lblTitle.setText("Title");

        lblId.setText("ID");

        lblAuthor.setText("Author");

        lblPublicationYear.setText("Publication Year");

        lblPublisher.setText("Publisher");

        lblType.setText("Type");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblId)
                            .addComponent(lblAuthor))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                        .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPublisher)
                            .addComponent(lblPublicationYear)
                            .addComponent(lblType))
                        .addGap(18, 18, 18)))
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(txtId))
                    .addComponent(txtYearOfPublication, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addGap(36, 36, 36)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYearOfPublication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPublicationYear))
                .addGap(39, 39, 39)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPublisher))
                .addGap(35, 35, 35)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout pnlManageLayout = new javax.swing.GroupLayout(pnlManage);
        pnlManage.setLayout(pnlManageLayout);
        pnlManageLayout.setHorizontalGroup(
            pnlManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageLayout.createSequentialGroup()
                .addGroup(pnlManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteRow)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlManageLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlManageLayout.setVerticalGroup(
            pnlManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManageLayout.createSequentialGroup()
                        .addComponent(btnDeleteRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlManage, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillTable() {
        try {
            ArrayList<Book> books = bookManager.viewBookCatalog();
            for (Book book : books) {
                DefaultTableModel modelCatalog = (DefaultTableModel) tblSearch.getModel();
                modelCatalog.addRow(new Object[]{book.getId(), book.getTitle(), book.getAuthor(),
                    book.getYearOfPublication(), book.getPublisher(), book.getType()});
            }
        } catch (IOException ex) {
            Logger.getLogger(FrmBookstoreSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel modelCatalog = (DefaultTableModel) tblSearch.getModel();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(modelCatalog);
        tblSearch.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearch.getText()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        DefaultTableModel modelCatalog = (DefaultTableModel) tblSearch.getModel();
        String rowData = "";
        try {
            int selectedRowIndex = tblSearch.getSelectedRow();
            if (selectedRowIndex != -1) {
                rowData = getRowData(rowData, selectedRowIndex);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            }
            modelCatalog.removeRow(selectedRowIndex);
            bookManager.deleteBook(rowData);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private String getRowData(String rowData, int selectedRowIndex) {
        for (int i = 0; i < tblSearch.getColumnCount(); i++) {
            rowData += tblSearch.getValueAt(selectedRowIndex, i);
            if (i != tblSearch.getColumnCount() - 1) {
                rowData += "|";
            }
        }
        return rowData;
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRowIndex = tblSearch.getSelectedRow();
        String oldRowData = "";
        oldRowData = getRowData(oldRowData, selectedRowIndex);
        if (selectedRowIndex!=-1) {
            tblSearch.setValueAt(txtId.getText(), selectedRowIndex, 0);
            tblSearch.setValueAt(txtTitle.getText(), selectedRowIndex, 1);
            tblSearch.setValueAt(txtAuthor.getText(), selectedRowIndex, 2);
            tblSearch.setValueAt(txtYearOfPublication.getText(), selectedRowIndex, 3);
            tblSearch.setValueAt(txtPublisher.getText(), selectedRowIndex, 4);
            tblSearch.setValueAt(cmbType.getSelectedItem(), selectedRowIndex, 5);
        }
        try {
            if (selectedRowIndex != -1) {
                String rowData = "";
                rowData = getRowData(rowData, selectedRowIndex);
                bookManager.updateBook(oldRowData, rowData);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to delete.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            bookManager.addBook(txtTitle.getText(), txtId.getText(), txtAuthor.getText(),
                    txtYearOfPublication.getText(), txtPublisher.getText(), (String) cmbType.getSelectedItem());
            DefaultTableModel modelCatalog = (DefaultTableModel) tblSearch.getModel();
            modelCatalog.addRow(new Object[]{ txtId.getText(),txtTitle.getText(), txtAuthor.getText(),
                txtYearOfPublication.getText(), txtPublisher.getText(), (String) cmbType.getSelectedItem()});
        } catch (IOException ex) {
            Logger.getLogger(FrmBookstoreSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchMouseClicked
        DefaultTableModel modelCatalog = (DefaultTableModel) tblSearch.getModel();

        String rowId = modelCatalog.getValueAt(tblSearch.getSelectedRow(), 0).toString();
        String rowTitle = modelCatalog.getValueAt(tblSearch.getSelectedRow(), 1).toString();
        String rowAuthor = modelCatalog.getValueAt(tblSearch.getSelectedRow(), 2).toString();
        String rowYearOfPublication = modelCatalog.getValueAt(tblSearch.getSelectedRow(), 3).toString();
        String rowPublisher = modelCatalog.getValueAt(tblSearch.getSelectedRow(), 4).toString();
        String rowType = modelCatalog.getValueAt(tblSearch.getSelectedRow(), 5).toString();

        txtId.setText(rowId);
        txtTitle.setText(rowTitle);
        txtAuthor.setText(rowAuthor);
        txtYearOfPublication.setText(rowYearOfPublication);
        txtPublisher.setText(rowPublisher);
        cmbType.setSelectedItem(rowType);
    }//GEN-LAST:event_tblSearchMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBookstoreSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBookstoreSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBookstoreSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBookstoreSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBookstoreSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPublicationYear;
    private javax.swing.JLabel lblPublisher;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlManage;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYearOfPublication;
    // End of variables declaration//GEN-END:variables

    
}
