#!/bin/bash
echo "SDKWork Backend SDK"
case "$1" in
  build)
    cd "$(dirname "$0")/.." && npm install && npm run build
    ;;
  *)
    echo "Usage: $0 build"
    ;;
esac
