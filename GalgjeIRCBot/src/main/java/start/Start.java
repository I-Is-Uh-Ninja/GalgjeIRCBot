/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import irc.RaadBotChatter;
import irc.WoordBotChatter;
import java.io.IOException;
import org.jibble.pircbot.IrcException;

/**
 *
 * @author Ian
 */
public class Start {
    private static WoordBotChatter woordBotChatter;
    private static RaadBotChatter raadBotChatter;
    
    public static void main(String[] args) {
        woordBotChatter = new WoordBotChatter();
        raadBotChatter = new RaadBotChatter("#rsvierGalgje");
        try {
                woordBotChatter.connect("openirc.snt.utwente.nl");
                woordBotChatter.joinChannel("#rsvierGalgje");
                WoordBotManager.setWoordBotChatter(woordBotChatter);
                raadBotChatter.connect("openirc.snt.utwente.nl");
                raadBotChatter.joinChannel("#rsvierGalgje");
                RaadBotManager.setRaadBotChatter(raadBotChatter);
        } catch (IOException | IrcException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
}
