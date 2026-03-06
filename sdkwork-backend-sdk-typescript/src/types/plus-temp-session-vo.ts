import type { BucketObject } from './bucket-object';

/** 文件VO类，用于存储文件的元数据信息 */
export interface PlusTempSessionVO {
  /** 文件ID */
  fileId?: number;
  /** 临时访问 keyId */
  tmpAccessKeyId?: string;
  /** 临时访问密钥 */
  tmpAccessKeySecret?: string;
  /** 会话 token */
  sessionToken?: string;
  /** 凭证有效秒数 */
  expirationSeconds?: number;
  /** 上传地址 */
  uploadUrl?: string;
  /** 对象 key */
  objectKey?: string;
  /** 桶信息 */
  bucket?: BucketObject;
  /** 创建时间 */
  createTime?: string;
}
