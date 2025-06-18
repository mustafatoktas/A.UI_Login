plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)

    //kotlin 2.0.0 üstü için
    alias(libs.plugins.compose.compiler)

    //ksp
    alias(libs.plugins.devtools.ksp)

    //hilt
    alias(libs.plugins.dagger.hilt.android)

    //serialization (navigation için)
    alias(libs.plugins.kotlinx.serialization)

    //navigation için
    id("kotlin-parcelize")
}

android {
    namespace = "com.mustafatoktas.loginui"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.mustafatoktas.loginui"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.7.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //hilt
    implementation(libs.dagger.hilt.android)
    implementation(libs.hilt.navigation.compose)
    ksp(libs.dagger.hilt.compiler)

    //Lifecycle
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)

    // Coroutines
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    //splash screen
    implementation(libs.androidx.core.splashscreen)

    //icon paketi
    implementation(libs.androidx.material.icons.extended)

    //Navigation
    implementation(libs.androidx.navigation.compose)

    //serialization (navigation için)
    implementation(libs.kotlinx.serialization.json)

    //coil (image cashing)
    implementation(libs.coil.compose)

    //konfetti
    implementation(libs.konfetti)
}