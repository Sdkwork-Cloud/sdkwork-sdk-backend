/** 用户信息视图对象 */
export interface UserVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 用户ID */
  id: number;
  /** 用户名 */
  username: string;
  /** 电子邮箱 */
  email?: string;
  /** 手机号码 */
  phone?: string;
}
