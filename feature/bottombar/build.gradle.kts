plugins {
    id(Plugins.library)
    id(Plugins.kotlin)
    id(Plugins.kapt)
    id(Plugins.hilt)
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 28
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
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
}

dependencies {
    implementation(Implementation.AndroidX.core)
    implementation(Implementation.AndroidX.ktxLifecycle)
    implementation(Implementation.AndroidX.ktxViewModel)
    implementation(Implementation.Compose.composeUi)
    implementation(Implementation.Compose.composeMaterial)
    implementation(Implementation.Compose.composeToolingPreview)
    implementation(Implementation.Navigation.jetpackComposeNav)
    implementation(Implementation.DI.hilt)
    implementation(Implementation.DI.hiltNavigation)
    kapt(Kapt.DI.hilt)

    implementation(project(Modules.Features.home))
    implementation(project(Modules.Features.search))
}