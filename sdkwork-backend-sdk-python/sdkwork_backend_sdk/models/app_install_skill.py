from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppInstallSkill:
    """应用安装技能信息"""
    id: int = None
    name: str = None
