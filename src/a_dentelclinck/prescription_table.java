
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_dentelclinck;

import javax.swing.JFrame;

/**
 *
 * @author REAL COMPUTERS
 */
public class prescription_table extends javax.swing.JFrame {

    /**
     * Creates new form prescription_table
     */
    
     database_con dd=new database_con();
    public prescription_table() {
        initComponents();
              this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            String sql = "CALL `prescriptions_view`();";
        dd.viewTable(sql, pres_table);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rSButtonIconI1 = new rojerusan.RSButtonIconI();
        jLabel3 = new javax.swing.JLabel();
        rSButtonIconI2 = new rojerusan.RSButtonIconI();
        rSButtonIconI4 = new rojerusan.RSButtonIconI();
        jLabel4 = new javax.swing.JLabel();
        rSButtonIconI6 = new rojerusan.RSButtonIconI();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pres_table = new rojeru_san.complementos.TableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonIconI1.setBackground(new java.awt.Color(0, 0, 102));
        rSButtonIconI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/descreption.png"))); // NOI18N
        rSButtonIconI1.setText("descreption");
        rSButtonIconI1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(rSButtonIconI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 210, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("prescription");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        rSButtonIconI2.setBackground(new java.awt.Color(0, 0, 102));
        rSButtonIconI2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/555 back patent.png"))); // NOI18N
        rSButtonIconI2.setText("    Back to home");
        rSButtonIconI2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSButtonIconI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI2ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButtonIconI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 200, 50));

        rSButtonIconI4.setBackground(new java.awt.Color(0, 0, 102));
        rSButtonIconI4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/prescription_1.png"))); // NOI18N
        rSButtonIconI4.setText("prescriptions name");
        rSButtonIconI4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(rSButtonIconI4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/prescreption table.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, 170));

        rSButtonIconI6.setBackground(new java.awt.Color(0, 0, 102));
        rSButtonIconI6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/patent date.png"))); // NOI18N
        rSButtonIconI6.setText(" Expire date");
        rSButtonIconI6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(rSButtonIconI6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 190, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 760));

        jPanel4.setBackground(new java.awt.Color(102, 51, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home / prescreption");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Prescreption");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/prescription (1) table 156.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 270, 210));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 890, 210));

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(102, 51, 255));
        rSButtonMaterialIconTwo1.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconTwo1.setText("Add NEW Patent");
        rSButtonMaterialIconTwo1.setBackgroundHover(new java.awt.Color(67, 150, 209));
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Manegment  Systeam");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/tooth (1).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Dental clinck ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 50));

        pres_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pres_table.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        pres_table.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(pres_table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 880, 320));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1219, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
        // TODO add your handling code here:
        prescription p=new  prescription ();
        p.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

    private void rSButtonIconI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI2ActionPerformed
        // TODO add your handling code here:
         dhashbord d= new  dhashbord();
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
            java.util.logging.Logger.getLogger(prescription_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prescription_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prescription_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prescription_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prescription_table().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.complementos.TableMetro pres_table;
    private rojerusan.RSButtonIconI rSButtonIconI1;
    private rojerusan.RSButtonIconI rSButtonIconI2;
    private rojerusan.RSButtonIconI rSButtonIconI4;
    private rojerusan.RSButtonIconI rSButtonIconI6;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    // End of variables declaration//GEN-END:variables
}
