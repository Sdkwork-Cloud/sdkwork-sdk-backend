import type { DatasourceConfig } from './datasource-config';
import type { TagsContent } from './tags-content';

/** Data source creation form (includes name, type, connection config) */
export interface PlusDatasourceForm {
  /** Project ID */
  projectId: number;
  /** Datasource name */
  name: string;
  /** Channel */
  channel: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** External channel ID */
  channelId: string;
  /** Datasource type */
  type: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 99;
  /** Datasource status */
  status: 1 | 0 | -1 | -2;
  /** Description */
  description?: string;
  /** Connection configuration */
  connectionConfig: DatasourceConfig;
  /** Datasource URL */
  url?: string;
  /** Owner */
  owner?: string;
  /** Last connected time */
  lastConnectedAt?: string;
  /** Connection timeout in seconds */
  connectionTimeout?: number;
  /** Tags */
  tags?: TagsContent;
  /** Database version */
  dbVersion?: string;
  /** Security level */
  securityLevel?: number;
  /** Access count */
  accessCount?: number;
  /** Icon */
  icon?: string;
  /** Display color */
  color?: string;
}
