
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nelsi
 */
public class Quiz9 extends javax.swing.JFrame {

int ponto9, tempo = 30;
    public Quiz9(int ponto8) {
        initComponents();
        ponto9 = ponto8;
    }

    private Quiz9() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblTempo = new javax.swing.JLabel();
        respCorrect = new javax.swing.JRadioButton();
        ç = new javax.swing.JRadioButton();
        a = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 64)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot_1-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 220));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Qual é o Gênero dos Chimpanzés");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, 30));

        jRadioButton3.setText("Monotremata");
        jRadioButton3.setFocusable(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moedamini.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 70, 90));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("450 Moedas de Banana");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel2.setText("Tempo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        LblTempo.setText("30");
        getContentPane().add(LblTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        respCorrect.setText("Pan troglodytes");
        respCorrect.setFocusable(false);
        respCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respCorrectActionPerformed(evt);
            }
        });
        getContentPane().add(respCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        ç.setText("Homo Sapiens");
        ç.setFocusable(false);
        ç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çActionPerformed(evt);
            }
        });
        getContentPane().add(ç, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        a.setText("Azazhel Diabolicus");
        a.setFocusable(false);
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mamacogif.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 310, 290));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrumarFundo.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void errou(){
        JOptionPane.showMessageDialog(null, "Você errou!!");
        this.dispose();
        QuizPerdeu qP = new QuizPerdeu();
        qP.setVisible(true);
    }
    
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        errou();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void respCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respCorrectActionPerformed
        if(respCorrect.isSelected()){
            ponto9 = ponto9 + 450;
        }

        Quiz10 q10 = new Quiz10(ponto9);
        q10.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_respCorrectActionPerformed

    private void çActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çActionPerformed
        errou();
    }//GEN-LAST:event_çActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        errou();
    }//GEN-LAST:event_aActionPerformed
        public void tempo(){
            if(tempo == 0){
            JOptionPane.showMessageDialog(null, "O tempo acabou! Você perdeu");
            this.dispose();
            QuizA qA = new QuizA();
            qA.setVisible(true);
            }
        }
    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        tempo--;
        LblTempo.setText(String.valueOf(tempo));
        tempo();
    }//GEN-LAST:event_timer1OnTime

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
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTempo;
    private javax.swing.JRadioButton a;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton respCorrect;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private javax.swing.JRadioButton ç;
    // End of variables declaration//GEN-END:variables
}
