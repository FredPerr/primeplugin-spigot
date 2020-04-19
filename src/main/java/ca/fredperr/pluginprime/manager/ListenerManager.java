package ca.fredperr.pluginprime.manager;

public class ListenerManager {

    private static ListenerManager instance;

    private ListenerManager(){

    }

    public static ListenerManager getInstance(){
        return instance == null ? instance = new ListenerManager(): instance;
    }
}
