plugins {
    id("com.google.protobuf") version "0.8.18" apply false
    kotlin("jvm") version "1.6.21" apply false
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}