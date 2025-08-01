package moka.commands;

import moka.util.TemplateService;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@CommandLine.Command(name = "init", description = "Scaffold a new Java project")
public class InitCommand implements Runnable {
    @CommandLine.Parameters(index = "0", description = "Name of the project")
    private String projectName;

    @Override
    public void run() {
        try {
            Path projectDir = Paths.get(projectName);
            Files.createDirectories(projectDir.resolve("src/main/java"));
            Files.createDirectories(projectDir.resolve("src/test/java"));
            Map<String, Object> context = Map.of("jdkVersion", 21);
            TemplateService.render("templates/build.gradle.kts.mustache", context, projectDir.resolve("build.gradle.kts"));
            Files.writeString(projectDir.resolve("settings.gradle"), "rootProject.name = \"" + projectName + "\"\n");
            System.out.println("Project '" + projectName + "' initialized.");
        } catch (IOException e) {
            System.err.println("Failed to initialize project: " + e.getMessage());
        }
    }
}
