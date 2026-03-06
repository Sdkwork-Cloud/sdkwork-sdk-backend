from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillFeatureForm:
    """技能推荐配置参数"""
    featured: bool = None
    recommend_weight: int = None
