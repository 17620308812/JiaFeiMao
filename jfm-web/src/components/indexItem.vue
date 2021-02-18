<template>
  <div style="margin-top: 20px">
    <div style="display: flex; margin-bottom: 15px">
      <JfmIconErJi :size="45" />
      <div style="line-height: 45px; margin-left: 15px; font-size: 25px">
        音乐
      </div>
    </div>
    <div style="display: flex; height: 300px">
      <div style="width: 77%; height: 100%">
        <div style="margin-right: 10px">
          <div
            style="
              justify-content: space-between;
              display: flex;
              flex-wrap: wrap;
            "
          >
            <div class="item-single-style">
              <div
                style="
                  height: 116px;
                  overflow: hidden;
                  position: relative;
                  font-size: 12px;
                  color: white;
                "
              >
                <img
                  src="~@/resource/index-scroll/index-scroll-2.jpg"
                  style="width: 100%"
                />
                <div
                  style="
                    position: absolute;
                    bottom: 5px;
                    display: flex;
                    left: 5px;
                  "
                >
                  <div style="display: flex">
                    <JfmIconBoFang size="15" />
                    <span style="margin: 0px 15px 0px 5px">21.8万</span>
                    <JfmIconZan size="15" />
                    <span style="margin: 0px 15px 0px 5px">6961</span>
                  </div>
                </div>
                <div
                  style="
                    position: absolute;
                    bottom: 5px;
                    display: flex;
                    right: 5px;
                  "
                >
                  13:21
                </div>
              </div>
              <div>
                <div style="font-size: 14px; margin: 10px 0 8px">
                  BLACKPINK 最美好的年华与你携手工地
                </div>
                <div
                  style="
                    font-size: 12px;
                    color: #999;
                    vertical-align: top;
                    display: flex;
                  "
                >
                  <JfmIconUser size="15" /><span style="margin-left: 5px"
                    >棒棒糖盟主</span
                  >
                </div>
              </div>
            </div>
            <div class="item-single-style"></div>
            <div class="item-single-style"></div>
            <div class="item-single-style"></div>
            <div class="item-single-style"></div>
            <div class="item-single-style"></div>
            <div class="item-single-style"></div>
            <div class="item-single-style"></div>
          </div>
        </div>
      </div>
      <div style="width: 23%; height: 100%">
        <div
          style="
            display: flex;
            justify-content: space-between;
            line-height: 36px;
          "
        >
          <div style="font-size: 20px">排行榜</div>
          <div style="margin-right: 10px; font-size: 12px">
            <span
              style="border: 1px solid rgb(222, 222, 222); padding: 2px 10px"
              >更多 ></span
            >
          </div>
        </div>
        <div
          style="
            display: flex;
            justify-content: space-between;
            margin-bottom: 18px;
          "
        >
          <span
            style="
              font-size: 14px;
              color: #fff;
              width: 18px;
              height: 18px;
              text-align: center;
              line-height: 18px;
              background: #00a1d6;
              border-radius: 2px;
              display: inline-block;
            "
            >1</span
          >
          <div
            style="
              width: calc(100% - 38px);
              height: 70px;
              overflow: hidden;
              display: flex;
            "
          >
            <div style="width: 40%">
              <img
                src="~@/resource/index-scroll/index-scroll-2.jpg"
                style="width: 100%"
              />
            </div>
            <div
              style="
                width: 60%;
                padding: 0px 10px;
                font-size: 15px;
                position: relative;
              "
            >
              <div style="line-height: 20px">新年新气象二狗子测试每行字体</div>
              <div
                style="
                  color: #999;
                  font-size: 14px;
                  position: absolute;
                  bottom: 0px;
                "
              >
                综合评分：6.6
              </div>
            </div>
          </div>
        </div>
        <div
          style="
            display: flex;
            justify-content: space-between;
            margin-bottom: 18px;
          "
        >
          <span
            style="
              font-size: 14px;
              color: #fff;
              width: 18px;
              height: 18px;
              text-align: center;
              line-height: 18px;
              background: #00a1d6;
              border-radius: 2px;
              display: inline-block;
            "
            >2</span
          >
          <div
            style="
              width: calc(100% - 38px);
              overflow: hidden;
              text-overflow: ellipsis;
              white-space: nowrap;
            "
          >
            加菲猫！加菲猫
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import {
  JfmIconErJi,
  JfmIconUser,
  JfmIconBoFang,
  JfmIconZan,
} from "@/components/colorFont.js";

export default {
  name: "IndexItem",
  components: {
    JfmIconErJi,
    JfmIconUser,
    JfmIconBoFang,
    JfmIconZan,
  },
};
</script>

<style lang="less" scoped>
//flex-wrap: wrap; 盒型元素拆行

//小于1400
@media screen and (max-width: 1600px) {
  .item-single-style {
    width: calc((100% - 45px) / 4);
  }
}

//大于1600
@media screen and (min-width: 1600px) {
  .item-single-style {
    width: calc((100% - 60px) / 5);
    height: 190px;
  }
}
//大于1800
@media screen and (min-width: 1800px) {
  .item-single-style {
    width: calc((100% - 75px) / 6);
  }
}
</style>