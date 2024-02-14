/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIers;

import Bussiness.EmergencyResponseTeam.Ersreport;
import Model.Directoryinti;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author devmi
 */
public class Viewthesave extends javax.swing.JPanel {

 JPanel userProcessContainer;
 Directoryinti ersreporters;
Directoryinti Persont;
Directoryinti logrep;
Directoryinti diaster;
String id;
String idd;

    /**
    
     */
    public Viewthesave(JPanel userProcessContainer,Directoryinti diaster,String id,Directoryinti Persont,Directoryinti ersreporters, String idd) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diaster = diaster;
        this.id = id;
        this.Persont = Persont;
        this.ersreporters = ersreporters;
        this.idd = idd;
        populatetexts();
    }
    
      public void populatetexts(){
         
         for(Ersreport d : ersreporters.getErsreporters())
         {
             if(d.getDiaster_id().equals(idd)){
             
            jTextField1.setText(id);
                txtedt.setText(d.getEnddatetime());
                txtmag.setText(String.valueOf(d.getMagnitude()));
                txtnetpropdmg.setText(String.valueOf(d.getPropertiy_dmg()));
                txtnooffpplwithminorinj.setText(String.valueOf(d.getNumber_ofminorinjuries()));
                txtnopplaffec.setText(String.valueOf(d.getNumber_ofpplaffected()));
                txtnopplincriticalcond.setText(String.valueOf(d.getNumber_ofpplcriticalcndition()));
                txtnopplmiss.setText(String.valueOf(d.getNumberpplmisssing()));
                txtstdandedt.setText(d.getStartdatetime());
                tctnochildaffec.setText(String.valueOf(d.getNumber_ofchildaffected()));
                jTextField2.setText(d.getSeverity());
             }
         }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        txtnopplaffec = new javax.swing.JTextField();
        tctnochildaffec = new javax.swing.JTextField();
        txtnetpropdmg = new javax.swing.JTextField();
        txtnopplincriticalcond = new javax.swing.JTextField();
        txtnooffpplwithminorinj = new javax.swing.JTextField();
        txtstdandedt = new javax.swing.JTextField();
        txtedt = new javax.swing.JTextField();
        txtmag = new javax.swing.JTextField();
        txtnopplmiss = new javax.swing.JTextField();
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
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 162, -1));
        jPanel2.add(txtnopplaffec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 162, -1));

        tctnochildaffec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tctnochildaffecActionPerformed(evt);
            }
        });
        jPanel2.add(tctnochildaffec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 162, -1));
        jPanel2.add(txtnetpropdmg, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 162, -1));

        txtnopplincriticalcond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnopplincriticalcondActionPerformed(evt);
            }
        });
        jPanel2.add(txtnopplincriticalcond, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 162, -1));
        jPanel2.add(txtnooffpplwithminorinj, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 162, -1));

        txtstdandedt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdandedtActionPerformed(evt);
            }
        });
        jPanel2.add(txtstdandedt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 160, -1));

        txtedt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedtActionPerformed(evt);
            }
        });
        jPanel2.add(txtedt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 160, -1));

        txtmag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmagActionPerformed(evt);
            }
        });
        jPanel2.add(txtmag, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 160, -1));

        txtnopplmiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnopplmissActionPerformed(evt);
            }
        });
        jPanel2.add(txtnopplmiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 160, -1));

        jLabel2.setText("Disaster Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 76, -1));

        jLabel3.setText("Total Number People Affected:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, -1));

        jLabel4.setText("Number of Children Affected");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, -1));

        jLabel5.setText("Net Property Damage");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 140, -1));

        jLabel6.setText("End Date and Time");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 110, -1));

        jLabel7.setText("Number of People Missing");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        jLabel8.setText("Start Date and Time");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 120, -1));

        jLabel9.setText("Number of People In Critical Condition:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 220, -1));

        jLabel10.setText("Number of People with Minor Injuries");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 230, 40));

        jLabel11.setText("Magnitude");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 85, -1));

        jLabel12.setText("Severity");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 85, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ERS Report");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 110));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, 150, -1));

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnopplmissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnopplmissActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnopplmissActionPerformed

    private void txtmagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmagActionPerformed

    private void txtedtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedtActionPerformed

    private void txtstdandedtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdandedtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstdandedtActionPerformed

    private void txtnopplincriticalcondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnopplincriticalcondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnopplincriticalcondActionPerformed

    private void tctnochildaffecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tctnochildaffecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tctnochildaffecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField tctnochildaffec;
    private javax.swing.JTextField txtedt;
    private javax.swing.JTextField txtmag;
    private javax.swing.JTextField txtnetpropdmg;
    private javax.swing.JTextField txtnooffpplwithminorinj;
    private javax.swing.JTextField txtnopplaffec;
    private javax.swing.JTextField txtnopplincriticalcond;
    private javax.swing.JTextField txtnopplmiss;
    private javax.swing.JTextField txtstdandedt;
    // End of variables declaration//GEN-END:variables
}