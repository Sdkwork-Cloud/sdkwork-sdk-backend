import type { RtcMetricsVO } from './rtc-metrics-vo';

export interface RtcParticipantVO {
  userId?: string;
  name?: string;
  role?: string;
  joinTime?: string;
  status?: string;
  device?: string;
  audioStatus?: boolean;
  videoStatus?: boolean;
  uplink?: RtcMetricsVO;
  downlink?: RtcMetricsVO;
}
