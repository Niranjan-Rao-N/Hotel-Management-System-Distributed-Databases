/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.net.ConnectException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.driver.OracleDriver;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hitman
 */
public class PaymentFrame extends javax.swing.JFrame {
Connection connect;

    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    Connection connectdb2;
    /**
     * Creates new form PaymentFrame
     */
    public PaymentFrame() {
        initComponents();
    }
    public PaymentFrame(Connection connect,Connection connectdb2) {
        initComponents();
        this.connect=connect;
        this.connectdb2=connectdb2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHomeScreen = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jView = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jInsert = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPayments = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jHomeScreen.setBackground(new java.awt.Color(255, 255, 51));
        jHomeScreen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jHomeScreen.setForeground(new java.awt.Color(255, 0, 0));
        jHomeScreen.setText("Home Screen");
        jHomeScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeScreenActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(255, 255, 0));
        jDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 51, 51));
        jDelete.setText("DELETE");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PAYMENT_ID ", "BOOKING_ID ", "PAYMENT_DATE ", "PAYMENT_METHOD ", "PAYMENT_AMT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jView.setBackground(new java.awt.Color(255, 255, 0));
        jView.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jView.setForeground(new java.awt.Color(255, 51, 51));
        jView.setText("VIEW");
        jView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewActionPerformed(evt);
            }
        });

        jClear.setBackground(new java.awt.Color(255, 255, 0));
        jClear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jClear.setForeground(new java.awt.Color(255, 51, 51));
        jClear.setText("CLEAR");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jInsert.setBackground(new java.awt.Color(255, 255, 0));
        jInsert.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jInsert.setForeground(new java.awt.Color(255, 51, 51));
        jInsert.setText("INSERT");
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("PaymentID Record to Delete");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("View Unpaid Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER_ID", "ROOM_ID", "CHECK_OUT_DATE", "TOTAL_AMT", "PAYMENT_STATUS"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("PAYMENT_ID");

        jLabel2.setText("BOOKING_ID");

        jLabel3.setText("PAYMENT_DATE");

        jLabel4.setText("PAYMENT_METHOD");

        jLabel5.setText("PAYMENT_AMT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_ID", "CUST_FIRSTNAME", "BOOKING_ID", "PAYMENT_Date", "PAYMENT_METHOD", "PAYMENT_AMT"
            }
        ));
        jScrollPane3.setViewportView(jPayments);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Payments");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jView, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jView, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jInsert)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeScreenActionPerformed
        WelcomePage wl=new WelcomePage(connect,connectdb2);
        wl.setVisible(true);
        wl.clock();
        closeWelcome();
        
    }//GEN-LAST:event_jHomeScreenActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        DefaultTableModel dtm= (DefaultTableModel)jTable1.getModel();
        while ( dtm.getRowCount()>0)
        {
                    for(int i=0;i<dtm.getRowCount();i++){
                        dtm.removeRow(i);
                        
                 }
         }
    }//GEN-LAST:event_jClearActionPerformed

    private void jViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewActionPerformed
        populateTable();
    }//GEN-LAST:event_jViewActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
         try{
            stmt = connect.createStatement();
            String query="delete from Payment where PAYMENT_ID  = "+ jTextField6.getText();
            System.out.println(query);
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Record deleted from database", "delete Success", JOptionPane.INFORMATION_MESSAGE);
          
           
           
          
           
        }
        catch (SQLException f) {
            System.out.println(f.getMessage());
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Statement stmt = connect.createStatement();
           
           rs=stmt.executeQuery("select CUSTOMER_ID,ROOM_ID,CHECK_OUT_DATE,TOTAL_AMT,PAYMENT_STATUS from  Booking_Details b , payment p where b.booking_id=p.booking_id and payment_Status='PENDING'");
            
              while (rs.next()) {
                String CUSTOMER_ID  = rs.getString(1);
                String ROOM_ID  = rs.getString(2);
                String CHECK_OUT_DATE  = rs.getString(3).substring(0,10);
                String TOTAL_AMT  = rs.getString(4);
                String PAYMENT_STATUS  = rs.getString(5);
              
                Object[] content = {CUSTOMER_ID, ROOM_ID, CHECK_OUT_DATE, TOTAL_AMT, PAYMENT_STATUS};
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.addRow(content);
            }
          
           
        }
        catch (SQLException f) {
            System.out.println(f.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
        insertData();
        
          try{
            stmt = connect.createStatement();
            String q="select customer_id from booking_details where BOOKING_ID="+jTextField2.getText();
           rs=stmt.executeQuery(q);
           String CUSTOMER_ID  = rs.getString(1);
           
            
            String query="UPDATE CUSTOMER SET CUST_MEMBERSHIP_CREDITS= (select cust_membership_credits from customer where cust_id="+CUSTOMER_ID+")+150";
            System.out.println(query);
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Rewards to customer has been awarded", "Success", JOptionPane.INFORMATION_MESSAGE);
          
           
           
          
           
        }
        catch (SQLException f) {
            System.out.println(f.getMessage());
        }
    }//GEN-LAST:event_jInsertActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Statement stmt = connect.createStatement();
           String q=" select CUSTOMER_ID,ROOM_ID,CHECK_OUT_DATE,TOTAL_AMT,PAYMENT_STATUS from payment p,BOOKING_DETAILS b,CUSTOMER c where c.CUST_ID=b.CUSTOMER_ID and b.BOOKING_ID=p.BOOKING_ID ";
           
           System.out.println(q);
                                 rs=stmt.executeQuery(q);
            
              while (rs.next()) {
                String CUSTOMER_ID  = rs.getString(1);
                
                String ROOM_ID  = rs.getString(2);
                String CHECK_OUT_DATE  = rs.getString(3);
                String TOTAL_AMT  = rs.getString(4);
                String PAYMENT_STATUS  = rs.getString(5);
                 String PAYMENT_AMT  = rs.getString(6);
              
                Object[] content = {CUSTOMER_ID, ROOM_ID, CHECK_OUT_DATE, TOTAL_AMT, PAYMENT_STATUS,PAYMENT_AMT};
                DefaultTableModel model = (DefaultTableModel) jPayments.getModel();
                model.addRow(content);
            }
        }  catch(Exception e){}
              
            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentFrame().setVisible(true);
            }
        });
    }
    
    
    private void closeWelcome()
{
    WindowEvent winClose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
}
    
    
     public void populateTable() {
        try {

            Statement stmt = connect.createStatement();
            rs = stmt.executeQuery("select * from PAYMENT");
            while (rs.next()) {
                String PAYMENT_ID  = rs.getString(1);
                String BOOKING_ID  = rs.getString(2);
                String PAYMENT_DATE  = rs.getString(3).substring(0,10);
                String PAYMENT_METHOD  = rs.getString(4);
                String PAYMENT_AMT  = rs.getString(5);
              
                Object[] content = {PAYMENT_ID, BOOKING_ID, PAYMENT_DATE, PAYMENT_METHOD, PAYMENT_AMT};
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(content);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        }
     
         private void insertData() {
        try {
            String Field1 = "";
            String Field2 = "";
            String Field3 = "";
            String Field4 = "";
            String Field5 = "";
            
            Field1 = jTextField1.getText().toString();
            Field2 = jTextField2.getText().toString();
            Field3 = jTextField3.getText().toString();
            Field4 = jTextField4.getText().toString();
            Field5 = jTextField5.getText().toString();
    
            Statement stmt = connect.createStatement();

            String query ="INSERT INTO PAYMENT VALUES("+"PAYMENT_NO_SEQ.nextval"+ "," + Field2 + ","+ "(TO_DATE("+"'"+Field3+"'"+","+"'yyyy/mm/dd'))"+ "," + "'" + Field4 + "'" + "," + Field5+ ")" ;
            System.out.println(query);
            stmt.executeUpdate(query);
            stmt.execute("commit");
            tableClear();
            populateTable();
            

        } catch (SQLException f) {
            System.out.println(f.getMessage());
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
        JOptionPane.showMessageDialog(null, "One Record Inserted into the database .!!", "Insert Success", JOptionPane.INFORMATION_MESSAGE);

    }
         
         
          public void tableClear()
    {
         DefaultTableModel dtm= (DefaultTableModel)jTable1.getModel();
        while ( dtm.getRowCount()>0)
        {
                    for(int i=0;i<dtm.getRowCount();i++){
                        dtm.removeRow(i);
                        
                 }
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jHomeScreen;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jPayments;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jView;
    // End of variables declaration//GEN-END:variables
}
