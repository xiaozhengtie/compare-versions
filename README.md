# Compare Versions
## Description
This simple CompareVersions class compares two version numbers version1 and version2.
* If version1 > version2, return 1
* If version1 < version2, return -1
* otherwise, return 0

The assumption is that the version string is valid:
* it is non-empty
* it contains only digits and the 'dot' character
* it is an valid version string, i.e., "1." is not a valid version string

Example of version numbers ordering: 

0.1 < 1.1 < 1.2 < 1.2.9.9.9.9 < 1.3 < 1.3.4 < 1.10

## Prerequisites
Java JDK version 8 or higher, to check, run
```
>java -version
openjdk version "1.8.0_292"
```
Install [gradle](https://gradle.org/install/). You can use sdkman to install it
```
>sdk install gradle
```
You can also open/compile/run it using an IDE (e.g., I use IntelliJ IDEA).
## Runbook
Build and run unit test:
```
./gradlew build
```
You can also open the project in your own IDE and run the `main` method in `CompareVersions` class.
## Code
See the `CompareVersions` class in src/main/java/, and test code in src/test/java/.
### Usage
```java
import com.xztie.compareversions.CompareVersions;
CompareVersions.compareTwoVersions("0.1", "1.1");
```


