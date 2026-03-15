from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillBatchReviewForm:
    """Skill batch review request"""
    skill_ids: List[int]
    comment: str = None
