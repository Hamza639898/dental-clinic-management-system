/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_dentelclinck;

import java.sql.Date;
import javax.swing.JFrame;
import static mondrian.olap.fun.vba.Vba.date;



/**
 *
 * @author REAL COMPUTERS
 */
public class bills extends javax.swing.JFrame {

    /**
     * Creates new form bills
     */
      database_con CO=new database_con ();
      String patentes=null;
      String  amounts=null;
      String id=null;
        String wa;
  String wb;
      public void clear(){
        txt1.setText("");txt2.setText("");txt3.setText("");search.setText("");
    }
    public bills() {
        initComponents();
          this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        

         CO.fillComboBox(comb1, "SELECT concat(p_no,',',p_name,',',p_tell)patentes FROM `patentes`", "patentes");
         CO.fillComboBox(comb2, "select concat( am_no,',',am_name)amounts from `amounts`","amounts");
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
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        search = new RSMaterialComponent.RSTextFieldMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        date = new com.toedter.calendar.JDateChooser();
        txt3 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comb2.setBackground(new java.awt.Color(51, 0, 51));
        comb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amount" }));
        comb2.setColorArrow(new java.awt.Color(102, 0, 102));
        comb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb2ActionPerformed(evt);
            }
        });
        jPanel1.add(comb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 380, -1));

        comb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "patient" }));
        comb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comb1ActionPerformed(evt);
            }
        });
        jPanel1.add(comb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 380, 30));

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
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 380, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("discription");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("P_no");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount_type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Am_name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(51, 0, 0));
        rSButtonMaterialIconOne3.setText("Delete");
        rSButtonMaterialIconOne3.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 140, -1));

        rSButtonIconOne1.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(255, 255, 255));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

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
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 330, 40));

        txt2.setBackground(new java.awt.Color(51, 0, 0));
        txt2.setColumns(20);
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setRows(5);
        txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(txt2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 380, 80));

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
        rSButtonMaterialIconOne5.setText("Update");
        rSButtonMaterialIconOne5.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 140, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 380, 40));

        txt3.setBackground(new java.awt.Color(51, 0, 0));
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setColorMaterial(new java.awt.Color(255, 255, 255));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt3.setPhColor(new java.awt.Color(255, 255, 255));
        txt3.setPlaceholder("Amount");
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 380, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb2ActionPerformed
     
            String []ww=comb2.getSelectedItem().toString().split(",");
        amounts=ww[0];
    }//GEN-LAST:event_comb2ActionPerformed

    private void comb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comb1ActionPerformed
   
           String []ww=comb1.getSelectedItem().toString().split(",");
        patentes=ww[0];
    }//GEN-LAST:event_comb1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:\
         Date d= new Date(date.getDate().getTime());
        String oper="delete";
        CO.setSql("call bil_pr('"+patentes+"','"+amounts+"','"+txt1.getText()+"','"+txt3.getText()+"','"+d+"','"+txt2.getText()+"','"+oper+"','"+id+"')");
        clear();
        
      
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
        // TODO add your handling code here:

        
        String sql="SELECT b.bils_no,b.amount_bil ,b.amount_name,b.date,b.description, concat(p.p_no,',',p.p_name,',',p.p_tell) patentes,  concat(a.am_no,',',a.am_name) amounts  from patentes p , bills3 b ,amounts a   WHERE  b.p_no=p.p_no and b.am_no=a.am_no and  b.bils_no='"+search.getText()+"'"; CO.search(sql);
     CO.search(sql); 
       try{
         if(CO.rs.next()){
             id=CO.rs.getString("bils_no");
              comb1.setSelectedItem(CO.rs.getString("patentes"));
              comb2.setSelectedItem(CO.rs.getString("amounts"));
              txt1.setText(CO.rs.getString("amount_bil"));
              txt3.setText(CO.rs.getString("amount_name"));
              
             date.setDate(CO.rs.getDate("date"));
             txt2.setText(CO.rs.getString("description"));
           
           
          
            
                }else{
                      javax.swing.JOptionPane.showMessageDialog(null, "Record Not Found");
            
             
        }
        
    }catch(Exception ex){
        
             javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        
         
    
    }
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
         Date d=new  Date(date.getDate().getTime());
               
            String oper="insert";
        String Sql="call bil_pr('"+patentes+"','"+ amounts+"','"+txt1.getText()+"','"+txt3.getText()+"','"+d+"','"+txt2.getText()+"','"+oper+"',null)";
        CO.setSql(Sql);
        clear();
                    
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:
        Date d= new Date(date.getDate().getTime());
        String oper="update";
        CO.setSql("call bil_pr('"+patentes+"','"+amounts+"','"+txt1.getText()+"','"+txt3.getText()+"','"+d+"','"+txt2.getText()+"','"+oper+"','"+id+"')");
        clear();
        
    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

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
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bills().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial search;
    private RSMaterialComponent.RSTextFieldMaterial txt1;
    private javax.swing.JTextArea txt2;
    private RSMaterialComponent.RSTextFieldMaterial txt3;
    // End of variables declaration//GEN-END:variables
}
