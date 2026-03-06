from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppInstallConfig:
    """应用安装配置"""
    packages: List[AppInstallPackage] = None
    default_package_id: str = None
    install_command: str = None
    launch_command: str = None
    uninstall_command: str = None
    metadata: Dict[str, Any] = None
