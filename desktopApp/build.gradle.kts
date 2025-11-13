plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
    application
}

application {
    mainClass.set("me.alex.janus.chess.MainKt")
}

dependencies {
    implementation(compose.desktop.currentOs)

    implementation(project(":shared"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.8.0")
}
