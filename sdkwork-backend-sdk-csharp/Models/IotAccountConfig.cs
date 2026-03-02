using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class IotAccountConfig
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Region { get; set; }
        public int? Weight { get; set; }
        public string? Channel { get; set; }
        public string? Product { get; set; }
        public List<string>? Functions { get; set; }
        public AccountConfigMetadata? Metadata { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public List<IotTransportConfig>? Transports { get; set; }
        public string? FirmwareDownloadUrl { get; set; }
        public string? OtaUpgradeUrl { get; set; }
        public string? DeviceRegistryUrl { get; set; }
        public string? CertificatePath { get; set; }
        public string? PrivateKeyPath { get; set; }
        public string? CaCertificatePath { get; set; }
        public int? ReportingInterval { get; set; }
        public int? MaxRetryAttempts { get; set; }
        public int? RetryInterval { get; set; }
    }
}
