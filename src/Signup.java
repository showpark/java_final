
import javax.swing.JOptionPane;

/**
 *
 * @author Jaehyun
 */
public class Signup extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select * From UserInfo";
    boolean dup = false;
    int hobby = 0;
    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblSignId = new javax.swing.JLabel();
        lblSignPassword = new javax.swing.JLabel();
        lblSignPasswordConfirm = new javax.swing.JLabel();
        lblSignName = new javax.swing.JLabel();
        lblSignEmail = new javax.swing.JLabel();
        lblSignGender = new javax.swing.JLabel();
        txtSignId = new javax.swing.JTextField();
        btnDup = new javax.swing.JButton();
        txtSignName = new javax.swing.JTextField();
        txtSignEmail = new javax.swing.JTextField();
        signGender = new javax.swing.JComboBox<>();
        btnSignup = new javax.swing.JButton();
        txtSignPassword = new javax.swing.JPasswordField();
        txtSignPasswordConfirm = new javax.swing.JPasswordField();
        lblSignStatus = new javax.swing.JLabel();
        lblSignHobby = new javax.swing.JLabel();
        Member = new javax.swing.JRadioButton();
        ReadyMember = new javax.swing.JRadioButton();
        Student = new javax.swing.JRadioButton();
        swim = new javax.swing.JCheckBox();
        game = new javax.swing.JCheckBox();
        golf = new javax.swing.JCheckBox();
        ski = new javax.swing.JCheckBox();
        book = new javax.swing.JCheckBox();
        tennis = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("회원가입");

        lblSignId.setText("아이디");

        lblSignPassword.setText("비밀번호");

        lblSignPasswordConfirm.setText("비밀번호 확인");

        lblSignName.setText("이름");

        lblSignEmail.setText("이메일");

        lblSignGender.setText("성별");

        txtSignId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSignIdActionPerformed(evt);
            }
        });

        btnDup.setText("중복확인");
        btnDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDupActionPerformed(evt);
            }
        });

        txtSignName.setToolTipText("");

        signGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "남자", "여자", "기타" }));

        btnSignup.setText("회원가입");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        lblSignStatus.setText("회원 상태");

        lblSignHobby.setText("취미");

        buttonGroup1.add(Member);
        Member.setSelected(true);
        Member.setText("정회원");

        buttonGroup1.add(ReadyMember);
        ReadyMember.setText("준회원");

        buttonGroup1.add(Student);
        Student.setText("학생회원");

        swim.setText("수영");

        game.setText("게임");

        golf.setText("골프");

        ski.setText("스키");

        book.setText("독서");

        tennis.setText("테니스");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSignStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(lblSignHobby, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Member)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReadyMember)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Student))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(swim)
                                .addGap(18, 18, 18)
                                .addComponent(game)
                                .addGap(18, 18, 18)
                                .addComponent(golf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ski)
                                .addGap(18, 18, 18)
                                .addComponent(book)
                                .addGap(18, 18, 18)
                                .addComponent(tennis)))))
                .addGap(0, 130, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSignPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSignPasswordConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSignName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSignEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSignGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSignId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSignId)
                    .addComponent(signGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSignName, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(txtSignEmail)
                    .addComponent(txtSignPasswordConfirm)
                    .addComponent(txtSignPassword))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignup)
                    .addComponent(btnDup, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignId)
                    .addComponent(txtSignId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignPassword)
                    .addComponent(txtSignPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignPasswordConfirm)
                    .addComponent(txtSignPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignName)
                    .addComponent(txtSignName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignEmail)
                    .addComponent(txtSignEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignStatus)
                    .addComponent(Member)
                    .addComponent(ReadyMember)
                    .addComponent(Student))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignHobby)
                    .addComponent(swim)
                    .addComponent(game)
                    .addComponent(golf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ski)
                    .addComponent(book)
                    .addComponent(tennis))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignGender)
                    .addComponent(signGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSignup)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSignIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSignIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSignIdActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        String pw = "";
        String pw1 = "";
        char[] password = txtSignPassword.getPassword();
        char[] confirmPassword = txtSignPasswordConfirm.getPassword();
        for(char c : password){
            Character.toString(c);
            pw += (pw.equals("")) ? ""+c+"" : ""+c+"";
        }
        for(char c : confirmPassword){
            Character.toString(c);
            pw1 += (pw1.equals("")) ? ""+c+"" : ""+c+"";
        }
        
        String hobby = "";
        byte checkbit = 0000;
        
        strSQL = null;
        strSQL = "Insert Into UserInfo Values (";
        strSQL += "'"+txtSignId.getText()+"', ";
        strSQL += "'"+pw+"', ";
        strSQL += "'"+txtSignName.getText()+"', ";
        strSQL += "'"+txtSignEmail.getText()+"', ";
        if(Member.isSelected()){
            strSQL += "'"+"정회원"+"', ";
        }else if(ReadyMember.isSelected()){
            strSQL += "'"+"준회원"+"', ";
        }else if(Student.isSelected()){
            strSQL += "'"+"학생회원"+"', ";
        }
        if(swim.isSelected()) checkbit = (byte)(checkbit | 1);
        if(game.isSelected()) checkbit = (byte)(checkbit | 2);
        if(golf.isSelected()) checkbit = (byte)(checkbit | 4);
        if(ski.isSelected()) checkbit = (byte)(checkbit | 8);
        if(book.isSelected()) checkbit = (byte)(checkbit | 16);
        if(tennis.isSelected()) checkbit = (byte)(checkbit | 32);
        hobby = Integer.toString(checkbit);
        strSQL += "'"+hobby+"', ";
        strSQL += "'"+signGender.getSelectedItem()+"')";
        
        if(dup==true){
            if(pw.equals(pw1)){ 
                try{
                DBM.dbOpen();
                DBM.DB_stmt.executeUpdate(strSQL);
                strSQL = "Select * From UserInfo";
                DBM.dbClose();
                dup = false;
                JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
                this.dispose();
                Login login = new Login();
                login.setVisible(true);
                }catch(Exception e){
                    System.out.println("SQLException : "+e.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
            }
        }else {
            JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요.");
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDupActionPerformed
         try{
            DBM.dbOpen();                                                       
            DBM.DB_stmt.executeUpdate(strSQL);                                  
            strSQL = "Select * From UserInfo Where ID = '"+txtSignId.getText()+"'";
            duplicate(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnDupActionPerformed

    public void duplicate(String strQuery){
        String strOutput = "";
        
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strOutput = DBM.DB_rs.getString("ID");
            }
            DBM.DB_rs.close();                                              
            if(strOutput.equals("")){                                           
                JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
                dup = true;
            }else{
                JOptionPane.showMessageDialog(null, "중복된 아이디입니다.");
            }
        }catch (Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }
   
    
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Member;
    private javax.swing.JRadioButton ReadyMember;
    private javax.swing.JRadioButton Student;
    private javax.swing.JCheckBox book;
    private javax.swing.JButton btnDup;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox game;
    private javax.swing.JCheckBox golf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSignEmail;
    private javax.swing.JLabel lblSignGender;
    private javax.swing.JLabel lblSignHobby;
    private javax.swing.JLabel lblSignId;
    private javax.swing.JLabel lblSignName;
    private javax.swing.JLabel lblSignPassword;
    private javax.swing.JLabel lblSignPasswordConfirm;
    private javax.swing.JLabel lblSignStatus;
    private javax.swing.JComboBox<String> signGender;
    private javax.swing.JCheckBox ski;
    private javax.swing.JCheckBox swim;
    private javax.swing.JCheckBox tennis;
    private javax.swing.JTextField txtSignEmail;
    private javax.swing.JTextField txtSignId;
    private javax.swing.JTextField txtSignName;
    private javax.swing.JPasswordField txtSignPassword;
    private javax.swing.JPasswordField txtSignPasswordConfirm;
    // End of variables declaration//GEN-END:variables
}
