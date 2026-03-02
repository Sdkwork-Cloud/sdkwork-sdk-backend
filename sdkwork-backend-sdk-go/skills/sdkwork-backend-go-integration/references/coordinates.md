# SDK Coordinates

- Domain: backend
- Language: go
- SDK package directory: `sdkwork-backend-sdk-go`
- Build descriptor: `go.mod`
- SDK coordinate: `github.com/sdkwork/backend-sdk@v1.0.0`

## Integration Commands

- Registry mode: `go get github.com/sdkwork/backend-sdk@v1.0.0`
- Local mode: `go mod edit -replace github.com/sdkwork/backend-sdk=<path-to-sdkwork-backend-sdk-go> && go mod tidy`

## Validation Commands

- Stage 1: `go mod tidy`
- Stage 5: `go test ./...`

