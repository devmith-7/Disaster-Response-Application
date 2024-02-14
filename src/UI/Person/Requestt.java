 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Person;

import Bussiness.EmergencyResponseTeam.Ersreport;
import Bussiness.SearchandResue.Searchreq;
import Model.Directoryinti;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author devmi
 */
public class Requestt extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
   Directoryinti searchandrescue;
    JPanel userProcessContainer;
String id;
Directoryinti person;
Directoryinti volun;
String name;
int n=0;
/**
     * Creates new form NewJPanel1
     */
    public Requestt(JPanel userProcessContainer, String id, Directoryinti person, Directoryinti volun,Directoryinti searchandrescue,String name) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.id =id;
        this.person = person;
        this.volun = volun;
        this.searchandrescue = searchandrescue;
        this.name = name;
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
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        subjectTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        postRequestBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Customer Work Area");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 88, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1531, 76));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Subject : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 20));
        jPanel1.add(subjectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 222, -1));

        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setRows(5);
        jScrollPane3.setViewportView(descriptionJTextArea);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 450, 150));

        jLabel2.setText("Description :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Location    :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));
        jPanel1.add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 222, -1));

        postRequestBtn.setBackground(new java.awt.Color(204, 255, 204));
        postRequestBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        postRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Person/post.png"))); // NOI18N
        postRequestBtn.setText("Post Request");
        postRequestBtn.setBorder(new javax.swing.border.MatteBorder(null));
        postRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postRequestBtnActionPerformed(evt);
            }
        });
        jPanel1.add(postRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 222, 40));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1047, 473, 467, 429));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void postRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postRequestBtnActionPerformed
       if(subjectTextField.getText().isEmpty() || descriptionJTextArea.getText().isEmpty() || locationTextField.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Any of the above field(s) can't be Empty", "Warning", JOptionPane.WARNING_MESSAGE);
} else {
   
    Searchreq usc = searchandrescue.addNewrequestinsearchandres();
    
    usc.setCustomerid(id); 
    usc.setDecription(descriptionJTextArea.getText());
    usc.setLocation(locationTextField.getText());
    usc.setUserid("NA"); 
    usc.setSubject(subjectTextField.getText());
    usc.setStatus("NA"); 
    usc.setNameofuser(name); 

    JOptionPane.showMessageDialog(null, "Request added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
}

        
    }//GEN-LAST:event_postRequestBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton postRequestBtn;
    private javax.swing.JTextField subjectTextField;
    // End of variables declaration//GEN-END:variables
}
