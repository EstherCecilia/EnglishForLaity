/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

/**
 *
 * @author ana
 */
import trabalhopratico.ExibeVideo;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class SwingJavaFX { //reproduz o video
    
    private static void ShowGUI(int num) { //num corresponde ao numero do video que foi clicado 
       
        ExibeVideo frame = new ExibeVideo(num); //janela na qual o video sera exibido
       
        final JFXPanel fxPanel = new JFXPanel(); // painel de exibiçao do video
        
        
        fxPanel.setSize(848, 550);
        
        frame.add(fxPanel);
        fxPanel.setVisible(true);
        
        frame.setVisible(true);
        

        Platform.runLater(() -> {
            frame.initFX(fxPanel);
        });
    }

    
    public static void pfv(int num) {
        SwingUtilities.invokeLater(() -> {
            ShowGUI(num); // chama o metodo que carrega o video na tela
        });
    }
}
