plugins {
    id("buildlogic.groovy-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    mainClass = "demo.app.App" // <1>
}
