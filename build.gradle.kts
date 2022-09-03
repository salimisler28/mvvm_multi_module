buildscript {

}
plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version Versions.kotlinVersion apply false
    id("com.google.dagger.hilt.android") version(Versions.hilt) apply false
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}