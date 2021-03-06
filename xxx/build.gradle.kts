val micronautDocsVersion: String by project
val spockVersion: String by project
val micronautTestVersion: String by project

dependencies {
    annotationProcessor("io.micronaut:micronaut-inject-java")
    annotationProcessor("io.micronaut.docs:micronaut-docs-asciidoc-config-props:$micronautDocsVersion")

    api("io.micronaut:micronaut-inject")

    testImplementation("org.spockframework:spock-core:${spockVersion}") {
        exclude(module = "groovy-all")
    }
    testImplementation( "io.micronaut.test:micronaut-test-spock:$micronautTestVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
