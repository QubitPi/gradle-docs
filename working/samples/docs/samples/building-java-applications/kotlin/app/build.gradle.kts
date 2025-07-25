plugins {
    application // <1>
}

repositories {
    mavenCentral() // <2>
}

dependencies {
    testImplementation(libs.junit.jupiter) // <3>

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(libs.guava) // <4>
}

application {
    mainClass = "demo.App" // <5>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <6>
}
