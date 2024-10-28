# 1. Gradle을 사용하여 빌드하기 위한 기본 이미지 설정
FROM gradle:7.4.0-jdk17 as build

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. Gradle Wrapper 및 소스 코드 복사
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src ./src

# 4. 애플리케이션 빌드
RUN ./gradlew build -x test

# 5. 실행할 최종 이미지 설정
FROM eclipse-temurin:17-jre-alpine

# 6. 빌드된 JAR 파일 복사
COPY --from=build /app/build/libs/*.jar app.jar

# 7. 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]