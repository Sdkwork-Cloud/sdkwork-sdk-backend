import type { PlusFileObject } from './plus-file-object';
import type { PlusPptContext } from './plus-ppt-context';
import type { PlusPptSlide } from './plus-ppt-slide';
import type { PlusPptTheme } from './plus-ppt-theme';
import type { TagsContent } from './tags-content';

/** PPTé¡¹ç®ä¿¡æ¯ */
export interface PlusPptProject {
  /** Project ID */
  id?: string;
  /** Project UUID */
  uuid?: string;
  /** Project Type */
  type?: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  /** å±å¹ç±»å */
  screenType?: 'PHONE' | 'TABLET' | 'LAPTOP' | 'DESKTOP' | 'TV';
  /** Sdké¡¹ç®åç§° */
  name: string;
  /** é¡¹ç®æ é¢ */
  title: string;
  /** é¡¹ç®ææèç±»å */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** é¡¹ç®ææèID */
  ownerId?: number;
  /** ç½çID */
  diskId?: number;
  /** Sdkæä»¶åè¡¨ */
  files?: PlusFileObject[];
  /** ä½è */
  author?: string;
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåä¿®æ¹æ¶é´ */
  lastModifiedTime?: string;
  /** çæ¬å· */
  version?: string;
  /** AIè¾å¥çéæ±æç¤ºè¯ */
  prompt?: string;
  /** é¡¹ç®æè¿° */
  description?: string;
  /** æ ç­¾åè¡¨ */
  tags?: TagsContent;
  /** PPTå®½åº¦(åç´ ) */
  width: number;
  /** PPTé«åº¦(åç´ ) */
  height: number;
  /** å¹»ç¯çæ°ç» */
  slides: PlusPptSlide[];
  /** PPTä¸»é¢ */
  theme?: PlusPptTheme;
  /** PPTä¸ä¸æä¿¡æ¯ */
  context?: PlusPptContext;
  /** PPTå¯æ é¢ */
  subtitle?: string;
  /** æ¯å¦åå«é¡µç  */
  includePageNumbers?: boolean;
  /** æ¯å¦åå«é¡µè */
  includeFooter?: boolean;
  /** é¡µèææ¬ */
  footerText?: string;
  /** å¯¼åºæ ¼å¼ */
  exportFormat?: 'pptx' | 'pdf' | 'jpg' | 'png';
}
