plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("MagiskPlugin") {
            id = "MagiskPlugin"
            implementationClass = "MagiskPlugin"
        }
    }
}

dependencies {
    implementation(embeddedKotlin("gradle-plugin"))
    implementation("com.android.tools.build:gradle:8.4.2")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.4")
    implementation("org.lsposed.lsparanoid:gradle-plugin:0.5.2")
    implementation("org.eclipse.jgit:org.eclipse.jgit:6.7.0.202309050840-r")
}