from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillReviewForm:
    """技能审核参数"""
    comment: str = None
