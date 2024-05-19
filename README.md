# ECOS Solver for Java Native Libraries

[![Build](https://github.com/atraplet/ecos4j-native/actions/workflows/build.yml/badge.svg)](https://github.com/atraplet/ecos4j-native/actions/workflows/build.yml)
[![Maven Central](https://img.shields.io/maven-central/v/com.ustermetrics/ecos4j-native)](https://central.sonatype.com/artifact/com.ustermetrics/ecos4j-native)
[![GPLv3 licensed](https://img.shields.io/badge/license-GPLv3-blue)](https://github.com/atraplet/ecos4j-native/blob/master/LICENSE)

ecos4j-native (ECOS Solver for Java Native Libraries) contains the shared library release binaries
of [ECOS](https://github.com/embotech/ecos) for [ecos4j](https://github.com/atraplet/ecos4j).

## Usage

### Dependency

Add the latest version from [Maven Central](https://central.sonatype.com/artifact/com.ustermetrics/ecos4j-native) to
your `pom.xml`

```
<dependency>
    <groupId>com.ustermetrics</groupId>
    <artifactId>ecos4j-native</artifactId>
    <version>x.y.z</version>
    <scope>runtime</scope>
</dependency>
```

## Build

## Release

Update the version in the `pom.xml`, create a tag, and push it by running

```
export ECOS_VERSION=X.Y.Z
export VERSION=X.Y.Z
export VERSION=$VERSION-$ECOS_VERSION
git checkout --detach HEAD
sed -i -E "s/<version>[0-9]+\-SNAPSHOT<\/version>/<version>$VERSION<\/version>/g" pom.xml
git commit -m "v$VERSION" pom.xml
git tag v$VERSION
git push origin v$VERSION
```

This will trigger the upload of the package to Maven Central via GitHub Actions.

Then, go to the GitHub repository [releases page](https://github.com/atraplet/ecos4j-native/releases) and update the
release.

## Credits

This project is based on the native open source mathematical programming
solver [ECOS](https://github.com/embotech/ecos),
which is developed and maintained by [embotech](https://www.embotech.com), Alexander Domahidi, and others.
