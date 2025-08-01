package moka.toml.model;

import java.util.List;
import java.util.Map;

public class BuildConfig {
    private List<String> output;
    private Map<String, Object> jar;
    private Map<String, Object> fatJar;
    private Map<String, Object> nativeConfig;
}
