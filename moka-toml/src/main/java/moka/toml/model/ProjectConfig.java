package moka.toml.model;

import java.util.List;

public class ProjectConfig {
    private String name;
    private String version;
    private String description;
    private int jdk;
    private String main;
    private List<String> members;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getJdk() { return jdk; }
    public void setJdk(int jdk) { this.jdk = jdk; }

    public String getMain() { return main; }
    public void setMain(String main) { this.main = main; }

    public List<String> getMembers() { return members; }
    public void setMembers(List<String> members) { this.members = members; }
}
