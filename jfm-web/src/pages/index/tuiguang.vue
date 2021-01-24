<template>
  <div>
    <div style="display:flex;position:relative">
      <JfmIconTuiguang size="45" />
      <div style="height:45px;line-height:45px;font-size: 25px;margin-left: 10px;">推广视频</div>
      <div style="height: 25px; position: absolute; bottom: 5px; left: 180px;display:flex;">
        <JfmIconHuo />
        <span style="font-size: 14px; margin-right: 20px;padding: 5px;" class="fire-font">这石头吃起来像煤块</span>
        <JfmIconHuo />
        <div style="font-size: 14px;padding: 5px;" class="fire-font">今天的天气看起来不错</div>
      </div>
    </div>
    <div style="display:flex">
      <div
        style="width:33.33%"
        class="index-show"
        @mouseenter="onMouseHover_1('1')"
        @mouseleave="omMouseLeave_1('1')"
      >
        <div class="index-img ii-1">
          <div
            style="color: burlywood;position:absolute;top:15px;left:15px;background-color:black;padding: 3px 5px; border-radius: 5px;"
          >新皮肤</div>

          <div
            style="background: -webkit-linear-gradient(bottom, rgb(0, 0, 0) 0%, rgba(0,0,0,0.8) 40%,transparent 100%);height:150px;position:absolute;bottom:0px;width: 100%;"
          >
            <div
              style="color: burlywood;position:absolute;bottom:40px;left:15px;font-size:22px;font-weight:700"
            >二倍攻势 玫瑰绽放</div>
            <div style="color:white;position:absolute;bottom:15px;left:15px">灵能特工 序章</div>
          </div>
        </div>
        <div class="index-video">
          <video-player
            class="video-player vjs-custom-skin"
            ref="videoPlayer"
            :playsinline="true"
            :options="{...playOptions, sources: [{ type: 'video/mp4', src: '/index-video/example.mp4', }], }"
          ></video-player>
        </div>
      </div>
      <div
        style="width:33.33%"
        class="index-show"
        @mouseenter="onMouseHover_1('2')"
        @mouseleave="omMouseLeave_1('2')"
      >
        <div class="index-img ii-2">
          <div
            style="color: burlywood;position:absolute;top:15px;left:15px;background-color:black;padding: 3px 5px; border-radius: 5px;"
          >新气象</div>

          <div
            style="background: -webkit-linear-gradient(bottom, rgb(0, 0, 0) 0%, rgba(0,0,0,0.8) 40%,transparent 100%);height:150px;position:absolute;bottom:0px;width: 100%;"
          >
            <div
              style="color: burlywood;position:absolute;bottom:40px;left:15px;font-size:22px;font-weight:700"
            >花开花落 猫狗一家</div>
            <div style="color:white;position:absolute;bottom:15px;left:15px">极品飞车 断路</div>
          </div>
        </div>
        <div class="index-video">
          <video-player
            class="video-player vjs-custom-skin"
            ref="videoPlayer"
            :playsinline="true"
            :options="{...playOptions, sources: [{ type: 'video/mp4', src: '/index-video/example.mp4', }], }"
          ></video-player>
        </div>
      </div>
      <div
        style="width:33.33%"
        class="index-show"
        @mouseenter="onMouseHover_1('3')"
        @mouseleave="omMouseLeave_1('3')"
      >
        <div class="index-img ii-3">
          <div
            style="color: burlywood;position:absolute;top:15px;left:15px;background-color:black;padding: 3px 5px; border-radius: 5px;"
          >新征程</div>

          <div
            style="background: -webkit-linear-gradient(bottom, rgb(0, 0, 0) 0%, rgba(0,0,0,0.8) 40%,transparent 100%);height:150px;position:absolute;bottom:0px;width: 100%;"
          >
            <div
              style="color: burlywood;position:absolute;bottom:40px;left:15px;font-size:22px;font-weight:700"
            >好好学习 天天向上</div>
            <div style="color:white;position:absolute;bottom:15px;left:15px">测试开发 结束</div>
          </div>
        </div>
        <div class="index-video">
          <video-player
            class="video-player vjs-custom-skin"
            ref="videoPlayer"
            :playsinline="true"
            :options="{...playOptions, sources: [{ type: 'video/mp4', src: '/index-video/example.mp4', }], }"
          ></video-player>
        </div>
      </div>
    </div>
    <div
      style="display:flex;padding-top:20px;overflow:hidden;height:0px;transition: height 0.5s"
      ref="indexBottomImg"
      @mouseenter="onMouseHover_2()"
      @mouseleave="omMouseLeave_2()"
    >
      <div
        style="width:14.28%;position:relative;height:145px;cursor:pointer"
        v-for="item in 7"
        :key="item"
      >
        <div style="margin:0px 5px 0px 5px">
          <img
            :src="'/index-video-bottom/index-video-bottom'+moveType+' ('+item+').jpg'"
            style="width: 100%; height: 100%;"
          />
        </div>
        <div
          style="position:absolute; bottom: 0px; margin: 0px 5px;text-align: center; background-color: rgba(0,0,0,0.5);color: burlywood;right: 0px; left: 0px; line-height: 35px;"
        >灵魂莲花 202{{item}}</div>
      </div>
    </div>
  </div>
