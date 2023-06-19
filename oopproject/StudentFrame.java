/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopproject;

import javax.swing.JOptionPane;

/**
 *
 * @author zubi1
 */
public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
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

        passwordjLabel = new javax.swing.JLabel();
        usernamejLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agejLabel = new javax.swing.JLabel();
        cnicjLabel = new javax.swing.JLabel();
        phonenojLabel = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        agejTextField1 = new javax.swing.JTextField();
        usernamejTextField1 = new javax.swing.JTextField();
        cnicjTextField2 = new javax.swing.JTextField();
        phonenumberjTextField3 = new javax.swing.JTextField();
        Submitbtn = new javax.swing.JButton();
        roomnoBox1 = new javax.swing.JComboBox<>();
        roomnojLabel1 = new javax.swing.JLabel();
        laundaryjCheckBox1 = new javax.swing.JCheckBox();
        messjCheckBox2 = new javax.swing.JCheckBox();
        backjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 200));

        passwordjLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordjLabel.setText("PASSWORD");

        usernamejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernamejLabel.setText("USERNAME");

        namejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namejLabel.setText("NAME       ");

        agejLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agejLabel.setText("AGE       ");

        cnicjLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cnicjLabel.setText("CNIC ");

        phonenojLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phonenojLabel.setText("PHONE NO");

        usernamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamejTextField1ActionPerformed(evt);
            }
        });

        Submitbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submitbtn.setText("SUBMIT");
        Submitbtn.setPreferredSize(new java.awt.Dimension(72, 23));
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });

        roomnoBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        roomnojLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        roomnojLabel1.setText("Room NO");

        laundaryjCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        laundaryjCheckBox1.setText("Laundary");

        messjCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        messjCheckBox2.setText("Mess");

        backjButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backjButton1.setText("back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(usernamejLabel)
                        .addGap(73, 73, 73)
                        .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(passwordjLabel)
                        .addGap(73, 73, 73)
                        .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(namejLabel)
                        .addGap(81, 81, 81)
                        .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(agejLabel)
                        .addGap(93, 93, 93)
                        .addComponent(agejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(cnicjLabel)
                        .addGap(108, 108, 108)
                        .addComponent(cnicjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(phonenojLabel)
                        .addGap(77, 77, 77)
                        .addComponent(phonenumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(roomnojLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(roomnoBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(laundaryjCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(messjCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamejLabel)
                    .addComponent(usernamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(passwordjLabel))
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(namejLabel))
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(agejLabel))
                    .addComponent(agejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cnicjLabel))
                    .addComponent(cnicjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(phonenojLabel))
                    .addComponent(phonenumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(roomnojLabel1))
                    .addComponent(roomnoBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laundaryjCheckBox1)
                    .addComponent(messjCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backjButton1))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
        Student s1 ;
        StudentOperations student = new StudentOperations();
        boolean checker = true;
        String username = usernamejTextField1.getText();
        String password = passwordjTextField.getText();
        String name = namejTextField.getText();
        int age =Integer.parseInt(agejTextField1.getText());
        if (age<16) {
            checker = false;
            JOptionPane.showMessageDialog(null, "sorry you are underage ");
            agejTextField1.setText("");
        } 
        String phoneNo = phonenumberjTextField3.getText();
        if (!student.phonenumberchecker(phoneNo)) {
            checker = false;
            JOptionPane.showMessageDialog(null, "phone number must be of length of 11 and only integers");
            phonenumberjTextField3.setText("");
        }
        int room = Integer.parseInt(roomnoBox1.getSelectedItem().toString());
        Rooms r1 = new Rooms(room);
        if (!r1.checkRoom()) {
            checker = false;
            JOptionPane.showMessageDialog(null, "sorry this room is not available ","Room availbility",1);
        }
        int fee = 12000;
        String cnic = cnicjTextField2.getText();
        if (!student.idchecker(cnic)) {
            checker = false;
            JOptionPane.showMessageDialog(null, "Cnic must be of length of 13 and only integers");
        }
        if(messjCheckBox2.isSelected()){
            fee+=5000;
        }
        if (laundaryjCheckBox1.isSelected()) {
            fee+=1000;
        }
        s1 = new Student(username, password, name, age, phoneNo, cnic, fee, r1);
        AdminOperations a1 = new AdminOperations();
        if (checker) {
            if (a1.addStudent(s1)) {
                JOptionPane.showMessageDialog(null, "student data saved .");
                clear();
            }
            
        }



    }//GEN-LAST:event_SubmitbtnActionPerformed
    public void clear(){
        usernamejTextField1.setText("");
        passwordjTextField.setText("");
        namejTextField.setText("");
        agejTextField1.setText("");
        phonenumberjTextField3.setText("");
        cnicjTextField2.setText("");
        laundaryjCheckBox1.setSelected(false);
        messjCheckBox2.setSelected(false);
    }

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        StudentLoginFrame student1 = new StudentLoginFrame();
        dispose();
        student1.setVisible(true);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void usernamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamejTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submitbtn;
    private javax.swing.JLabel agejLabel;
    private javax.swing.JTextField agejTextField1;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel cnicjLabel;
    private javax.swing.JTextField cnicjTextField2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox laundaryjCheckBox1;
    private javax.swing.JCheckBox messjCheckBox2;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JLabel phonenojLabel;
    private javax.swing.JTextField phonenumberjTextField3;
    private javax.swing.JComboBox<String> roomnoBox1;
    private javax.swing.JLabel roomnojLabel1;
    private javax.swing.JLabel usernamejLabel;
    private javax.swing.JTextField usernamejTextField1;
    // End of variables declaration//GEN-END:variables
}