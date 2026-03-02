# SDKWork Backend SDK

This directory contains all generated SDK artifacts for the `backend` API group.

## OpenAPI Source

- Local snapshot: `backend-openapi-8080.json`
- Runtime endpoint: `http://localhost:8080/v3/api-docs/backend`

Before regeneration, make sure the endpoint returns a valid OpenAPI 3.x document.

## Generated Languages

- `sdkwork-backend-sdk-typescript`
- `sdkwork-backend-sdk-python`
- `sdkwork-backend-sdk-go`
- `sdkwork-backend-sdk-java`
- `sdkwork-backend-sdk-kotlin`
- `sdkwork-backend-sdk-swift`
- `sdkwork-backend-sdk-csharp`
- `sdkwork-backend-sdk-flutter`

## Regenerate SDKs

Run from repository root:

```bash
node sdk/sdkwork-sdk-generator/bin/sdkgen.js generate \
  -i spring-ai-plus-business-api/sdkwork-sdk-backend/backend-openapi-8080.json \
  -o spring-ai-plus-business-api/sdkwork-sdk-backend/sdkwork-backend-sdk-<language> \
  -n sdkwork-backend-sdk \
  -t backend \
  -l <language> \
  --base-url http://localhost:8080 \
  --api-prefix /backend/v3/api
```

`<language>` supports:

- `typescript`
- `python`
- `go`
- `java`
- `kotlin`
- `swift`
- `csharp`
- `flutter`

## Refresh OpenAPI Snapshot

If you want to regenerate from the latest running service schema:

```bash
curl http://localhost:8080/v3/api-docs/backend -o spring-ai-plus-business-api/sdkwork-sdk-backend/backend-openapi-8080.json
```

## Authentication Modes (Mutually Exclusive)

Use exactly one auth mode for the same client instance.

1. API Key mode
- Header: `Authorization: Bearer <apiKey>`

2. Dual-token mode
- Header: `Access-Token: <accessToken>`
- Header: `Authorization: Bearer <authToken>`

Do not configure API key together with dual tokens on the same client instance.

## Publish Standard (Per Language `bin`)

Every language SDK directory now includes:

- `bin/publish-core.mjs` (shared cross-platform publish core)
- `bin/publish.sh` (Linux/macOS entrypoint)
- `bin/publish.ps1` (Windows/PowerShell entrypoint)

Example:

```bash
cd spring-ai-plus-business-api/sdkwork-sdk-backend/sdkwork-backend-sdk-typescript
./bin/publish.sh --action check
./bin/publish.sh --action publish --channel release
```

```powershell
cd spring-ai-plus-business-api/sdkwork-sdk-backend/sdkwork-backend-sdk-java
.\bin\publish.ps1 --action publish --channel test --dry-run
```

Actions:

- `check`: validate package and publish prerequisites
- `build`: build package artifact only
- `publish`: publish to target registry (or tag-based release for Go/Swift)

Common target ecosystems:

- TypeScript -> npm (`npm publish`)
- Python -> PyPI/TestPyPI (`python -m twine upload`)
- Java/Kotlin -> Maven Central compatible flow (`mvn deploy` / `gradle publish`)
- C# -> NuGet (`dotnet nuget push`)
- Flutter -> pub.dev (`dart pub publish`)
- Go/Swift -> Git tag release flow (proxy/index consumption)

## Client Naming

The generated primary client name is unified across languages:

- `SdkworkBackendClient`

Each language package includes its own usage examples in its local `README.md`.

## Language README Entrypoints

- `sdkwork-backend-sdk-typescript/README.md`
- `sdkwork-backend-sdk-python/README.md`
- `sdkwork-backend-sdk-go/README.md`
- `sdkwork-backend-sdk-java/README.md`
- `sdkwork-backend-sdk-kotlin/README.md`
- `sdkwork-backend-sdk-swift/README.md`
- `sdkwork-backend-sdk-csharp/README.md`
- `sdkwork-backend-sdk-flutter/README.md`

## Troubleshooting

- If input is not a valid OpenAPI 3.x document, generation fails fast by design.
- If the input payload is an upstream error envelope (`code/msg`) instead of schema, generation stops with source validation error.
- Verify your running endpoint first: `http://localhost:8080/v3/api-docs/backend`.
