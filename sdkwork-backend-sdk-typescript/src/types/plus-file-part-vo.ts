/** 文件分片VO对象 */
export interface PlusFilePartVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 关联的文件ID */
  fileId?: number;
  /** 分片索引(从0开始) */
  chunkIndex?: number;
  /** 分片大小(字节) */
  chunkSize?: number;
  /** 文件总大小(字节) */
  totalSize?: number;
  /** 分片内容校验和 */
  checksum?: string;
  /** 上传状态: 1-上传中, 2-上传完成, 3-上传失败 */
  status?: number;
  /** 分片存储路径 */
  storagePath?: string;
}
