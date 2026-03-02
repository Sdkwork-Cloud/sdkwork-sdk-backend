import type { ImageMediaResource } from './image-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** Character creation form */
export interface PlusCharacterForm {
  /** 角色名称 */
  name: string;
  /** 角色类型 */
  type: 'HUMAN' | 'PET' | 'ANIMAL' | 'ROBOT' | 'OTHER';
  /** 角色头像图片（资源路径） */
  avatar?: ImageMediaResource;
  /** 角色三视图（资源路径） */
  threeViewImage?: ImageMediaResource;
  /** 角色GRID分镜图（资源路径） */
  gridShotsImage?: ImageMediaResource;
  /** 角色头像视频（资源路径） */
  avatarVideo?: VideoMediaResource;
  /** 关联的AI智能体ID */
  agentId: number;
  /** 角色描述（详细功能说明） */
  description?: string;
  /** 角色状态（启用/禁用/删除） */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 角色个性特征（JSON格式，如{"性格":"开朗","爱好":"音乐"}） */
  personality?: string;
  /** 角色背景故事（JSON格式，如{"出生地":"未来城市","经历":"AI工程师"}） */
  background?: string;
  /** 交互设置（JSON格式，如{"语言":"中文","回复速度":"快"}） */
  interactionSettings?: string;
  /** 角色版本（如v1.0.0） */
  version?: string;
  /** 用户ID */
  userId: number;
}
