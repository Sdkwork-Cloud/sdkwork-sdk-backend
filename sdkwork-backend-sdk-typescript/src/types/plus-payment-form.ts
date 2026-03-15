/** Payment creation form */
export interface PlusPaymentForm {
  /** Payment purpose */
  purpose: 'ORDER' | 'MEMBER' | 'POINTS' | 'OTHER';
  /** Order ID */
  orderId: number;
  /** Transaction ID */
  transactionId?: string;
  /** External trade number */
  outTradeNo?: string;
  /** Payment channel */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** Payment provider */
  provider?: 'WECHAT_PAY' | 'ALIPAY' | 'UNION_PAY' | 'APPLE_PAY' | 'GOOGLE_PAY' | 'PAYPAL' | 'STRIPE' | 'AMAZON_PAY' | 'VISA' | 'MASTERCARD' | 'AMERICAN_EXPRESS' | 'DISCOVER' | 'JCB' | 'DINERS_CLUB' | 'BANK_TRANSFER' | 'CASH' | 'CREDIT_CARD' | 'DEBIT_CARD';
  /** Payment status */
  status?: 'DEFAULT' | 'PENDING' | 'SUCCESS' | 'FAILED' | 'TIMEOUT' | 'CLOSED';
  /** Payment amount */
  amount: number;
  /** Payment success time */
  successTime?: string;
  /** Remark */
  remark?: string;
  /** Content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Content ID */
  contentId?: number;
  /** Payment product type */
  productType?: 'JSAPI' | 'NATIVE' | 'APP' | 'H5' | 'MINIAPP' | 'MICROPAY' | 'PC' | 'WEB' | 'WITHHOLDING' | 'WALLET' | 'ONLINE_BANK' | 'APPLE_PAY' | 'GOOGLE_PAY' | 'DIGITAL_CURRENCY';
}
