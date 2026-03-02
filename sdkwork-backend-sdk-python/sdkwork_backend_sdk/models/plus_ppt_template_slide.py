from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateSlide:
    """PPT模板幻灯片配置，存储模板中单个幻灯片的结构和属性"""
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
    template_id: int
    ppt_template: PlusPptTemplate = None
    type: PPTSlideType
    title: str = None
    description: str = None
    sort_order: int
    layout_type: str = None
    slide_config: PlusPptSlide = None
    payload: PlusPptPayload = None
    pptturning_mode: PPTTurningMode = None
