package moka.toml.model;

public class DependencySpec {
    private String group;
    private String artifact;
    private String version;
    private String scope;
    private boolean optional;
    private String alias;

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public String getArtifact() { return artifact; }
    public void setArtifact(String artifact) { this.artifact = artifact; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getScope() { return scope; }
    public void setScope(String scope) { this.scope = scope; }

    public boolean isOptional() { return optional; }
    public void setOptional(boolean optional) { this.optional = optional; }

    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }
}
