/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// clase folosite in aplicatie 
package banking.system;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//import path.to.Datecont;


import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class RegisternowPage extends javax.swing.JFrame {
    
    /**
     * Creates new form RegisternowPage
     */
   public RegisternowPage() {
        initComponents();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")  //nnotation is a way to tell the compiler to suppress these unchecked warnings for a specific piece of code or a method. It indicates that the
            //programmer is aware of the unchecked operation and has taken responsibility for ensuring type safety manually.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Creeaza cont ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 51));
        jLabel13.setText("Inapoi");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel2.setText("Useri-id:");

        jLabel4.setText("Nume-cont:");

        jLabel5.setText("Parola:");

        jLabel6.setText("Iban:");

        jLabel7.setText("Seria-act-identitate:");

        jLabel8.setText("Email:");

        jLabel9.setText("Nume:");

        jLabel10.setText("Adresa:");

        jLabel11.setText("Numar-telefon:");

        jLabel12.setText("Data-nasterii:");

        jLabel15.setText("Ocupatie:");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inregistrare");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Prenume:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 51));
        jLabel16.setText("User-id se va completa automat dupa completarea tuturor campurilor.");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 51));
        jLabel17.setText("Nume-cont trebuie sa fie de forma: numeprenume urmat de doua cifre.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(117, 117, 117)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel15))
                                    .addGap(75, 75, 75)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel9))
                                .addGap(90, 90, 90)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField10)
                            .addComponent(jTextField8)
                            .addComponent(jTextField7)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6)
                            .addComponent(jTextField11)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //ce se intampla cand pui click pe Inapoi - se ajunge inapoi pe pagina de Login 
        LoginPage obj = new LoginPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
