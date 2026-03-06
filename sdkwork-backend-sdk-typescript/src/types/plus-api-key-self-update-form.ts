/** 开发者自助更新API Key请求 */
export interface PlusApiKeySelfUpdateForm {
  /** API Key名称 */
  name?: string;
  /** 新的过期时间 */
  expireTime?: string;
  /** 是否清空过期时间，true时忽略expireTime */
  clearExpireTime?: boolean;
  /** 描述信息 */
  description?: string;
}
