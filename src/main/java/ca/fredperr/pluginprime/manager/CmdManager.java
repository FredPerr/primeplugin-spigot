package ca.fredperr.pluginprime.manager;

public class CmdManager {

    private static CmdManager instance;

    private CmdManager(){
        // Add the command here.
    }

    public static CmdManager getInstance(){
        return instance == null ? instance = new CmdManager(): instance;
    }
}
