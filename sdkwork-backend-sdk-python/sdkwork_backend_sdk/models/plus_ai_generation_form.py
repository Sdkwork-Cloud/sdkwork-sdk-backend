from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiGenerationForm:
    """AI generation creation form"""
    user_id: int = None
    request_id: str = None
    model: str
    channel: str
    type: str
    cover_images: ImageMediaResourceList = None
    resource_list: AssetMediaResourceList = None
    storyboard: VideoStoryboard = None
    author: AuthorInfo = None
    tags: TagsContent = None
    prompt_id: int = None
    channel_task_id: str = None
    channel_task_status: str = None
    task_created_time: str = None
    task_updated_time: str = None
    cost: float = None
    status: str
    request_time: str = None
    response_time: str = None
    usage_record_id: int = None
    conversation_id: int = None
    message_id: int = None
