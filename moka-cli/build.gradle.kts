plugins {
    id("java")
}

group = "moka"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":moka-core"))
    implementation(project(":moka-toml"))
    implementation(project(":moka-resolver"))
    implementation(project(":moka-lock"))
    implementation(project(":moka-build"))
    implementation(project(":moka-scripting"))
    implementation(project(":moka-publish"))
    implementation("info.picocli:picocli:4.7.7")
    annotationProcessor("info.picocli:picocli-codegen:4.7.5")
    implementation("com.github.spullara.mustache.java:compiler:0.9.10")
}
