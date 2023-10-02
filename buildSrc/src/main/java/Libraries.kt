import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(dependencyList: List<Any>) {
    for (dependency in dependencyList) {
        add("implementation", dependency)
    }
}

object Versions {
    const val core = "1.9.0"
    const val lifecycle = "2.6.1"
    const val room = "2.5.2"
    const val coroutines = "1.7.3"
    const val ksp = "1.8.10-1.0.9"
}

object Libraries {
    val android = listOf(
        "androidx.core:core-ktx:${Versions.core}",
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    )

    val compose = listOf(
        "androidx.activity:activity-compose:1.7.2",
        "androidx.compose.ui:ui",
        "androidx.compose.ui:ui-graphics",
        "androidx.compose.ui:ui-tooling-preview",
        "androidx.compose.material3:material3"
    )

    val room = listOf(
        "androidx.room:room-runtime:${Versions.room}",
        "androidx.room:room-ktx:${Versions.room}"
    )

    val roomCompiler = listOf(
        "androidx.room:room-compiler:${Versions}"
    )

    val coroutines = listOf(
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    )
}