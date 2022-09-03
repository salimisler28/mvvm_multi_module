object Implementation {
    object Compose {
        const val composeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
        const val composeToolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
        const val composeActivity = "androidx.activity:activity-compose:1.5.1"
        const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    }

    object AndroidX {
        const val materialUi3 = "androidx.compose.material3:material3:${Versions.material3}"
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val ktxLifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ktxLifecycle}"
        const val ktxViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ktxViewModel}"
    }

    object DI {
        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:1.0.0"
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    }

    object ReactiveProgramming {
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0-native-mt"
    }

    object Tools {
        const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3"
        const val logger = "com.orhanobut:logger:2.2.0"
    }

    object DataStoring {
        const val dataStore = "androidx.datastore:datastore-preferences:1.0.0"
        const val room = "androidx.room:room-runtime:${Versions.room}"
    }

    object Networking {
        const val ktorClientCore = "io.ktor:ktor-client-core:${Versions.ktorVersion}"
        const val ktorClientCio = "io.ktor:ktor-client-cio:${Versions.ktorVersion}"
        const val ktorClientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktorVersion}"
        const val ktorClientLogging = "io.ktor:ktor-client-logging:${Versions.ktorVersion}"
        const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp:${Versions.ktorVersion}"
    }

    object Navigation {
        const val jetpackComposeNav = "androidx.navigation:navigation-compose:2.5.1"
    }
}

object DebugImplementation {
    object Compose {
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
        const val composeManifest =
            "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    }
}

object AndroidTestImplementation {
    object Compose {
        const val composeUiTestJunit =
            "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
        const val junitTest = "androidx.compose.ui:ui-test-junit4:1.0.5"
    }

    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    const val junit = "androidx.test.ext:junit:1.1.3"

}

object Kapt {
    object DI {
        const val hilt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }
}

object TestImplementation {
    const val junit = "junit:junit:${Versions.junit}"
    const val mockitoCore = "org.mockito:mockito-core:${Versions.mockitoCore}"
    const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:${Versions.mockitoKotlin}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val truth = "com.google.truth:truth:${Versions.truth}"
    const val coroutine =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutineTest}"
    const val turbine = "app.cash.turbine:turbine:0.7.0"
}

object Dependencies {
    object Kapt {
        const val room = "androidx.room:room-compiler:${Versions.room}"
    }

    object AnnotationProcessor {
        const val room = "androidx.room:room-compiler:${Versions.room}"
    }

    object DebugImplementation {
        const val composeUiTestManifest =
            "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    }

    object Classpath {
        const val gradle = "com.android.tools.build:gradle:7.1.0"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
        const val gms = "com.google.gms:google-services:4.3.10"
        const val firebaseCrash = "com.google.firebase:firebase-crashlytics-gradle:2.8.1"
        // const val firebasePerf = "com.google.firebase:perf-plugin:1.4.1"
    }
}