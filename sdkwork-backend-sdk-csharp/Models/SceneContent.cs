using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SceneContent
    {
        public List<string>? Scenes { get; set; }
        public List<SceneContent>? Children { get; set; }
    }
}
