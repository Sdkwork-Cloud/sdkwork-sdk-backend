from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateVO:
    """PPT模板VO对象，存储PPT模板的基本信息及关联关系"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    description: str = None
    cover_images: ImageMediaResourceList = None
    type: str = None
    status: str = None
    author_id: int = None
    author_name: str = None
    tags: PlusPptTemplateTags = None
    meta: PlusPptTemplateMeta = None
    slides: List[PlusPptTemplateSlideVO] = None
