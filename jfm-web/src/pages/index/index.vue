<template>
  <div>
    <div class="index-header">
      <div class="index-header-bgc"></div>
    </div>

    <div
      class="index-two-header"
      style="width: 85%; margin: 0 auto; min-width: 1400px; max-width: 1600px"
    >
      <!-- 一级标题 -->
      <div style="display: flex; padding-top: 15px">
        <div style="display: flex">
          <div style="min-width: 55px; text-align: center; cursor: pointer">
            <div
              style="
                width: 36px;
                height: 36px;
                border-radius: 36px;
                background-color: #ff5c7c;
                margin: 0 auto;
                color: white;
                font-size: 25px;
                line-height: 36px;
              "
            >
              <i class="el-icon-house"></i>
            </div>
            <div class="two-title-hover">首页</div>
          </div>
          <div style="min-width: 55px; text-align: center; cursor: pointer">
            <div
              style="
                width: 36px;
                height: 36px;
                border-radius: 36px;
                background-color: #fcba2a;
                margin: 0 auto;
                color: white;
                font-size: 25px;
                line-height: 36px;
              "
            >
              <i class="el-icon-cpu"></i>
            </div>
            <div class="two-title-hover">动态</div>
          </div>
          <div style="min-width: 55px; text-align: center; cursor: pointer">
            <div
              style="
                width: 36px;
                height: 36px;
                border-radius: 36px;
                background-color: #00a1d6;
                margin: 0 auto;
                color: white;
                font-size: 25px;
                line-height: 36px;
              "
            >
              <i class="el-icon-c-scale-to-original"></i>
            </div>
            <div class="two-title-hover">排行榜</div>
          </div>
          <div style="min-width: 55px; text-align: center; cursor: pointer">
            <div
              style="
                width: 36px;
                height: 36px;
                border-radius: 36px;
                background-color: #6dc781;
                margin: 0 auto;
                color: white;
                font-size: 25px;
                line-height: 36px;
              "
            >
              <i class="el-icon-coin"></i>
            </div>
            <div class="two-title-hover">频道</div>
          </div>
        </div>
        <el-divider direction="vertical"></el-divider>
        <div style="margin-left: 10px; width: 100%">
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >架构</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >前端</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >音乐</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >电影</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >语言</span
              >
              <el-tag size="mini">27</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >开发</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >技术</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >后端</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >网络圈</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >娱乐</span
              >
              <el-tag size="mini">356</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >公司</span
              >
              <el-tag size="mini">999</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >放映厅</span
              >
              <el-tag size="mini">569</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >北方</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >播放</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >笔迹</span
              >
              <el-tag size="mini">996</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >会议室</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >咨询</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >运维</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
          <div style="min-width: 80px; width: 10%; float: left">
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >数据库</span
              >
              <el-tag size="mini">999</el-tag>
            </div>
            <div style="height: 30px; line-height: 30px">
              <span
                class="two-title-hover"
                style="margin-right: 2px; cursor: pointer"
                >数据</span
              >
              <el-tag size="mini">999+</el-tag>
            </div>
          </div>
        </div>
        <el-divider direction="vertical"></el-divider>
        <div style="display: flex; margin-left: 10px; min-width: 270px">
          <div style="min-width: 80px">
            <div
              style="
                display: flex;
                cursor: pointer;
                height: 30px;
                line-height: 30px;
              "
            >
              <div style="padding-top: 4px; margin-right: 4px">
                <JfmIconZhuanlan size="25" />
              </div>
              <div
                class="two-title-hover"
                style="height: 30px; line-height: 30px"
              >
                专栏
              </div>
            </div>
            <div
              style="
                display: flex;
                cursor: pointer;
                height: 30px;
                line-height: 30px;
              "
            >
              <div style="padding-top: 2px; margin-right: 4px">
                <JfmIconZhibo size="25" />
              </div>
              <div
                class="two-title-hover"
                style="height: 30px; line-height: 30px"
              >
                直播
              </div>
            </div>
          </div>
          <div style="min-width: 80px">
            <div
              style="
                display: flex;
                cursor: pointer;
                height: 30px;
                line-height: 30px;
              "
            >
              <div style="padding-top: 4px; margin-right: 4px">
                <JfmIconHuodong size="25" />
              </div>
              <div
                class="two-title-hover"
                style="height: 30px; line-height: 30px"
              >
                活动
              </div>
            </div>
            <div
              style="
                display: flex;
                cursor: pointer;
                height: 30px;
                line-height: 30px;
              "
            >
              <div style="padding-top: 4px; margin-right: 4px">
                <JfmIconKetang size="25" />
              </div>
              <div
                class="two-title-hover"
                style="height: 30px; line-height: 30px"
              >
                课堂
              </div>
            </div>
          </div>
          <div style="min-width: 80px">
            <div
              style="
                display: flex;
                cursor: pointer;
                height: 30px;
                line-height: 30px;
              "
            >
              <div style="padding-top: 4px; margin-right: 4px">
                <JfmIconTianpingcheng size="25" />
              </div>
              <div
                class="two-title-hover"
                style="height: 30px; line-height: 30px"
              >
                小黑屋
              </div>
            </div>
            <div
              style="
                display: flex;
                cursor: pointer;
                height: 30px;
                line-height: 30px;
              "
            >
              <div style="padding-top: 4px; margin-right: 4px">
                <JfmIconYinle size="25" />
              </div>
              <div
                class="two-title-hover"
                style="height: 30px; line-height: 30px"
              >
                音乐PLUS
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- 预览栏 -->
      <div style="margin-top: 15px; margin-bottom: 20px">
        <el-row :gutter="15">
          <el-col :span="8" style="position: relative">
            <div class="grid-content bg-purple">
              <el-carousel
                height="250px"
                :autoplay="true"
                indicator-position="none"
                arrow="never"
                :interval="5000"
                ref="carousel"
                @change="
                  (curIndex, preIndex) =>
                    handleCarouselChange(curIndex + 1, preIndex)
                "
              >
                <el-carousel-item name="1">
                  <img
                    src="~@/resource/index-scroll/index-scroll-1.jpg"
                    style="width: 100%; height: 100%; border-radius: 5px"
                  />
                </el-carousel-item>
                <el-carousel-item name="2">
                  <img
                    src="~@/resource/index-scroll/index-scroll-2.jpg"
                    style="width: 100%; height: 100%; border-radius: 5px"
                  />
                </el-carousel-item>
                <el-carousel-item name="3">
                  <img
                    src="~@/resource/index-scroll/index-scroll-3.jpg"
                    style="width: 100%; height: 100%; border-radius: 5px"
                  />
                </el-carousel-item>
                <el-carousel-item name="4">
                  <img
                    src="~@/resource/index-scroll/index-scroll-4.jpg"
                    style="width: 100%; height: 100%; border-radius: 5px"
                  />
                </el-carousel-item>
                <el-carousel-item name="5">
                  <img
                    src="~@/resource/index-scroll/index-scroll-5.jpg"
                    style="width: 100%; height: 100%; border-radius: 5px"
                  />
                </el-carousel-item>
              </el-carousel>
            </div>
            <div class="index-scroll-select">
              <ul>
                <li @click="handleIndexSelect('1')">
                  <div
                    :class="
                      currentSelect === '1'
                        ? 'index-selected'
                        : 'no-index-selected'
                    "
                  ></div>
                </li>
                <li @click="handleIndexSelect('2')">
                  <div
                    :class="
                      currentSelect === '2'
                        ? 'index-selected'
                        : 'no-index-selected'
                    "
                  ></div>
                </li>
                <li @click="handleIndexSelect('3')">
                  <div
                    :class="
                      currentSelect === '3'
                        ? 'index-selected'
                        : 'no-index-selected'
                    "
                  ></div>
                </li>
                <li @click="handleIndexSelect('4')">
                  <div
                    :class="
                      currentSelect === '4'
                        ? 'index-selected'
                        : 'no-index-selected'
                    "
                  ></div>
                </li>
                <li @click="handleIndexSelect('5')">
                  <div
                    :class="
                      currentSelect === '5'
                        ? 'index-selected'
                        : 'no-index-selected'
                    "
                  ></div>
                </li>
              </ul>
            </div>
          </el-col>
          <el-col :span="4">
            <div class="grid-content bg-purple">
              <div
                style="
                  position: relative;
                  overflow: hidden;
                  border-radius: 5px;
                  margin-bottom: 15px;
                "
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-1.jpg"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>【电影史话06】他为韩国电影创造了历史——奉俊昊作品全解读</p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>咸鱼的鱼</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    42.0万播放
                  </div>
                </div>
              </div>
              <div
                style="position: relative; overflow: hidden; border-radius: 5px"
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-2.jpg"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>入门经典,深入浅出html,虎课网html5基础培训,快速上手</p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>灵风</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    42.0万播放
                  </div>
                </div>
              </div>
            </div>
          </el-col>
          <el-col :span="4">
            <div class="grid-content bg-purple">
              <div
                style="
                  position: relative;
                  overflow: hidden;
                  border-radius: 5px;
                  margin-bottom: 15px;
                "
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-3.png"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>
                    杂申椒与菌桂兮，岂惟纫夫蕙茝！彼尧、舜之耿介兮，既遵道而得路
                  </p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>长虹贯日</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    763.0万播放
                  </div>
                </div>
              </div>
              <div
                style="position: relative; overflow: hidden; border-radius: 5px"
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-4.jpg"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>
                    何桀纣之昌披兮，夫唯捷径以窘步。惟夫党人之偷乐兮，路幽昧以险隘
                  </p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>ThinkPad</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    586.0万播放
                  </div>
                </div>
              </div>
            </div>
          </el-col>
          <el-col :span="4">
            <div class="grid-content bg-purple">
              <div
                style="
                  position: relative;
                  overflow: hidden;
                  border-radius: 5px;
                  margin-bottom: 15px;
                "
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-5.jpg"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>
                    汩余若将不及兮，恐年岁之不吾与。朝搴阰之木兰兮，夕揽洲之宿莽。
                  </p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>明日之后</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    42.0万播放
                  </div>
                </div>
              </div>
              <div
                style="position: relative; overflow: hidden; border-radius: 5px"
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-6.jpg"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>
                    乘骐骥以驰骋兮，来吾道夫先路！昔三后之纯粹兮，固众芳之所在。
                  </p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>加菲猫</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    42.0万播放
                  </div>
                </div>
              </div>
            </div>
          </el-col>
          <el-col :span="4">
            <div class="grid-content bg-purple">
              <div
                style="
                  position: relative;
                  overflow: hidden;
                  border-radius: 5px;
                  margin-bottom: 15px;
                "
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-7.png"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>
                    忽奔走以先后兮，及前王之踵武。荃不查余之中情兮，反信谗而齌怒。
                  </p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>高渐离</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    657.0万播放
                  </div>
                </div>
              </div>
              <div
                style="position: relative; overflow: hidden; border-radius: 5px"
                class="index-mouse-mover"
              >
                <div style="width: 100%; height: 117px">
                  <img
                    src="~@/resource/index-show/index-show-8.jpg"
                    style="width: 100%; height: 100%"
                  />
                </div>
                <div class="mover-text">
                  <p>
                    余固知謇謇之为患兮，忍而不能舍也。指九天以为正兮，夫惟灵修之故也
                  </p>
                  <div
                    style="
                      color: antiquewhite;
                      margin-top: 10px;
                      font-size: 13px;
                    "
                  >
                    <span
                      style="
                        border: 2px solid;
                        border-radius: 5px;
                        margin-right: 10px;
                      "
                      >作者</span
                    >
                    <span>路演直通</span>
                  </div>
                  <div
                    style="
                      color: antiquewhite;
                      font-size: 13px;
                      margin-top: 5px;
                    "
                  >
                    123.0万播放
                  </div>
                </div>
              </div>
            </div>
          </el-col>
        </el-row>
      </div>
      <!-- 热门事件 -->
      <Huodong />
      <!-- 推广视频 -->
      <TuiGuangVideo />
      <!-- 自定义标签 -->
      <IndexItem v-for="item in 2" :key="item" />
    </div>
  </div>
