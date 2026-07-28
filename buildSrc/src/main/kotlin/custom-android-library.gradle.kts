plugins {
  id("com.android.library")
}

android {

    compileSdk {
        version = release(Const.TargetSdk) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = Const.MinSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

}