import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform") version "1.7.21"
    `maven-publish`
    `java-library`
}

group = "cc.polyfrost.crashparser"
version = "1.0.0"

kotlin {
    jvm()
    js().nodejs()

    sourceSets {
        all {
            languageSettings.optIn("kotlin.js.ExperimentalJsExport")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "18"
}