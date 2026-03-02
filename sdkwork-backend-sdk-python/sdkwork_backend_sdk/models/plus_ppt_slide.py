from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptSlide:
    """PPT幻灯片信息"""
    id: str
    elements: List[PPTBaseElement]
    notes: List[PPTNote] = None
    remark: str = None
    background: PPTSlideBackground = None
    animations: List[PPTAnimation] = None
    turning_mode: PPTTurningMode = None
    section_tag: PPTSectionTag = None
    type: PPTSlideType = None
    payload: PlusPptPayload = None
