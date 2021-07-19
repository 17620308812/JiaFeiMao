package jfm.live2d.server.controller;


import jfm.common.response.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class ModelController {


    @GetMapping("/get/{modelId}/{modelTexturesId}")
    public Object getModelById(@PathVariable("modelId") String modelId,@PathVariable String modelTexturesId){

        return "{\n" +
                "    \"version\": \"Sample 1.0.0\",\n" +
                "    \"model\": \"/HyperdimensionNeptunia/nepmaid/moc/model.moc\"," +
                "    \"textures\": [\n" +
                "        \"/HyperdimensionNeptunia/nepmaid/textures/00.png\",\n" +
                "        \"/HyperdimensionNeptunia/nepmaid/textures/01.png\",\n" +
                "        \"/HyperdimensionNeptunia/nepmaid/textures/02.png\"\n" +
                "    ],\n" +
                "    \"pose\": \"../model/HyperdimensionNeptunia/nepmaid/../nepnep/general/pose.json\",\n" +
                "    \"physics\": \"../model/HyperdimensionNeptunia/nepmaid/physics.json\",\n" +
                "    \"layout\": {\n" +
                "        \"center_x\": 0,\n" +
                "        \"center_y\": -0.5,\n" +
                "        \"width\": 3\n" +
                "    },\n" +
                "    \"hit_areas_custom\": {\n" +
                "        \"head_x\": [\n" +
                "            -0.35,\n" +
                "            0.6\n" +
                "        ],\n" +
                "        \"head_y\": [\n" +
                "            0.19,\n" +
                "            -0.2\n" +
                "        ],\n" +
                "        \"body_x\": [\n" +
                "            -0.3,\n" +
                "            -0.25\n" +
                "        ],\n" +
                "        \"body_y\": [\n" +
                "            0.3,\n" +
                "            -0.9\n" +
                "        ]\n" +
                "    },\n" +
                "    \"expressions\": [\n" +
                "        {\n" +
                "            \"name\": \"normal\",\n" +
                "            \"file\": \"/HyperdimensionNeptunia/nepmaid/exp/normal.json\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"happy\",\n" +
                "            \"file\": \"/HyperdimensionNeptunia/nepmaid/exp/happy.json\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"unhappy\",\n" +
                "            \"file\": \"/HyperdimensionNeptunia/nepmaid/exp/unhappy.json\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"kira\",\n" +
                "            \"file\": \"/HyperdimensionNeptunia/nepmaid/exp/kira.json\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"deformed\",\n" +
                "            \"file\": \"/HyperdimensionNeptunia/nepmaid/exp/deformed.json\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"enjoy\",\n" +
                "            \"file\": \"/HyperdimensionNeptunia/nepmaid/exp/enjoy.json\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"motions\": {\n" +
                "        \"idle\": [\n" +
                "            {\n" +
                "                \"file\": \"/HyperdimensionNeptunia/nepmaid/mtn/idle_00.mtn\",\n" +
                "                \"fade_in\": 2000,\n" +
                "                \"fade_out\": 2000\n" +
                "            },\n" +
                "            {\n" +
                "                \"file\": \"/HyperdimensionNeptunia/nepmaid/mtn/idle_01.mtn\",\n" +
                "                \"fade_in\": 2000,\n" +
                "                \"fade_out\": 2000\n" +
                "            },\n" +
                "            {\n" +
                "                \"file\": \"/HyperdimensionNeptunia/nepmaid/mtn/idle_02.mtn\",\n" +
                "                \"fade_in\": 2000,\n" +
                "                \"fade_out\": 2000\n" +
                "            }\n" +
                "        ],\n" +
                "        \"flick_head\": [\n" +
                "            {\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/smile.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/shake.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/refuse.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/tilt_head.mtn\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"tap_body\": [\n" +
                "            {\n" +
                "                \"dialogue\": 11,\n" +
                "                \"sound\": \"../model/HyperdimensionNeptunia/nepmaid/sounds/../../nepnep/general/snd/001.ogg\",\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/nep_touch_head_1.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"dialogue\": 13,\n" +
                "                \"sound\": \"../model/HyperdimensionNeptunia/nepmaid/sounds/../../nepnep/general/snd/013.ogg\",\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/nep_touch_belly_1.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"dialogue\": 90,\n" +
                "                \"sound\": \"../model/HyperdimensionNeptunia/nepmaid/sounds/../../nepnep/general/snd/101.ogg\",\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/nep_slide_head_2.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"dialogue\": 93,\n" +
                "                \"sound\": \"../model/HyperdimensionNeptunia/nepmaid/sounds/../../nepnep/general/snd/007.ogg\",\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/nep_touch_boobs_1.mtn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"dialogue\": 94,\n" +
                "                \"sound\": \"../model/HyperdimensionNeptunia/nepmaid/sounds/../../nepnep/general/snd/014.ogg\",\n" +
                "                \"file\": \"../model/HyperdimensionNeptunia/nepmaid/motions/../../nepnep/general/mtn/nep_touch_belly_2.mtn\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";

    }


}
