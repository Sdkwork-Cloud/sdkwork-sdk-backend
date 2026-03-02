from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateForm:
    """PPT template creation form"""
    title: str
    description: str = None
    cover_images: ImageMediaResourceList = None
    type: str
    status: str
    author_id: int
    author_name: str = None
    tags: PlusPptTemplateTags = None
    meta: PlusPptTemplateMeta = None
    slides: List[PlusPptTemplateSlide] = None
