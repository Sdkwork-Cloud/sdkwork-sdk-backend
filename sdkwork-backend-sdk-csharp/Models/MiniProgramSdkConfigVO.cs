using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MiniProgramSdkConfigVO
    {
        public string? AppId { get; set; }
        public int? Timestamp { get; set; }
        public string? NonceStr { get; set; }
        public string? Signature { get; set; }
        public List<string>? JsApiList { get; set; }
    }
}
