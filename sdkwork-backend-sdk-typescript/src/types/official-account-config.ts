import type { AccountConfigMetadata } from './account-config-metadata';

export interface OfficialAccountConfig {
  id?: number;
  uuid?: string;
  region?: string;
  weight?: number;
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  product?: string;
  functions?: 'NONE' | 'SPEECH_SYNTHESIS' | 'SPEECH_TRANSCRIPTION' | 'SPEECH_TRANSLATION'[];
  metadata?: AccountConfigMetadata;
  properties?: Record<string, unknown>;
  /** OAuthæä¾åç±»å */
  authProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  appId?: string;
  /** å®¢æ·ç«¯å¯é¥ï¼AppSecretï¼ */
  appSecret?: string;
  token?: string;
  /** åè°URL */
  redirectUri?: string;
  /** ææèå´ */
  scope?: string;
  /** æ¯å¦ä¸ºæå¡å· */
  isServiceAccount?: boolean;
  /** Apple Team ID */
  teamId?: string;
  /** Apple Key ID */
  keyId?: string;
  /** Appleç§é¥PEMæ ¼å¼åå®¹ */
  privateKey?: string;
  /** æ¯ä»å®å¬é¥ */
  publicKey?: string;
  secret?: string;
  aesKey?: string;
  qrCodeUrl?: string;
  originalId?: string;
  notifyUrl?: string;
  securityModeEnabled?: boolean;
  accessToken?: string;
  accessTokenExpiresIn?: number;
  accessTokenFetchTime?: number;
  jsSdkEnabled?: boolean;
  jsApiDomain?: string;
  encodingAESKey?: string;
}
