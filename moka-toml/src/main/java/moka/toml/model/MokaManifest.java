package moka.toml.model;

import moka.toml.annotations.Required;

import java.util.List;
import java.util.Map;

public class MokaManifest {
    @Required
    private ProjectConfig project;
    private Map<String, String> scripts;
    private BuildConfig build;
    private PublishConfig publish;
    private RepositoriesConfig repositories;
    private Map<String, DependencySpec> dependencies;
    private Map<String, DependencySpec> devDependencies;
    private Map<String, List<String>> features;
    private TargetConfig target;

    public ProjectConfig getProject() { return project; }
    public void setProject(ProjectConfig project) { this.project = project; }
    public Map<String, String> getScripts() { return scripts; }
    public void setScripts(Map<String, String> scripts) { this.scripts = scripts; }
    public BuildConfig getBuild() { return build; }
    public void setBuild(BuildConfig build) { this.build = build; }
    public PublishConfig getPublish() { return publish; }
    public void setPublish(PublishConfig publish) { this.publish = publish; }
    public RepositoriesConfig getRepositories() { return repositories; }
    public void setRepositories(RepositoriesConfig repositories) { this.repositories = repositories; }
    public Map<String, DependencySpec> getDependencies() { return dependencies; }
    public void setDependencies(Map<String, DependencySpec> dependencies) { this.dependencies = dependencies; }
    public Map<String, DependencySpec> getDevDependencies() { return devDependencies; }
    public void setDevDependencies(Map<String, DependencySpec> devDependencies) { this.devDependencies = devDependencies; }
    public Map<String, List<String>> getFeatures() { return features; }
    public void setFeatures(Map<String, List<String>> features) { this.features = features; }
    public TargetConfig getTarget() { return target; }
    public void setTarget(TargetConfig target) { this.target = target; }
}
