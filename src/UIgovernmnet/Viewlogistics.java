/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UIgovernmnet;

import Bussiness.Government.governor;
import Fundraisingteam.Requestin;
import Model.Directoryinti;
import Model.Reportforlogistics;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devmi
 */
public class Viewlogistics extends javax.swing.JPanel {

         JPanel userProcessContainer;
Directoryinti diaster;
String id;
Directoryinti logrep;
Directoryinti gov;
Directoryinti volun;
Directoryinti request;
Double money;
String city;
    /**
     * Creates new form Governmentperson
     */
    public Viewlogistics(JPanel userProcessContainer, Directoryinti diaster, String id,Directoryinti gov, Directoryinti logrep, Directoryinti volun, Directoryinti request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diaster = diaster;
        this.id = id;
        this.logrep = logrep;
        this.gov = gov;   
                this.volun = volun;
this.request = request;
        populatetab();
        int m=0;

    }
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        txtdisid = new javax.swing.JTextField();
        txtvolreq = new javax.swing.JTextField();
        txtvehiclerq = new javax.swing.JTextField();
        txtshel = new javax.swing.JTextField();
        txtfundreq = new javax.swing.JTextField();
        txtfoodpackreq = new javax.swing.JTextField();
        txtmedicalsuppreq = new javax.swing.JTextField();
        txtbalnkreq = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIgovernmnet/Home.png"))); // NOI18N
        jButton8.setText("Home");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIgovernmnet/Make A Requestr.png"))); // NOI18N
        jButton9.setText("Make a Request");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIgovernmnet/View.png"))); // NOI18N
        jButton10.setText("View Past Requests");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIgovernmnet/View.png"))); // NOI18N
        jButton4.setText("View Logistic Reports");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdisid.setEditable(false);
        jPanel3.add(txtdisid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 162, -1));

        txtvolreq.setEditable(false);
        txtvolreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvolreqActionPerformed(evt);
            }
        });
        jPanel3.add(txtvolreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 162, -1));

        txtvehiclerq.setEditable(false);
        txtvehiclerq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvehiclerqActionPerformed(evt);
            }
        });
        jPanel3.add(txtvehiclerq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 162, -1));

        txtshel.setEditable(false);
        jPanel3.add(txtshel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 162, -1));

        txtfundreq.setEditable(false);
        jPanel3.add(txtfundreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 121, -1));

        txtfoodpackreq.setEditable(false);
        jPanel3.add(txtfoodpackreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 121, -1));

        txtmedicalsuppreq.setEditable(false);
        txtmedicalsuppreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicalsuppreqActionPerformed(evt);
            }
        });
        jPanel3.add(txtmedicalsuppreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 121, -1));

        txtbalnkreq.setEditable(false);
        jPanel3.add(txtbalnkreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 121, -1));

        jLabel3.setText("Disaster id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 76, -1));

        jLabel4.setText("Number of Volunters Required");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel5.setText("Number of Vehicles Required");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 160, -1));

        jLabel6.setText("Total fund for recovery");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 140, -1));

        jLabel7.setText("Number of Medical Supplies");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel9.setText("Number of shelters to be built");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 180, -1));

        jLabel11.setText("Number of food packets");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 140, -1));

        jLabel13.setText("Number of blankets");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Requried funds to be raised", "Required Number of Volunteers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 760, 170));

        jTextField1.setEditable(false);
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 160, -1));

        jLabel2.setText("Funds to be raised");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        jScrollPane3.setViewportView(jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Logistics Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void  populatetab(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0); 
    for(governor g: gov.getGov()){
        if(g.getLoginId().equals(id))
        {
            money = g.getMoney();
            city = g.getStateOfGov();
        }
    }
for (Reportforlogistics dis : logrep.getLogrep()) 
{
    if(dis.getStatus().equals("COMPLETE") && dis.getCity().equals(city)){
 
        Double b = -1 *((0.1) * money - dis.getCompensatation());
            Object[] row = new Object[3];
            row[0] = dis;
            if(b >0){
               row[1] = b;
                               jTextField1.setText(String.valueOf(b));

           }
           else{
                row[1] = 0;
                jTextField1.setText(String.valueOf(0));
           }
            row[2] = dis.getNumber_ofvolunteers();
            dtm.addRow(row);
    }
    }
    }
    
    private void txtvolreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvolreqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvolreqActionPerformed

    private void txtvehiclerqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvehiclerqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvehiclerqActionPerformed

    private void txtmedicalsuppreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicalsuppreqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicalsuppreqActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        Governmentperson panel = new Governmentperson(userProcessContainer,  diaster,  id, gov,logrep,volun,request);
        userProcessContainer.add("Governmentperson", panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Makeareq panel = new Makeareq(userProcessContainer,  diaster,  id, gov,logrep,volun,request);
        userProcessContainer.add("Makeareq", panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        Viewpastrequest panel = new Viewpastrequest(userProcessContainer,  diaster,  id, gov,logrep,volun,request);
        userProcessContainer.add("Viewpastrequest", panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Viewlogistics panel = new Viewlogistics(userProcessContainer,  diaster,  id, gov,logrep,volun,request);
        userProcessContainer.add("Governmentperson", panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row from table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Reportforlogistics d = (Reportforlogistics) model.getValueAt(selectedRow, 0);
            txtbalnkreq.setText(String.valueOf(d.getBlankets()));
            txtfoodpackreq.setText(String.valueOf(d.getFoodpackets()));
            txtfundreq.setText(String.valueOf(d.getCompensatation()));
            txtmedicalsuppreq.setText(String.valueOf(d.getMedicalsupplies()));
            txtshel.setText(String.valueOf(d.getPropertiy_sheltertobuils()));
            txtvehiclerq.setText(String.valueOf(d.getNumber_ofvehicles()));
            txtvolreq.setText(String.valueOf(d.getNumber_ofvolunteers()));
            txtdisid.setText(d.getDiaster_id());
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtbalnkreq;
    private javax.swing.JTextField txtdisid;
    private javax.swing.JTextField txtfoodpackreq;
    private javax.swing.JTextField txtfundreq;
    private javax.swing.JTextField txtmedicalsuppreq;
    private javax.swing.JTextField txtshel;
    private javax.swing.JTextField txtvehiclerq;
    private javax.swing.JTextField txtvolreq;
    // End of variables declaration//GEN-END:variables
}
