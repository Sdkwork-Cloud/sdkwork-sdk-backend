using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerationInput
    {
        public string? Type { get; set; }
        public ImageGenerationInput? Image { get; set; }
        public VideoGenerationInput? Video { get; set; }
        public AudioGenerationInput? Audio { get; set; }
        public MusicGenerationInput? Music { get; set; }
        public CharacterGenerationInput? Character { get; set; }
        public VoiceSpeakerGenerationInput? VoiceSpeaker { get; set; }
        public AudioEffectGenerationInput? AudioEffect { get; set; }
        public BaseGenerationInput? Input { get; set; }
        public string? Prompt { get; set; }
    }
}
