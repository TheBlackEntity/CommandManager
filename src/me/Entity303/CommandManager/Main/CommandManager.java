package me.Entity303.CommandManager.Main;

import me.Entity303.CommandManager.API.CommandManagerAPI;

public class CommandManager {
    private static CommandManagerAPI commandManagerAPI;

    public static CommandManagerAPI getCommandManagerAPI() {
        return CommandManager.commandManagerAPI;
    }
}
