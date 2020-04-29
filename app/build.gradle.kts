plugins {
    id("com.android.application")
}

importCommonPlugins()

configAndroid()

importCommonDependencies()
android {
    // compiler 在 開始 build 的時候沒有辦法確定 script 的 Java 版本
    // 必須在這裡先宣告使用的 Java 版本
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}