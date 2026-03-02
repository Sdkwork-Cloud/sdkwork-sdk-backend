/** Payment creation form */
export interface PlusPaymentForm {
  /** 支付用途: ORDER-商品订单, MEMBER-会员服务, POINTS-积分充值, OTHER-其他业务 */
  purpose: 'ORDER' | 'MEMBER' | 'POINTS' | 'OTHER';
  /** 关联的订单ID */
  orderId: number;
  /** 第三方支付交易ID(如支付宝、微信支付的交易号) */
  transactionId?: string;
  /** 商户订单号/支付渠道订单号 */
  outTradeNo?: string;
  /** 支付渠道: ALIPAY-支付宝, WECHAT-微信支付, UNIONPAY-银联支付, BALANCE-余额支付 */
  channel?: 'DEFAULT' | 'ALIYUN' | 'AWS' | 'APPLE' | 'AZURE' | 'BAIDU' | 'VOLCENGINE' | 'TENCENT' | 'HUAWEI' | 'GOOGLE' | 'META' | 'WECHAT' | 'ALIPAY' | 'UNION_PAY' | 'UNIONPAY' | 'DOUYIN' | 'MICROSOFT' | 'AMAZON' | 'ANTHROPIC' | 'XAI' | 'DEEPSEEK' | 'GROQ' | 'HUGGING_FACE' | 'KUAISHOU' | 'MINIMAX' | 'MISTRAL' | 'MOONSHOT' | 'NVIDIA' | 'OPENAI' | 'OLLAMA' | 'PERPLEXITY' | 'SDKWORK' | 'SILICONFLOW' | 'STEPFUN' | 'XUNFEI' | 'ZHIPU' | 'RAGFLOW' | 'STABILITY' | 'MINDSDB' | 'MEM0' | 'BOCHA' | 'BING' | 'OPEN_ROUTER' | 'STRIPE' | 'PAYPAL' | 'SUNO' | 'VIDU' | 'RUNWAY' | 'MEITUAN' | 'YUNWU' | 'MIDJOURNEY' | 'IDEOGRAM' | 'FLUX' | 'VECTOR_STORE_AZURE' | 'VECTOR_STORE_CASSANDRA' | 'VECTOR_STORE_CHROMA' | 'VECTOR_STORE_COUCHBASE' | 'VECTOR_STORE_ELASTICSEARCH' | 'VECTOR_STORE_GEMFIRE' | 'VECTOR_STORE_MARIADB' | 'VECTOR_STORE_MILVUS' | 'VECTOR_STORE_MONGODB' | 'VECTOR_STORE_NEO4J' | 'VECTOR_STORE_OPENSEARCH' | 'VECTOR_STORE_ORACLE' | 'VECTOR_STORE_PGVECTOR' | 'VECTOR_STORE_PINECONE' | 'VECTOR_STORE_QDRANT' | 'VECTOR_STORE_REDIS' | 'VECTOR_STORE_TYPESENSE' | 'VECTOR_STORE_WEAVIATE';
  /** 支付状态: PENDING-待支付, SUCCESS-支付成功, FAILED-支付失败, REFUNDED-已退款 */
  status?: 'DEFAULT' | 'PENDING' | 'SUCCESS' | 'FAILED' | 'TIMEOUT' | 'CLOSED';
  /** 支付金额 */
  amount: number;
  /** 支付成功时间 */
  successTime?: string;
  /** 支付备注信息 */
  remark?: string;
  /** 关联内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID */
  contentId?: number;
  /** 支付产品类型 */
  productType?: 'JSAPI' | 'NATIVE' | 'APP' | 'H5' | 'MINIAPP' | 'MICROPAY' | 'PC' | 'WEB' | 'WITHHOLDING' | 'WALLET' | 'ONLINE_BANK' | 'APPLE_PAY' | 'GOOGLE_PAY' | 'DIGITAL_CURRENCY';
  /** 支付提供商 */
  provider?: 'WECHAT_PAY' | 'ALIPAY' | 'UNION_PAY' | 'APPLE_PAY' | 'GOOGLE_PAY' | 'PAYPAL' | 'STRIPE' | 'AMAZON_PAY' | 'VISA' | 'MASTERCARD' | 'AMERICAN_EXPRESS' | 'DISCOVER' | 'JCB' | 'DINERS_CLUB' | 'BANK_TRANSFER' | 'CASH' | 'CREDIT_CARD' | 'DEBIT_CARD';
}
