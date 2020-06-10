package me.Entity303.CommandManager.API;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.plugin.Plugin;

public class CommandManagerAPI {

    /**
     * Registers a new command in runtime
     *
     * @param executor = CommandExecutor for the command
     * @param plugin   = The plugin for the command
     * @param aliases  = The aliases for the command
     */
    public void registerCommand(CommandExecutor executor, Plugin plugin, String... aliases) {
    }

    /**
     * Registers a new command in runtime
     *
     * @param tabExecutor = CommandExecutor and TabCompleter for the command
     * @param plugin      = The plugin for the command
     * @param aliases     = The aliases for the command
     */
    public void registerCommand(TabExecutor tabExecutor, Plugin plugin, String... aliases) {
    }

    /**
     * Registers a new command in runtime
     *
     * @param executor     = CommandExecutor and TabCompleter for the command
     * @param tabCompleter = TabCompleter for the command
     * @param plugin       = The plugin for the command
     * @param aliases      = The aliases for the command
     */
    public void registerCommand(CommandExecutor executor, TabCompleter tabCompleter, Plugin plugin, String... aliases) {
    }

    /**
     * @param recessiveCommand = The recessive command (the command to swap)
     * @param recessivePlugin  = The recessive plugin (the plugin of the recessive command)
     * @param dominantCommand  = The dominant command (the command to swap to)
     * @param dominantPlugin   = The dominant plugin (the plugin of the dominant command)
     */
    public void swapCommands(String recessiveCommand, String recessivePlugin, String dominantCommand, String dominantPlugin) {
    }

    /**
     * @param command        = The command to deactivate
     * @param fromPlugin = The plugin of the command
     */
    public void deactivateCommand(String command, String fromPlugin) {
    }

    /**
     * @param command        = The command which should get a new alias
     * @param fromPlugin = The plugin of the command
     * @param alias      = The alias that should be added to the command
     */
    public void addAlias(String command, String fromPlugin, String alias) {
    }
}
