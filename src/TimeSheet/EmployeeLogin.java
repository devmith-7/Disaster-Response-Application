/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TimeSheet;

/**
 *
 * @author prana
 */
public class EmployeeLogin extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public EmployeeLogin() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Username:");
        jLabel2.setMaximumSize(new java.awt.Dimension(550, 512));
        jLabel2.setMinimumSize(new java.awt.Dimension(550, 512));

        jLabel3.setText("Password:");
        jLabel3.setMaximumSize(new java.awt.Dimension(550, 512));
        jLabel3.setMinimumSize(new java.awt.Dimension(550, 512));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Doctor", "Nurse" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Timesheet Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
//        String un =user.getText();
//        String p= pass.getText();
//        String entity_type = (String) jComboBox1.getSelectedItem();
//
//        try{ Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?useSSL=false&serverTimezone=UTC","root","root");
//            Statement st=conn.createStatement();
//            //            entity_type == "Admin"
//            if(entity_type.equals("Admin")){
//                String sql="select * from user_login";
//
//                ResultSet rs= st.executeQuery(sql);
//                while(rs.next()){
//                    String username=rs.getString("username");
//                    String password=rs.getString("password");
//
//                    if(un.equals(username) && p.equals(password)){
//                        JPanel welcomePageJPanel = new WelcomePageJPanel(mainWorkArea,dd);
//                        mainWorkArea.add("WelcomePageJPanel", welcomePageJPanel);
//                        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//                        layout.next(mainWorkArea);
//
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(this, "Wrong username and password");
//                    }
//                }
//            }
//            else if (entity_type.equals("Doctor")){
//                int count =0;
//                String sql="select * from doctor_userlogin";
//
//                ResultSet rs= st.executeQuery(sql);
//                while(rs.next()){
//                    String username=rs.getString("username");
//                    String password=rs.getString("password");
//
//                    if(un.equals(username) && p.equals(password)){
//                        count++;
//                        JPanel doctorDashboardJPanel = new DoctorDashboardJPanel(mainWorkArea,dd);
//                        mainWorkArea.add("DoctorDashboardJPanel", doctorDashboardJPanel);
//                        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//                        layout.next(mainWorkArea);
//
//                    }
//
//                }
//                if(count==0) JOptionPane.showMessageDialog(this, "Wrong username and password");
//
//            }
//            else if (entity_type.equals("Patient")){
//                String sql="select * from paitient_userlogin";
//                int count =0;
//                ResultSet rs= st.executeQuery(sql);
//                while(rs.next()){
//                    String username=rs.getString("username");
//                    String password=rs.getString("password");
//
//                    if(un.equals(username) && p.equals(password)){
//                        JPanel patientDashboardJPanel = new PatientDashboardJPanel(mainWorkArea,dd);
//                        mainWorkArea.add("PatientDashboardJPanel", patientDashboardJPanel);
//                        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//                        layout.next(mainWorkArea);
//                        count++;
//                    }
//
//                }
//                if(count==0) JOptionPane.showMessageDialog(this, "Wrong username and password");
//            }
//            else if (entity_type.equals("Donor")){
//                int count =0;
//                String sql="select * from donor_userlogin";
//
//                ResultSet rs= st.executeQuery(sql);
//                while(rs.next()){
//                    String username=rs.getString("username");
//                    String password=rs.getString("password");
//
//                    if(un.equals(username) && p.equals(password)){
//                        JPanel donorDashboardJPanel = new DonorDashboardJPanel(mainWorkArea,dd);
//                        mainWorkArea.add("DonorDashboardJPanel", donorDashboardJPanel);
//                        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
//                        layout.next(mainWorkArea);
//                        count++;
//                    }
//
//                }
//                if(count==0) JOptionPane.showMessageDialog(this, "Wrong username and password");
//            }
//            else{
//                JOptionPane.showMessageDialog(null,"Please choose an entity type!!");
//            }
//
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e.getMessage());
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        user.setText("");
        pass.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
