/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package a_dentelclinck;

 import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class forget_password extends javax.swing.JFrame {

    /**
     * Creates new form forget_password
     */
         database_con co=new database_con();
        public void clear(){
        t1.setText("");t2.setText("");t3.setText("");tt1.setText("");tt2.setText("");
    }
    public forget_password() {
        initComponents();
             this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        t1 = new necesario.TextField();
        jLabel1 = new javax.swing.JLabel();
        tt2 = new app.bolivia.swing.JCTextField();
        tt1 = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSButtonMaterialOne1 = new RSMaterialComponent.RSButtonMaterialOne();
        t2 = new necesario.TextField();
        t3 = new necesario.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        rSButtonIconI2 = new rojerusan.RSButtonIconI();
        rSLabelImage4 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setPlaceholder("enter your national id");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));
        jPanel1.add(tt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 250, -1));
        jPanel1.add(tt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("user");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        rSButtonMaterialOne1.setBackground(new java.awt.Color(107, 19, 19));
        rSButtonMaterialOne1.setText("get your password");
        rSButtonMaterialOne1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        rSButtonMaterialOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialOne1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 240, -1));

        t2.setPlaceholder("Enter your emial");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, 30));

        t3.setPlaceholder("enter your mother name");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mother");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Forget your password");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Emial");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/password login.png"))); // NOI18N
        jPanel1.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 80));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/password login.png"))); // NOI18N
        jPanel1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 70, 50));

        rSButtonIconI2.setBackground(new java.awt.Color(0, 0, 102));
        rSButtonIconI2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/555 back patent.png"))); // NOI18N
        rSButtonIconI2.setText("    Back to home");
        rSButtonIconI2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSButtonIconI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/f1.jpg"))); // NOI18N
        jPanel1.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialOne1ActionPerformed
        // TODO add your handling code here:
           String sql="SELECT user_name,passwor FROM users WHERE user_emial='"+t1.getText()+"'and user_mother_name='"+t2.getText()+"'and user_natinol_id='"+t3.getText()+"'";	;
           
              
        co.search(sql);
        
        try{
            if(co.rs.next()){
                tt1.setText(co.rs.getString("user_name"));
                tt2.setText(co.rs.getString("passwor"));
                t1.setText("");
                t2.setText("");
                t3.setText("");
                JOptionPane.showMessageDialog(null, "correct ansawir");
            }
            else{
                JOptionPane.showMessageDialog(null, "invalid user_favourate");
            }
        }catch(Exception b){
            JOptionPane.showMessageDialog(null, b.getMessage());
        }
       
        
    }//GEN-LAST:event_rSButtonMaterialOne1ActionPerformed

    private void rSButtonIconI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI2ActionPerformed
        // TODO add your handling code here:
      login_s d= new login_s();
        d.show();
        this.hide();
    }//GEN-LAST:event_rSButtonIconI2ActionPerformed

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
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forget_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSButtonIconI rSButtonIconI2;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojerusan.RSLabelImage rSLabelImage4;
    private necesario.TextField t1;
    private necesario.TextField t2;
    private necesario.TextField t3;
    private app.bolivia.swing.JCTextField tt1;
    private app.bolivia.swing.JCTextField tt2;
    // End of variables declaration//GEN-END:variables
}
