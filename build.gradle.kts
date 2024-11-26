plugins {
    id("java")
}

group = "home.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    implementation("org.apache.commons:commons-lang3:3.17.0")
    implementation("org.apache.commons:commons-collections4:4.5.0-M2")
    testImplementation("org.assertj:assertj-core:3.22.0")
    implementation("commons-io:commons-io:2.17.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.1")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.18.1")
    implementation("org.netbeans.modules:org-netbeans-modules-web-common:RELEASE180")
    implementation("org.projectlombok:lombok:1.18.36")
    implementation("net.datafaker:datafaker:2.4.2")
}

tasks.test {
    useJUnitPlatform()
}

