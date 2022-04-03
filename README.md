# Eureka

- Service Discovery

# 의존성

```
spring-cloud-starter-netflix-eureka-server
```

# 설정

- application.yaml
    ```yaml
    spring:
      application:
        name: eurekasample
    
    eureka:
      client:
        register-with-eureka: false
        fetch-registry: false
    ```

- EurekaSampleApplication.java
    - @EnableEurekaServer 설정 필요
   ```java
    
    @EnableEurekaServer // Eureka 서버로서 동작하도록 함
    public class EurekaSampleApplication {
        // ...
    }
    ```

# 등록 서비스 목록 확인

```
1. Application 실행
2. http://localhost:8761 접속
```

# Sample Service List

- [API Gateway](https://github.com/TonyJev93/msa-spring-cloud-gateway-sample.git)
- [User-Service](https://github.com/TonyJev93/msa-sample-user-service.git)
