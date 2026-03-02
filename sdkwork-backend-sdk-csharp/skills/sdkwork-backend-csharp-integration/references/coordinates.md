# SDK Coordinates

- Domain: backend
- Language: csharp
- SDK package directory: `sdkwork-backend-sdk-csharp`
- Build descriptor: `Backend.csproj`
- SDK coordinate: `Backend@1.0.0`

## Integration Commands

- Registry mode: `dotnet add package Backend --version 1.0.0`
- Local mode: `dotnet add <target.csproj> reference <path-to-sdkwork-backend-sdk-csharp/Backend.csproj>`

## Validation Commands

- Stage 1: `dotnet restore`
- Stage 5: `dotnet test`

