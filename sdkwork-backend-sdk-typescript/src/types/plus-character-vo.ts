import type { ImageMediaResource } from './image-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** 虚拟角色VO */
export interface PlusCharacterVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 角色ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 角色名称 */
  name?: string;
  /** 角色类型 */
  type?: 'HUMAN' | 'PET' | 'ANIMAL' | 'ROBOT' | 'OTHER';
  /** 角色头像图片 */
  avatar?: ImageMediaResource;
  /** 角色三视图 */
  threeViewImage?: ImageMediaResource;
  /** 角色GRID分镜图 */
  gridShotsImage?: ImageMediaResource;
  /** 角色头像视频 */
  avatarVideo?: VideoMediaResource;
  /** 关联的AI智能体ID */
  agentId?: number;
  /** 角色描述 (详细功能说明) */
  description?: string;
  /** 角色状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 角色个性特征 (JSON格式存储) */
  personality?: string;
  /** 角色背景故事 (JSON格式存储) */
  background?: string;
  /** 交互设置 (JSON格式存储) */
  interactionSettings?: string;
  /** 角色版本 */
  version?: string;
  /** 用户ID */
  userId?: number;
}
