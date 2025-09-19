plugins {
    alias(libs.plugins.kotlin.jvm) // <1>
    application // <2>
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

repositories {
    mavenCentral() // <3>
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test") // <4>

    testImplementation(libs.junit.jupiter.engine) // <5>

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(libs.guava) // <6>
}

application {
    mainClass = "demo.AppKt" // <7>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <8>
}
