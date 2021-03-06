/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrichor;

import javax.swing.JOptionPane;

/**
 *
 * @author Gareth
 */
public class NewUser extends javax.swing.JFrame {

    private AllUsers users = new AllUsers();
    private User editingUser = null;
    boolean editing;

    /**
     * Creates new form NewJFrame
     */
    public NewUser() {
        initComponents();
        editing = false;
    }

    public NewUser(User userToEdit) {
        initComponents();
        usernameField.setText(userToEdit.getUsername());
        emailField.setText(userToEdit.getEmail());
        passwordField.setText(userToEdit.getPassword());
        confirmPasswordField.setText(userToEdit.getPassword());
        editingUser = userToEdit;
        editing = true;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        username_label = new javax.swing.JLabel();
        decoration_label = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        underlineEmail = new javax.swing.JLabel();
        underlineUsername = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        password_label = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        underlinePassword = new javax.swing.JLabel();
        confirmPassword_label = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JTextField();
        underlineConfirmPassword = new javax.swing.JLabel();
        loginHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 50, 50));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));

        username_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username_label.setForeground(new java.awt.Color(100, 100, 100));
        username_label.setText("Username");

        decoration_label.setForeground(new java.awt.Color(26, 188, 156));
        decoration_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/login.jpg"))); // NOI18N
        decoration_label.setText("jLabel1");
        decoration_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        emailField.setBackground(new java.awt.Color(50, 50, 50));
        emailField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailField.setForeground(new java.awt.Color(150, 150, 150));
        emailField.setToolTipText("");
        emailField.setBorder(null);
        emailField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        email_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_label.setForeground(new java.awt.Color(100, 100, 100));
        email_label.setText("Email");

        usernameField.setBackground(new java.awt.Color(50, 50, 50));
        usernameField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernameField.setForeground(new java.awt.Color(150, 150, 150));
        usernameField.setToolTipText("");
        usernameField.setBorder(null);
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        underlineEmail.setBackground(new java.awt.Color(150, 150, 150));
        underlineEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        underlineEmail.setForeground(new java.awt.Color(150, 150, 150));
        underlineEmail.setText("_______________________________");
        underlineEmail.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        underlineUsername.setBackground(new java.awt.Color(150, 150, 150));
        underlineUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        underlineUsername.setForeground(new java.awt.Color(150, 150, 150));
        underlineUsername.setText("_______________________________");
        underlineUsername.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmButton.setBackground(new java.awt.Color(50, 50, 50));
        confirmButton.setForeground(new java.awt.Color(50, 50, 50));
        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/button_create-user (2).png"))); // NOI18N
        confirmButton.setBorder(null);
        confirmButton.setBorderPainted(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setForeground(new java.awt.Color(50, 50, 50));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/button_cancel (2).png"))); // NOI18N
        cancel.setToolTipText("");
        cancel.setBorder(null);
        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.setFocusPainted(false);
        cancel.setFocusable(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        closeButton.setForeground(new java.awt.Color(100, 100, 100));
        closeButton.setText("x");
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setFocusable(false);
        closeButton.setSelected(true);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        password_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_label.setForeground(new java.awt.Color(100, 100, 100));
        password_label.setText("Password");

        passwordField.setBackground(new java.awt.Color(50, 50, 50));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordField.setForeground(new java.awt.Color(150, 150, 150));
        passwordField.setToolTipText("");
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        underlinePassword.setBackground(new java.awt.Color(150, 150, 150));
        underlinePassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        underlinePassword.setForeground(new java.awt.Color(150, 150, 150));
        underlinePassword.setText("_______________________________");
        underlinePassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmPassword_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmPassword_label.setForeground(new java.awt.Color(100, 100, 100));
        confirmPassword_label.setText("Confirm Password");

        confirmPasswordField.setBackground(new java.awt.Color(50, 50, 50));
        confirmPasswordField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(150, 150, 150));
        confirmPasswordField.setToolTipText("");
        confirmPasswordField.setBorder(null);
        confirmPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        underlineConfirmPassword.setBackground(new java.awt.Color(150, 150, 150));
        underlineConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        underlineConfirmPassword.setForeground(new java.awt.Color(150, 150, 150));
        underlineConfirmPassword.setText("_______________________________");
        underlineConfirmPassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        loginHelp.setBackground(new java.awt.Color(60, 60, 60));
        loginHelp.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        loginHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petrichor/pictures/help-circle-outline.png"))); // NOI18N
        loginHelp.setBorder(null);
        loginHelp.setContentAreaFilled(false);
        loginHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(decoration_label, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 87, Short.MAX_VALUE)
                        .addComponent(cancel)
                        .addGap(78, 78, 78)
                        .addComponent(confirmButton)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(loginHelp)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email_label)
                                    .addComponent(username_label)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(underlineEmail)
                                    .addComponent(underlineUsername)
                                    .addComponent(confirmPassword_label)
                                    .addComponent(password_label)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(underlineConfirmPassword)
                                    .addComponent(underlinePassword))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_label))
                    .addComponent(loginHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(underlineUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(underlineEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(underlinePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(confirmPassword_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(underlineConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(confirmButton))
                .addGap(85, 85, 85))
            .addComponent(decoration_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if (!editing) {
            new Login().setVisible(true);
            this.dispose();
        } else {

            new MainUI(editingUser).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if (!usernameField.getText().isEmpty() && !passwordField.getText().isEmpty() && !emailField.getText().isEmpty() && !confirmPasswordField.getText().isEmpty()) {
            if (usernameField.getText().contains("'") || passwordField.getText().contains("'") || emailField.getText().contains("'") || confirmPasswordField.getText().contains("'")) {
                JOptionPane.showMessageDialog(null, "Please ensure none of the fields contain the ' character");
                return;
            }
            if (!passwordField.getText().equals(confirmPasswordField.getText())) {
                JOptionPane.showMessageDialog(null, "Your password and confirm password field do not match.");
                return;
            }
            if (!emailField.getText().contains("@") && !emailField.getText().contains(".")) {
                JOptionPane.showMessageDialog(null, "Please ensure you enter a valid email address");
                return;
            }
            if (!editing) {
                if (users.addUser(usernameField.getText(), passwordField.getText(), emailField.getText())) {
                    MainUI main = new MainUI(users.getUser(usernameField.getText(), passwordField.getText()));
                    main.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "That username is taken");
                }
            } else {
                if (users.updateUser(editingUser.getID(), usernameField.getText(), passwordField.getText(), emailField.getText()) != null) {
                    new MainUI(users.getUser(editingUser.getID())).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "The username you are trying to change to is taken");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please ensure you have entered all of your credentials");
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void loginHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginHelpActionPerformed
        if (!editing) {
            JOptionPane.showMessageDialog(null, GettingHelp.getHelp("createUser"));
        } else {
            JOptionPane.showMessageDialog(null, GettingHelp.getHelp("editingUser"));
        }

    }//GEN-LAST:event_loginHelpActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField confirmPasswordField;
    private javax.swing.JLabel confirmPassword_label;
    private javax.swing.JLabel decoration_label;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginHelp;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel underlineConfirmPassword;
    private javax.swing.JLabel underlineEmail;
    private javax.swing.JLabel underlinePassword;
    private javax.swing.JLabel underlineUsername;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
