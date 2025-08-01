plugins {
    `java-library`
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation(project(":moka-core"))
}