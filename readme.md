# Externalized all-open gradle plugin issue


# Overview
When you move plugin `all-open` into external script and apply it over
```gradle
apply plugin: org.jetbrains.kotlin.allopen.gradle.SpringGradleSubplugin
```
Project fails on during tests, when spring tries to start up a context

## To reproduce
Run 
```gradle
./gradlew build
```

## Result
```bash
> Task :test 

com.example.ApplicationTest > contextLoads FAILED
    java.lang.IllegalStateException
        Caused by: org.springframework.beans.factory.parsing.BeanDefinitionParsingException

1 test completed, 1 failed


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///Users/mayd/src/github/all-open-issue/build/reports/tests/test/index.html
```
