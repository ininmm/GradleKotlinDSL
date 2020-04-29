import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

/**
 * Created by Michael Lien
 * on 2020/4/29.
 */
fun Project.configAndroid() = this.extensions.getByType<BaseAppModuleExtension>().run {
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

fun BaseAppModuleExtension.kotlinOptions(configure: KotlinJvmOptions.() -> Unit): Unit =
    (this as ExtensionAware).extensions.configure("kotlinOptions", configure)