plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.sevapanov.mobile.bmstu"
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = "com.example.sevapanov.mobile.bmstu"
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        compileSdkPreview = "UpsideDownCake"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Libraries.android)
    implementation(Libraries.compose)
    implementation(Libraries.coroutines)
    implementation(project(":TodoList"))

    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
}