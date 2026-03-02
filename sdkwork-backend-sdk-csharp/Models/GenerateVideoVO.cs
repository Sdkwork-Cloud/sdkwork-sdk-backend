using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateVideoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RequestId { get; set; }
        public string? TaskId { get; set; }
        public string? TaskStatus { get; set; }
        public VideoMediaResourceList? Videos { get; set; }
        public string? Status { get; set; }
    }
}
