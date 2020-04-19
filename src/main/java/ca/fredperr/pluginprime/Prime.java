package ca.fredperr.pluginprime;

import ca.fredperr.pluginprime.manager.CmdManager;
import ca.fredperr.pluginprime.manager.FileManager;
import ca.fredperr.pluginprime.manager.ListenerManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Prime extends JavaPlugin {

    private static Prime instance;

    private Prime(){}

    @Override
    public void onEnable() {
        // Creating the files.
        FileManager.getInstance();
        // Creating the commands.
        CmdManager.getInstance();
        // Creating the listeners.
        ListenerManager.getInstance();
    }

    @Override
    public void onDisable(){
        // Save the files.
    }

    public static Prime getInstance(){
        return instance;
    }
}
