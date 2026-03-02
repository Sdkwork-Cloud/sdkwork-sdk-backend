from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplate:
    """PPT模板实体，存储模板基本信息、结构定义及关联关系"""
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
    title: str
    description: str = None
    cover_images: ImageMediaResourceList = None
    type: str
    status: str
    author_id: int
    author_name: str = None
    author: PlusUser = None
    tags: PlusPptTemplateTags = None
    meta: PlusPptTemplateMeta = None
    slides: List[PlusPptTemplateSlide] = None
