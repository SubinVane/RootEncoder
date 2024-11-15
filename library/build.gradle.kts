plugins {
  alias(libs.plugins.android.library)
  alias(libs.plugins.jetbrains.kotlin)
  id(libs.plugins.maven.publish.get().pluginId)
  alias(libs.plugins.jetbrains.dokka)
}

android {
  namespace = "com.pedro.library"
  compileSdk = 34

  defaultConfig {
    minSdk = 23
    targetSdk = 30
  }
  buildTypes {
    release {
      isMinifyEnabled = false
    }
  }
  compileOptions {
    targetCompatibility(JavaVersion.VERSION_1_8)
    sourceCompatibility(JavaVersion.VERSION_1_8)
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }

  publishing {
    singleVariant("release")
  }
}

afterEvaluate {
  publishing {
    publications {
      // Creates a Maven publication called "release".
      create<MavenPublication>("release") {
        // Applies the component for the release build variant.
        from(components["release"])

        // You can then customize attributes of the publication as shown below.
        groupId = libs.versions.libraryGroup.get()
        artifactId = "library"
        version = libs.versions.versionName.get()
      }
    }
  }
}

dependencies {
  implementation(libs.kotlinx.coroutines.android)
  api(project(":encoder"))
  api(project(":rtmp"))
  api(project(":rtsp"))
  api(project(":srt"))
  api(project(":udp"))
  api(project(":common"))
}
