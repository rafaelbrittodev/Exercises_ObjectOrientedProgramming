/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Ryzen
 */
public class Tela1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Tela1() {
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

        Tela2 = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_nome_Att = new javax.swing.JLabel();
        lb_nascimento_Att1 = new javax.swing.JLabel();
        lb_RGM_Att = new javax.swing.JLabel();
        lb_sobrenome_Att = new javax.swing.JLabel();
        lb_genero_Att = new javax.swing.JLabel();
        lb_curso_Att = new javax.swing.JLabel();
        Aviso = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_nao = new javax.swing.JButton();
        btn_sim = new javax.swing.JButton();
        btn_Atualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_Curso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_Sobrenome = new javax.swing.JTextField();
        txt_Nome = new javax.swing.JTextField();
        txt_RGM = new javax.swing.JTextField();
        txt_DataNascimento = new javax.swing.JTextField();
        rb_Fem = new javax.swing.JRadioButton();
        rb_Masc = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel10.setText("Nome");

        jLabel11.setText("Sobrenome");

        jLabel12.setText("Data de Nascimento");

        jLabel13.setText("Gênero");

        jLabel14.setText("RGM");

        jLabel15.setText("Curso");

        lb_nome_Att.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_nome_Att.setText("lb_nome_Att");

        lb_nascimento_Att1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_nascimento_Att1.setText("lb_nascimento_Att");

        lb_RGM_Att.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_RGM_Att.setText("lb_RGM_Att");

        lb_sobrenome_Att.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_sobrenome_Att.setText("lb_sobrenome_Att");

        lb_genero_Att.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_genero_Att.setText("lb_genero_Att");

        lb_curso_Att.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_curso_Att.setText("lb_curso_Att");

        javax.swing.GroupLayout Tela2Layout = new javax.swing.GroupLayout(Tela2.getContentPane());
        Tela2.getContentPane().setLayout(Tela2Layout);
        Tela2Layout.setHorizontalGroup(
            Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela2Layout.createSequentialGroup()
                        .addComponent(lb_nascimento_Att1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Tela2Layout.createSequentialGroup()
                        .addGroup(Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(Tela2Layout.createSequentialGroup()
                                .addGroup(Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(lb_nome_Att)
                                    .addComponent(lb_RGM_Att))
                                .addGap(92, 92, 92)
                                .addGroup(Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_curso_Att)
                                    .addComponent(lb_sobrenome_Att)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addComponent(lb_genero_Att))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Tela2Layout.setVerticalGroup(
            Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tela2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nome_Att)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nascimento_Att1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(Tela2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(lb_sobrenome_Att)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(12, 12, 12)
                        .addComponent(lb_genero_Att)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_RGM_Att)
                    .addComponent(lb_curso_Att))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Atenção!");

        jLabel9.setText("Você está atualizando seus dados, tem certeza?");

        btn_nao.setText("Não");
        btn_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_naoActionPerformed(evt);
            }
        });

        btn_sim.setText("Sim");
        btn_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AvisoLayout = new javax.swing.GroupLayout(Aviso.getContentPane());
        Aviso.getContentPane().setLayout(AvisoLayout);
        AvisoLayout.setHorizontalGroup(
            AvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvisoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AvisoLayout.createSequentialGroup()
                        .addComponent(btn_nao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_sim))
                    .addComponent(jLabel9))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AvisoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(123, 123, 123))
        );
        AvisoLayout.setVerticalGroup(
            AvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvisoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(AvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nao)
                    .addComponent(btn_sim))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Perfil de Aluno");
        setName("Meu Perfil de Aluno"); // NOI18N

        btn_Atualizar.setText("Atualizar");
        btn_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Sobrenome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Gênero");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("RGM");

        cb_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Análise e Desenvolvimento de Sistemas", "Engenharia de Software", "Segurança da Informação", "Gestão e Tecnologia da Informação", "Banco de Dados" }));
        cb_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CursoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Curso");

        txt_DataNascimento.setText("    /    /  ");

        rb_Fem.setText("Feminino");

        rb_Masc.setText("Masculino");
        rb_Masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_MascActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Atenção!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txt_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_RGM, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(196, 196, 196))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rb_Masc)
                                .addGap(50, 50, 50)
                                .addComponent(rb_Fem)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(205, 205, 205))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(131, 131, 131))
                                    .addComponent(txt_Sobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addComponent(cb_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_Masc)
                    .addComponent(rb_Fem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RGM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btn_Atualizar)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtualizarActionPerformed
        // TODO add your handling code here:
        String nome = txt_Nome.getText();
        String sobrenome = txt_Sobrenome.getText();
        String nascimento = txt_DataNascimento.getText();
        String rgm = txt_RGM.getText();
        String curso = cb_Curso.getSelectedItem().toString();
        
        String genero;
        
        boolean f = rb_Fem.isSelected();
        boolean m = rb_Masc.isSelected();
        
        if (f == true){
            genero = "Feminino";
        }else{
            genero = "Masculino";
        }
        
        Aviso.setSize(350,210);
        Tela2.setSize(440, 300);
        Aviso.setVisible(true);
        
        lb_nome_Att.setText(nome);
        lb_sobrenome_Att.setText(sobrenome);
        lb_nascimento_Att1.setText(nascimento);
        lb_RGM_Att.setText(rgm);
        lb_genero_Att.setText(genero);
        lb_curso_Att.setText(curso);

    }//GEN-LAST:event_btn_AtualizarActionPerformed

    private void cb_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CursoActionPerformed

    private void rb_MascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_MascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_MascActionPerformed

    private void btn_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_naoActionPerformed
        // TODO add your handling code here:
        Aviso.setVisible(false);
    }//GEN-LAST:event_btn_naoActionPerformed

    private void btn_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simActionPerformed
        // TODO add your handling code here:
        
        
        Tela2.setVisible(true);
        Aviso.setVisible(false);
    }//GEN-LAST:event_btn_simActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Aviso;
    private javax.swing.JDialog Tela2;
    private javax.swing.JButton btn_Atualizar;
    private javax.swing.JButton btn_nao;
    private javax.swing.JButton btn_sim;
    private javax.swing.JComboBox<String> cb_Curso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_RGM_Att;
    private javax.swing.JLabel lb_curso_Att;
    private javax.swing.JLabel lb_genero_Att;
    private javax.swing.JLabel lb_nascimento_Att1;
    private javax.swing.JLabel lb_nome_Att;
    private javax.swing.JLabel lb_sobrenome_Att;
    private javax.swing.JRadioButton rb_Fem;
    private javax.swing.JRadioButton rb_Masc;
    private javax.swing.JTextField txt_DataNascimento;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_RGM;
    private javax.swing.JTextField txt_Sobrenome;
    // End of variables declaration//GEN-END:variables
}
