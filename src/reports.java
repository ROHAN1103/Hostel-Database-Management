
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project1.ConnectionProvider;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author rohan
 */
public class reports extends javax.swing.JFrame {
    
public void werty()
{
    jComboBox2.removeAllItems();
        int i = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select  name from hosteldetailes  ");
            while (rs.next()) {
                i = 1;
                jComboBox2.addItem(rs.getString(1));
            }
            jComboBox2.addItem("All Hostels");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No Detailes");
        }
    
}
public void qwert()
{
     jComboBox1.removeAllItems();
        int i = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select distinct hostel from addmission");
            while (rs.next()) {
                i = 1;
                jComboBox1.addItem(rs.getString(1));
            }
            jComboBox1.addItem("All Hostels");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No Detailes");
        }
}
public void asdfg()
{
     jComboBox3.removeAllItems();
        int i = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select * from student1 where status='admitted'  ");
            while (rs1.next()) {
                i = 1;
                jComboBox3.addItem(rs1.getString(7));

            }
            jComboBox3.addItem("All Semester");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Detailes");
        }
}

public void zxcv()
{
    jComboBox4.removeAllItems();
        int i = 0;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st1 = con.createStatement();
            ResultSet rs4 = st1.executeQuery("select * from employe where status = 'working' ");
            while (rs4.next()) {
                i = 1;
                jComboBox4.addItem(rs4.getString(7));

            }
            jComboBox4.addItem("All Designations");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Detailes");
        }
    
}

    public void clear() {
        jComboBox1.removeAllItems();
        
        jComboBox3.removeAllItems();
    }

    /**
     * Creates new form reports
     */
    public reports() {
        initComponents();
        qwert();
        asdfg();
        zxcv();
        werty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20)); // NOI18N
        jLabel1.setText("Reports");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 14, 119, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Get Student Detailes  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 62, 168, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 100, 150, -1));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 156, 150, -1));

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("Search");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 150, 27));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "hostel", "roomnumber", "addmission id", "student ID", "name", "sem", "branch"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 656, 117));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("HOSTEL :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 100, 94, 27));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("SEMESTER :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 156, -1, 27));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-icon_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 6, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hostel", "Emp.Name", "Emp.ID", "Designation", "Salary"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 656, 131));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 236, 668, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 656, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 60, 8, 125));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Get Employee Detailes :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 60, 184, 24));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("HOSTEL :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 102, 115, 27));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 102, 148, 27));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("DESIGNATION :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 158, 129, 27));

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 158, 148, 27));

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Search");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 203, 148, 27));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Employee Detailes");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Student Detailes");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String hostel = (String) jComboBox1.getSelectedItem();
        String sem = (String) jComboBox3.getSelectedItem();
        if (sem == "All Semester" && hostel == "All Hostels") {
            try {

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs1 = st.executeQuery(" select a.hostel,a.roomnumber,a.aid,a.sid,s.name,s.sem,s.branch from addmission a,student1 s where  s.sid=a.sid and s.status='admitted'  order by roomnumber ");
                    while (rs1.next()) {
                        dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5), rs1.getString(6), rs1.getString(7)});

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e+"a");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e+"a");
            }
        }
        else if(sem == "All Semester")
        {
            try {

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs1 = st.executeQuery(" select a.hostel,a.roomnumber,a.aid,a.sid,s.name,s.sem,s.branch from addmission a,student1 s where a.hostel= '"+hostel+"' and s.sid=a.sid and s.status='admitted' order by roomnumber ");
                       
                        while (rs1.next())
                        {
                            
                            dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5), rs1.getString(6), rs1.getString(7)});
                           
                        }
                    } 
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e+"x");

                    }
                } 
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e+"X");
                }

            
            
        }
        
        else if(hostel == "All Hostels")
        {
            
                try {

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs1 = st.executeQuery(" select a.hostel,a.roomnumber,a.aid,a.sid,s.name,s.sem,s.branch from addmission a,student1 s where  s.sid=a.sid and s.status='admitted' and sem= '"+sem+"' order by roomnumber ");
                       
                        while (rs1.next())
                        {
                            dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5), rs1.getString(6), rs1.getString(7)});

                        }
                    } 
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e+"s");

                    }
                } 
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e+"s");
                }

            
            
        }
        
        
        else 
        {
            
                try {

                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    dtm.setRowCount(0);
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs1 = st.executeQuery(" select a.hostel,a.roomnumber,a.aid,a.sid,s.name,s.sem,s.branch from addmission a,student1 s where a.hostel='"+hostel+"' and s.sid=a.sid and s.status='admitted' and sem= '"+sem+"' order by roomnumber ");
                       
                        while (rs1.next())
                        {
                            dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5), rs1.getString(6), rs1.getString(7)});

                        }
                    } 
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e+"f");

                    }
                } 
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e+"f");
                }

            
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String hostel = (String) jComboBox2.getSelectedItem();
        String des = (String) jComboBox4.getSelectedItem();
        if (des == "All Designations" && hostel == "All Hostels") {
            try {

                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs1 = st.executeQuery(" select h.name,e.name,e.Eid,e.Designation,e.salary from employe e,hosteldetailes h where e.Hid=h.Hid order by h.name");
                    while (rs1.next()) {
                        dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5)});

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e+"a");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e+"a");
            }
        }
        else if(hostel == "All Hostels" ){
            try {

                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs1 = st.executeQuery(" select h.name,e.name,e.Eid,e.Designation,e.salary from employe e,hosteldetailes h where e.Hid=h.Hid and e.Designation='"+des+"' order by h.name");
                    while (rs1.next()) {
                        dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5)});

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e+"a");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e+"a");
            }
            
        }
        
        
        else if(des == "All Designations" ){
            try {

                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs1 = st.executeQuery(" select h.name,e.name,e.Eid,e.Designation,e.salary from employe e,hosteldetailes h where e.Hid=h.Hid and h.name='"+hostel+"' order by h.name");
                    while (rs1.next()) {
                        dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5)});

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e+"a");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e+"a");
            }
            
        }
        
        else {
            try {

                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs1 = st.executeQuery(" select h.name,e.name,e.Eid,e.Designation,e.salary from employe e,hosteldetailes h where e.Hid=h.Hid and h.name='"+hostel+"' and e.Designation='"+des+"' order by h.name");
                    while (rs1.next()) {
                        dtm.addRow(new Object[]{rs1.getString(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5)});

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e+"a");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e+"a");
            }
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
