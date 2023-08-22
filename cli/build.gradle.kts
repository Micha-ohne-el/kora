import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
	kotlin("multiplatform") version "1.9.0"
	application
}

kotlin {
	linuxX64()
	macosX64()
	mingwX64()
	jvm()

	targets.withType<KotlinNativeTarget> {
		binaries {
			executable {
				entryPoint = "main"
				baseName = "kora"
			}
		}
	}

	sourceSets {
		getByName("commonMain") {
			dependencies {
				implementation(project(":common"))
				implementation(project(":language"))

				implementation("com.github.ajalt.clikt:clikt:4.2.0")
			}
		}
	}
}
