from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppInstallPackage:
    """应用安装包定义"""
    id: str = None
    name: str = None
    source_type: str = None
    package_format: str = None
    platform: str = None
    url: str = None
    repository_url: str = None
    branch: str = None
    tag: str = None
    commit_id: str = None
    checksum_algorithm: str = None
    checksum: str = None
    architecture: str = None
    size_bytes: int = None
    enabled: bool = None
