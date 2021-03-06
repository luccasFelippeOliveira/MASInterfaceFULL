/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ObjectModel;
import model.Services;
import org.jdesktop.beansbinding.Binding;

/**
 *
 * @author luccas
 */
public class RegisterObjectForm extends javax.swing.JFrame {
    
    private List<ObjectModel> listObject;
    
    /**
     * Creates new form RegisterObjectForm
     */
    public RegisterObjectForm() {
        listObject = Services.getObjectModelList();
        initComponents();
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        objectList = new java.util.ArrayList<>();
        objectScrollPane = new javax.swing.JScrollPane();
        objectsTable = new javax.swing.JTable();
        objectNameLabel = new javax.swing.JLabel();
        objectTextField = new javax.swing.JTextField();
        saveObjectButton = new javax.swing.JButton();
        deleteObjectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, objectList, objectsTable, "objectTableBinding");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${objectName}"));
        columnBinding.setColumnName("Object Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        objectScrollPane.setViewportView(objectsTable);

        objectNameLabel.setText("Object Name:");

        saveObjectButton.setText("Save");
        saveObjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveObjectButtonActionPerformed(evt);
            }
        });

        deleteObjectButton.setText("Delete");
        deleteObjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteObjectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(objectScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(objectNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(objectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(saveObjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteObjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(objectNameLabel)
                    .addComponent(objectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveObjectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteObjectButton)
                .addGap(25, 25, 25)
                .addComponent(objectScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveObjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveObjectButtonActionPerformed
        // Save Object
        if(objectTextField.getText() == null || "".equals(objectTextField.getText()) ) {
            /*Field is void alert*/
            JOptionPane.showMessageDialog(rootPane, "Object Name is void");
        }
        else {
            /*Create object and add to list*/
            ObjectModel object = new ObjectModel();
            object.setObjectName(objectTextField.getText());
            listObject.add(object);
            refreshTable();
            /*Clean objectTextField*/
            objectTextField.setText("");
        }
    }//GEN-LAST:event_saveObjectButtonActionPerformed

    private void deleteObjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteObjectButtonActionPerformed
        // Delete object
        int selectedRow = objectsTable.getSelectedRow();
        int selectedColumn = objectsTable.getSelectedColumn();
        
        /*TODO: Check if user has selected*/
        
        /*Get selected string*/
        String selectedValue = (String) objectsTable.getValueAt(selectedRow, selectedColumn);
        
        int selectedValueIndex = 0;
        for (ObjectModel o : listObject) {
            if(o.getObjectName().equals(selectedValue)) {
                break;
            }
            selectedValueIndex ++;
        }
        /*Delete */
        if(!listObject.isEmpty()) {
            listObject.remove(selectedValueIndex);
            refreshTable();
        }
    }//GEN-LAST:event_deleteObjectButtonActionPerformed


      private void refreshTable() {
        Binding b = bindingGroup.getBinding("objectTableBinding");
        b.unbind();
        objectList.clear();
        objectList.addAll(listObject);
        b.bind();
        objectsTable.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteObjectButton;
    private java.util.ArrayList<ObjectModel> objectList;
    private javax.swing.JLabel objectNameLabel;
    private javax.swing.JScrollPane objectScrollPane;
    private javax.swing.JTextField objectTextField;
    private javax.swing.JTable objectsTable;
    private javax.swing.JButton saveObjectButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
