/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author User
 */
public class Uitatparola extends javax.swing.JFrame {

 // functia care defineste structura codului de resetare care se trimite spre utilizatorul 
      private  String recoveredRandomCode(){
        // cod format din 8 caractere, si cifre si numere 
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int codeLength = 8;
        StringBuilder randomCode = new StringBuilder();

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < codeLength; i++) {
            int index = random.nextInt(characters.length());
            randomCode.append(characters.charAt(index));
        }

        return randomCode.toString();
    }
       // functie care defineste structura parolei, parolei noi introduse - ca in pagina de inregistrare - trebuie sa aiba 8 caractere: litera mare, cifre si simbol 
      private boolean isValidPassword(String password) {
    // verifica lungimea minima 
    if (password.length() < 8) {
        return false;
    }
    // verifica daca are litera mare 
    if (!password.matches(".*[A-Z].*")) {
        return false;
    }
    // verifica daca are un simbol 
    if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
        return false;
    }
     // verifica daca are o cifra 
    if (!password.matches(".*\\d.*")) {
        return false;
    }
    // daca toate conditiile sunt indeplinitate - parola este valida 
    return true;
}
      
   
    
    /**
     * Creates new form Uitatparola
     */
    public Uitatparola() {
        
        

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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(179, 116, 176));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel4.setText("Nume:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Prenume:");

        jLabel6.setText("Seria buletin:");

        jLabel7.setText("Iban:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Recuperare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Pentru a recupera parola/contul introdu următoarele date:");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel2.setText("Recuperare parolă/cont");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel1.setText("Inapoi");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel8.setText("Adresa de email:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        // daca se apasa pe butonul de inapoi se ajunge din nou la pagina de logare 
        LoginPage obj = new LoginPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // conectiune cu baza de date 
           String jdbcUrl = "jdbc:mysql://localhost:3306/banking";
    String username = "Layla";
    String password = "Kaleido98#";

  try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
    System.out.println("Connected to the database!"); // daca conexiunea este reusita se afiseaza mesajul connected to the database 
} catch (SQLException e) {
    // Handle exceptions
    e.printStackTrace();
}

String firstName = jTextField1.getText().trim();
String lastName = jTextField2.getText().trim();
String seria = jTextField3.getText().trim();
String iban = jTextField4.getText().trim();

 
 
    
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    //conexiune cu baza de date 
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "Layla", "Kaleido98#");
// se verifica daca numele, prenumele, seria si iban-ul exista in baza de date, in tabelul utilizatori si apartin aceluiasi utilizator 
    String sql = "SELECT userid, numecont FROM utilizatori WHERE nume = ? AND prenume = ? AND serie = ? AND iban = ?";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, firstName);
        pstmt.setString(2, lastName);
        pstmt.setString(3, seria);
        pstmt.setString(4, iban);
// daca conditia de sus este indeplinita, codul de resetare se trimite catre adresa de mail introdusa de utilizator 
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
       
           String recoveryCode = recoveredRandomCode();
        
        // trimiterea mailului se face prin Brevo - care este un Customer Relantionship Management   
            String recoveredUserid = rs.getString("userid");
            String recoveredNumecont = rs.getString("numecont");
            String senderEmail = "antoniaitineant30@gmail.com"; // adresa de mail de unde se trimite 
            String senderPassword = "nGLWgwzJVNkI4c7S";

        // adresa de mail a destinatorului, cea care se introduce 
        String recipientEmail = jTextField5.getText();

        // setarile serverului - Simple Mail Transfer Protocol
        String host = "smtp-relay.brevo.com";
        int port = 587;

       
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);

         // creare o sesiune cu trimiterea mailului 
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // creare obiect MimeMessage
       
            Message message = new MimeMessage(session);

           
            // setare adresa de mail a expeditorului si destinatarului 
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

           
            // setare subiect si ce contine mailul
            message.setSubject("Resetare parola");
            message.setText("Codul de resetare este:" + recoveryCode);

            // transmitere mail 
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    
// se afiseaza nume cont, user id si faptul ca codul de resetare a fost trimis pe mail 
           
            JOptionPane.showMessageDialog(this,
        "<html><b>Contul tau este:</b>"
                + "<br><b>Nume cont:</b> " + recoveredNumecont
                + "<br><b>User id:</b> " + recoveredUserid + "<br><b>Codul de resetare a parolei a fost trimis pe email</b> "
                /*+ "<br><b>Cod resetare parola:</b> " + recoveryCode */+ "</html>",
        "Recuperare cont",
        JOptionPane.INFORMATION_MESSAGE);
             JOptionPane.showMessageDialog(null, "Spre pasul urmator");
             // se deschide o alta pagina, in care trebuie introdus user id, codul de restare si parola noua 
             JDialog dialog = new JDialog(Uitatparola.this, "Resetare parola", true);
        dialog.setSize(300, 200);
        dialog.setLocationRelativeTo(Uitatparola.this);

