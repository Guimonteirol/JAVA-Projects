package CalculadoraFinal;

public class JCalculadoraFinal extends javax.swing.JFrame {

    public JCalculadoraFinal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
            
    Operacao op = new Operacao();
    double valor01;
    double valor02;
    double resp;
    String ops;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblresp = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnmult = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnponto = new javax.swing.JButton();
        btnresp = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnapaga_ultm = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        btnapagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        jButton1.setText("jButton1");

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblresp.setEditable(false);
        lblresp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblresp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(lblresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 57));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 173, 70, 70));

        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });
        getContentPane().add(btnsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 70));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 70, 70));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 173, 70, 70));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 261, 70, 70));

        btnmult.setText("X");
        btnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultActionPerformed(evt);
            }
        });
        getContentPane().add(btnmult, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, 70));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 261, 70, 70));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 261, 70, 70));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 70, 70));

        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });
        getContentPane().add(btndiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 100, 70));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 70));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 70, 70));

        btnponto.setText(".");
        btnponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpontoActionPerformed(evt);
            }
        });
        getContentPane().add(btnponto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 70, 70));

        btnresp.setText("=");
        btnresp.setToolTipText("");
        btnresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrespActionPerformed(evt);
            }
        });
        getContentPane().add(btnresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 170, 90));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 80, 70));

        btnapaga_ultm.setText("C");
        btnapaga_ultm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapaga_ultmActionPerformed(evt);
            }
        });
        getContentPane().add(btnapaga_ultm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 65, 60));

        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 95, 100, 60));

        jButton23.setText("%");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 95, 65, 60));

        btnapagar.setText("AC");
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 95, 65, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CalculadoraFinal/blue.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        valor01 = Double.parseDouble(lblresp.getText());
        lblresp.setText("");
        ops = "-";
    }//GEN-LAST:event_btnsubActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String enviarnumero = lblresp.getText() + btn9.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultActionPerformed
        valor01 = Double.parseDouble(lblresp.getText());
        lblresp.setText("");
        ops = "*";
    }//GEN-LAST:event_btnmultActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String enviarnumero = lblresp.getText() + btn6.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        valor01 = Double.parseDouble(lblresp.getText());
        lblresp.setText("");
        ops = "/";
    }//GEN-LAST:event_btndivActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String enviarnumero = lblresp.getText() + btn3.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnrespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrespActionPerformed
        String resposta;
        valor02 = Double.parseDouble(lblresp.getText());
        
        if (ops == "+") {
            resp = op.somar(valor01, valor02);
            resposta = (valor01 + " + " + valor02 + " = " + String.format("%.0f", resp));
            lblresp.setText(resposta);
        }
        else if (ops == "-") {
            resp = op.subtrair(valor01, valor02);
            resposta = (valor01 + " - " + valor02 + " = " + String.format("%.0f", resp));
            lblresp.setText(resposta);
        }
        else if (ops == "*") {
            resp = op.multiplicar(valor01, valor02);
            resposta = (valor01 + " * " + valor02 + " = " + String.format("%.0f", resp));
            lblresp.setText(resposta);
        }
        else if (ops == "/") {
            resp = op.dividir(valor01, valor02);
            resposta = (valor01 + " / " + valor02 + " = " + String.format("%.0f", resp));
            lblresp.setText(resposta);
        }
        else if (ops == "%") {
            resp = op.porcentagem(valor01, valor02);
            resposta = String.format("%.0f", resp);
            lblresp.setText(resposta);
        }           
    }//GEN-LAST:event_btnrespActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        valor01 = Double.parseDouble(lblresp.getText());
        lblresp.setText("");
        ops = "+";
    }//GEN-LAST:event_btnaddActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        valor01 = Double.parseDouble(lblresp.getText());
        lblresp.setText("");
        ops = "%";
    }//GEN-LAST:event_jButton23ActionPerformed

    private void btnapaga_ultmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapaga_ultmActionPerformed
        String apagar = null;
        
        if(lblresp.getText().length() > 0 ) {
            StringBuilder strB = new StringBuilder(lblresp.getText());
            strB.deleteCharAt(lblresp.getText().length() - 1);
            apagar = strB.toString();
            lblresp.setText(apagar);
        }
    }//GEN-LAST:event_btnapaga_ultmActionPerformed

    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
        lblresp.setText("");
    }//GEN-LAST:event_btnapagarActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String enviarnumero = lblresp.getText() + btn7.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String enviarnumero = lblresp.getText() + btn8.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String enviarnumero = lblresp.getText() + btn4.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String enviarnumero = lblresp.getText() + btn5.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String enviarnumero = lblresp.getText() + btn1.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String enviarnumero = lblresp.getText() + btn2.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String enviarnumero = lblresp.getText() + btn0.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpontoActionPerformed
        String enviarnumero = lblresp.getText() + btnponto.getText();
        lblresp.setText(enviarnumero);
    }//GEN-LAST:event_btnpontoActionPerformed

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
            java.util.logging.Logger.getLogger(JCalculadoraFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCalculadoraFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCalculadoraFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCalculadoraFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCalculadoraFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnapaga_ultm;
    private javax.swing.JButton btnapagar;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnponto;
    private javax.swing.JButton btnresp;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lblresp;
    // End of variables declaration//GEN-END:variables
}
