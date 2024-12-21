plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.user.auth"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
// https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
	runtimeOnly ("org.postgresql:postgresql")
	implementation("org.springframework.boot:spring-boot-starter-data-rest")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
// https://mvnrepository.com/artifact/org.springframework.data/spring-data-jpa
	implementation("org.jetbrains.kotlin:kotlin-reflect")
// https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt-api
	implementation("io.jsonwebtoken:jjwt-api:0.11.5")
	implementation("com.auth0:java-jwt:4.4.0")
// https://mvnrepository.com/artifact/jakarta.persistence/jakarta.persistence-api

	implementation("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation(kotlin("stdlib-jdk8"))
	developmentOnly("org.springframework.boot:spring-boot-devtools")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
