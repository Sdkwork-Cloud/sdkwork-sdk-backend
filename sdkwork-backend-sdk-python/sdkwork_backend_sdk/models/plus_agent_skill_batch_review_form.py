from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillBatchReviewForm:
    """技能批量审核参数"""
    skill_ids: List[int]
    comment: str = None
