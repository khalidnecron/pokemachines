import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    `java-library`
    kotlin("jvm")
    id("architectury-plugin")
    id("dev.architectury.loom")
//    alias(libs.plugins.kotlin.jvm)
//    alias(libs.plugins.architectury)
//    alias(libs.plugins.loom)
}

repositories {
    maven("https://maven.impactdev.net/repository/development/")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

architectury {
    minecraft = libs.minecraft.get().version!!
}

dependencies {
    minecraft(libs.minecraft)
    mappings(variantOf(libs.yarn) { classifier("v2") })

    testRuntimeOnly(libs.junit.engine)
    testImplementation(libs.junit.api)
    testImplementation(libs.junit.params)
    testImplementation(libs.mockk)
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }

    withType<JavaCompile> {
        options.release.set(17)
    }

    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    withType<Jar> {
        from(rootProject.file("LICENSE"))
    }
}
