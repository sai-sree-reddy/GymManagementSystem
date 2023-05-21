/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Customer.UserInterface;

import Course.CourseDirectory;
import Enterprise.Enterprise;
import Enterprise.FitnessEnterprise;
import Enterprise.OnlineSalesEnterprise;
import Model.EcoSystem;
import Network.Network;
import Organization.CustomerOrg;
import Sale.OnlineSales;
import UserAccount.UserAcnt;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author sanja
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private UserAcnt account;
    private Network network;
    private CourseDirectory myCourse;
    private EcoSystem ecoSystem;
    private HashMap<OnlineSales, Integer> cart;

    /**
     * Creates new form CustomerMain
     */
    public CustomerAreaJPanel(JPanel container, UserAcnt account, CustomerOrg organization,
            Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        initComponents();
        this.container = container;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.network = network;
        myCourse = new CourseDirectory();
        this.cart = new HashMap();
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
        btnRequest = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReserveCourse = new javax.swing.JButton();
        btnCheckHistory = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BtnOrderOnline = new javax.swing.JButton();
        BtnViewOrder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(43, 45, 66));

        jPanel2.setBackground(new java.awt.Color(242, 233, 228));

        btnRequest.setBackground(new java.awt.Color(202, 97, 71));
        btnRequest.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(242, 233, 228));
        btnRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-request-58.png"))); // NOI18N
        btnRequest.setText("    Request an appointment");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Select a Trainer with you:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Freedom from Self-Decipline");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(jLabel3)))
                        .addGap(0, 240, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hi!");

        jPanel3.setBackground(new java.awt.Color(242, 233, 228));

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Public Class");

        btnReserveCourse.setBackground(new java.awt.Color(202, 97, 71));
        btnReserveCourse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnReserveCourse.setForeground(new java.awt.Color(242, 233, 228));
        btnReserveCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-reserve-48.png"))); // NOI18N
        btnReserveCourse.setText("Reserve Fitness Class");
        btnReserveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveCourseActionPerformed(evt);
            }
        });

        btnCheckHistory.setBackground(new java.awt.Color(202, 97, 71));
        btnCheckHistory.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCheckHistory.setForeground(new java.awt.Color(242, 233, 228));
        btnCheckHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-checkmark-64.png"))); // NOI18N
        btnCheckHistory.setText("Check Class History");
        btnCheckHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReserveCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReserveCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheckHistory)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(242, 233, 228));

        BtnOrderOnline.setBackground(new java.awt.Color(202, 97, 71));
        BtnOrderOnline.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BtnOrderOnline.setForeground(new java.awt.Color(242, 233, 228));
        BtnOrderOnline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-shopping-cart-50 (1).png"))); // NOI18N
        BtnOrderOnline.setText("      Buy from Online");
        BtnOrderOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderOnlineActionPerformed(evt);
            }
        });

        BtnViewOrder.setBackground(new java.awt.Color(202, 97, 71));
        BtnViewOrder.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BtnViewOrder.setForeground(new java.awt.Color(242, 233, 228));
        BtnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-online-store-50.png"))); // NOI18N
        BtnViewOrder.setText("  View Online Orders");
        BtnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewOrderActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Online Store");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(BtnOrderOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnOrderOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnViewOrder)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(858, 858, 858))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1974, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof FitnessEnterprise){
                RequestTrainerJPanel makeRequestJPanel = new RequestTrainerJPanel(container, account, (FitnessEnterprise) ent);
                container.add("makeRequestJPanel", makeRequestJPanel);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnReserveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveCourseActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof FitnessEnterprise){
                ReserveCourseJPanel reverseClassJPanel = new ReserveCourseJPanel(container, account, myCourse, (FitnessEnterprise) ent);
                container.add("reverseClassJPanel", reverseClassJPanel);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }
        }
    }//GEN-LAST:event_btnReserveCourseActionPerformed

    private void btnCheckHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckHistoryActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof FitnessEnterprise){
                CourseViewJPanel courseHistoryViewJPanel = new CourseViewJPanel(container, account, (FitnessEnterprise) ent);
                container.add("courseHistoryViewJPanel", courseHistoryViewJPanel);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }
        }
    }//GEN-LAST:event_btnCheckHistoryActionPerformed

    private void BtnOrderOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderOnlineActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof OnlineSalesEnterprise){
                OrderItemJPanel orderItemJPanel = new OrderItemJPanel(container, account, cart, (OnlineSalesEnterprise) ent);
                container.add("orderItemJPanel", orderItemJPanel);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }
        }
    }//GEN-LAST:event_BtnOrderOnlineActionPerformed

    private void BtnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewOrderActionPerformed
        // TODO add your handling code here:

        ViewOnlineOrderJPanel viewOrderJPanel = new ViewOnlineOrderJPanel(container, account);
        container.add("viewOrderJPanel", viewOrderJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

    }//GEN-LAST:event_BtnViewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOrderOnline;
    private javax.swing.JButton BtnViewOrder;
    private javax.swing.JButton btnCheckHistory;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnReserveCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}