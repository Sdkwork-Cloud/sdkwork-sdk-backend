import type { ImageMediaResource } from './image-media-resource';
import type { SocialInfoList } from './social-info-list';
import type { VideoMediaResource } from './video-media-resource';

/** ç¨æ·ä¸ªäººèµæVO */
export interface PlusUserProfileVO {
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
  faceVideo?: VideoMediaResource;
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
  /** å½å®¶ä»£ç  */
  countryCode?: string;
  /** çä»½ä»£ç  */
  provinceCode?: string;
  /** åå¸ä»£ç  */
  cityCode?: string;
  /** åºåä»£ç  */
  districtCode?: string;
  /** è¯¦ç»å°å */
  address?: string;
  /** ä¸ªäººç®ä» */
  bio?: string;
  /** åºçæ¥æ */
  birthDate?: string;
  /** ç¤¾äº¤ä¿¡æ¯ */
  socialInfoList?: SocialInfoList;
}