// componentele: etichetele si textfield pentru userid, reset code si parola 
        // componente user id 
        JLabel userIDLabel = new JLabel("UserID:");
        JTextField userIDField = new JTextField(20);

       
        // componente resetare parola 
        JLabel resetCodeLabel = new JLabel("Reset Password Code:");
        JTextField resetCodeField = new JTextField(20);

        
        // componente parola noua 
        JLabel newPasswordLabel = new JLabel("New Password:");
        JPasswordField newPasswordField = new JPasswordField(20);

        // buton de resetare paorla 
        JButton submitButton = new JButton("Resetare parola");
        
       
       submitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/banking"; // conectare baza de date 
        String username = "Layla";
        String password = "Kaleido98#";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connected to the database!");

            String userID = userIDField.getText();
            String resetCode = resetCodeField.getText();
            String newPassword = newPasswordField.getText();
// daca user id este in baza de date, se verifica daca codul de resatare introdus de utilizator este egal cu cel primit pe mail, apoi se valideaza parola si se face update in baza de date 
            if (isUserIDValid(connection, userID)) {
                if (resetCode.equals(recoveryCode)) {
                    if (isValidPassword(newPassword)) {
                        updatePassword(connection, userID, newPassword);
                        JOptionPane.showMessageDialog(Uitatparola.this,
                                "rESETAT CU SUCCES",
                                "rESETARE",
                                JOptionPane.INFORMATION_MESSAGE);
                        
                    } else {
                       // se afiseaza mesajul de eroare daca parola nu respecta structura 
                        JOptionPane.showMessageDialog(Uitatparola.this,
                                "Error: Parola nu respecta structura.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                     // se afiseaza mesaj eroare daca codul nu este la fel cu cel primit pe mail 
                    JOptionPane.showMessageDialog(Uitatparola.this,
                            "Error: Reset Code does not match.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // se afiseaza un mesaj de eroare daca userid nu este gasit in baza de date 
                JOptionPane.showMessageDialog(Uitatparola.this,
                        "Error: UserID not found in the database.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
       
    }

   
    // functie verificare daca userId este in baza de date 
    private boolean isUserIDValid(Connection connection, String userID) {
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM utilizatori WHERE userid = ?")) {
            statement.setString(1, userID);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next(); //  returneaza true daca user id gasit in baza de date 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

   String hashedPassword = hashWithSHA256(newPasswordField.getText());
// functie care face update in baza de date  - si pune parola hasuita in baza de date 
 
    private void updatePassword(Connection connection, String userID, String newPassword) {
        try {
            newPassword = hashWithSHA256(newPassword);
            String updateSql = "UPDATE utilizatori SET parola = ? WHERE userid = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSql)) {
                preparedStatement.setString(1, newPassword);
                preparedStatement.setString(2, userID);
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


// face parola intr-un hexadecimal string 
private String hashWithSHA256(String input) {
    try {
       
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

             //folosete JCA (Java Crytography Architecture pentru a genera hash-ul parolei introduse 
        byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        // UTF-8 - Unicode Transformation Format - 8 bit - este un standar Unicode - prin care se codifica caractere in mod unic , se asigura ca hash-ul unei parole este unic 

        //prin codul de mai jos - fiecare octet din matricea hashBytes este convertit intr-un sir hexazecimal 
        StringBuilder hexString = new StringBuilder();
        for (byte hashByte : hashBytes) {
            String hex = Integer.toHexString(0xff & hashByte);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
       // in cazul in care exista o problema - in algoritm se genereaza o exceptie 
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null; 
    }
}
});
                
                dialog.dispose();
            
        // Create layout for the dialog
        dialog.setLayout(new GridLayout(4, 2));
        dialog.add(userIDLabel);
        dialog.add(userIDField);
        dialog.add(resetCodeLabel);
        dialog.add(resetCodeField);
        dialog.add(newPasswordLabel);
        dialog.add(newPasswordField);
        dialog.add(submitButton);

        dialog.setVisible(true);
        
        } else {
          
            JOptionPane.showMessageDialog(this, "Utilizatorul nu a fost gasit sau datele au fost introduse gresit.", "Recuperare cont", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
   
                   conn.close();
                    dispose();

    
   
    // Close the database connection
  
}    catch (Exception e) {
    e.printStackTrace();

}

    }//GEN-LAST:event_jButton1ActionPerformed
   // Function to check if userID exists in the database
   
   
                
    
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
            java.util.logging.Logger.getLogger(Uitatparola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uitatparola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uitatparola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uitatparola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  

    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uitatparola().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
