plugins {
	kotlin("multiplatform") version "1.9.0"
}

kotlin {
	linuxX64()
	macosX64()
	mingwX64()
	jvm()

	sourceSets {
		getByName("commonMain") {
			dependencies {
				implementation(project(":common"))
			}
		}

		getByName("commonTest") {
			dependencies {
				implementation(kotlin("test"))
			}
		}
	}
}
