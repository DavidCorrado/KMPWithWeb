plugins {
    kotlin("js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    //implementation(project(":shared"))
}
kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
}