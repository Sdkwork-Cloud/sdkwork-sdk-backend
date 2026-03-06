using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTempSessionVO
    {
        public int? FileId { get; set; }
        public string? TmpAccessKeyId { get; set; }
        public string? TmpAccessKeySecret { get; set; }
        public string? SessionToken { get; set; }
        public int? ExpirationSeconds { get; set; }
        public string? UploadUrl { get; set; }
        public string? ObjectKey { get; set; }
        public BucketObject? Bucket { get; set; }
        public string? CreateTime { get; set; }
    }
}
