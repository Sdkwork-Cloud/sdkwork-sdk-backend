using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOssBucketVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? V { get; set; }
        public int? UserId { get; set; }
        public string? Name { get; set; }
        public string? Region { get; set; }
        public string? Channel { get; set; }
        public int? ChannelConfigId { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public string? CreationDate { get; set; }
        public string? Arn { get; set; }
        public string? Endpoint { get; set; }
        public string? StorageClass { get; set; }
        public bool? VersioningEnabled { get; set; }
        public bool? EncryptionEnabled { get; set; }
        public string? EncryptionType { get; set; }
        public string? Acl { get; set; }
    }
}
