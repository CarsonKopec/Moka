plugins {
    `java-library`
}

dependencies {
    implementation("org.tomlj:tomlj:1.1.1")
    implementation(project(":moka-core"))
}