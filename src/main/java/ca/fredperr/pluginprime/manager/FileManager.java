package ca.fredperr.pluginprime.manager;

public class FileManager {

    private static FileManager instance;

    private FileManager(){

    }

    public static FileManager getInstance(){
        return instance == null ? instance = new FileManager(): instance;
    }
}
