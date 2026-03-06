/** 开发者自助创建API Key请求 */
export interface PlusApiKeySelfCreateForm {
  /** API Key名称 */
  name: string;
  /** API Key类型，默认USER */
  type?: 'DEFAULT' | 'SYSTEM' | 'USER' | 'APPLICATION' | 'INTEGRATION';
  /** 过期时间，留空表示不过期 */
  expireTime?: string;
  /** 描述信息 */
  description?: string;
}
