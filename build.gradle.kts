plugins {
	java
	id("org.springframework.boot") version "3.3.0-SNAPSHOT"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "ua.shuba"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.flywaydb:flyway-core")

	compileOnly("org.projectlombok:lombok:1.18.30")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("org.testcontainers:junit-jupiter")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
