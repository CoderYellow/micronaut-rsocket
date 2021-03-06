buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    dependencies {
        classpath("io.micronaut.build.internal:micronaut-gradle-plugins:4.0.0")
    }
}

subprojects {
    group = "org.microjservice.xxx"

    apply(plugin = "io.micronaut.build.internal.common")
    apply(plugin = "io.micronaut.build.internal.dependency-updates")

    apply(plugin = "io.micronaut.build.internal.publishing")
}

apply(plugin = "io.micronaut.build.internal.docs")
apply(plugin = "io.micronaut.build.internal.dependency-updates")