/*
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed
*/
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    // verificare daca adresa de mail este una valida din punct de vedere al elementelor 
    private boolean isValidEmail(String email) {
     // se defineste o expresie pe care toate adresele de mail trebuie sa le aiba 
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    // Create a Pattern object
    Pattern pattern = Pattern.compile(emailRegex);
    // Create a matcher object
    Matcher matcher = pattern.matcher(email);
    // verificare daca mailul se potriveste cu patternul 
    return matcher.matches();
       }
       
    // constrangere pentru ca toate numerele de telefon introduse sa aiba 10 cifre 
    private boolean isValidPhoneNumber(String phoneNumber) {
    String phoneRegex = "^[0-9]{10}$";
     // Create a Pattern object
    Pattern pattern = Pattern.compile(phoneRegex);
    // Create a matcher object
    Matcher matcher = pattern.matcher(phoneNumber);
    // Check if the phone number matches the pattern
    return matcher.matches();
}
    
    
    private boolean isValidName(String Name) {
    String lettersOnly = "^[A-Za-z]+$";
    // Create a Pattern object
    Pattern pattern = Pattern.compile(lettersOnly);
    // Create a matcher object
    Matcher matcher = pattern.matcher(Name);
    // Check if the phone number matches the pattern
    return matcher.matches();
}
    
    
    
    private boolean isValidPrenume(String Prenume) {
   // String lettersOnly = "^[A-Za-z]+$";
     String surnamePattern = "^[A-Za-z]+(?:[-\\s][A-Za-z]+)?$";
    // Create a Pattern object
    Pattern pattern = Pattern.compile(surnamePattern);
// Create a matcher object
    Matcher matcher = pattern.matcher(Prenume);
// Check if the phone number matches the pattern
    return matcher.matches();
}

    
    // toate datele de nastere introduse trebuie sa aiba un anumit pattern 
    
    private boolean isValidDateOfBirth(String dob) {
    // patternul trebuie sa fie  date/month/year
    String dobRegex = "^\\d{2}/\\d{2}/\\d{4}$";
     Pattern pattern = Pattern.compile(dobRegex);
    Matcher matcher = pattern.matcher(dob);
    if (!matcher.matches()) {
        return false; // Invalid format
    }
  // metoda care  încearcă să valideze un șir de date (dob) utilizând clasa SimpleDateFormat. 
          // scopul este de a verifica dacă șirul de date furnizat respectă formatul de date specificat ("dd/MM/aaaa") și dacă este o dată validă.
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setLenient(false); // Strict parsing, won't allow invalid dates
        try {
            
       Date date = dateFormat.parse(dob);
        
        return true;
    } catch (ParseException e) {
        return false; // Invalid date
    }
}
    
    
    //  am definit o structura al ibanului care se introduce 
    private boolean isValidBankAccountNumber(String accountNumber) {
    // definirea structurii ibanului 
    //String accountNumberRegex = "^ROKAL33337777\\d{4}$";
    String accountNumberRegex = "^RO\\d{2}KALB33337777\\d{8}$";

     // creare obiect pattern 
    Pattern pattern = Pattern.compile(accountNumberRegex);
    // creare obiect matcher 
    Matcher matcher = pattern.matcher(accountNumber);
   // verificare daca iban-ul se potriveste cu pattern-ul 
    return matcher.matches();
}
    //verificam ca ibanul sa fie unic 
    private boolean isIBANUnique(String iban, Connection connection) throws SQLException {
        String query = "SELECT COUNT(*) AS count FROM utilizatori WHERE iban = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, iban);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt("count");
                    return count == 0; // daca count is 0, iban este unic 
                }
            }
        }
        return false; // in cazul unei exceptii se returneaza false 
    }
    
    
    
    // am definit structura parolei -  sa fie formata - cel putin 8 caractere, o litera mare, o cifra, un simbol 
    
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
    
 
    // account name - structura numelui contului 
   private boolean isValidAccountName(String firstName, String lastName, String accountName) {
    // verificare daca formularele pentru nume si prenume nu sunt goale 
    if (firstName.isEmpty() || lastName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nume sau prenume necompletat.", "Account Name Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
     // verificare daca nume cont este egal cu pattern-ul definit 
    String expectedPattern = firstName.toLowerCase() + lastName.toLowerCase() + "\\d{2}";
    if (!accountName.toLowerCase().matches(expectedPattern)) {
        JOptionPane.showMessageDialog(null, "Nume cont invalid. Va rugam introduceti un nume cont valid.", "Account Name Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
          return true; 
   }
   private boolean isAccountNameUnique(String numecont, Connection connection) throws SQLException{
       String query = "SELECT COUNT(*) AS count FROM utilizatori WHERE numecont =? ";
       try(PreparedStatement pstmt = connection.prepareStatement(query)){
           pstmt.setString(1, numecont);
           try(ResultSet rs = pstmt.executeQuery()){
               if(rs.next()){
                   int count = rs.getInt("count");
                   return count == 0; // daca count este 0 , numecont unic 
               }
           }
       }
       return false; 
   }
  
   
   // !!!! user id  - se genereaza automat - prima litera din nume , prima litera din prenume si 6 numere puse random 
    private String generateUserID(String ffirstName, String llastName) {
     // se ia prima litera din nume si prima litera din prenume 
    String initials = ffirstName.substring(0, 1).toUpperCase() + llastName.substring(0, 1).toUpperCase();
     // se genereaza 6 numere aleatorii 
    Random random = new Random();
    int randomDigits = random.nextInt(900000) + 100000; 
    // concatenare text cu cifrele 
    return initials + randomDigits;
}
    
    
    
    
    
// butonuuul de click !!!! 
    //ce se intampla cand butonul este actionat 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {         
        // conectare cu baza de date prin url, username si parola contului folosit in baza de date 
    String jdbcUrl = "jdbc:mysql://localhost:3306/banking";
    String username = "Layla";
    String password = "Kaleido98#";

    try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
        System.out.println("Connected to the database!");

     
        //validare parola 
       String password1 = jPasswordField1.getText();
       
       // daca parola nu este valida se afiseaza mesajul de mai jos 
    if (!isValidPassword(password1)) {
        JOptionPane.showMessageDialog(null, "Parola nu respecta politica de securitate. Asigurati-va ca are cel putin 8 caractere, o litera mare, un simbol si o cifra.", "Password Policy Error", JOptionPane.ERROR_MESSAGE);
        return; // se iese din metoda daca parola nu respecta criteriile de mai sus 
    }
           // parola se hash-uieste cu algoritmul SHA-256 pentru a nu aparea in plaintext in baza de date 
        String hashedPassword = hashWithSHA256(jPasswordField1.getText());
        
        
     
         // validare adresa de mail 
        String email = jTextField5.getText();
        // daca adresa de mail nu este valida se afiseaza urmatorul mesaj 
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Adresa de email invalida. Va rugam introduceti o adresa de email valida.", "Email Validation Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
    
         // validare numar de telefon 
            String phoneNumber = jTextField8.getText();
            // daca numarul de telefon nu este valid ( nu are 10 cifre) se afiseaza urmatorul mesaj 
    if (!isValidPhoneNumber(phoneNumber)) {
        JOptionPane.showMessageDialog(null, "Numar de telefon invalid.Va rugam introduceti un numar de telefon valid (format din 10 cifre).", "Phone Number Validation Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    // validare nume user 
          String Name = jTextField6.getText();
          if(!isValidName(Name)){
               JOptionPane.showMessageDialog(null, "Nume scris incorect", "Name Validation Error",  JOptionPane.ERROR_MESSAGE);
          }
          
          //validare prenume user 
           String Prenume = jTextField11.getText();
          if(!isValidPrenume(Prenume)){
               JOptionPane.showMessageDialog(null, "Prenume scris incorect", "Prenume Validation Error",  JOptionPane.ERROR_MESSAGE);
          }
          
     // validare data nastere 
        String dob = jTextField9.getText();
        // daca data de nastere nu respecta patternul se afiseaza mesajul de mai jos 
    if (!isValidDateOfBirth(dob)) {
        JOptionPane.showMessageDialog(null, "Data nasterii invalida.Va rugam introduceti data nasterii in format dd/mm/yyyy.", "Date of Birth Validation Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
    
    //validare iban 
    String accountNumber = jTextField12.getText();
    // daca structura ibanului nu corespunde cu structura din cod, se afiseaza mesajul de mai jos 
    if (!isValidBankAccountNumber(accountNumber)) {
        JOptionPane.showMessageDialog(null, "IBAN invalid. Va rugam introduceti un IBAN valid.", "Bank Account Number Validation Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
            // verificare daca iban este unic in baza de date 
            if (!isIBANUnique(accountNumber, connection)) {
                JOptionPane.showMessageDialog(null, "IBAN deja existent", "Bank Account Number Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
        //!!!!!!!! NUME CONT 
        // validare numecont 
        String firstName = jTextField6.getText();  // jTextField6 - campul pentru nume 
        String lastName = jTextField11.getText();  // jTextField11 - campul pentru prenume 
        String accountName = jTextField2.getText(); // jTextField2 - campul pentru numecont 
         if (!isValidAccountName(firstName, lastName, accountName)) {
                           JOptionPane.showMessageDialog(null, "Nume cont nu respecta structura ceruta", "Account Name Validation Error", JOptionPane.ERROR_MESSAGE);
        return; 
     }
     // verificare daca numecont e unic in baza de date 
            if (!isAccountNameUnique(accountName, connection)) {
                JOptionPane.showMessageDialog(null, "Numecont deja existent", "Account Name Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
 
                     //!!!!!! USER ID 
             // validare user id 
             String ffirstName = jTextField6.getText();  // jTextField6 - campul pentru nume 
             String llastName = jTextField11.getText();  // jTextField11 - campul pentru prenume
               // generare userid 
            String userID = generateUserID(firstName, lastName);
               // Setare generare user id in forumarul de inregistrare 
            // jTextField 1 - este campul pentru user id
            jTextField1.setText(userID);

            
            
               // Validate each input field
    //String accountNumber = jTextField4.getText();
    //String Nume = jTextField2.getText();
    String otherField2 =  userID;
    String otherField3 = accountName;
    String otherField4 = jTextField4.getText();
    String otherField7 = jTextField7.getText();
    String otherField10 = jTextField10.getText();

    /*if ((isValidName(Name)
            ||isValidPrenume(Prenume)
            || otherField2.isEmpty()
            || otherField3.isEmpty()
            ||isValidPassword(password1)
            ||isValidBankAccountNumber(accountNumber)
            || otherField4.isEmpty()
            || isValidEmail(email)
            || otherField7.isEmpty()
            || isValidPhoneNumber(phoneNumber)
            || isValidDateOfBirth(dob)
            || otherField10.isEmpty())) {
        JOptionPane.showMessageDialog(null, "Toate câmpurile sunt obligatorii și trebuie completate corect.",
                "Eroare de validare", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if any field is not valid
    }
       */
    // conectare cu baza de date 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "Layla", "Kaleido98#");
            // pentru a insera in tabela utilizatori si pentru a insera in tabela login 
            String sql = "insert into utilizatori values (?,?,?,?,?,?,?,?,?,?,?,?)";
           String sql1 = "insert into userid values(?,?)"; // se transmit userid si accountNumber in tabela de userid
            
            // linia de cod face parte din JDBC (Java Database Conectivity - pentru executarea interogarilor SQL  
            PreparedStatement ptstmt = conn.prepareStatement(sql); 
         PreparedStatement ptstmt1 = conn.prepareStatement(sql1);
            // se transmit informatiile spre baza de date 
           
            ptstmt.setString(1, Name);
            ptstmt.setString(2, Prenume);
            ptstmt.setString(3, userID); //jTextField1
            ptstmt.setString(4, accountName);
            ptstmt.setString(5, hashedPassword); // se foloseste parola hash-uita // cand se transmite spre baza de date 
            ptstmt.setString(6, accountNumber);
            ptstmt.setString(7, jTextField4.getText());
            ptstmt.setString(8, email); // se foloseste variabila de mail validata
            ptstmt.setString(9, jTextField7.getText());
            ptstmt.setString(10, phoneNumber);
            ptstmt.setString(11, dob);
            ptstmt.setString(12, jTextField10.getText());
            
            ptstmt.executeUpdate(); // folosit pentru a executa query-uri in SQL care modifica baza de date, in contexte precum update, inserare, stergere inregistrari din baza de date 
            
            
               ptstmt1.setString(1, userID);
               ptstmt1.setString(2, accountNumber); // Use hashed password // cand se intra in login 
          //  ptstmt1.setString(2,jPasswordField1.getText());
 
               ptstmt1.executeUpdate();
               
             JOptionPane.showMessageDialog(this, "Bun venit " +  Prenume + " " + Name, "Bun venit", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Datele au fost inserate cu succes. Spre pasul urmator");
         

             datecont newFrame = new datecont();
        newFrame.setVisible(true);
        
                 //ptstmt.executeUpdate();
                  
                    conn.close();
                    dispose();
             
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        }
    } catch (SQLException e) {
        // Handle exceptions

    }
    
   
}   
    // functia de hash 
// face parola intr-un hexadecimal string 
private String hashWithSHA256(String input) {
    try {
        //MessageDigest este o clasa Java care ofera functionalitati pentru hashing 
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
            java.util.logging.Logger.getLogger(RegisternowPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisternowPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisternowPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisternowPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisternowPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}