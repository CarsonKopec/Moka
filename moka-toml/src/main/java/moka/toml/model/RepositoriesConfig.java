package moka.toml.model;

import java.util.Map;

public class RepositoriesConfig {
    private Map<String, String> repositories;

    public Map<String, String> getRepositories() {
        return repositories;
    }

    public void setRepositories(Map<String, String> repositories) {
        this.repositories = repositories;
    }
}
