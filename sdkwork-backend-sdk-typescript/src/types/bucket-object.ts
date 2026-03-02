/** 存储桶对象，包含名称和区域信息 */
export interface BucketObject {
  /** 存储桶名称 */
  name: string;
  /** 存储桶所在区域 */
  region?: string;
  /** 创建时间 */
  creationDate?: string;
  /** ARN */
  arn?: string;
}
