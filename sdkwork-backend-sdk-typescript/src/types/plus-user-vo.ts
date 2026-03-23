import type { ImageMediaResource } from './image-media-resource';
import type { SocialInfoList } from './social-info-list';

/** System User Value Object */
export interface PlusUserVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·ID */
  id?: number;
  /** ç¨æ·UUID */
  uuid?: string;
  /** ç¨æ·å¤´å */
  faceImage?: ImageMediaResource;
  /** ç¨æ·è§é¢ä»ç» */
  faceVideo?: ImageMediaResource;
  /** ç¨æ·å(å¯ä¸) */
  username?: string;
  /** æµç§° */
  nickname?: string;
  /** çµå­é®ç®± */
  email?: string;
  /** ææºå·ç  */
  phone?: string;
  /** æ§å« */
  gender?: 'UNKNOWN' | 'MALE' | 'FEMALE' | 'NEUTRAL';
  /** ç¨æ·ç¶æ(ACTIVE:æ´»è·,INACTIVE:æªæ¿æ´»,LOCKED:éå®,DELETED:å·²å é¤) */
  status?: 'ACTIVE' | 'INACTIVE';
  /** ç¨æ·è§è²IDéå */
  roleIds?: number[];
  /** ç¨æ·è§è²åç§°éå */
  roleNames?: string[];
  /** ç¤¾äº¤ä¿¡æ¯ */
  socialInfoList?: SocialInfoList;
}
