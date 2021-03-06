/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopstock;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingConstants;

/**
 *
 * @author User
 */
public class BenifitCalculation extends javax.swing.JFrame {

    /**
     * Creates new form BenifitCalculation
     */
    String User;
    DatabaseConnection DbC = new DatabaseConnection();
    public BenifitCalculation(String a) {
        initComponents();
        User=a;
    }
    BenifitCalculation() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        BenifitShow = new javax.swing.JTextField();
        TotalLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TotalPurchaseText = new javax.swing.JTextField();
        TotalSaleText = new javax.swing.JTextField();
        TotalLabel1 = new javax.swing.JLabel();
        TotalDamageText = new javax.swing.JTextField();
        PurchaseShow = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("From");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To");

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jXDatePicker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker2ActionPerformed(evt);
            }
        });

        BenifitShow.setEditable(false);
        BenifitShow.setBackground(new java.awt.Color(255, 204, 204));
        BenifitShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BenifitShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenifitShowActionPerformed(evt);
            }
        });

        TotalLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TotalLabel.setText("Total Sale");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Total Purchase");

        TotalPurchaseText.setEditable(false);
        TotalPurchaseText.setBackground(new java.awt.Color(51, 255, 255));
        TotalPurchaseText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalPurchaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPurchaseTextActionPerformed(evt);
            }
        });

        TotalSaleText.setEditable(false);
        TotalSaleText.setBackground(new java.awt.Color(51, 255, 255));
        TotalSaleText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalSaleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSaleTextActionPerformed(evt);
            }
        });

        TotalLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TotalLabel1.setText("Total Damage");

        TotalDamageText.setEditable(false);
        TotalDamageText.setBackground(new java.awt.Color(51, 255, 255));
        TotalDamageText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalDamageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalDamageTextActionPerformed(evt);
            }
        });

        PurchaseShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PurchaseShow.setText("Show Benifit");
        PurchaseShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseShowActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopstock/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(TotalLabel)
                                    .addComponent(TotalLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TotalDamageText)
                                    .addComponent(TotalSaleText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotalPurchaseText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PurchaseShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BenifitShow, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(PurchaseShow)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TotalPurchaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalLabel)
                    .addComponent(TotalSaleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalLabel1)
                    .addComponent(TotalDamageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(BenifitShow, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
        jXDatePicker1.setFormats(new String[]{"yyyy-MM-dd"});
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jXDatePicker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker2ActionPerformed
        // TODO add your handling code here:
        jXDatePicker2.setFormats(new String[]{"yyyy-MM-dd"});
    }//GEN-LAST:event_jXDatePicker2ActionPerformed

    private void BenifitShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenifitShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BenifitShowActionPerformed

    private void TotalPurchaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPurchaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPurchaseTextActionPerformed

    private void TotalSaleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSaleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSaleTextActionPerformed

    private void TotalDamageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalDamageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalDamageTextActionPerformed

    private void PurchaseShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseShowActionPerformed
        // TODO add your handling code here:
        

        Date oDate1 = jXDatePicker1.getDate();
        DateFormat oDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String szDate1 = oDateFormat1.format(oDate1);
        Date oDate2 = jXDatePicker2.getDate();
        DateFormat oDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        String szDate2 = oDateFormat2.format(oDate2);

        float PurchaseSum=0;
        try{

            String sql3="SELECT SUM(PurchaseTotal) AS TS FROM PURCHASE WHERE PurchaseDate BETWEEN '"+szDate1+"' AND '"+szDate2+"'";
            PreparedStatement st =DbC.connection().prepareStatement(sql3);

            ResultSet rs=st.executeQuery();
            if(rs.next()){
                PurchaseSum= rs.getFloat("TS");
            }
            System.out.println(PurchaseSum);
            TotalPurchaseText.setHorizontalAlignment(SwingConstants.RIGHT);
            TotalPurchaseText.setText(Float.toString(PurchaseSum));
            DbC.connection().close();
        }
        catch(SQLException ex){

        }
        float SaleSum=0;
        try{
            String sql3="SELECT SUM(SaleTotal) AS TS FROM Sale WHERE SaleDate BETWEEN '"+szDate1+"' AND '"+szDate2+"'";
            PreparedStatement st =DbC.connection().prepareStatement(sql3);

            ResultSet rs=st.executeQuery();
                    if(rs.next()){
                    SaleSum= rs.getFloat("TS");
                    }
                    System.out.println(SaleSum);
                    TotalSaleText.setHorizontalAlignment(SwingConstants.RIGHT);
                    TotalSaleText.setText(Float.toString(SaleSum));
                    DbC.connection().close();
        }
        catch(SQLException ex){
            
        }
        float DamageSum=0;
        try{
            String sql3="SELECT SUM(DamageTotal) AS TS FROM DAMAGE WHERE DamageDate BETWEEN '"+szDate1+"' AND '"+szDate2+"'";
            PreparedStatement st =DbC.connection().prepareStatement(sql3);

            ResultSet rs=st.executeQuery();
                    if(rs.next()){
                    DamageSum= rs.getFloat("TS");
                    }
                    System.out.println(DamageSum);
                    TotalDamageText.setHorizontalAlignment(SwingConstants.RIGHT);
                    TotalDamageText.setText(Float.toString(DamageSum));
                    DbC.connection().close();
        }
        catch(SQLException ex){
            
        }

        float benifit=SaleSum-PurchaseSum+DamageSum;
        BenifitShow.setHorizontalAlignment(SwingConstants.CENTER);
        BenifitShow.setText("Benifit From "+szDate1+" to "+szDate2+" is TK. "+benifit);
        
    }//GEN-LAST:event_PurchaseShowActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminWorkingWin ob= new AdminWorkingWin(User);
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BenifitCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BenifitCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BenifitCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BenifitCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BenifitCalculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BenifitShow;
    private javax.swing.JButton PurchaseShow;
    private javax.swing.JTextField TotalDamageText;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel TotalLabel1;
    private javax.swing.JTextField TotalPurchaseText;
    private javax.swing.JTextField TotalSaleText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables
}
