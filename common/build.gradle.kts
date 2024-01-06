plugins {
	id("pokemachines.base-conventions")
	alias(libs.plugins.kotlin.serialization)
}

architectury {
	common("fabric", "forge")
}

dependencies {
	implementation(libs.kotlin.stdlib)
	implementation(libs.kotlin.reflect)
	implementation(libs.kotlin.json)

	modApi(libs.architectury)

	modImplementation(libs.fabric.loader)

	modImplementation(libs.cobblemon.common)
}

//tasks {
//	publishing {
//		publications {
//			create<MavenPublication>("mavenFabric") {
//			}
//		}
//
//		// See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
//		repositories {
//			// Add repositories to publish to here.
//			// Notice: This block does NOT have the same function as the block in the top level.
//			// The repositories here will be used for publishing your artifact, not for
//			// retrieving dependencies.
//		}
//	}
//}
