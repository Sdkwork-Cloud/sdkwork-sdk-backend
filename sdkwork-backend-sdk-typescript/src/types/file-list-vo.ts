import type { FileItemVO } from './file-item-vo';

/** 文件列表视图对象 */
export interface FileListVO {
  /** 文件列表 */
  data?: FileItemVO[];
  /** 对象类型 */
  object?: string;
}
