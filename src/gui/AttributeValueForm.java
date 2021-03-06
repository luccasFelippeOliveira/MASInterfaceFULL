/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import javax.swing.JOptionPane;
import model.AttributeModel;
import model.Services;
import model.ValueModel;
import org.jdesktop.beansbinding.Binding;

/**
 *
 * @author luccas
 */
public class AttributeValueForm extends javax.swing.JFrame {

    private List<AttributeModel> listAttribute;
    private AttributeModel currentAttribute = null;
    /**
     * Creates new form AtributteValueForm
     */
    public AttributeValueForm() {
        listAttribute = Services.getAttributeModelList();
        initComponents();
        refreshAttributeTable();
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

        attributeList = new java.util.ArrayList<>();
        valueList = new java.util.ArrayList<>();
        attributeNameLabel = new javax.swing.JLabel();
        attributeTextField = new javax.swing.JTextField();
        saveAttributeButton = new javax.swing.JButton();
        deleteAttributeButton = new javax.swing.JButton();
        attributeScrollPane = new javax.swing.JScrollPane();
        attributeTable = new javax.swing.JTable();
        forAttributeLabel = new javax.swing.JLabel();
        attributeComboBox = new javax.swing.JComboBox<>();
        valueIsLabel = new javax.swing.JLabel();
        valueTextField = new javax.swing.JTextField();
        saveValueButton = new javax.swing.JButton();
        deleteValueButton = new javax.swing.JButton();
        valueScrollPane = new javax.swing.JScrollPane();
        valueTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        attributeNameLabel.setText("Attribute Name:");

        saveAttributeButton.setText("Save Attribute");
        saveAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAttributeButtonActionPerformed(evt);
            }
        });

        deleteAttributeButton.setText("Delete Attribute");
        deleteAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAttributeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, attributeList, attributeTable, "attributeTableBinding");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${attributeName}"));
        columnBinding.setColumnName("Attribute Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        attributeScrollPane.setViewportView(attributeTable);

        forAttributeLabel.setText("For Attribute");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, attributeList, attributeComboBox, "attributeComboBinding");
        bindingGroup.addBinding(jComboBoxBinding);

        attributeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                attributeComboBoxItemStateChanged(evt);
            }
        });

        valueIsLabel.setText("Value is: ");

        saveValueButton.setText("Save Value");
        saveValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveValueButtonActionPerformed(evt);
            }
        });

        deleteValueButton.setText("Delete Value");
        deleteValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteValueButtonActionPerformed(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, valueList, valueTable, "valueAttributeBinding");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${value}"));
        columnBinding.setColumnName("Value");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        valueScrollPane.setViewportView(valueTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueScrollPane)
                    .addComponent(attributeScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(forAttributeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(attributeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueIsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(valueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveValueButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteValueButton)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(attributeNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(attributeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveAttributeButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteAttributeButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attributeNameLabel)
                    .addComponent(attributeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveAttributeButton)
                    .addComponent(deleteAttributeButton))
                .addGap(18, 18, 18)
                .addComponent(attributeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forAttributeLabel)
                    .addComponent(attributeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueIsLabel)
                    .addComponent(valueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveValueButton)
                    .addComponent(deleteValueButton))
                .addGap(18, 18, 18)
                .addComponent(valueScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAttributeButtonActionPerformed
        // Save a AttributeModel
         if(attributeTextField.getText() == null || "".equals(attributeTextField.getText()) ) {
            /*Field is void alert*/
            JOptionPane.showMessageDialog(rootPane, "Attribute Name is void");
        }
        else {
            /*Create object and add to list*/
            AttributeModel attribute = new AttributeModel();
            attribute.setAttributeName(attributeTextField.getText());
            listAttribute.add(attribute);
            refreshAttributeTable();
            /*Clean objectTextField*/
            attributeTextField.setText("");
        }
    }//GEN-LAST:event_saveAttributeButtonActionPerformed

    private void deleteAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAttributeButtonActionPerformed
        // Delete object
        int selectedRow = attributeTable.getSelectedRow();
        int selectedColumn = attributeTable.getSelectedColumn();
        
        /*TODO: Check if user has selected*/
        
        /*Get selected string*/
        String selectedValue = (String) attributeTable.getValueAt(selectedRow, selectedColumn);
        
        int selectedValueIndex = 0;
        for (AttributeModel a : listAttribute) {
            if(a.getAttributeName().equals(selectedValue)) {
                break;
            }
            selectedValueIndex ++;
        }
        /*Delete */
        if(!listAttribute.isEmpty()) {
            listAttribute.remove(selectedValueIndex);
            refreshAttributeTable();
        }
    }//GEN-LAST:event_deleteAttributeButtonActionPerformed

    private void attributeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_attributeComboBoxItemStateChanged
        // Activates when combo item changes.
        currentAttribute = (AttributeModel) evt.getItem();
        refreshValueTable(currentAttribute);
    }//GEN-LAST:event_attributeComboBoxItemStateChanged

    private void saveValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveValueButtonActionPerformed
        // Save value
        String text = valueTextField.getText();
        if(text == null || "".equals(text)) {
            JOptionPane.showMessageDialog(rootPane, "Value Name is void" + text);
        }
        else if(currentAttribute == null) {
            JOptionPane.showMessageDialog(rootPane, "Select or create an attribute");
        }
        else {
            ValueModel vm = new ValueModel();
            vm.setValue(text);         
            /*Add to list*/
            currentAttribute.addValue(vm);
            refreshValueTable(currentAttribute);
            
            /*Clear text field*/
            valueTextField.setText("");
        }
    }//GEN-LAST:event_saveValueButtonActionPerformed

    private void deleteValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteValueButtonActionPerformed
        // Delete Value
        int selectedRow = valueTable.getSelectedRow();
        int selectedColumn = valueTable.getSelectedColumn();
        
        /*TODO: Check if user has selected*/
        
        /*Get selected string*/
        String selectedValue = (String) valueTable.getValueAt(selectedRow, selectedColumn);
        
        int selectedValueIndex = 0;
        for (ValueModel v : currentAttribute.getValues()) {
            if(v.getValue().equals(selectedValue)) {
                break;
            }
            selectedValueIndex ++;
        }
        /*Delete */
        if(!currentAttribute.getValues().isEmpty()) {
            currentAttribute.getValues().remove(selectedValueIndex);
            refreshValueTable(currentAttribute);
        }
    }//GEN-LAST:event_deleteValueButtonActionPerformed

    private void refreshAttributeTable() {
        Binding b = bindingGroup.getBinding("attributeTableBinding");
        Binding bCombo = bindingGroup.getBinding("attributeComboBinding");
        b.unbind();
        bCombo.unbind();
        attributeList.clear();
        attributeList.addAll(listAttribute);
        b.bind();
        bCombo.bind();
        attributeTable.repaint();
        attributeComboBox.repaint();
    }
    
    private void refreshValueTable(AttributeModel attr) {
        Binding b = bindingGroup.getBinding("valueAttributeBinding");
        List<ValueModel> values = attr.getValues();
        
        b.unbind();
        valueList.clear();
        
        if(values == null) {
            /*TODO: Not an optimal solution*/
            ValueModel nullValue = new ValueModel();
            nullValue.setValue("No current Value");
            valueList.add(nullValue);
        }else {
            valueList.addAll(values);
        }
         
        b.bind();
        
        valueTable.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<AttributeModel> attributeComboBox;
    private java.util.ArrayList<AttributeModel> attributeList;
    private javax.swing.JLabel attributeNameLabel;
    private javax.swing.JScrollPane attributeScrollPane;
    private javax.swing.JTable attributeTable;
    private javax.swing.JTextField attributeTextField;
    private javax.swing.JButton deleteAttributeButton;
    private javax.swing.JButton deleteValueButton;
    private javax.swing.JLabel forAttributeLabel;
    private javax.swing.JButton saveAttributeButton;
    private javax.swing.JButton saveValueButton;
    private javax.swing.JLabel valueIsLabel;
    private java.util.ArrayList<ValueModel> valueList;
    private javax.swing.JScrollPane valueScrollPane;
    private javax.swing.JTable valueTable;
    private javax.swing.JTextField valueTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