</template>

<script>
import {
  JfmIconZhuanlan,
  JfmIconZhibo,
  JfmIconTianpingcheng,
  JfmIconHuodong,
  JfmIconKetang,
  JfmIconYinle,
} from "@/components/colorFont.js";
import TuiGuangVideo from "@/pages/index/tuiguang.vue";
import Huodong from "@/pages/index/huodong.vue";
import IndexItem from '@/components/indexItem'

export default {
  name: "Index",
  components: {
    JfmIconZhuanlan,
    JfmIconZhibo,
    JfmIconTianpingcheng,
    JfmIconHuodong,
    JfmIconKetang,
    JfmIconYinle,
    TuiGuangVideo,
    Huodong,
    IndexItem
  },
  data() {
    return {
      currentSelect: "1",
    };
  },
  methods: {
    handleIndexSelect(selectKey) {
      this.currentSelect = selectKey;
      this.$refs.carousel.setActiveItem(selectKey);
    },
    handleCarouselChange(val) {
      this.currentSelect = String(val);
    },
  },
};
</script>

<style lang="less" scoped>
.index-two-header /deep/ .el-divider--vertical {
  height: 45px;
  margin-top: 5px;
}

.index-two-header /deep/ .el-tag--mini {
  background-color: #409eff;
  color: white;
  height: 18px;
  padding: 0 2px;
  line-height: 18px;
  transform: scale(0.8);
  margin-left: -3px;
}

