/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_dentelclinck;

import java.sql.Date;
import javax.swing.JFrame;

/**
 *
 * @author REAL COMPUTERS
 */
public class visits extends javax.swing.JFrame {

    /**
     * Creates new form visits
     */
    database_con co= new  database_con();
       String patentes=null;
      String  doctores=null;
       String id=null;
               String wa;
  String wb;
    public visits() {
          initComponents();
                this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
           co.fillComboBox(comp1, "SELECT concat(p_no,',',p_name,',',p_tell)patentes FROM `patentes`","patentes");
           co.fillComboBox(comb3, "select concat(d_no,',',d_name,',',d_taype)doctores from `doctores`","doctores");
         
        
      
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSComboMetroBeanInfo1 = new rojerusan.RSComboMetroBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        comp1 = new RSMaterialComponent.RSComboBox();
        comb3 = new RSMaterialComponent.RSComboBox();
        date = new com.toedter.calendar.JDateChooser();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne6 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne7 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        search = new RSMaterialComponent.RSTextFieldMaterial();
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comp1.setBackground(new java.awt.Color(51, 0, 51));
        comp1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "patents", " " }));
        comp1.setColorArrow(new java.awt.Color(102, 0, 102));
        comp1.setColorFondo(new java.awt.Color(51, 0, 51));
        comp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp1ActionPerformed(evt);
            }
        });
        jPanel1.add(comp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 410, 40));

        comb3.setBackground(new java.awt.Color(51, 0, 51));
        comb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "doctore number" }));
        comb3.setColorArrow(new java.awt.Color(102, 0, 102));
        comb3.setColorFondo(new java.awt.Color(51, 0, 51));
        comb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb3ActionPerformed(evt);
            }
        });
        jPanel1.add(comb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 410, 40));

        date.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 400, 40));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne4.setText("Insert");
        rSButtonMaterialIconOne4.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 140, -1));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne5.setText("Insert");
        rSButtonMaterialIconOne5.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 140, -1));

        rSButtonMaterialIconOne6.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne6.setText("Update");
        rSButtonMaterialIconOne6.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 140, -1));

        rSButtonMaterialIconOne7.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne7.setText("Update");
        rSButtonMaterialIconOne7.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne7.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne7ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 140, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne3.setText("Delete");
        rSButtonMaterialIconOne3.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 140, -1));

        rSButtonIconOne1.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(255, 255, 255));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

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
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 330, 40));

        txt1.setBackground(new java.awt.Color(51, 0, 0));
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setColorMaterial(new java.awt.Color(255, 255, 255));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt1.setPhColor(new java.awt.Color(255, 255, 255));
        txt1.setPlaceholder("Amount");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 400, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("amount");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Paitent");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 870, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp1ActionPerformed
        // TODO add your handling code here:
          String []ww=comp1.getSelectedItem().toString().split(",");
        patentes=ww[0];
    }//GEN-LAST:event_comp1ActionPerformed

    private void comb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb3ActionPerformed
        // TODO add your handling code here:
            String []ww=comb3.getSelectedItem().toString().split(",");
              doctores=ww[0];
    }//GEN-LAST:event_comb3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
    

    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:
        Date d=new  Date(date.getDate().getTime());

        String oper="insert";
        String Sql="call visit_pr_new('"+patentes+"','"+   doctores+"','"+txt1.getText()+"','"+d+"','"+oper+"',null)";
        co.setSql(Sql);

    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void rSButtonMaterialIconOne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne6ActionPerformed
        // TODO add your handling code here:
     

    }//GEN-LAST:event_rSButtonMaterialIconOne6ActionPerformed

    private void rSButtonMaterialIconOne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne7ActionPerformed
        // TODO add your handling code here:
       Date d= new Date(date.getDate().getTime());
        String oper="update";
        co.setSql(" call visit_pr_new('"+patentes+"','"+ doctores+"','"+txt1.getText()+"','"+d+"','"+oper+"','"+id+"' )");

    }//GEN-LAST:event_rSButtonMaterialIconOne7ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:\
        Date d= new Date(date.getDate().getTime());
        String oper="delete";
        co.setSql("call visit_pr_new('"+patentes+"','"+doctores+"','"+txt1.getText()+"','"+d+"','"+oper+"','"+id+"')");

    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        // TODO add your handling code here:

        String sql="SELECT v.v_no,v.prise,v.v_date, concat(p.p_no,',',p.p_name,',',p.p_tell) patentes,concat(d.d_no,',',d.d_name,',',d.d_taype)doctores  from patentes p , visits v ,doctores d   WHERE v.p_no=p.p_no and v.d_no=d.d_no and v.v_no='"+search.getText()+"'"; co.search(sql);
        co.search(sql);
        try{
            if(co.rs.next()){
                id=co.rs.getString("v_no");
                comp1.setSelectedItem(co.rs.getString("patentes"));
                comb3.setSelectedItem(co.rs.getString("doctores"));
                txt1.setText(co.rs.getString("prise"));
                date.setDate(co.rs.getDate("v_date"));

                

            }else{
                javax.swing.JOptionPane.showMessageDialog(null,"Record Not Found");
                

            }

        }catch(Exception ex){

            javax.swing.JOptionPane.showMessageDialog(null,ex.getMessage());

        }
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(visits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBox comb3;
    private RSMaterialComponent.RSComboBox comp1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne6;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne7;
    private rojerusan.RSComboMetroBeanInfo rSComboMetroBeanInfo1;
    private RSMaterialComponent.RSTextFieldMaterial search;
    private RSMaterialComponent.RSTextFieldMaterial txt1;
    // End of variables declaration//GEN-END:variables
}
