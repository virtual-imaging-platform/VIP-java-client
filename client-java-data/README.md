# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String uri = "uri_example"; // String | 
        try {
            Path result = apiInstance.createPath(uri);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createPath");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**createPath**](docs/DefaultApi.md#createPath) | **POST** /path/directory | 
*DefaultApi* | [**deletePath**](docs/DefaultApi.md#deletePath) | **DELETE** /path | 
*DefaultApi* | [**doesPathExists**](docs/DefaultApi.md#doesPathExists) | **GET** /path/exists | 
*DefaultApi* | [**downloadFile**](docs/DefaultApi.md#downloadFile) | **GET** /path/content | 
*DefaultApi* | [**getPath**](docs/DefaultApi.md#getPath) | **GET** /path | 
*DefaultApi* | [**listDirectory**](docs/DefaultApi.md#listDirectory) | **GET** /path/directory | 
*DefaultApi* | [**uploadFile**](docs/DefaultApi.md#uploadFile) | **PUT** /path/content | 


## Documentation for Models

 - [ErrorCodeAndMessage](docs/ErrorCodeAndMessage.md)
 - [Path](docs/Path.md)
 - [UploadData](docs/UploadData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: apiKey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



