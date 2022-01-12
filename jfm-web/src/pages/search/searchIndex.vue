<template>
  <div style="margin-top: 55px">
    <div
      style="display: flex;border-top: 1px solid rgb(242,242,242);padding-top: 20px;padding-bottom: 20px;box-shadow: inset 0px 4px 4px 0px rgb(242 242 242);"
    >
      <div style="height: 44px;display: flex;margin:0px auto" class="seach-title">
        <div class="search-logo"></div>
        <div style="margin: 0px 20px">
          <el-input
            v-model="searchText"
            style="width:300px;border: 2px solid #ccd0d7;border-radius: 4px;background: transparent; "
            placeholder="请输入内容"
          ></el-input>
        </div>
        <div>
          <el-button type="primary" icon="el-icon-search">搜索</el-button>
        </div>
      </div>
    </div>
    <div style="display: flex;">
      <div style="width: 80%;margin:0px auto;min-width: 1000px" class="search-tabs">
        <el-tabs v-model="activeName" @tab-click="handleTabsClick">
          <el-tab-pane label="综合" name="1">
            <div
              style="margin-top: 5px;border-bottom: 1px solid rgb(232,232,232);padding-bottom: 15px"
            >
              <div style="display:flex;font-size:14px;margin-bottom: 10px">
                <div
                  style="background-color:#00a1d6;color: white;padding:1px 5px;border-radius: 3px;margin-right: 25px"
                >综合排序</div>
                <div class="hover-color" style="margin-right: 25px">最多点击</div>
                <div class="hover-color" style="margin-right: 25px">最新发布</div>
                <div class="hover-color" style="margin-right: 25px">最多弹幕</div>
                <div class="hover-color" style="margin-right: 25px">最多收藏</div>
              </div>
              <div style="display:flex;font-size:14px;margin-bottom: 10px">
                <div
                  style="background-color:#00a1d6;color: white;padding:1px 5px;border-radius: 3px;margin-right: 25px"
                >全部时长</div>
                <div class="hover-color" style="margin-right: 25px">10分钟以下</div>
                <div class="hover-color" style="margin-right: 25px">10-30分钟</div>
                <div class="hover-color" style="margin-right: 25px">30-60分钟</div>
                <div class="hover-color" style="margin-right: 25px">60分钟以上</div>
              </div>
              <div style="display:flex;font-size:14px;margin-bottom: 10px;flex-flow: wrap;">
                <div
                  style="background-color:#00a1d6;color: white;padding:1px 5px;border-radius: 3px;margin-right: 25px;;white-space: nowrap;"
                >全部分区</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">动画</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">番剧</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">国创</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">音乐</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">舞蹈</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">游戏</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">知识</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">科技</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">运动</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">汽车</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">生活</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">美食</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">动物圈</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">鬼畜</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">时尚</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">资讯</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">娱乐</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">影视</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">纪录片</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">电影</div>
                <div class="hover-color" style="margin-right: 25px;white-space: nowrap;">电视剧</div>
              </div>
            </div>
            <div style="margin-top: 15px">
              <div style="width: 16.6%;float: left" v-for="item in 20" :key="item">
                <div
                  style="margin-right: 20px;border: 1px solid rgb(240,240,240);padding-bottom:5px;margin-bottom: 20px"
                >
                  <div
                    style="height: 100px;width: 100%;border-radius: 5px;overflow: hidden;border-radius: 5px;position: relative"
                    @click="handelVideoClick"
                  >
                    <div style="height: 100%">
                      <img
                        :src="'/index-video-bottom/index-video-bottom1 ('+(item %6 +1)+').jpg'"
                        style="width: 100%;height:100%;"
                      />
                    </div>
                    <div
                      class="hover-bg"
                      style="position: absolute;top: 0px;width: 100%;height: 100%;"
                    ></div>
                  </div>
                  <div
                    class="hover-color"
                    style="font-size: 12px;line-height: 20px;padding: 8px 10px"
                  >王侯将相宁有种乎，几千年了这句话还有很多国家说不出来</div>
                  <div
                    style="font-size: 12px;color: rgb(180,180,180);display: flex;padding: 5px 10px; "
                  >
                    <div style="display: flex">
                      <IconBoFang1 size="15" />
                      <div style="margin-left: 5px">32.9万</div>
                    </div>
                    <div style="display: flex;margin-left: 15px;">
                      <IconShiZhong size="15" />
                      <div style="margin-left: 5px">2020-09-04</div>
                    </div>
                  </div>
                  <div style="display: flex;padding: 0px 10px 5px 10px;color: rgb(180,180,180);">
                    <div style="margin-left:-2px">
                      <IconUser1 size="17" />
                    </div>
                    <div style="font-size: 12px;margin-left: 5px">海棠家的大肥鱼</div>
                  </div>
                </div>
              </div>
            </div>
          </el-tab-pane>
          <el-tab-pane label="视频" name="2">视频</el-tab-pane>
          <el-tab-pane label="文章" name="3">文章</el-tab-pane>
          <el-tab-pane label="专栏" name="4">专栏</el-tab-pane>
          <el-tab-pane label="话题" name="5">话题</el-tab-pane>
          <el-tab-pane label="博客" name="6">博客</el-tab-pane>
          <el-tab-pane label="直播" name="7">直播</el-tab-pane>
          <el-tab-pane label="用户" name="8">用户</el-tab-pane>
        </el-tabs>
      </div>
    </div>
  </div>
</template>

<script>
import {
  IconShiZhong,
  IconUser1,
  IconBoFang1,
  JfmIconZan
} from "@/components/colorFont.js";

export default {
  name: "SearchIndex",
  components: {
    IconShiZhong,
    IconUser1,
    IconBoFang1,
    JfmIconZan
  },
  data() {
    return {
      activeName: "1",
      searchText:'',
    };
  },
  methods: {
    handleTabsClick(value) {
      console.log(value);
    },
    handelVideoClick(){
      this.$router.push('/video')
    }
  }
};
</script>

<style scoped>
.seach-title /deep/ .el-input__inner {
  border: none;
}

.search-tabs /deep/ .el-tabs__nav {
  width: 100%;
}

.search-tabs /deep/ .el-tabs__item {
  line-height: unset;
  font-size: 16px;
  width: 12.5%;
  text-align: center;
}

.search-logo {
  background-image: url("~@/pages/search/resource/sprite-690be8a6ea.png");
  width: 131px;
  height: 35px;
  background-position: -261px -72px;
}

.hover-bg {
  background-color: rgb(0, 0, 0, 0);
}

.hover-bg:hover {
  background-color: rgb(0, 0, 0, 0.15);
  cursor: pointer;
}

.hover-color {
  color: #222;
  font-size: 12px;
  line-height: 20px;
}

.hover-color:hover {
  color: #00a1d6;
  cursor: pointer;
}
</style>