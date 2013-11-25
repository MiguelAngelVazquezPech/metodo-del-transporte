
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0w3w
 */
public class step03 extends javax.swing.JFrame {
    
    private metodoTransporte mt;
    
    /**
     * Creates new form step01
     */
    public step03() {        
        initComponents();
        mt = new metodoTransporte();
    }

    public step03(metodoTransporte imt){
        initComponents();
        mt = imt;
        this.resultadosTxt.setText(mt.getResults(true));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleText = new javax.swing.JLabel();
        StepTitle = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        restartBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadosTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleText.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        TitleText.setText("Método del Transporte");

        StepTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        StepTitle.setText("Paso 3");

        subTitle.setText("Resultados");

        restartBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        restartBtn.setText("Iniciar Nuevamente");
        restartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBtnActionPerformed(evt);
            }
        });

        resultadosTxt.setEditable(false);
        resultadosTxt.setColumns(20);
        resultadosTxt.setRows(5);
        jScrollPane1.setViewportView(resultadosTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(restartBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StepTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subTitle))
                            .addComponent(TitleText))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StepTitle)
                    .addComponent(subTitle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restartBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtnActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Si sigues se perderá tu calculo, ¿Estás seguro?","Atencion",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            this.dispose();
            new main().setVisible(true);
        }
    }//GEN-LAST:event_restartBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StepTitle;
    private javax.swing.JLabel TitleText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton restartBtn;
    private javax.swing.JTextArea resultadosTxt;
    private javax.swing.JLabel subTitle;
    // End of variables declaration//GEN-END:variables
}