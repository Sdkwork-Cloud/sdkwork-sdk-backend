# SDK Coordinates

- Domain: backend
- Language: kotlin
- SDK package directory: `sdkwork-backend-sdk-kotlin`
- Build descriptor: `build.gradle.kts`
- SDK coordinate: `com.sdkwork:backend-sdk:1.0.0`

## Integration Commands

- Registry mode: `implementation("com.sdkwork:backend-sdk:1.0.0")`
- Local mode: `implementation(files("<path-to-sdkwork-backend-sdk-kotlin/build/libs/*.jar"))`

## Validation Commands

- Stage 1: `gradle build -x test`
- Stage 5: `gradle test`

