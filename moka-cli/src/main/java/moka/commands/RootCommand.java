package moka.commands;

import picocli.CommandLine;

@CommandLine.Command(name = "moka", mixinStandardHelpOptions = true, version = "moka 0.0.1",
description = "Java Developer CLI Toolbox")
public class RootCommand implements Runnable{
    @Override
    public void run() {
        System.out.println("Moka - Java Developer CLI Toolbox\nUse --help to see available commands.");
    }
}
