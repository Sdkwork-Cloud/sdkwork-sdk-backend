import type { ImageMediaResource } from './image-media-resource';
import type { SocialInfoList } from './social-info-list';
import type { VideoMediaResource } from './video-media-resource';

/** 用户个人资料VO */
export interface PlusUserProfileVO {
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
  faceVideo?: VideoMediaResource;
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
  /** 国家代码 */
  countryCode?: string;
  /** 省份代码 */
  provinceCode?: string;
  /** 城市代码 */
  cityCode?: string;
  /** 区域代码 */
  districtCode?: string;
  /** 详细地址 */
  address?: string;
  /** 个人简介 */
  bio?: string;
  /** 出生日期 */
  birthDate?: string;
  /** 社交信息 */
  socialInfoList?: SocialInfoList;
}
