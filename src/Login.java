
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select * From UserInfo";
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lbltitle = new javax.swing.JLabel();
        lbtitle_id = new javax.swing.JLabel();
        lbltilte_pw = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtemail_p = new javax.swing.JTextField();
        lblemail_p = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        btnfindid = new javax.swing.JButton();
        btnfindpw = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnfind = new javax.swing.JButton();

        lbltitle.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        lbltitle.setText("아이디/비밀번호 찾기");

        lbtitle_id.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        lbtitle_id.setText("아이디 찾기");

        lbltilte_pw.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        lbltilte_pw.setText("비밀번호 찾기");

        btnexit.setText("종료");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        lblemail.setText("이메일");

        lblemail_p.setText("이메일");

        lblid.setText("아이디");

        btnfindid.setText("아이디 찾기");
        btnfindid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindidActionPerformed(evt);
            }
        });

        btnfindpw.setText("비밀번호 찾기");
        btnfindpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindpwActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(lbltitle)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(btnexit)
                        .addContainerGap())))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnfindpw)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(lblid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addComponent(lblemail_p)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtemail_p, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addComponent(lblemail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbltilte_pw)
                        .addComponent(lbtitle_id))
                    .addComponent(btnfindid))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle)
                .addGap(37, 37, 37)
                .addComponent(lbtitle_id)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnfindid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltilte_pw)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail_p)
                    .addComponent(txtemail_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnfindpw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnexit)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogin.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        lblLogin.setText("Log In");

        lblId.setText("ID");

        lblPassword.setText("Password");

        btnLogin.setText("로그인");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignup.setText("회원가입");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnfind.setText("아이디/비밀번호 찾기");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignup, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(txtPassword)))
                            .addComponent(btnfind))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnfind)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            DBM.dbOpen();                                                       
            DBM.DB_stmt.executeUpdate(strSQL);                                  
            strSQL = "Select * From UserInfo Where ID = '"+txtId.getText()+"'";
            authCheck(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        this.dispose();
        Signup sign = new Signup();
        sign.setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        jDialog1.setLocation(350,350);
        jDialog1.setSize(400,400);
        jDialog1.show();
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        jDialog1.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnfindidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindidActionPerformed
        //아이디 찾기
        try{
            DBM.dbOpen();
            strSQL = "Select ID From UserInfo Where EMAIL = '" + txtemail.getText() + "'";
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            if(DBM.DB_rs.next()){
                String output = "찾으시는 아이디는 " + DBM.DB_rs.getString("ID") + "입니다.";
                JOptionPane.showMessageDialog(null, output);
            } else {
                JOptionPane.showMessageDialog(null, "존재하지 않은 이메일 입니다.");
            }
        } catch(Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnfindidActionPerformed

    private void btnfindpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindpwActionPerformed
        //비밀번호 찾기
        try{
            DBM.dbOpen();
            strSQL = "Select PASSWORD From UserInfo Where EMAIL = '" + txtemail_p.getText() + "'";
            strSQL += " AND ID = '" + txtid.getText() + "'";
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            if(DBM.DB_rs.next()){
                String output = "찾으시는 비밀번호는 " + DBM.DB_rs.getString("PASSWORD") + "입니다.";
                JOptionPane.showMessageDialog(null, output);
            } else {
                JOptionPane.showMessageDialog(null, "존재하지 않은 이메일이나 아이디 입니다.");
            }
        } catch(Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnfindpwActionPerformed

    //로그인 아이디 비밀번호 유효성 검사 함수
    public void authCheck(String strQuery){
        String strId = "";
        String strPassword = "";
        String password = "";
        String admin = "admin";
        char [] pw = txtPassword.getPassword();
        for(char c : pw){
            Character.toString(c);
            password += (password.equals("")) ? ""+c+"": ""+c+"";
        }
        
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strId = DBM.DB_rs.getString("ID");
                strPassword = DBM.DB_rs.getString("Password");
            }
            DBM.DB_rs.close();                                              
            if(strId.equals("")){                                           
                JOptionPane.showMessageDialog(null, "존재하지 않는 아이디 입니다.");
            }else if(strId.equals(txtId.getText()) && !strPassword.equals(password)){
                JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
            }else if(strId.equals(txtId.getText()) && strPassword.equals(password)){
                if(strId.equals(admin)){                        //admin 체크 
                    JOptionPane.showMessageDialog(null, "관리자 로그인에 성공하였습니다.");
                    this.dispose();
                    Adminpage main = new Adminpage();
                    main.setVisible(true);
                }else{
                JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
                this.dispose();
                MainPage main = new MainPage();
                main.setVisible(true);
                }
            }
        }catch (Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnfindid;
    private javax.swing.JButton btnfindpw;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemail_p;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbltilte_pw;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbtitle_id;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemail_p;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
