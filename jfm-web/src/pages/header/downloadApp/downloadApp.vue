<template>
  <div style="margin-top: 50px">
    <div style="position: relative; height: 1200px">
      <div
        style="
          box-shadow: rgb(0 0 0 / 8%) 0px 4px 4px 0px inset;
          height: 5px;
          background-color: rgba(0, 0, 0, 0);
          position: absolute;
          top: 0px;
          z-index: 10;
          width: 100%;
        "
      ></div>
      <div style="display: flex; padding-top: 80px" class="bg-img1">
        <div style="width: 45%; padding-top: 50px; text-align: right">
          <img
            :src="require('@/pages/header/downloadApp/resources/'+it.name)"
            class="animate__animated animate__rubberBand"
            style="width: 50%; margin-right: 100px"
            v-show="version === it.key"
            v-for="it in [
              { key: '安卓版', name: 'eee (5).png' },
              { key: 'App Store', name: 'eee (1).png' },
              { key: 'iPadHD版', name: 'eee (2).png' },
              { key: '安卓HD版', name: 'eee (3).png' },
              { key: 'Windows版', name: 'eee (4).png' },
              { key: 'TV版', name: '333.png' },
              { key: '车载版', name: 'eee (6).png' },
            ]"
            :key="it.key"
          />
        </div>
        <div style="width: 55%">
          <img src="~@/pages/header/user/resource/1646811103_225981.png" />
          <div
            style="
              color: white;
              font-size: 20px;
              letter-spacing: 5px;
              padding-left: 15px;
            "
          >斯人韶华易逝，苍翠万古常青。</div>
          <div
            style="
              display: flex;
              margin-top: 60px;
              z-index: 6;
              position: absolute;
            "
          >
            <div
              style="
                padding: 30px;
                background-color: white;
                padding: 30px;
                border-radius: 30px;
              "
            >
              <img
                src="~@/pages/header/downloadApp/resources/9_cdaa9289bce7a0e8cb9a0d6d14d56209.png"
                style="width: 190px; height: 190px"
              />
            </div>
            <div style="margin-left: 30px">
              <div style="display: flex; margin-bottom: 20px">
                <div class="version-btn" @click="version = '安卓版'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650511579272"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="2090"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M141.1 331.2c-35 0-63.3 28.3-63.3 63.2v264.7c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2V394.4c0-34.9-28.3-63.2-63.3-63.2zM228.9 753.3c0 37.3 30.3 67.5 67.6 67.5h46.1v140c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2v-140h85.5v140c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2v-140h46.1c37.3 0 67.6-30.2 67.6-67.5V343.1H228.9v410.2zM651.8 93.4L696 13c2.4-4.2 0.8-9.6-3.5-11.9-4.2-2.3-9.6-0.8-11.9 3.5l-44.7 81.2C598.4 69.2 556.4 59.9 512 59.9c-44.4 0-86.4 9.3-123.9 25.8L343.4 4.6c-2.3-4.3-7.7-5.8-11.9-3.5-4.3 2.3-5.9 7.7-3.5 11.9l44.2 80.4c-86.8 44.8-145.5 130-145.5 227.7h570.5c0.1-97.8-58.6-182.9-145.4-227.7zM382.2 218c-13.2 0-23.9-10.7-23.9-23.9s10.7-23.9 23.9-23.9 23.9 10.7 23.9 23.9c-0.1 13.2-10.8 23.9-23.9 23.9z m259.7 0c-13.2 0-23.9-10.7-23.9-23.9s10.7-23.9 23.9-23.9 23.9 10.7 23.9 23.9c-0.1 13.2-10.8 23.9-23.9 23.9zM882.9 331.2c-35 0-63.3 28.3-63.3 63.2v264.7c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2V394.4c0-34.9-28.3-63.2-63.3-63.2z"
                        p-id="2091"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">安卓版</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
                <div class="version-btn" @click="version = 'App Store'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650517843286"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="4124"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M836.608 675.84q41.984 59.392 96.256 76.8-23.552 72.704-74.752 151.552-78.848 118.784-155.648 118.784-28.672 0-84.992-19.456-52.224-19.456-91.136-19.456t-86.016 20.48q-49.152 19.456-80.896 19.456-92.16 0-181.248-156.672-89.088-154.624-89.088-304.128 0-138.24 67.584-226.304 69.632-88.064 172.032-88.064 22.528 0 50.176 5.632t57.344 20.992q31.744 17.408 52.224 24.064t31.744 6.656q13.312 0 40.96-6.144t55.296-22.528q29.696-16.384 51.2-24.576t44.032-8.192q71.68 0 129.024 38.912 30.72 20.48 62.464 60.416-47.104 40.96-68.608 71.68-39.936 57.344-39.936 124.928 0 74.752 41.984 135.168zM630.784 197.632q-35.84 33.792-65.536 44.032-10.24 3.072-26.112 5.632t-36.352 4.608q1.024-90.112 47.104-155.648t151.552-90.112q2.048 10.24 3.072 14.336l0 11.264q0 36.864-17.408 82.944-18.432 45.056-56.32 82.944z"
                        p-id="4125"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">App Store</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
              </div>
              <div style="display: flex; margin-bottom: 20px">
                <div class="version-btn" @click="version = 'Windows版'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650517691221"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="2990"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M426.285714 574.857143v372L36.571429 893.142857v-318.285714h389.714285z m0-424.571429v376.571429H36.571429V204z m561.142857 424.571429v449.142857l-518.285714-71.428571v-377.714286h518.285714z m0-501.714286v453.714286H469.142857V144.571429z"
                        p-id="2991"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">Windows版</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
                <div class="version-btn" @click="version = 'TV版'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650518101212"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="9534"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M960 1024H64a65.792 65.792 0 0 1-64-65.984V256a64 64 0 0 1 64-64h336L256 0h128l128 170.624L640 0h128L624 192H960a64 64 0 0 1 64 64v702.016A65.728 65.728 0 0 1 960 1024zM766.016 352a32 32 0 0 0-32-32H160a32 32 0 0 0-32 32v512a32 32 0 0 0 32 32h574.016a32 32 0 0 0 32-32v-512zM960 384h-128v128h128V384z m0 256h-128v128h128v-128z"
                        p-id="9535"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">TV版</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
              </div>
              <div style="display: flex; margin-bottom: 20px">
                <div class="version-btn" @click="version = 'iPadHD版'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650517843286"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="4124"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M836.608 675.84q41.984 59.392 96.256 76.8-23.552 72.704-74.752 151.552-78.848 118.784-155.648 118.784-28.672 0-84.992-19.456-52.224-19.456-91.136-19.456t-86.016 20.48q-49.152 19.456-80.896 19.456-92.16 0-181.248-156.672-89.088-154.624-89.088-304.128 0-138.24 67.584-226.304 69.632-88.064 172.032-88.064 22.528 0 50.176 5.632t57.344 20.992q31.744 17.408 52.224 24.064t31.744 6.656q13.312 0 40.96-6.144t55.296-22.528q29.696-16.384 51.2-24.576t44.032-8.192q71.68 0 129.024 38.912 30.72 20.48 62.464 60.416-47.104 40.96-68.608 71.68-39.936 57.344-39.936 124.928 0 74.752 41.984 135.168zM630.784 197.632q-35.84 33.792-65.536 44.032-10.24 3.072-26.112 5.632t-36.352 4.608q1.024-90.112 47.104-155.648t151.552-90.112q2.048 10.24 3.072 14.336l0 11.264q0 36.864-17.408 82.944-18.432 45.056-56.32 82.944z"
                        p-id="4125"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">iPadHD版</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
                <div class="version-btn" @click="version = '安卓HD版'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650511579272"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="2090"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M141.1 331.2c-35 0-63.3 28.3-63.3 63.2v264.7c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2V394.4c0-34.9-28.3-63.2-63.3-63.2zM228.9 753.3c0 37.3 30.3 67.5 67.6 67.5h46.1v140c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2v-140h85.5v140c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2v-140h46.1c37.3 0 67.6-30.2 67.6-67.5V343.1H228.9v410.2zM651.8 93.4L696 13c2.4-4.2 0.8-9.6-3.5-11.9-4.2-2.3-9.6-0.8-11.9 3.5l-44.7 81.2C598.4 69.2 556.4 59.9 512 59.9c-44.4 0-86.4 9.3-123.9 25.8L343.4 4.6c-2.3-4.3-7.7-5.8-11.9-3.5-4.3 2.3-5.9 7.7-3.5 11.9l44.2 80.4c-86.8 44.8-145.5 130-145.5 227.7h570.5c0.1-97.8-58.6-182.9-145.4-227.7zM382.2 218c-13.2 0-23.9-10.7-23.9-23.9s10.7-23.9 23.9-23.9 23.9 10.7 23.9 23.9c-0.1 13.2-10.8 23.9-23.9 23.9z m259.7 0c-13.2 0-23.9-10.7-23.9-23.9s10.7-23.9 23.9-23.9 23.9 10.7 23.9 23.9c-0.1 13.2-10.8 23.9-23.9 23.9zM882.9 331.2c-35 0-63.3 28.3-63.3 63.2v264.7c0 34.9 28.4 63.2 63.3 63.2 35 0 63.3-28.3 63.3-63.2V394.4c0-34.9-28.3-63.2-63.3-63.2z"
                        p-id="2091"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">安卓HD版</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
              </div>
              <div style="display: flex">
                <div class="version-btn" @click="version = '车载版'">
                  <div style="display: inline-flex; align-items: center">
                    <svg
                      t="1650518387345"
                      class="icon"
                      viewBox="0 0 1024 1024"
                      version="1.1"
                      xmlns="http://www.w3.org/2000/svg"
                      p-id="11478"
                      width="30"
                      height="30"
                    >
                      <path
                        d="M941.435051 801.862737 941.435051 695.650717c22.560832-32.597419 34.678824-73.414033 34.678824-118.427226 0-71.757301-29.913287-133.51076-86.589101-165.948543-16.154935-131.410935-88.667435-227.844242-178.317245-227.844242L312.82317 183.430706c-89.679485 0-162.194032 96.432283-178.413436 227.844242-56.610322 32.407084-86.524632 94.192266-86.524632 165.948543 0 45.013193 12.242835 85.829807 34.678824 118.427226l0 106.21202c0 51.609425 189.33109 51.609425 189.33109 0l0-34.314527 480.363466 0 0 34.314527C752.259504 853.471139 941.435051 853.471139 941.435051 801.862737M208.249463 639.039371c-34.143635 0-61.785182-27.625174-61.785182-61.815881 0-34.189683 27.67327-61.879326 61.785182-61.879326 34.331923 0 61.847603 27.689642 61.847603 61.879326C270.097066 611.414197 242.454496 639.039371 208.249463 639.039371M230.432695 386.80258c-12.368702 0-23.63428 1.49812-34.678824 3.171226 17.797341-86.303598 64.214511-149.839657 117.195166-149.839657L711.365118 240.134149c52.949956 0 99.272981 63.536059 117.070322 149.839657-5.806239-0.931209-12.214183-1.231037-18.429745-1.673106C810.006719 387.780861 230.432695 386.80258 230.432695 386.80258M815.811936 639.039371c-34.205033 0-61.880349-27.625174-61.880349-61.815881 0-34.189683 27.801183-61.879326 61.880349-61.879326 34.081213 0 61.784158 27.689642 61.784158 61.879326C877.756753 611.414197 849.95557 639.039371 815.811936 639.039371"
                        p-id="11479"
                        fill="#ffffff"
                      />
                    </svg>
                  </div>
                  <div style="margin-left: 7px">
                    <div style="color: white; font-size: 14px">车载版</div>
                    <div style="color: white; font-size: 12px">下载</div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="bg-img2"></div>
      <div style="position: absolute; top: 720px; z-index: 5; width: 100%">
        <div style="width: 60%; margin: 0px auto">
          <div
            style="
              font-size: 24px;
              font-weight: bold;
              color: #6d757a;
              text-align: center;
              margin-bottom: 20px;
            "
          >关注我们</div>
          <div
            style="
              display: block;
              width: 62px;
              margin: 20px auto 40px auto;
              border: 1px solid #f25d8e;
            "
          ></div>
          <div style="display: flex">
            <div style="width: 20%; display: flex">
              <img
                src="~@/pages/header/downloadApp/resources/icon-weibo.png"
                style="width: 70px; height: 70px"
              />
              <div style="margin-left: 15px">
                <div style="font-weight: bold; color: #6d757a; font-size: 14px">官方微博</div>
                <div style="font-size: 14px; color: #6d757a; margin-top: 15px">@加菲猫钓鱼</div>
              </div>
            </div>
            <div style="width: 20%; display: flex" v-for="item in 4" :key="item">
              <img
                src="~@/pages/header/downloadApp/resources/icon-qq1.png"
                style="width: 70px; height: 70px"
              />
              <div style="margin-left: 15px">
                <div style="font-weight: bold; color: #6d757a; font-size: 14px">安卓讨论群</div>
                <div
                  style="font-size: 14px; color: #6d757a; margin-top: 15px"
                  v-for="ic in 3"
                  :key="ic"
                >2663468076</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div style="background-color: #fff2f2; width: 100%; padding: 50px 0px">
      <div
        style="
          margin: 0px auto;
          width: 60%;
          background-color: white;
          box-shadow: 0 0 5px 3px #ffd7d7;
          border-radius: 10px;
        "
      >
        <div style="display: flex; padding: 20px; border-bottom: 1px solid #e5e9ef">
          <div
            v-for="i1 in [
              '安卓版',
              'iPhone版',
              'iPadHD版',
              'windows版',
              'TV版',
            ]"
            :key="i1"
            :class="[
              'update',
              updateType === i1 ? 'update-hover' : 'update-none',
            ]"
            @click="updateType = i1"
          >{{ i1 }}</div>
        </div>
        <div style="padding: 20px 0px 20px 30px">
          <div style="display: flex" v-for="i3 in 8" :key="i3">
            <div style="color: #6d757a">2022-04-21</div>
            <div
              style="
                position: relative;
                border-left: 2px solid #e4e7ed;
                margin-left: 30px;
                padding-bottom: 40px;
              "
            >
              <div
                style="
                  position: absolute;
                  border-radius: 50%;
                  width: 20px;
                  height: 20px;
                  left: -10px;
                  background-color: rgb(228, 231, 237);
                "
              ></div>
              <div
                style="
                  font-size: 16px;
                  font-weight: bold;
                  color: #6d757a;
                  margin-bottom: 15px;
                  margin-left: 40px;
                "
              >
                <span>加菲猫</span>
                <span style="margin: 0px 10px">android</span>
                <span>6.69.0</span>
              </div>
              <div
                style="color: #6d757a; line-height: 28px; margin-left: 46px"
              >【修正】无法从搜索结果中访问番剧信息的问题</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "DownloadApp",
  data() {
    return {
      version: "安卓版",
      updateType: "安卓版"
    };
  }
};
</script>

<style scoped>
.bg-img1 {
  position: relative;
  background: #fff url("~@/pages/header/downloadApp/resources/bg1.png")
    no-repeat;
  margin: 0 auto;
  height: 689px;
}
.bg-img2 {
  position: absolute;
  background: #fff url("~@/pages/header/downloadApp/resources/bg2.png") center
    no-repeat;
  margin: 0 auto;
  top: 430px;
  background-color: rgba(0, 0, 0, 0);
  height: 778px;
  width: 100%;
  z-index: 3;
}
.update {
  border-radius: 30px;
  width: 114px;
  height: 36px;
  line-height: 36px;
  text-align: center;
  margin-right: 20px;
  cursor: pointer;
}

.update-none {
  background-color: white;
  color: rgb(20, 20, 20);
}

.update-hover {
  background-color: #f25d8e;
  color: #fff;
}
.version-btn {
  display: flex;
  padding: 5px;
  width: 120px;
  border-radius: 8px;
  background-color: rgb(34, 34, 34);
  border: 1px solid white;
  margin-right: 15px;
  cursor: pointer;
}
</style>