</template>

<script>
import { JfmIconTuiguang, JfmIconHuo } from "@/components/colorFont.js";

export default {
  name: "TuiGuangVideo",
  components: {
    JfmIconTuiguang,
    JfmIconHuo,
  },
  data() {
    return {
      playOptions: {
        //播放速度
        playbackRates: [0.5, 1.0, 1.5, 2.0],
        // 将播放器置于流畅模式，并在计算播放器的动态大小时使用该值。值应该代表一个比例 - 用冒号分隔的两个数字（例如
        aspectRatio: "16:9",
        // 当true时，Video.js player将拥有流体大小。换句话说，它将按比例缩放以适应其容器。
        fluid: true,
      },
      isMoveEnter_1: false,
      isMoveEnter_2: false,
      moveType: "1",
    };
  },
  methods: {
    onMouseHover_1(type) {
      this.isMoveEnter_1 = true;
      this.moveType = type;
      this.$refs.indexBottomImg.style.height = "145px";
    },

    omMouseLeave_1() {
      this.isMoveEnter_1 = false;
      if (!this.isMoveEnter_2) {
        this.$refs.indexBottomImg.style.height = "0px";
      }
    },
    onMouseHover_2() {
      this.isMoveEnter_2 = true;
      this.$refs.indexBottomImg.style.height = "145px";
    },
    omMouseLeave_2() {
      this.isMoveEnter_2 = false;
      if (!this.isMoveEnter_1) {
        this.$refs.indexBottomImg.style.height = "0px";
      }
    },
  },
};
</script>

<style lang="less" scoped>
.fire-font:hover {
  color: #00a1d6;
  cursor: pointer;
}

.index-show {
  position: relative;
  height: 310px;
  .ii-1 {
    background: url("~@/resource/index-video-img/index-video-1.jpg") no-repeat;
    background-size: 100% 100%;
  }
  .ii-2 {
    background: url("~@/resource/index-video-img/index-video-2.jpg") no-repeat;
    background-size: 100% 100%;
  }
  .ii-3 {
    background: url("~@/resource/index-video-img/index-video-3.jpg") no-repeat;
    background-size: 100% 100%;
  }
  .index-img {
    background-size: 100% 100%;
    z-index: 2;
    position: absolute;
    top: 50%;
    left: 50%;
    //height: 283px;
    height: 245px;
    border-radius: 5px;
    overflow: hidden;
    transform: translate(-50%, -50%);
    width: calc(100% - 30px);
    //display: none;
  }
  .index-video {
    position: absolute;
    top: 50%;
    left: 50%;
    border-radius: 5px;
    overflow: hidden;
    transform: translate(-50%, -50%);
    width: calc(100% - 30px);
    transition: width 0s;
  }
}

.index-show:hover {
  .index-img {
    display: none;
  }
  .index-video {
    width: calc(100% + 30px);
    transition: width 0.5s;
  }
}
</style>