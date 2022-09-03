plugins {
    id(Plugins.application)
    id(Plugins.kotlin)
    id(Plugins.kapt)
    id(Plugins.hilt)
}

android {
    compileSdk = Versions.compileSdkVersion

    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Implementation.AndroidX.core)
    implementation(Implementation.AndroidX.ktxLifecycle)
    implementation(Implementation.AndroidX.ktxViewModel)
    implementation(Implementation.Compose.composeUi)
    implementation(Implementation.Compose.composeMaterial)
    implementation(Implementation.Compose.composeToolingPreview)
    implementation(Implementation.Compose.composeActivity)
    implementation(Implementation.DI.hilt)
    implementation(Implementation.DI.hiltNavigation)
    kapt(Kapt.DI.hilt)
    implementation(Implementation.Navigation.jetpackComposeNav)
    debugImplementation(DebugImplementation.Compose.composeTooling)
    debugImplementation(DebugImplementation.Compose.composeManifest)
    androidTestImplementation(AndroidTestImplementation.Compose.junitTest)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espresso)
    testImplementation(TestImplementation.junit)

    implementation(project(Modules.Features.splash))
    implementation(project(Modules.Features.bottombar))
    implementation(project(Modules.Features.search))

}