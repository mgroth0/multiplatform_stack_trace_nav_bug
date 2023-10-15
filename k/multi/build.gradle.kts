plugins {
    application
    kotlin("multiplatform")
}
application {
    mainClass.set("matt.multi.MultiKt")
}
kotlin {
    jvm {
        @Suppress("OPT_IN_USAGE")
        mainRun {
            mainClass = "matt.multi.MultiMainKt"
        }
    }
}
dependencies {

    commonMainImplementation("org.jetbrains.kotlin:kotlin-test:1.9.20-RC")
    commonMainImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.9.20-RC")
    commonMainImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    commonTestRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.withType(Test::class) {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}