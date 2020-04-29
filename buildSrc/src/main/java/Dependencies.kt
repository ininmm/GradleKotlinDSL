/**
 * Created by Michael Lien
 * on 2020/4/29.
 */
object Dependencies {
    const val androidGradlePlugin = "com.android.tools.build:gradle:4.1.0-alpha07"

    object Kotlin {
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.kotlin}"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.kotlin}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.androidXAppCompat}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.AndroidX.androidXCore}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayout}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.liveData}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.viewModel}"
    }

    object Google {
        const val material = "com.google.android.material:material:${Versions.Google.material}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.Test.junit}"
        const val androidXTestExt = "androidx.test.ext:junit:${Versions.Test.androidXTestExt}"
        const val androidXEspresso = "androidx.test.espresso:espresso-core:${Versions.Test.androidXEspresso}"
    }
}