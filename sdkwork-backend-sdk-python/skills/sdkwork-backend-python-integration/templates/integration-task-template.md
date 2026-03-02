# SDK Integration Task Template

## Context

- Domain: backend
- Language: python
- SDK package: `sdkwork-backend-sdk-python`
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

- Registry integration: `pip install sdkwork-backend-sdk==1.0.0`
- Local integration: `pip install <path-to-sdkwork-backend-sdk-python>`
- Stage 1 verification: `python -m pip show sdkwork-backend-sdk`
- Stage 5 verification: `python -m pytest`

## Deliverables

- [ ] Dependency integrated
- [ ] Client configured
- [ ] Minimal API call path verified
- [ ] Advanced capabilities verified (if enabled)
- [ ] Handoff + rollback documented

