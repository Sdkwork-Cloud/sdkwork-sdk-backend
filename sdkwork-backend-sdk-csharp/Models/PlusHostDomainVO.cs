using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusHostDomainVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? DomainName { get; set; }
        public string? Tld { get; set; }
        public string? Registrar { get; set; }
        public int? OwnerId { get; set; }
        public string? RegisteredAt { get; set; }
        public string? ExpiredAt { get; set; }
        public string? Status { get; set; }
        public DnsServers? DnsServers { get; set; }
        public string? ResolutionStatus { get; set; }
        public bool? AutoRenew { get; set; }
        public string? Remark { get; set; }
        public List<PlusDnsRecordVO>? DnsRecords { get; set; }
    }
}