.index-header {
  height: 160px;
  background: url("~@/resource/index-header.png") no-repeat;
  background-size: 100% 100%;
  //background-color: aqua;
  .index-header-bgc {
    position: absolute;
    top: 0px;
    left: 0px;
    right: 0px;
    height: 100px;
    background: linear-gradient(rgba(0, 0, 0, 0.4), transparent);
  }
}

.two-title-hover:hover {
  color: #00a1d6;
}

.index-scroll-select {
  position: absolute;
  z-index: 2;
  top: 180px;
  right: 30px;
  ul {
    list-style: none;
  }
  ul li {
    display: inline-block;
    vertical-align: middle;
    height: 30px;
    line-height: 30px;
    width: 30px;
    display: table-cell;
    vertical-align: middle;
    text-align: center;
    cursor: pointer;
  }
  .index-selected {
    width: 20px;
    height: 20px;
    background: url("~@/resource/index-scroll/icon_slide_selected.png")
      no-repeat;
    background-size: auto 100%;
    margin: 0 auto;
  }
  .no-index-selected {
    width: 10px;
    height: 10px;
    border-radius: 10px;
    background-color: white;
    margin: 0 auto;
  }
}

.index-mouse-mover {
  .mover-text {
    position: absolute;
    z-index: 2;
    width: 100%;
    top: 92px;
    transition: top 0.2s;
    padding: 0px 10px;
    box-sizing: border-box;
    p {
      margin: 0px;
      font-size: 14px;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
      height: 36px;
      color: #fff;
    }
  }
}
.index-mouse-mover:hover {
  .mover-text {
    top: 0px;
    padding-top: 20px;
    width: 100%;
    background-color: rgba(0, 0, 0, 0.3);
    height: 100%;
    p {
      white-space: normal;
      height: 36px;
      overflow: hidden;
    }
  }
}

</style>