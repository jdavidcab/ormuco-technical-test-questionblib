# Compare two String Library

This is a Java library that accepts 2 version string as input and returns whether one is greater than, equal, or less than the other.

## Documentation

The documentation was generated with Javadocs library and it is here in this repository. Folder below: 

```bash
/target/side/index.html
```

## Published

The service was published on AWS EC2 server over docker container. It was implemented with only POST method, url below:

```bash
http://ec2-54-67-7-50.us-west-1.compute.amazonaws.com:8081/compare/twoString
```

Request 1: The locale information is take to System Locale.
```bash
{
    "strNum1" : "1.2",
    "strNum2" : "1.1"
}
```

Request 2: The locale information is take to System Locale.
```bash
{
    "strNum1" : "1.2",
    "strNum2" : "1.1",
    "locale" : {
        "language" : "en",
        "country" : "CA"
    }
}
```

Response:
```bash
{
    "compareInd": 1,
    "description": "strNum1 is greater than strNum2"
}
```

The git code for Restful service published that use this library is below:
```bash
https://github.com/jdavidcab/ormuco-technical-test-questionbrest
```

## Docker image
The docker image was published in docker hub site. URL below:

```bash
https://hub.docker.com/repository/docker/jdavidcab/ormuco-technicaltest-questionb
```

## Test information
The goal of this question is to write a software library that accepts 2 version string as input and returns whether one is greater than, equal, or less than the other. As an example: “1.2” is greater than “1.1”. Please provide all test cases you could think of.