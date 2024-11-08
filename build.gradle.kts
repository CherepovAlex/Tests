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
    implementation("org.apache.commons:commons-lang3:3.17.0")
    implementation("org.apache.commons:commons-collections4:4.5.0-M2")
}

tasks.test {
    useJUnitPlatform()
}

