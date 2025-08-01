plugins {
    application
    `java-library`
    id("org.graalvm.buildtools.native") version "0.10.2"
}

subprojects {
    apply(plugin = "java-library")
    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }
    repositories {
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    }
    tasks.test {
        useJUnitPlatform()
    }
}


application {
    mainClass.set("moka.Main")
}

graalvmNative {
    binaries {
        named("main") {
            imageName.set("moka")
            mainClass.set("moka.Main")
            buildArgs.add("--report-unsupported-elements-at-runtime")
            buildArgs.add("--no-fallback")
        }
    }
}
