# RSA Key Generation REST API
This is a simple Spring Boot REST API that generates a new RSA key pair (public and private keys) and returns it in JSON format. 
The API uses Java's KeyPairGenerator to create a 2048-bit RSA key pair and encodes it in Base64.

## Features
Generates a 2048-bit RSA key pair.

Returns both public and private keys in Base64 format.

Getting Started

Prerequisites

    Java 11 or later
    Maven 3.6+
    Project Setup

Features
Generates a 2048-bit RSA key pair.
Returns both public and private keys in Base64 format.
Getting Started
Prerequisites
Java 11 or later
Maven 3.6+
Project Setup
Clone the repository:

bash
Copy code
git clone https://github.com/anddegs/rsa-as-a-service.git
cd rsa-as-a-service

Build the project using Maven:
```
bash
Copy code
mvn clean install
Run the application:
```
```
bash
Copy code
mvn spring-boot:run
```

The API will start on http://localhost:8081.

API Endpoint
The API has one endpoint for generating RSA keys:

Endpoint: GET /api/rsa/generate
Description: Generates a 2048-bit RSA key pair and returns the public and private keys encoded in Base64.

Example Request
```
bash
Copy code
curl http://localhost:8080/api/rsa/generate
```

Example Response
```
json
Copy code
{
"publicKey": "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA...",
"privateKey": "MIIEvQIBADANBgkqhkiG9w0BAQEFAASC..."
}
```

Project Structure
RSAKeyGeneratorService: A service that generates the RSA key pair using KeyPairGenerator.
RSAKeyController: A REST controller that provides an endpoint to generate and retrieve the RSA key pair.
Dependencies
Spring Boot Web: For building RESTful APIs with Spring Boot.
License
This project is licensed under the MIT License.

Feel free to customize this README based on any additional project-specific details or requirements.
    