plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.App.sdk)
    buildToolsVersion(Versions.App.buildTool)

    defaultConfig {
        applicationId = Versions.App.id
        minSdkVersion(Versions.App.minSdk)
        targetSdkVersion(Versions.App.sdk)
        versionCode = Versions.App.versionCode
        versionName = Versions.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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
}

dependencies {
    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.Google.material)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.AndroidX.liveData)
    implementation(Dependencies.AndroidX.viewModel)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.androidXTestExt)
    androidTestImplementation(Dependencies.Test.androidXEspresso)
}