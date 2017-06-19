# java-client

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
    <groupId>fr.insalyon.creatis.vip</groupId>
    <artifactId>java-client</artifactId>
    <version>0.3</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fr.insalyon.creatis.vip:java-client:0.3"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-client-0.3.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import fr.insalyon.creatis.vip.java_client.*;
import fr.insalyon.creatis.vip.java_client.auth.*;
import fr.insalyon.creatis.vip.java_client.model.*;
import fr.insalyon.creatis.vip.java_client.api.DefaultApi;

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
        String executionIdentifier = "executionIdentifier_example"; // String | 
        DeleteExecutionConfiguration body = new DeleteExecutionConfiguration(); // DeleteExecutionConfiguration | delete configuration
        try {
            apiInstance.deleteExecution(executionIdentifier, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteExecution");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteExecution**](docs/DefaultApi.md#deleteExecution) | **PUT** /executions/{executionIdentifier}/delete | 
*DefaultApi* | [**getExecution**](docs/DefaultApi.md#getExecution) | **GET** /executions/{executionIdentifier} | 
*DefaultApi* | [**getExecutionResults**](docs/DefaultApi.md#getExecutionResults) | **GET** /executions/{executionIdentifier}/results | 
*DefaultApi* | [**getPipeline**](docs/DefaultApi.md#getPipeline) | **GET** /pipelines/{pipelineIdentifier} | 
*DefaultApi* | [**getPlatformProperties**](docs/DefaultApi.md#getPlatformProperties) | **GET** /platform | 
*DefaultApi* | [**getStderr**](docs/DefaultApi.md#getStderr) | **GET** /executions/{executionIdentifier}/stderr | 
*DefaultApi* | [**getStdout**](docs/DefaultApi.md#getStdout) | **GET** /executions/{executionIdentifier}/stdout | 
*DefaultApi* | [**initAndStartExecution**](docs/DefaultApi.md#initAndStartExecution) | **POST** /executions/create-and-start | 
*DefaultApi* | [**initExecution**](docs/DefaultApi.md#initExecution) | **POST** /executions | 
*DefaultApi* | [**killExecution**](docs/DefaultApi.md#killExecution) | **PUT** /executions/{executionIdentifier}/kill | 
*DefaultApi* | [**listExecutions**](docs/DefaultApi.md#listExecutions) | **GET** /executions | 
*DefaultApi* | [**listPipelines**](docs/DefaultApi.md#listPipelines) | **GET** /pipelines | 
*DefaultApi* | [**playExecution**](docs/DefaultApi.md#playExecution) | **PUT** /executions/{executionIdentifier}/play | 
*DefaultApi* | [**updateExecution**](docs/DefaultApi.md#updateExecution) | **PUT** /executions/{executionIdentifier} | 


## Documentation for Models

 - [DeleteExecutionConfiguration](docs/DeleteExecutionConfiguration.md)
 - [ErrorCodeAndMessage](docs/ErrorCodeAndMessage.md)
 - [Execution](docs/Execution.md)
 - [ParameterType](docs/ParameterType.md)
 - [Pipeline](docs/Pipeline.md)
 - [PipelineParameter](docs/PipelineParameter.md)
 - [PlatformProperties](docs/PlatformProperties.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

carmin@googlegroups.com

