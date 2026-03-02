import type { ImageMediaResource } from './image-media-resource';
import type { SocialInfoList } from './social-info-list';

/** System User Value Object */
export interface PlusUserVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 用户ID */
  id?: number;
  /** 用户UUID */
  uuid?: string;
  /** 用户头像 */
  faceImage?: ImageMediaResource;
  /** 用户视频介绍 */
  faceVideo?: ImageMediaResource;
  /** 用户名(唯一) */
  username?: string;
  /** 昵称 */
  nickname?: string;
  /** 电子邮箱 */
  email?: string;
  /** 手机号码 */
  phone?: string;
  /** 性别 */
  gender?: 'UNKNOWN' | 'MALE' | 'FEMALE' | 'NEUTRAL';
  /** 用户状态(ACTIVE:活跃,INACTIVE:未激活,LOCKED:锁定,DELETED:已删除) */
  status?: 'ACTIVE' | 'INACTIVE';
  /** 用户角色ID集合 */
  roleIds?: number[];
  /** 用户角色名称集合 */
  roleNames?: string[];
  /** 社交信息 */
  socialInfoList?: SocialInfoList;
}
