# Spring Boot Hazelcast

![Java CI with Maven](https://github.com/gcalsolaro/spring-boot-hazelcast/workflows/Java%20CI%20with%20Maven/badge.svg)
> **Sample application using Hazelcast and Spring Boot**


## Table of Contents

   * [Spring Boot Hazelcast](#spring-boot-hazelcast)
      * [Architecture](#architecture)
      * [Prerequisites](#prerequisites)
      * [Rest API](#rest-api)
         * [Hazelcast Rest API](#hazelcast-rest-api)
      

## Architecture

Microservice architectural style is an approach to developing a single application as a suite of small services.
In this example the technology stack used is provided by Spring Cloud, in particular:

* **_Spring Boot_** - 2.0.0.RELEASE
* **_Spring Hazelcast Integration_** - Centralized external configuration management

## Prerequisites
* **_JDK 8_** - Install JDK 1.8 version
* **_Maven_** - Download latest version



## Rest API

### Hazelcast Rest API

Method | URI | Description | Parameters |
--- | --- | --- | --- |
`GET` | */hazelcast/write-data* |
`GET` | */hazelcast/read-data* |

