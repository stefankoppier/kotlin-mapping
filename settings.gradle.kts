rootProject.name = "kotlin-mapping"

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

include(":processor")
include(":annotations")