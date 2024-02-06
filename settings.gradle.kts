pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KYR1"
include(":app")
include(":app2")
include(":second2")
include(":hellokitty")
include(":Wednesday")
include(":friday")
include(":rating")
