using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreateUploadFileRequest
    {
        public string? File { get; set; }
    }
}
