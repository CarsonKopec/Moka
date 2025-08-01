package moka;

import moka.commands.InitCommand;
import moka.commands.RootCommand;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
		int exitCode = new CommandLine(new RootCommand())
                .addSubcommand("init", new InitCommand())
                .execute(args);
        System.exit(exitCode);
    }
}