pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMPWithWeb"
include(":androidApp")
include(":shared")
include(":webApp")