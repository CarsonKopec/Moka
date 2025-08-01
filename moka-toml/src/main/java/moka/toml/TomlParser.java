package moka.toml;

import moka.toml.model.MokaManifest;
import moka.toml.model.ProjectConfig;
import org.tomlj.Toml;
import org.tomlj.TomlParseResult;
import org.tomlj.TomlTable;

import java.nio.file.Path;
import java.util.Objects;

public class TomlParser {
    public static MokaManifest parse(Path tomlFile) throws Exception {
        TomlParseResult result = Toml.parse(tomlFile);
        MokaManifest manifest = new MokaManifest();
        projectSetter(manifest.getProject(), result);
        return manifest;
    }

    private static void projectSetter(ProjectConfig project, TomlTable projectTable) {
        project.setName(projectTable.getString("name"));
        project.setVersion(projectTable.getString("version"));
        project.setDescription(projectTable.getString("description"));
        project.setJdk(Objects.requireNonNull(projectTable.getLong("jdk")).intValue());
        project.setMain(projectTable.getString("main"));
    }
}
