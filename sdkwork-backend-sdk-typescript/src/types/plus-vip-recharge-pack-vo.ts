/** VIP充值套餐VO对象 */
export interface PlusVipRechargePackVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 套餐ID */
  id?: number;
  /** 套餐名称 */
  name?: string;
  /** 套餐描述 */
  description?: string;
  /** 套餐价格(元) */
  price?: number;
  /** 赠送灵点数量 */
  pointAmount?: number;
  /** VIP时长(天) */
  vipDurationDays?: number;
  /** 套餐状态(1-上架 2-下架) */
  status?: number;
  /** 排序权重 */
  sortWeight?: number;
  /** 套餐有效期开始时间 */
  validFrom?: string;
  /** 套餐有效期结束时间 */
  validTo?: string;
  /** 备注信息 */
  remark?: string;
}
