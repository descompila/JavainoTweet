/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Samuelson
 */
public class ArduinoTwitter {
    
    public void enviar(String valor){
         ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setOAuthConsumerKey("QSyJ1oY2R0crZhL9DfvigQV1i")
                .setOAuthConsumerSecret("T26bdiSEgHM7JuNLY6ZAqpGdC17A4zPjFoE41N1nwj5IrceM6Z")
                .setOAuthAccessToken("115984791-h3x3AZTou6nuGc9E655rX3727UwmMGocGrgsWYiL")
                .setOAuthAccessTokenSecret("4aVMCVzSM2JYgOCEPSHkdNmFPovRDB5Hd75AIgabHQGKX");

        Twitter twitter = new TwitterFactory(cb.build()).getInstance();

        try {
            Status status = twitter.updateStatus("[Bandido "+valor+"cm próximo detectado]");
        } catch (TwitterException ex) {
            System.err.println("Erro:"+ex);
        }
    }
    
}
