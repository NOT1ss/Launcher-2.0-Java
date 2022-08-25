
import java.awt.Point;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Reciclagem extends javax.swing.JFrame {

    int ladoX, ladoY, pontos = 0;
    String material;

    public Reciclagem() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Bem vindo ao MineRecicles!\n\n"
                + "O objetivo do jogo é colocar todos os itens do Minecraft\n"
                + "em suas respectivas latas de lixo. Fazendo 12 pontos você "
                + "ganha o jogo.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JVidroLIXO = new javax.swing.JLabel();
        JMetalLIXO = new javax.swing.JLabel();
        JOrgLIXO = new javax.swing.JLabel();
        JPapelLIXO = new javax.swing.JLabel();
        JMetalA = new javax.swing.JLabel();
        JMetalB = new javax.swing.JLabel();
        JMetalC = new javax.swing.JLabel();
        JPapelB = new javax.swing.JLabel();
        LblContador = new javax.swing.JLabel();
        JPapelA = new javax.swing.JLabel();
        JPapelC = new javax.swing.JLabel();
        JVidroA = new javax.swing.JLabel();
        JVidroC = new javax.swing.JLabel();
        JVidroB = new javax.swing.JLabel();
        JOrgC = new javax.swing.JLabel();
        JOrgB = new javax.swing.JLabel();
        JOrgA = new javax.swing.JLabel();
        BntReset = new javax.swing.JButton();
        LblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblPnto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JVidroLIXO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lixo Verde.png"))); // NOI18N
        JVidroLIXO.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                JVidroLIXOComponentAdded(evt);
            }
        });
        JVidroLIXO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JVidroLIXOMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JVidroLIXOMouseMoved(evt);
            }
        });
        getContentPane().add(JVidroLIXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 220));

        JMetalLIXO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lixo Amarelo.png"))); // NOI18N
        getContentPane().add(JMetalLIXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 160, 220));

        JOrgLIXO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lixo Marrom.png"))); // NOI18N
        getContentPane().add(JOrgLIXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 160, 220));

        JPapelLIXO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lixo Azul.png"))); // NOI18N
        getContentPane().add(JPapelLIXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 160, 220));

        JMetalA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ouro.png"))); // NOI18N
        JMetalA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JMetalAMouseDragged(evt);
            }
        });
        getContentPane().add(JMetalA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        JMetalB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cobre.png"))); // NOI18N
        JMetalB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JMetalBMouseDragged(evt);
            }
        });
        getContentPane().add(JMetalB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        JMetalC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ferro.png"))); // NOI18N
        JMetalC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JMetalCMouseDragged(evt);
            }
        });
        getContentPane().add(JMetalC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        JPapelB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/papel.png"))); // NOI18N
        JPapelB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPapelBMouseDragged(evt);
            }
        });
        getContentPane().add(JPapelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        LblContador.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        LblContador.setText("0");
        getContentPane().add(LblContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        JPapelA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Livro Normal.png"))); // NOI18N
        JPapelA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPapelAMouseDragged(evt);
            }
        });
        getContentPane().add(JPapelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        JPapelC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Livro Encantado.png"))); // NOI18N
        JPapelC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPapelCMouseDragged(evt);
            }
        });
        getContentPane().add(JPapelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        JVidroA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vidrodois.png"))); // NOI18N
        JVidroA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JVidroAMouseDragged(evt);
            }
        });
        getContentPane().add(JVidroA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        JVidroC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vidrotres.png"))); // NOI18N
        JVidroC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JVidroCMouseDragged(evt);
            }
        });
        getContentPane().add(JVidroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        JVidroB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vidroum.png"))); // NOI18N
        JVidroB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JVidroBMouseDragged(evt);
            }
        });
        getContentPane().add(JVidroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        JOrgC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Carne Crua.png"))); // NOI18N
        JOrgC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JOrgCMouseDragged(evt);
            }
        });
        getContentPane().add(JOrgC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        JOrgB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maça.png"))); // NOI18N
        JOrgB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JOrgBMouseDragged(evt);
            }
        });
        getContentPane().add(JOrgB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        JOrgA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Carne Podre.png"))); // NOI18N
        JOrgA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JOrgAMouseDragged(evt);
            }
        });
        getContentPane().add(JOrgA, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        BntReset.setText("Reset");
        BntReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntResetActionPerformed(evt);
            }
        });
        getContentPane().add(BntReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        LblName.setFont(new java.awt.Font("Wasco Sans", 1, 36)); // NOI18N
        LblName.setForeground(new java.awt.Color(0, 0, 0));
        LblName.setText("MineRecicles");
        getContentPane().add(LblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 80, 90));

        LblPnto.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        LblPnto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ponto.png"))); // NOI18N
        getContentPane().add(LblPnto, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrumarFundo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 80, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telabranca.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void pontuacao(){
        pontos++;
        LblContador.setText(String.valueOf(pontos));
        if(pontos == 12){
            JOptionPane.showMessageDialog(null, "Você ganhou o jogo!!");
            resetar();
        }
    }
    
    public void xisiplison(javax.swing.JLabel Lbl, int xis, int iplison){
        switch (material) {
            case "metal":
                if(ladoX >= 500 && ladoX <= 500 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    
                    Lbl.setVisible(false);
                    pontuacao();
                }   if(ladoX >= 710 && ladoX <= 710 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 260 && ladoX <= 260 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 30 && ladoX <= 30 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   break;
            case "papel":
                if(ladoX >= 500 && ladoX <= 500 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 710 && ladoX <= 710 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    JOptionPane.showMessageDialog(null, "Você acertou!!");
                    Lbl.setVisible(false);
                    pontuacao();
                }   if(ladoX >= 260 && ladoX <= 260 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 30 && ladoX <= 30 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   break;
            case "vidro":
                if(ladoX >= 500 && ladoX <= 500 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 710 && ladoX <= 710 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 260 && ladoX <= 260 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 30 && ladoX <= 30 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    JOptionPane.showMessageDialog(null, "Você acertou!!");
                    Lbl.setVisible(false);
                    pontuacao();
                }   break;
            case "organico":
                if(ladoX >= 500 && ladoX <= 500 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 710 && ladoX <= 710 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   if(ladoX >= 260 && ladoX <= 260 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    JOptionPane.showMessageDialog(null, "Você acertou!!");
                    Lbl.setVisible(false);
                    pontuacao();
                }   if(ladoX >= 30 && ladoX <= 30 + 130 && ladoY >= 290 && ladoY <= 290 + 200){
                    Lbl.setLocation(xis, iplison);
                }   break;
            default:
                break;     
        }
    }

    public void resetar(){
        pontos = 0;
        LblContador.setText("0");
        JMetalB.setLocation(120, 90);
        JMetalB.setVisible(true);
        JMetalA.setLocation(730, 150);
        JMetalA.setVisible(true);
        JMetalC.setLocation(440, 160);
        JMetalC.setVisible(true);
        JPapelC.setLocation(770, 80);
        JPapelC.setVisible(true);
        JPapelB.setLocation(210, 140);
        JPapelB.setVisible(true);
        JPapelA.setLocation(330, 110);
        JPapelA.setVisible(true);
        JOrgA.setLocation(820, 210);
        JOrgA.setVisible(true);
        JOrgB.setLocation(650, 60);
        JOrgB.setVisible(true);
        JOrgC.setLocation(500, 110);
        JOrgC.setVisible(true);
        JVidroA.setLocation(70, 30);
        JVidroA.setVisible(true);
        JVidroB.setLocation(600, 140);
        JVidroB.setVisible(true);
        JVidroC.setLocation(50, 180);
        JVidroC.setVisible(true);
    }
    private void JMetalBMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMetalBMouseDragged
        material = "metal";
        
        ladoX = JMetalB.getLocation().x + evt.getX();
        ladoY = JMetalB.getLocation().y + evt.getY();

        JMetalB.setLocation(ladoX, ladoY);
        if(JMetalB.isVisible() == true){
        xisiplison(JMetalB, 120, 90);
        }
    }//GEN-LAST:event_JMetalBMouseDragged

    private void JMetalCMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMetalCMouseDragged
        material = "metal";
       
        ladoX = JMetalC.getLocation().x + evt.getX();
        ladoY = JMetalC.getLocation().y + evt.getY();

        JMetalC.setLocation(ladoX, ladoY);

        if(JMetalC.isVisible() == true){
        xisiplison(JMetalC, 440, 160);
        }
        
    }//GEN-LAST:event_JMetalCMouseDragged

    private void JMetalAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMetalAMouseDragged
        material = "metal";
       
        ladoX = JMetalA.getLocation().x + evt.getX();
        ladoY = JMetalA.getLocation().y + evt.getY();

        JMetalA.setLocation(ladoX, ladoY);

        if(JMetalA.isVisible() == true){
        xisiplison(JMetalA, 730, 150);
        }
        
    }//GEN-LAST:event_JMetalAMouseDragged

    private void JPapelBMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPapelBMouseDragged
        material = "papel";
         
        ladoX = JPapelB.getLocation().x + evt.getX();
        ladoY = JPapelB.getLocation().y + evt.getY();
        
        JPapelB.setLocation(ladoX, ladoY);

        if(JPapelB.isVisible() == true){
        xisiplison(JPapelB, 210, 140);
        }
        
    }//GEN-LAST:event_JPapelBMouseDragged

    private void JPapelCMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPapelCMouseDragged
        material = "papel";
       
        ladoX = JPapelC.getLocation().x + evt.getX();
        ladoY = JPapelC.getLocation().y + evt.getY();

        JPapelC.setLocation(ladoX, ladoY);

        if(JPapelC.isVisible() == true){
        xisiplison(JPapelC, 770, 80);
        }
        
    }//GEN-LAST:event_JPapelCMouseDragged

    private void JPapelAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPapelAMouseDragged
        material = "papel";
       
        ladoX = JPapelA.getLocation().x + evt.getX();
        ladoY = JPapelA.getLocation().y + evt.getY();

        JPapelA.setLocation(ladoX, ladoY);
        if(JPapelA.isVisible() == true){
        xisiplison(JPapelA, 330, 110);
        }
        
    }//GEN-LAST:event_JPapelAMouseDragged

    private void JVidroAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JVidroAMouseDragged
        material = "vidro";
        
        ladoX = JVidroA.getLocation().x + evt.getX();
        ladoY = JVidroA.getLocation().y + evt.getY();

        JVidroA.setLocation(ladoX, ladoY);

        JPapelA.setLocation(ladoX, ladoY);
        if(JVidroA.isVisible() == true){
            xisiplison(JVidroA, 70, 30);
        }
        
    }//GEN-LAST:event_JVidroAMouseDragged

    private void JVidroBMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JVidroBMouseDragged
        material = "vidro";
       
        ladoX = JVidroB.getLocation().x + evt.getX();
        ladoY = JVidroB.getLocation().y + evt.getY();

        JVidroB.setLocation(ladoX, ladoY);

        JPapelA.setLocation(ladoX, ladoY);
        if(JVidroB.isVisible() == true){
        xisiplison(JVidroB, 600, 140);
        }
        
    }//GEN-LAST:event_JVidroBMouseDragged

    private void JVidroCMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JVidroCMouseDragged
        material = "vidro";
       
        ladoX = JVidroC.getLocation().x + evt.getX();
        ladoY = JVidroC.getLocation().y + evt.getY();

        JVidroC.setLocation(ladoX, ladoY);
        if(JVidroC.isVisible() == true){
        xisiplison(JVidroC, 50 , 180);
        }
    }//GEN-LAST:event_JVidroCMouseDragged

    private void JOrgCMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JOrgCMouseDragged
        material = "organico";
       
        ladoX = JOrgC.getLocation().x + evt.getX();
        ladoY = JOrgC.getLocation().y + evt.getY();

        JOrgC.setLocation(ladoX, ladoY);
        if(JOrgC.isVisible() == true){
        xisiplison(JOrgC, 500 ,110);
        }
       
    }//GEN-LAST:event_JOrgCMouseDragged

    private void JOrgBMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JOrgBMouseDragged
        material = "organico";
       
        ladoX = JOrgB.getLocation().x + evt.getX();
        ladoY = JOrgB.getLocation().y + evt.getY();

        JOrgB.setLocation(ladoX, ladoY);
        if(JOrgB.isVisible() == true){
        xisiplison(JOrgB, 650, 60);
        }
        
    }//GEN-LAST:event_JOrgBMouseDragged

    private void JOrgAMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JOrgAMouseDragged
        material = "organico";
       
        ladoX = JOrgA.getLocation().x + evt.getX();
        ladoY = JOrgA.getLocation().y + evt.getY();

        JOrgA.setLocation(ladoX, ladoY);
        if(JOrgA.isVisible() == true){
        xisiplison(JOrgA, 820, 210);
        }
       
    }//GEN-LAST:event_JOrgAMouseDragged

    private void JVidroLIXOMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JVidroLIXOMouseDragged

    }//GEN-LAST:event_JVidroLIXOMouseDragged

    private void JVidroLIXOMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JVidroLIXOMouseMoved

    }//GEN-LAST:event_JVidroLIXOMouseMoved

    private void JVidroLIXOComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_JVidroLIXOComponentAdded
        
    }//GEN-LAST:event_JVidroLIXOComponentAdded

    private void BntResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntResetActionPerformed
       resetar();
    }//GEN-LAST:event_BntResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciclagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntReset;
    private javax.swing.JLabel JMetalA;
    private javax.swing.JLabel JMetalB;
    private javax.swing.JLabel JMetalC;
    private javax.swing.JLabel JMetalLIXO;
    private javax.swing.JLabel JOrgA;
    private javax.swing.JLabel JOrgB;
    private javax.swing.JLabel JOrgC;
    private javax.swing.JLabel JOrgLIXO;
    private javax.swing.JLabel JPapelA;
    private javax.swing.JLabel JPapelB;
    private javax.swing.JLabel JPapelC;
    private javax.swing.JLabel JPapelLIXO;
    private javax.swing.JLabel JVidroA;
    private javax.swing.JLabel JVidroB;
    private javax.swing.JLabel JVidroC;
    private javax.swing.JLabel JVidroLIXO;
    private javax.swing.JLabel LblContador;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblPnto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

 
}
