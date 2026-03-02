import type { AccountConfigMetadata } from './account-config-metadata';
import type { EmbeddingAccountConfig } from './embedding-account-config';

export interface VectorAccountConfig {
  id?: number;
  uuid?: string;
  region?: string;
  weight?: number;
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  product?: string;
  functions?: 'NONE' | 'SPEECH_SYNTHESIS' | 'SPEECH_TRANSCRIPTION' | 'SPEECH_TRANSLATION'[];
  metadata?: AccountConfigMetadata;
  properties?: Record<string, unknown>;
  dimension?: number;
  indexType?: 'None' | 'FLAT' | 'IVF_FLAT' | 'IVF_SQ8' | 'IVF_PQ' | 'HNSW' | 'HNSW_SQ' | 'HNSW_PQ' | 'HNSW_PRQ' | 'DISKANN' | 'AUTOINDEX' | 'SCANN' | 'GPU_IVF_FLAT' | 'GPU_IVF_PQ' | 'GPU_BRUTE_FORCE' | 'GPU_CAGRA' | 'BIN_FLAT' | 'BIN_IVF_FLAT' | 'TRIE' | 'STL_SORT' | 'INVERTED' | 'BITMAP' | 'SPARSE_INVERTED_INDEX' | 'SPARSE_WAND';
  indexName?: string;
  embeddingConfigId?: number;
  databaseName?: string;
  collectionName?: string;
  embeddingConfig?: EmbeddingAccountConfig;
}
