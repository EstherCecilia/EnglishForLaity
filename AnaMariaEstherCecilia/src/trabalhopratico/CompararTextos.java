/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author ana
 */
public class CompararTextos extends javax.swing.JFrame {

    String legenda; //legenda do video

    /**
     * Creates new form CompararTextos
     */
    public CompararTextos() {
        initComponents();
    }

    public CompararTextos(String textoUsuario, int numArq) {
        initComponents();
        this.setLocationRelativeTo(null);
        switch (numArq) {//o valor de aux determina qual endereco de video sera carregado
            case 0:
                legendaVideo0();
                textoVideo.setText(legenda);
                textoVideo.setVisible(true);
                break;
            case 1:
                legendaVideo1();
                textoVideo.setText(legenda);
                textoVideo.setVisible(true);

                break;
            case 2:
                legendaVideo2();
                textoVideo.setText(legenda);
                textoVideo.setVisible(true);

                break;
            case 3:
                legendaVideo3();
                textoVideo.setText(legenda);
                textoVideo.setVisible(true);

                break;
            case 4:
                legendaVideo4();
                textoVideo.setText(legenda);
                textoVideo.setVisible(true);

                break;
            case 5:
                legendaVideo5();
                textoVideo.setText(legenda);
                textoVideo.setVisible(true);

                break;

        }

        texto.setText(textoUsuario); // mostra o que o usuario digitou na tela ExibeVideo

        texto.setVisible(true);

    }

    public void legendaVideo0() {
        legenda = "I can't believe this Chandler I said I was sorry yeah well sorry doesn't bring. \n"
                + "I Back to the little piggy that cried all the way home \n"
                + "I hate this stupid day and everything about it. \n"
                + "I'll see you later wait healer come here is there anything. \n"
                + "I can do anything yeah just let me alone for one.\n"
                + "Oh \n"
                + "I'm a duck I go quack quack \n"
                + "I'm happy all the time nice try hey wait wait wait \n"
                + "look Monica \n"
                + "this is not gonna work all right that's \n"
                + "it work you look so great I love you \n"
                + "what nothing \n"
                + "I said I said you're so great and then I just I just \n"
                + "stopped talking said you love me \n"
                + "I can't believe this no I didn't \n"
                + "yes you're dead \n"
                + "no I didn't know stop it started started stop it";
    }

    public void legendaVideo1() {
        legenda = "Photograph\n"
                + "Ed Sheeran\n"
                + "Loving can hurt, loving can hurt sometimes\n"
                + "But it's the only thing that I know\n"
                + "When it gets hard, you know it can get hard sometimes\n"
                + "It is the only thing makes us feel alive\n"
                + "We keep this love in a photograph\n"
                + "We made these memories for ourselves\n"
                + "Where our eyes are never closing\n"
                + "Hearts are never broken\n"
                + "And time's forever frozen still\n"
                + "So you can keep me\n"
                + "Inside the pocket of your ripped jeans\n"
                + "Holding me closer 'til our eyes meet\n"
                + "You won't ever be alone, wait for me to come home\n"
                + "Loving can heal, loving can mend your soul\n"
                + "And it's the only thing that I know, know\n"
                + "I swear it will get easier\n"
                + "Remember that with every piece of you\n"
                + "Hm, and it's the only thing we take with us when we die\n"
                + "Hm, we keep this love in this photograph\n"
                + "We made these memories for ourselves\n"
                + "Where our eyes are never closing\n"
                + "Hearts were never broken\n"
                + "And time's forever frozen still\n"
                + "So you can keep me\n"
                + "Inside the pocket of your ripped jeans\n"
                + "Holding me closer 'til our eyes meet\n"
                + "You won't ever be alone\n"
                + "And if you hurt me\n"
                + "That's okay baby, only words bleed\n"
                + "Inside these pages you just hold me\n"
                + "And I won’t ever let you go\n"
                + "Wait for me to come home\n"
                + "Wait for me to come home\n"
                + "Wait for me to come home\n"
                + "Wait for me to come home\n"
                + "Oh, you can fit me\n"
                + "Inside the necklace you got when you were sixteen\n"
                + "Next to your heartbeat where I should be\n"
                + "Keep it deep within your soul\n"
                + "And if you hurt me\n"
                + "Well, that's okay baby, only words bleed\n"
                + "Inside these pages you just hold me\n"
                + "And I won’t ever let you go\n"
                + "When I'm away, I will remember how you kissed me\n"
                + "Under the lamppost back on Sixth street\n"
                + "Hearing you whisper through the phone\n"
                + "\"Wait for me to come home\"";
    }

