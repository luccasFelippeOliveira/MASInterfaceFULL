/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author luccas
 */
public class BNFNormsForm extends javax.swing.JFrame {

    /**
     * Creates new form BNFNormsForm
     */
    public BNFNormsForm() {
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

        normLanguageLabel = new javax.swing.JLabel();
        languageScrollPane = new javax.swing.JScrollPane();
        languageTextPane = new javax.swing.JTextPane();
        numberNormLabel = new javax.swing.JLabel();
        numberNormsTextField = new javax.swing.JTextField();
        conflictsType1Button = new javax.swing.JButton();
        conflictsType2Button = new javax.swing.JButton();
        conflictsType3Button = new javax.swing.JButton();
        conflictsType4Button = new javax.swing.JButton();
        allConflictsButton = new javax.swing.JButton();
        conflictsLabel = new javax.swing.JLabel();
        confliictsScrollPane = new javax.swing.JScrollPane();
        conflictsTextPane = new javax.swing.JTextPane();
        numberConflictsLabel = new javax.swing.JLabel();
        numberConflictsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        normLanguageLabel.setText("Norm Languge:");

        languageScrollPane.setViewportView(languageTextPane);

        numberNormLabel.setText("Number of Norms:");

        numberNormsTextField.setText("0");
        numberNormsTextField.setEnabled(false);

        conflictsType1Button.setText("Conflicts Type I");

        conflictsType2Button.setText("Conflicts Type II");

        conflictsType3Button.setText("Conflicts Type III");

        conflictsType4Button.setText("Conflicts Type IV");

        allConflictsButton.setText("All Conflicts");

        conflictsLabel.setText("Conflicts");

        confliictsScrollPane.setViewportView(conflictsTextPane);

        numberConflictsLabel.setText("Number of Conflicts");

        numberConflictsTextField.setText("0");
        numberConflictsTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confliictsScrollPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(languageScrollPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(normLanguageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numberNormLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberNormsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conflictsType1Button)
                        .addGap(18, 18, 18)
                        .addComponent(conflictsType2Button)
                        .addGap(18, 18, 18)
                        .addComponent(conflictsType3Button)
                        .addGap(18, 18, 18)
                        .addComponent(conflictsType4Button)
                        .addGap(18, 18, 18)
                        .addComponent(allConflictsButton)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conflictsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numberConflictsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberConflictsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normLanguageLabel)
                    .addComponent(numberNormLabel)
                    .addComponent(numberNormsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(languageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conflictsType1Button)
                    .addComponent(conflictsType2Button)
                    .addComponent(conflictsType3Button)
                    .addComponent(conflictsType4Button)
                    .addComponent(allConflictsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conflictsLabel)
                    .addComponent(numberConflictsLabel)
                    .addComponent(numberConflictsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confliictsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allConflictsButton;
    private javax.swing.JLabel conflictsLabel;
    private javax.swing.JTextPane conflictsTextPane;
    private javax.swing.JButton conflictsType1Button;
    private javax.swing.JButton conflictsType2Button;
    private javax.swing.JButton conflictsType3Button;
    private javax.swing.JButton conflictsType4Button;
    private javax.swing.JScrollPane confliictsScrollPane;
    private javax.swing.JScrollPane languageScrollPane;
    private javax.swing.JTextPane languageTextPane;
    private javax.swing.JLabel normLanguageLabel;
    private javax.swing.JLabel numberConflictsLabel;
    private javax.swing.JTextField numberConflictsTextField;
    private javax.swing.JLabel numberNormLabel;
    private javax.swing.JTextField numberNormsTextField;
    // End of variables declaration//GEN-END:variables
}
