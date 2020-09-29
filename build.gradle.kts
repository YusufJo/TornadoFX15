plugins {
    kotlin("jvm") version "1.4.10"
    id("org.openjfx.javafxplugin") version "0.0.9"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

javafx {
    version = "15"
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClassName = "main.kt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("no.tornado:tornadofx:2.0.0-SNAPSHOT")
    testImplementation(kotlin("test-junit"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
