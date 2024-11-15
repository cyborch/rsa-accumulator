plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm").version("2.0.20")
}

group = "org.starcoin.rsa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.12")
    implementation("com.google.guava:guava:20.0")
}

tasks.test {
    useJUnitPlatform()
}
