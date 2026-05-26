plugins {
  application
}

java {
  toolchain { languageVersion.set(org.gradle.jvm.toolchain.JavaLanguageVersion.of(17)) }
}

repositories { mavenCentral() }

dependencies {
  implementation("io.javalin:javalin-bundle:6.7.0")
  implementation("org.xerial:sqlite-jdbc:3.50.3.0")

  // ==============================
  // ADICIONADO (recomendado)
  // ==============================

  // Logging (melhor para debug do sistema de grupos)
  implementation("org.slf4j:slf4j-simple:2.0.13")

  // JSON (vai ser MUITO útil para API de grupos/empresas)
  implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")

  // (Opcional futuro) testes
  testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.test {
  useJUnitPlatform()
}

tasks.register<JavaExec>("runHello") {
  group = "application"
  mainClass.set("demo.HelloJavalin")
  classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("runAdviceText") {
  group = "application"
  mainClass.set("demo.RandomAdviceService")
  classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("runAdviceJson") {
  group = "application"
  mainClass.set("demo.RandomAdviceServiceJson")
  classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("runPoi") {
  group = "application"
  mainClass.set("demo.PoiService")
  classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("runSqlite") {
  group = "application"
  mainClass.set("demo.SqliteService")
  classpath = sourceSets["main"].runtimeClasspath
}