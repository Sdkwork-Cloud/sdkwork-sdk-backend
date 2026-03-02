# SDK Integration Task Template

## Context

- Domain: backend
- Language: typescript
- SDK package: `sdkwork-backend-sdk-typescript`
- Target app path: <fill>
- Integration mode: <registry | local-path>

## Stage Plan

1. Stage 0 Discover
2. Stage 1 Wire Dependency
3. Stage 2 Configure Client
4. Stage 3 Minimal Viable Call
5. Stage 4 Advanced Capability (optional)
6. Stage 5 Verify and Handoff

## Commands

- Registry integration: `pnpm add @sdkwork/backend-sdk`
- Local integration: `pnpm add file:<path-to-sdkwork-backend-sdk-typescript>`
- Stage 1 verification: `pnpm install`
- Stage 5 verification: `pnpm run build`

## Deliverables

- [ ] Dependency integrated
- [ ] Client configured
- [ ] Minimal API call path verified
- [ ] Advanced capabilities verified (if enabled)
- [ ] Handoff + rollback documented

