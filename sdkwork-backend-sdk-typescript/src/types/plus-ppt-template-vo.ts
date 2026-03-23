import type { ImageMediaResourceList } from './image-media-resource-list';
import type { PlusPptTemplateMeta } from './plus-ppt-template-meta';
import type { PlusPptTemplateSlideVO } from './plus-ppt-template-slide-vo';
import type { PlusPptTemplateTags } from './plus-ppt-template-tags';

/** PPTæ¨¡æ¿VOå¯¹è±¡ï¼å­å¨PPTæ¨¡æ¿çåºæ¬ä¿¡æ¯åå³èå³ç³» */
export interface PlusPptTemplateVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** æ¨¡æ¿åç§° */
  title?: string;
  /** æ¨¡æ¿æè¿° */
  description?: string;
  /** æ¨¡æ¿å°é¢å¾URL */
  coverImages?: ImageMediaResourceList;
  /** æ¨¡æ¿ç±»åï¼1-åä¸/2-æè²/3-æ±æ¥/4-å¶ä»ï¼ */
  type?: 'DEFAULT' | 'BUSINESS' | 'EDUCATION' | 'REPORT' | 'OTHER';
  /** æ¨¡æ¿ç¶æï¼1-å¯ç¨/2-ç¦ç¨/3-èç¨¿ï¼ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DRAFT';
  /** æ¨¡æ¿ä½èID */
  authorId?: number;
  /** æ¨¡æ¿ä½èåç§° */
  authorName?: string;
  /** PPT tagsä¿¡æ¯ */
  tags?: PlusPptTemplateTags;
  /** PPT metaä¿¡æ¯ */
  meta?: PlusPptTemplateMeta;
  /** PPTæ¨¡æ¿è¯¦æåè¡¨ */
  slides?: PlusPptTemplateSlideVO[];
}
