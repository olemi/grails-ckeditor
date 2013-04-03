grails.project.class.dir = "target/classes"

grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"

grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    inherits "global" // inherit Grails' default dependencies
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
    }

    plugins {
        build ":tomcat:$grailsVersion"
        build (":release:2.2.1") {
			export = false
		}
    }

    dependencies {
    }

}
