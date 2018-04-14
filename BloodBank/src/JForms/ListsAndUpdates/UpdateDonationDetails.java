/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JForms.ListsAndUpdates;

import JForms.Pages.donorPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UpdateDonationDetails extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonorInfo
     */
    public UpdateDonationDetails() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_DNo = new javax.swing.JTextField();
        txt_BagNumber = new javax.swing.JTextField();
        txt_Hospital = new javax.swing.JTextField();
        txt_CollectionDate = new javax.swing.JTextField();
        txt_GivingDate = new javax.swing.JTextField();
        txt_GivenAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Donation Number:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(36, 76, 156, 22);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bag Number:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(36, 122, 156, 22);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospital:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(36, 161, 156, 22);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Collection Date:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(36, 213, 156, 22);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Giving Date:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(36, 259, 156, 22);

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Given Amount:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(36, 305, 156, 22);

        txt_DNo.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_DNo);
        txt_DNo.setBounds(318, 73, 148, 28);

        txt_BagNumber.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_BagNumber);
        txt_BagNumber.setBounds(318, 119, 148, 28);

        txt_Hospital.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_Hospital);
        txt_Hospital.setBounds(318, 158, 148, 28);

        txt_CollectionDate.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_CollectionDate);
        txt_CollectionDate.setBounds(318, 210, 148, 28);

        txt_GivingDate.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jPanel1.add(txt_GivingDate);
        txt_GivingDate.setBounds(318, 256, 148, 28);

        txt_GivenAmount.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        txt_GivenAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GivenAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txt_GivenAmount);
        txt_GivenAmount.setBounds(318, 302, 148, 28);

        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(44, 386, 93, 31);

        btn_update.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(318, 386, 148, 31);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 540, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try{
            
            
            /*DonationNumber int identity(20000,1) not null primary key,
	    BagNumber int foreign key references BloodInventory(BagNumber),
        Hospital varchar(1000),
        CollectionDate date,
        GivingDate date,
        GivenAmount int*/
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=12345;" +
            "databaseName=BloodBank;");
            
            Statement statement = connection.createStatement();  
            String ID = txt_DNo.getText().toString();
            int iDnumber = Integer.parseInt(ID);
           // String phoneNumber = txt_phone.getText().toString();
           // int PhoneNum = Integer.parseInt(phoneNumber);
            //String query= "update donor set DonorName='"+txt_name.getText().toString()+"',DonorArea='"+txt_area.getText().toString()+"', DonorAddress='"+txt_address.getText().toString()+"', DonorGender= '"+txt_gender.getText().toString()+"' ,DonorBloodGroup='"+txt_blood.getText().toString()+"',DonorPhoneNumber="+PhoneNum+" where DonorID="+iDnumber;
            String query1="update DonationDetails set Hospital='"+txt_Hospital.getText().toString()+"', CollectionDate='"+txt_CollectionDate.getText().toString()+"', GivingDate= '"+txt_GivingDate.getText().toString()+"' ,GivenAmount='"+txt_GivenAmount.getText().toString()+"'where DonationNumber='"+ID+"';";
            statement.execute(query1);
            JOptionPane.showMessageDialog(null, "Update Successful!");
              
              DonationDetailsList window;
              window = new DonationDetailsList();
             window.setVisible(true);
             this.setVisible(false);
              
        }catch (Exception e) {  
             e.printStackTrace();
             JOptionPane.showMessageDialog(null, "exception");
         }
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        donorList window;
        window = new donorList();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_GivenAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GivenAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GivenAmountActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonationDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_BagNumber;
    public javax.swing.JTextField txt_CollectionDate;
    public javax.swing.JTextField txt_DNo;
    public javax.swing.JTextField txt_GivenAmount;
    public javax.swing.JTextField txt_GivingDate;
    public javax.swing.JTextField txt_Hospital;
    // End of variables declaration//GEN-END:variables
}