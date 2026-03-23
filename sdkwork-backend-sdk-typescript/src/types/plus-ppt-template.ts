import type { ImageMediaResourceList } from './image-media-resource-list';
import type { PlusPptTemplateMeta } from './plus-ppt-template-meta';
import type { PlusPptTemplateSlide } from './plus-ppt-template-slide';
import type { PlusPptTemplateTags } from './plus-ppt-template-tags';
import type { PlusUser } from './plus-user';

/** PPTæ¨¡æ¿å®ä½ï¼å­å¨æ¨¡æ¿åºæ¬ä¿¡æ¯ãç»æå®ä¹åå³èå³ç³» */
export interface PlusPptTemplate {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  /** æ¨¡æ¿åç§°ï¼ç³»ç»åå¯ä¸ */
  title: string;
  /** æ¨¡æ¿åè½ãéç¨åºæ¯ç­è¯¦ç»è¯´æ */
  description?: string;
  /** å°é¢å¾çURLåè¡¨ */
  coverImages?: ImageMediaResourceList;
  /** æ¨¡æ¿åç±»ç±»å */
  type: 'BUSINESS' | 'EDUCATION' | 'REPORT' | 'OTHER';
  /** æ¨¡æ¿ä½¿ç¨ç¶æ */
  status: 'ACTIVE' | 'DISABLED' | 'DRAFT';
  /** æ¨¡æ¿åå»ºèIDï¼å³èç¨æ·è¡¨ä¸»é®ï¼ */
  authorId: number;
  /** æ¨¡æ¿åå»ºèå§åï¼åä½å­æ®µï¼ä¼åæ¥è¯¢æ§è½ï¼ */
  authorName?: string;
  /** æ¨¡æ¿ä½èè¯¦ç»ä¿¡æ¯ï¼å³èç¨æ·è¡¨ï¼ */
  author?: PlusUser;
  /** æ¨¡æ¿æ ç­¾éåï¼JSONæ ¼å¼å­å¨ */
  tags?: PlusPptTemplateTags;
  /** æ¨¡æ¿åæ°æ®ï¼åå«å®½é«ãä¸»é¢ç­éç½® */
  meta?: PlusPptTemplateMeta;
  /** æ¨¡æ¿åå«çå¹»ç¯çé¡µé¢åè¡¨ */
  slides?: PlusPptTemplateSlide[];
}
