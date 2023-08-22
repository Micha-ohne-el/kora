plugins {
	kotlin("multiplatform") version "1.9.0"
}

kotlin {
	linuxX64()
	macosX64()
	mingwX64()
	jvm()
}
