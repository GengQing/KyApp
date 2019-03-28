apply plugin: 'java'
apply plugin: 'maven'

apply plugin: 'application'


apply plugin: 'org.javafxports.jfxmobile'




mainClassName = 'pers.geng.qing.ky.Main'

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'org.javafxports:jfxmobile-plugin:1.3.16'
    }
}

group = 'pers.geng.qing.ky'
version = '1.0-SNAPSHOT'

description = """"""

sourceCompatibility = 1.8
targetCompatibility = 1.8
tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
}


repositories {

    jcenter()

    maven { url "http://repo.maven.apache.org/maven2" }
}
dependencies {
    compile group: 'org.projectlombok', name: 'lombok', version: '1.16.22'
    compile group: 'org.jfree', name: 'fxgraphics2d', version: '1.8'
    compile group: 'org.scilab.forge', name: 'jlatexmath', version: '1.0.7'
    testCompile group: 'junit', name: 'junit', version: '4.12'
}

jfxmobile {
    downConfig {
        version = '3.8.6'
        // Do not edit the line below. Use Gluon Mobile Settings in your project context menu instead
        plugins 'display', 'lifecycle', 'statusbar', 'storage'
    }
    android {
        manifest = 'src/android/AndroidManifest.xml'
        packagingOptions {
            exclude 'META-INF/LICENSE'
            exclude 'META-INF/NOTICE.txt'
            exclude 'META-INF/COPYING'
        }
    }


}
