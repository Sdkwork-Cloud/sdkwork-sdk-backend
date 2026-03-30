import type { AccountConfigMetadata } from './account-config-metadata';
import type { IotTransportConfig } from './iot-transport-config';

/** IoT account configuration */
export interface IotAccountConfig {
  id?: number;
  uuid?: string;
  region?: string;
  weight?: number;
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  product?: string;
  functions?: ('NONE' | 'SPEECH_SYNTHESIS' | 'SPEECH_TRANSCRIPTION' | 'SPEECH_TRANSLATION')[];
  metadata?: AccountConfigMetadata;
  properties?: Record<string, Record<string, unknown>>;
  /** List of transport configurations */
  transports?: IotTransportConfig[];
  /** Firmware download URL for device updates */
  firmwareDownloadUrl?: string;
  /** OTA upgrade URL for over-the-air device updates */
  otaUpgradeUrl?: string;
  /** Device registry URL for device management */
  deviceRegistryUrl?: string;
  /** Certificate file path for device authentication */
  certificatePath?: string;
  /** Private key file path for device authentication */
  privateKeyPath?: string;
  /** CA certificate file path for server verification */
  caCertificatePath?: string;
  /** Device data reporting interval in seconds */
  reportingInterval?: number;
  /** Maximum number of retry attempts for failed operations */
  maxRetryAttempts?: number;
  /** Retry interval in milliseconds between retry attempts */
  retryInterval?: number;
}
