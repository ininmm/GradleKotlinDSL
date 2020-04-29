repositories {
    mavenCentral()
    google()
    jcenter()
}

plugins {
    `kotlin-dsl`
}

dependencies {
    // 讓我們可以自定義 android gradle plugin
    implementation("com.android.tools.build:gradle:4.1.0-alpha07")
    // 讓我們可以自定義 kotlin plugin
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    // 讓我們可以依賴 gradle api 來自定義 custom plugin
    implementation(gradleApi())
    implementation(localGroovy())
}