import type { PlusFileObject } from './plus-file-object';
import type { PlusPptContext } from './plus-ppt-context';
import type { PlusPptSlide } from './plus-ppt-slide';
import type { PlusPptTheme } from './plus-ppt-theme';
import type { TagsContent } from './tags-content';

/** PPT项目信息 */
export interface PlusPptProject {
  /** Project ID */
  id?: string;
  /** Project UUID */
  uuid?: string;
  /** Project Type */
  type?: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  /** 屏幕类型 */
  screenType?: 'PHONE' | 'TABLET' | 'LAPTOP' | 'DESKTOP' | 'TV';
  /** Sdk项目名称 */
  name: string;
  /** 项目标题 */
  title: string;
  /** 项目所有者类型 */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** 项目所有者ID */
  ownerId?: number;
  /** 网盘ID */
  diskId?: number;
  /** Sdk文件列表 */
  files?: PlusFileObject[];
  /** 作者 */
  author?: string;
  /** 创建时间 */
  createdAt?: string;
  /** 最后修改时间 */
  lastModifiedTime?: string;
  /** 版本号 */
  version?: string;
  /** AI输入的需求提示词 */
  prompt?: string;
  /** 项目描述 */
  description?: string;
  /** 标签列表 */
  tags?: TagsContent;
  /** PPT宽度(像素) */
  width: number;
  /** PPT高度(像素) */
  height: number;
  /** 幻灯片数组 */
  slides: PlusPptSlide[];
  /** PPT主题 */
  theme?: PlusPptTheme;
  /** PPT上下文信息 */
  context?: PlusPptContext;
  /** PPT副标题 */
  subtitle?: string;
  /** 是否包含页码 */
  includePageNumbers?: boolean;
  /** 是否包含页脚 */
  includeFooter?: boolean;
  /** 页脚文本 */
  footerText?: string;
  /** 导出格式 */
  exportFormat?: 'pptx' | 'pdf' | 'jpg' | 'png';
}
