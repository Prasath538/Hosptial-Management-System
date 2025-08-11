
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sedhu
 */
public class MASTER extends javax.swing.JFrame {

    /**
     * Creates new form MASTER`
     */
  boolean flag = false;
    Integer r = 0;
 
    public MASTER() {
initComponents();

    try
        {
        Connection con = Project.connection.getCon();
        
        try
         {
             
             
            Statement stamt = con.createStatement();
            String q3 = "select available_appointment from doctordetails where special= '"+"master1"+"'";
            ResultSet s = stamt.executeQuery(q3);
            if(s.next())
            {
                String rs = s.getString("available_appointment");
                r = Integer.parseInt(rs);
                System.out.println(r);
            }
            if(validate(r))
            {
                jCheckBox1.setSelected(true);
                flag =true;
            }
            else
            {
                jCheckBox1.setSelected(false);
            }
            Statement stmt = con.createStatement();
            String q4 = "select available_appointment from doctordetails where special= '"+"master2"+"'";
            ResultSet si = stmt.executeQuery(q4);
            if(si.next())
            {
                String rs = si.getString("available_appointment");
                r = Integer.parseInt(rs);
                System.out.println(r);
            }
            if(validate(r))
            {
                jCheckBox2.setSelected(true);
                flag =true;
            }
            else
            {
                jCheckBox2.setSelected(false);
            }
                        Statement stmt1 = con.createStatement();
            String q5 = "select available_appointment from doctordetails where special= '"+"master3"+"'";
            ResultSet sii = stmt.executeQuery(q5);
            if(sii.next())
            {
                String rs = sii.getString("available_appointment");
                r = Integer.parseInt(rs);
                System.out.println(r);
            }
            if(validate(r))
            {
                jCheckBox3.setSelected(true);
                flag =true;
            }
            else
            {
                jCheckBox3.setSelected(false);
            }
            
            
             Statement stmt2 = con.createStatement();
            String q6 = "select available_appointment from doctordetails where special= '"+"master4"+"'";
            ResultSet s1 = stmt.executeQuery(q6);
            if(s1.next())
            {
                String rs = s1.getString("available_appointment");
                r = Integer.parseInt(rs);
                System.out.println(r);
            }
            if(validate(r))
            {
                jCheckBox14.setSelected(true);
                flag =true;
            }
            else
            {
                jCheckBox14.setSelected(false);
            }
            
            
             Statement stmt3 = con.createStatement();
            String q7 = "select available_appointment from doctordetails where special= '"+"master5"+"'";
            ResultSet s2 = stmt.executeQuery(q7);
            if(s2.next())
            {
                String rs =s2.getString("available_appointment");
                r = Integer.parseInt(rs);
                System.out.println(r);
            }
            if(validate(r))
            {
                jCheckBox15.setSelected(true);
                flag =true;
            }
            else
            {
                jCheckBox15.setSelected(false);
            }
            
            
             Statement stmt4 = con.createStatement();
            String q8 = "select available_appointment from doctordetails where special= '"+"master6"+"'";
            ResultSet s3 = stmt.executeQuery(q8);
            if(s3.next())
            {
                String rs = s3.getString("available_appointment");
                r = Integer.parseInt(rs);
                System.out.println(r);
            }
            if(validate(r))
            {
                jCheckBox13.setSelected(true);
                flag =true;
            }
            else
            {
                jCheckBox13.setSelected(false);
            }
         }
         catch(Exception f)
         {
             System.out.println(f);
         }
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   // private void initComponents() {
  //      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private boolean validate(int n)
    {
        if(n > 0)
        {
            return true;
        }
        else
        {
            return false;
        }}

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setText("MASTER OF SURGERY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 599, -1));

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("NAME : DR.PRASATH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("AGE : 28");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 125, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setText("CONTACT NUMBER: 8763887233");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 420, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("STUDIED INSTUTITE: DINDUGAL MEDICAL COLLEGE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("EXPERIENCE : 5 YEARS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("NAME : DR.RAMANI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 290, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setText("AGE : 29");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 113, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setText("CONTACT NUMBER: 8783473474");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 430, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel10.setText("STUDIED INSTUTITE: SIVAGANGA MEDICAL COLLEGE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setText("EXPERIENCE : 4 YEARS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 300, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 40, 80, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox1.setText("2:00PM-2:30PM");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox2.setText("2:30PM-3:00PM");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox3.setText("3:00PM-3:30PM");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, 30));

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox13.setText("8:00PM-8:30PM");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 560, 150, -1));

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox14.setText("8:30PM-9:00PM");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 420, -1, -1));

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBox15.setText("9:00PM-9:30PM");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("APPOINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("APPOINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("APPOINT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setText("APPOINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton6.setText("APPOINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton7.setText("APPOINT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 570, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1550, 1220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
setVisible(false);
new DoctorDetails().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected()){
    jButton1.setVisible(true);
    jCheckBox1.setSelected(false);
// TODO add your handling code here:
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
if(jCheckBox2.isSelected()){
    jButton2.setVisible(true);
    jCheckBox2.setSelected(false);
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
if(jCheckBox3.isSelected()){
    jButton3.setVisible(true);
    jCheckBox3.setSelected(false);
// TODO add your handling code here:
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
if(jCheckBox15.isSelected()){
    jButton6.setVisible(true);
    jCheckBox15.setSelected(false);
    
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
if(jCheckBox13.isSelected()){
    jButton7.setVisible(true);
    jCheckBox13.setSelected(false);
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
if(jCheckBox14.isSelected()){
    jButton4.setVisible(true);
    jCheckBox14.setSelected(false);
// TODO add your handling code here:
    }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   setVisible(false);
      new master1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);
new master2().setVisible(true);
     // new master2().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
setVisible(false);
new master3().setVisible(true);
   //   new master3().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
setVisible(false);
new master4().setVisible(true);
    //  new master4().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
setVisible(false);
new master5().setVisible(true);
  //    new master5().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
setVisible(false);
new master6().setVisible(true);
  //    new master6().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MASTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  MASTER s = new MASTER();
                s.setVisible(true);
                s.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
