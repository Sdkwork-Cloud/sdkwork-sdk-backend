import type { FileContentObject } from './file-content-object';

/** 文件内容VO（与PlusFile一对一对应，存储文件的文本内容和编码信息） */
export interface PlusFileContentVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 关联文件ID(外键关联plus_file.id) */
  fileId?: number;
  /** 关联文件UUID(外键关联plus_file.uuid) */
  fileUuid?: string;
  /** 提示词 */
  prompt?: string;
  /** 文件编码格式(如UTF-8、GBK、ISO-8859-1等) */
  encoding?: string;
  /** 文件文本内容 */
  content?: FileContentObject;
}
