package moka.toml.model;

public class TargetConfig {
    private NativeTarget nativeTarget;
    private JvmTarget jvmTarget;

    public static class NativeTarget {
        private boolean graalvm;
        private String optimize;
        private String initHeapSize;
        private String maxHeapSize;
    }

    public static class JvmTarget {
        private int jdk;
    }
}
