from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTAnimation:
    """元素动画"""
    id: str
    el_id: str
    effect: str
    type: PPTAnimationType
    duration: int
    trigger: PPTAnimationTrigger
