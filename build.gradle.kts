plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit:junit-bom:4.13.1")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnit()
}