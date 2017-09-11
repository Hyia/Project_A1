package pe.hyiafactory.gamecore.project_a1;

/**
 * Engine will be core of ProjectA1.
 * needs dynamic calculations, maybe also threads.
 *
 * # game stream
 * game title -> choose or create hero -> tutorial when create hero -> make first deck to dive dungeon
 * { fight -> receive skill card from monster } loop until top of the tower or hero fell down.
 * if hero fallen, return making first deck maker.
 * if reached top, get last battle for boss, Evil one.
 *
 * @Athor Hyia
 * @Since Mon Sep 11 2017
 */
public class Engine{

    // TODO: need field for Player, having his cards, deck......
    // FIXME: this game would be single player game. maybe Database needed?



    private static Engine instance = null;
    public Engine getInstance(){
        if(instance == null){
            instance = new Engine();
        }
        return instance;
    }
    private Engine(){

    }


    public static String getString(){
        return "hello world!";
    }



}