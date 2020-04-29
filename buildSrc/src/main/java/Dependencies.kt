import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*

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

fun Project.importCommonPlugins() {
    plugins.apply("kotlin-android")
    plugins.apply("kotlin-android-extensions")
    plugins.apply("kotlin-kapt")
}

fun Project.importCommonDependencies() {
    dependencies {
        // compiler 在 compilation time 時並不知道這些 configurations 可以被 script 使用　(因為構建順序的原因)，
        // 所以在 runtime 時要主動告知，see：https://github.com/gradle/kotlin-dsl-samples/issues/843，
        // 有兩種宣告方式：
        "implementation"(fileTree("dir" to "libs", "include" to listOf("*.jar")))
        // or
        val implementation by configurations
        val testImplementation by configurations
        val androidTestImplementation by configurations
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
}