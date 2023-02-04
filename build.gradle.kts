plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

//    lets plot
    implementation ("org.jetbrains.lets-plot:lets-plot-common:3.0.0")
    implementation ("org.jetbrains.lets-plot:lets-plot-kotlin-jvm:4.2.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}