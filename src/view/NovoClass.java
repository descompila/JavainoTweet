/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author samuelson
 */
public class NovoClass {

    public static void main(String[] args) {

        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setOAuthConsumerKey("QSyJ1oY2R0crZhL9DfvigQV1i")
                .setOAuthConsumerSecret("T26bdiSEgHM7JuNLY6ZAqpGdC17A4zPjFoE41N1nwj5IrceM6Z")
                .setOAuthAccessToken("115984791-h3x3AZTou6nuGc9E655rX3727UwmMGocGrgsWYiL")
                .setOAuthAccessTokenSecret("4aVMCVzSM2JYgOCEPSHkdNmFPovRDB5Hd75AIgabHQGKX");

        Twitter twitter = new TwitterFactory(cb.build()).getInstance();

        try {
            Status status = twitter.updateStatus("[Enviado via Java]: Teste");
        } catch (TwitterException ex) {
            System.err.println("Erro:"+ex);
        }
        
        
//        List<Status> statuses;
//        try {
//
//            statuses = twitter.getHomeTimeline();
//
//            System.out.println("Showing home timeline.");
//            for (Status status : statuses) {
//                System.out.println(status.getUser().getName() + ":" + status.getText());
//            }
//
//        } catch (TwitterException ex) {
//            Logger.getLogger(NovoClass.class.getName()).log(Level.SEVERE, null, ex);
//        }


//
//        Query query = new Query("#testejava");
//        QueryResult result;
//        try {
//            result = twitter.search(query);
//
//            for (Status status : result.getTweets()) {
//                System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText()+" : "+status.getCreatedAt());
//            }
//            System.out.println("CONT: "+result.getCount());
//        } catch (TwitterException ex) {
//            System.err.println("Erro: "+ex);
//        }
    }

}
