/** åºç¨ååºåå¸éç½® */
export interface AppStoreListingConfig {
  /** ååºå¹³å° */
  platform?: 'APPLE_APP_STORE' | 'GOOGLE_PLAY';
  /** ååºä¸­çåºç¨ID */
  storeAppId?: string;
  /** Android åå */
  packageName?: string;
  /** iOS Bundle ID */
  bundleId?: string;
  /** åå¸è½¨é */
  releaseTrack?: 'INTERNAL' | 'ALPHA' | 'BETA' | 'PRODUCTION';
  /** éç§æ¿ç­URL */
  privacyPolicyUrl?: string;
  /** æå¡æ¡æ¬¾URL */
  termsOfServiceUrl?: string;
  /** æ¯æé¡µURL */
  supportUrl?: string;
  /** æ¯æé®ç®± */
  supportEmail?: string;
  /** è¥éé¡µURL */
  marketingUrl?: string;
  /** ä¸»åç±» */
  category?: string;
  /** å­åç±» */
  subcategory?: string;
  /** åå®¹åçº§ */
  contentRating?: string;
  /** è¯­è¨åè¡¨ */
  languages?: string[];
  /** å½å®¶/å°åºåè¡¨ */
  countries?: string[];
  /** åºç¨æªå¾URLåè¡¨ */
  screenshotUrls?: string[];
}
