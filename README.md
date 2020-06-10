# Jar test
  * a jar that has a system dependency, that contains a crypto API misuse
  * currently pom has hardcoded pointer for system dep, but this push includes all built components


# How to analyse:
```
java -Xss8192k -cp $PREFIXTOCOGNI/CryptoAnalysis/CryptoAnalysis/build/CryptoAnalysis-2.7.1-SNAPSHOT-jar-with-dependencies.jar crypto.HeadlessCryptoScanner  --sootCp$SOOTCP --rulesDir=$PREFIXTOCOGNI/CryptoAnalysis/CryptoAnalysis/src/main/resources/JavaCryptographicArchitecture/ --applicationCp=$PATHTOJARTEST/jarTest/mainJar/target/jarTest-1.0-SNAPSHOT-jar-with-dependencies.jar
```

  * where:
     *  $PREFIXTOCOGNI == path to [latest](https://github.com/CROSSINGTUD/CryptoAnalysis/releases/tag/2.7.1) CogniCrypt_SAST
     * $SOOTCP == a full path to a jce.jar and a rt.jar (example: /Users/knewbury/Desktop/jdks/jdk1.8.0_201/jre/lib/jce.jar:/Users/knewbury/Desktop/jdks/jdk1.8.0_201/jre/lib/rt.jar)
     * $PATHTOJARTEST is the prefix of where the example project has been cloned to