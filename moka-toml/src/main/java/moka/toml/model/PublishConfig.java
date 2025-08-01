package moka.toml.model;

import java.util.List;
import java.util.Map;

public class PublishConfig {
    private String groupId;
    private String artifactId;
    private String version;
    private String registry;
    private String repositoryUrl;
    private Map<String, String> credentials;
    private List<String> format;
    private boolean autoTag;
    private String tagFormat;
    private boolean sign;
}