    public void legendaVideo2() {
        legenda = "Something Just Like This\n"
                + "Coldplay, The Chainsmokers\n"
                + "I've been reading books of old\n"
                + "The legends and the myths\n"
                + "Achilles and his gold\n"
                + "Hercules and his gifts\n"
                + "Spiderman's control\n"
                + "And Batman with his fists\n"
                + "And clearly I don't see myself upon that list\n"
                + "But she said, where'd you wanna go?\n"
                + "How much you wanna risk?\n"
                + "I'm not looking for somebody\n"
                + "With some superhuman gifts\n"
                + "Some superhero\n"
                + "Some fairytale bliss\n"
                + "Just something I can turn to\n"
                + "Somebody I can kiss\n"
                + "I want something just like this\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Oh, I want something just like this\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Oh, I want something just like this\n"
                + "I want something just like this\n"
                + "I've been reading books of old\n"
                + "The legends and the myths\n"
                + "The testaments they told\n"
                + "The moon and its eclipse\n"
                + "And Superman unrolls\n"
                + "A suit before he lifts\n"
                + "But I'm not the kind of person that it fits\n"
                + "She said, where'd you wanna go?\n"
                + "How much you wanna risk?\n"
                + "I'm not looking for somebody\n"
                + "With some superhuman gifts\n"
                + "Some superhero\n"
                + "Some fairytale bliss\n"
                + "Just something I can turn to\n"
                + "Somebody I can miss\n"
                + "I want something just like this\n"
                + "I want something just like this\n"
                + "I want something just like this\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Oh, I want something just like this\n"
                + "Doo-doo-doo, doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Doo-doo-doo, doo-doo-doo\n"
                + "Where'd you wanna go?\n"
                + "How much you wanna risk?\n"
                + "I'm not looking for somebody\n"
                + "With some superhuman gifts\n"
                + "Some superhero\n"
                + "Some fairytale bliss\n"
                + "Just something I can turn to\n"
                + "Somebody I can kiss\n"
                + "I want something just like this\n"
                + "Oh, I want something just like this\n"
                + "Oh, I want something just like this\n"
                + "Oh, I want something just like this";
    }

    public void legendaVideo3() {
        legenda = "A Thousand Years\n"
                + "Christina Perri\n"
                + "The day we met,\n"
                + "Frozen I held my breath\n"
                + "Right from the start\n"
                + "I knew that I'd found a home for my heart\n"
                + "Beats fast\n"
                + "Colors and promises\n"
                + "How to be brave?\n"
                + "How can I love when I'm afraid to fall\n"
                + "But watching you stand alone?\n"
                + "All of my doubt suddenly goes away somehow\n"
                + "One step closer\n"
                + "I have died everyday waiting for you\n"
                + "Darling don't be afraid I have loved you\n"
                + "For a thousand years\n"
                + "I'll love you for a thousand more\n"
                + "Time stands still\n"
                + "Beauty in all she is\n"
                + "I will be brave\n"
                + "I will not let anything take away\n"
                + "What's standing in front of me\n"
                + "Every breath\n"
                + "Every hour has come to this\n"
                + "One step closer\n"
                + "I have died everyday waiting for you\n"
                + "Darling don't be afraid I have loved you\n"
                + "For a thousand years\n"
                + "I'll love you for a thousand more\n"
                + "And all along I believed I would find you\n"
                + "Time has brought your heart to me\n"
                + "I have loved you for a thousand years\n"
                + "I'll love you for a thousand more\n"
                + "I'll love you for a thousand more\n"
                + "Ohh\n"
                + "One step closer\n"
                + "I have died everyday waiting for you\n"
                + "Darling don't be afraid I have loved you\n"
                + "For a thousand years\n"
                + "I'll love you for a thousand more\n"
                + "And all along I believed I would find you\n"
                + "Time has brought your heart to me\n"
                + "I have loved you for a thousand years\n"
                + "I'll love you for a thousand more";
    }

