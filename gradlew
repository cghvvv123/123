#!/bin/sh
# Gradle wrapper script for Minecraft Fabric Mod
echo "Running Gradle build..."
exec java -Xmx1G -Xms1G -Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en -jar gradle/gradle-8.7/lib/gradle-launcher-8.7.jar "$@"
