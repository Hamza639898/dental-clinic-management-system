/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_dentelclinck;

/**
 *
 * @author REAL COMPUTERS
 */
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class customer_prescription_form extends javax.swing.JFrame {
  database_con CO=new database_con ();
   String cp_no=null;
String prescriptions=null;
String patentes=null;
  String wa;
  String wb;
    public void clear(){
       txt2.setText("");txt3.setText("");search.setText("");
    }
  
    public customer_prescription_form() {
  initComponents();
       this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
        CO.fillComboBox(comb1,"SELECT concat(pr_no,',',pr_name,',',pr_madein,',',pr_expire_date)prescriptions FROM `prescriptions`", "prescriptions");
        CO.fillComboBox(comb2, "SELECT concat(p_no,',',p_name,',',p_tell)patentes FROM `patentes`", "patentes");
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
        comb2 = new RSMaterialComponent.RSComboBox();
        comb1 = new RSMaterialComponent.RSComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel5 = new javax.swing.JLabel();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        update = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        search = new RSMaterialComponent.RSTextFieldMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comb2.setBackground(new java.awt.Color(51, 0, 51));
        comb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "patents", " " }));
        comb2.setColorArrow(new java.awt.Color(102, 0, 102));
        comb2.setColorFondo(new java.awt.Color(51, 0, 51));
        comb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb2ActionPerformed(evt);
            }
        });
        jPanel1.add(comb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 410, 40));

        comb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select prescription", " " }));
        comb1.setColorFondo(new java.awt.Color(51, 0, 51));
        comb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb1ActionPerformed(evt);
            }
        });
        jPanel1.add(comb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 410, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("discription");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("prescription");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patent");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txt3.setBackground(new java.awt.Color(51, 0, 0));
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setColorMaterial(new java.awt.Color(255, 255, 255));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt3.setPhColor(new java.awt.Color(255, 255, 255));
        txt3.setPlaceholder("Usage");
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 410, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("usage");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne2.setText("Delete");
        rSButtonMaterialIconOne2.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 160, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne3.setText(" insert");
        rSButtonMaterialIconOne3.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 140, -1));

        update.setBackground(new java.awt.Color(51, 0, 0));
        update.setText("update");
        update.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        update.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 160, -1));

        rSButtonIconOne1.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(255, 255, 255));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        search.setBackground(new java.awt.Color(51, 0, 0));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setColorMaterial(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search.setPhColor(new java.awt.Color(255, 255, 255));
        search.setPlaceholder("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 320, 40));

        txt2.setColumns(20);
        txt2.setRows(5);
        txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txt2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 380, 100));

        date.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 410, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 920, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
  Date d= new Date(date.getDate().getTime());
        
        String oper="delete";
        CO.setSql("call customer_prescription_pr('"+prescriptions+"','"+ patentes+"','"+d+"','"+txt3.getText()+"','"+txt2.getText()+"','"+oper+"','"+ cp_no+"')");
       clear();
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
         Date d= new Date(date.getDate().getTime());
          String oper="insert";
        String Sql="call customer_prescription_pr('"+prescriptions+"','"+ patentes+"','"+d+"','"+txt3.getText()+"','"+txt2.getText()+"','"+oper+"',null)";
         CO.setSql(Sql);
         clear();
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
  Date d= new Date(date.getDate().getTime());
        
        String oper="update";
        CO.setSql("call customer_prescription_pr('"+prescriptions+"','"+ patentes+"','"+d+"','"+txt3.getText()+"','"+txt2.getText()+"','"+oper+"','"+ cp_no+"')");
              clear();
    }//GEN-LAST:event_updateActionPerformed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        // TODO add your handling code here:

          String sql="SELECT c.cp_no,c.tariikh,c.usag,c.description,concat(pr.pr_no,',',pr.pr_name,',',pr.pr_madein,',',pr.pr_expire_date)prescriptions,concat(p.p_no,',',p.p_name,',',p.p_tell) patentes from  prescriptions pr , customer_prescription c , patentes p     WHERE c.pr_no=pr.pr_no and c.p_no=p.p_no and c.cp_no='"+search.getText()+"'";CO.search(sql);
    CO.search(sql); 
    try{
        if(CO.rs.next()){
            cp_no=CO.rs.getString("cp_no");
            comb1.setSelectedItem(CO.rs.getString("prescriptions"));
            comb2.setSelectedItem(CO.rs.getString("patentes"));
               date.setDate(CO.rs.getDate("tariikh"));
            txt3.setText(CO.rs.getString("usag"));
            txt2.setText(CO.rs.getString("description"));
           
           
          
            
        }else{
            
             JOptionPane.showMessageDialog(null, "Record Not Found");
        }
        
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }

    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void comb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb1ActionPerformed
         String []ww=comb1.getSelectedItem().toString().split(",");
     prescriptions=ww[0];
    }//GEN-LAST:event_comb1ActionPerformed

    private void comb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb2ActionPerformed
          String []ww=comb2.getSelectedItem().toString().split(",");
     patentes=ww[0];
    }//GEN-LAST:event_comb2ActionPerformed

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
            java.util.logging.Logger.getLogger(customer_prescription_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_prescription_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_prescription_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_prescription_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_prescription_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBox comb1;
    private RSMaterialComponent.RSComboBox comb2;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSTextFieldMaterial search;
    private javax.swing.JTextArea txt2;
    private RSMaterialComponent.RSTextFieldMaterial txt3;
    private RSMaterialComponent.RSButtonMaterialIconOne update;
    // End of variables declaration//GEN-END:variables
}