    public void legendaVideo4() {
        legenda = "FRIENDS\n"
                + "Marshmello, Anne-Marie\n"
                + "Ooh ooh, ooh ooh\n"
                + "Ooh ooh, ooh ooh\n"
                + "You say you love me, I say you crazy\n"
                + "We're nothing more than friends\n"
                + "You're not my lover, more like a brother\n"
                + "I known you since we were like ten, yeah\n"
                + "Don't mess it up, talking that shit\n"
                + "Only gonna push me away, that's it\n"
                + "When you say you love me, that make me crazy\n"
                + "Here we go again\n"
                + "Don't go look at me with that look in your eye\n"
                + "You really ain't going away without a fight\n"
                + "You can't be reasoned with, I'm done being polite\n"
                + "I've told you one, two, three, four, five, six thousand times\n"
                + "Haven't I made it obvious?\n"
                + "Haven't I made it clear?\n"
                + "Want me to spell it out for you?\n"
                + "F-R-I-E-N-D-S\n"
                + "Haven't I made it obvious?\n"
                + "Haven't I made it clear?\n"
                + "Want me to spell it out for you?\n"
                + "F-R-I-E-N-D-S\n"
                + "F-R-I-E-N-D-S\n"
                + "Have you got no shame? You looking insane\n"
                + "Turning up at my door\n"
                + "It's two in the morning, the rain is pouring\n"
                + "Haven't we been here before?\n"
                + "Don't mess it up, talking that shit\n"
                + "Only gonna push me away, that's it\n"
                + "Have you got no shame? You looking insane\n"
                + "Here we go again\n"
                + "So don't go look at me with that look in your eye\n"
                + "You really ain't going away without a fight\n"
                + "You can't be reasoned with, I'm done being polite\n"
                + "I've told you one, two, three, four, five, six thousand times\n"
                + "Haven't I made it obvious? (Haven't I made it?)\n"
                + "Haven't I made it clear? (Haven't I made it clear?)\n"
                + "Want me to spell it out for you?\n"
                + "F-R-I-E-N-D-S\n"
                + "Haven't I made it obvious?\n"
                + "Haven't I made it clear? (Haven't I?)\n"
                + "Want me to spell it out for you? (To spell it out for you?)\n"
                + "F-R-I-E-N-D-S\n"
                + "F-R-I-E-N-D-S\n"
                + "F-R-I-E-N-D-S\n"
                + "That's how you f- spell \"friends\"\n"
                + "F-R-I-E-N-D-S\n"
                + "Get that shit inside your head\n"
                + "No, no, yeah, uh, ah\n"
                + "F-R-I-E-N-D-S\n"
                + "We're just friends\n"
                + "So don't go look at me with that look in your eye\n"
                + "You really ain't going nowhere without a fight\n"
                + "You can't be reasoned with, I'm done being polite\n"
                + "I've told you one, two, three, four, five, six thousand times\n"
                + "Haven't I made it obvious? (Have I not made it obvious?)\n"
                + "Haven't I made it clear? (I made it very clear)\n"
                + "Want me to spell it out for you? (Yo)\n"
                + "F-R-I-EN-D-S (I said F-R-I-E-N-D-S)\n"
                + "Haven't I made it obvious? (I made it very obvious)\n"
                + "Haven't I made it clear? (I made it very clear)\n"
                + "Want me to spell it out for you?\n"
                + "F-R-I-E-N-D-S\n"
                + "F-R-I-E-N-D-S\n"
                + "Ooh ooh, ooh ooh\n"
                + "Ah ah ah";
    }

    public void legendaVideo5() {
        legenda = "Human\n"
                + "Rag'n'Bone Man\n"
                + "I'm only human\n"
                + "I'm only, I'm only\n"
                + "I'm only human, human\n"
                + "Maybe I'm foolish\n"
                + "Maybe I'm blind\n"
                + "Thinking I can see through this\n"
                + "And see what's behind\n"
                + "Got no way to prove it\n"
                + "So maybe I'm blind\n"
                + "But I'm only human after all\n"
                + "I'm only human after all\n"
                + "Don't put your blame on me\n"
                + "Don't put your blame on me\n"
                + "Take a look in the mirror\n"
                + "And what do you see\n"
                + "Do you see it clearer\n"
                + "Or are you deceived\n"
                + "In what you believe\n"
                + "'Cause I'm only human after all\n"
                + "You're only human after all\n"
                + "Don't put the blame on me\n"
                + "Don't put your blame on me\n"
                + "Some people got the real problems\n"
                + "Some people out of luck\n"
                + "Some people think I can solve them\n"
                + "Lord heavens above\n"
                + "I'm only human after all\n"
                + "I'm only human after all\n"
                + "Don't put the blame on me\n"
                + "Don't put the blame on me\n"
                + "Don't ask my opinion\n"
                + "Don't ask me to lie\n"
                + "Then beg for forgiveness \n"
                + "For making you cry\n"
                + "Making you cry\n"
                + "'Cause I'm only human after all\n"
                + "I'm only human after all\n"
                + "Don't put your blame on me\n"
                + "Don't put the blame on me\n"
                + "Oh, some people got the real problems\n"
                + "Some people out of luck\n"
                + "Some people think I can solve them\n"
                + "Lord heavens above\n"
                + "I'm only human after all\n"
                + "I'm only human after all\n"
                + "Don't put the blame on me\n"
                + "Don't put the blame on me\n"
                + "I'm only human\n"
                + "I make mistakes\n"
                + "I'm only human \n"
                + "That's all it takes\n"
                + "To put the blame on me\n"
                + "Don't put the blame on me\n"
                + "I'm no prophet or Messiah\n"
                + "Should go looking somewhere higher\n"
                + "I'm only human after all\n"
                + "I'm only human after all\n"
                + "Don't put the blame on me\n"
                + "Don't put the blame on me\n"
                + "I'm only human \n"
                + "I do what I can\n"
                + "I'm just a man \n"
                + "I do what I can\n"
                + "Don't put the blame on me\n"
                + "Don't put your blame on me";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoVideo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        textoVideo.setColumns(20);
        textoVideo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textoVideo.setRows(5);
        jScrollPane2.setViewportView(textoVideo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compare o que você digitou com a legenda do vídeo anterior");

        jButton1.setText("Voltar ao Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TestaListen listen = new TestaListen();
        listen.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CompararTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompararTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompararTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompararTextos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompararTextos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextArea textoVideo;
    // End of variables declaration//GEN-END:variables
}
