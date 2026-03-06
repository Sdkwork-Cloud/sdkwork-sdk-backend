import type { BucketObject } from './bucket-object';

/** File upload form */
export interface PlusUploadForm {
  /** OSS provider type */
  provider?: 'ALIYUN_OSS' | 'AWS_S3' | 'TENCENT_COS' | 'AZURE_BLOB' | 'GCS' | 'HUAWEI_OBS' | 'QINIU_KODO' | 'BAIDU_BOS' | 'UPYUN' | 'MINIO';
  /** File name */
  name?: string;
  /** Scene identifier */
  scene?: string;
  /** Bucket object */
  bucket?: BucketObject;
  /** Expiration time in seconds, default is 3600 seconds */
  expirationSeconds?: number;
}
