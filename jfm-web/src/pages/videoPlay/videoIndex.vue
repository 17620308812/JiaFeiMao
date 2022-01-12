<template>
  <div style="margin-top: 55px">
    <div
      style="border-top: 1px solid rgb(242,242,242);box-shadow: inset 0px 4px 4px 0px rgb(242 242 242);"
    >
      <div style="width: 80%;display: flex;margin:0px auto;min-width: 1100px">
        <div style="width: calc(100% - 350px);margin-top: 30px;">
          <div style="font-size: 18px">王 侯 将 相 宁 有 种 乎 ！</div>
          <div style="font-size: 12px;color: rgb(180,180,180);padding: 10px 0px;">
            <span>8.9万播放</span>
            <span style="margin: 0px 5px">·</span>
            <span style="margin-right: 15px;">153弹幕</span>
            <span>2019-11-13 16:09:24</span>
          </div>
          <div>
            <video-play :hasAudio="true" url="/index-video/example.mp4"></video-play>
          </div>
          <div
            style="display:flex;padding: 10px;line-height: 30px;border: 1px solid rgb(242,242,242);margin-top:-5px;box-shadow: 0px 3px 3px 0px rgb(240 240 240);"
          >
            <div
              style="font-size: 12px;color: rgb(150,150,150);line-height: 30px;margin-right: 20px;width: 220px"
            >2人正在看(全站&lt;10人再看), 153条弹幕</div>
            <div :class="barrage?'jfm-dan1':'jfm-dan2'" style>
              <el-switch v-model="barrage" active-color="#409eff" :width="30" inactive-color="gray"></el-switch>
            </div>
            <div style="margin: 0px 20px;height: 30px; line-height: 45px;">
              <svg
                xmlns="http://www.w3.org/2000/svg"
                style="width: 30px; height: 24px; fill: #757575;"
                viewBox="0 0 22 22"
              >
                <path
                  d="M16.5 8c1.289 0 2.49.375 3.5 1.022V6a2 2 0 00-2-2H4a2 2 0 00-2 2v10a2 2 0 002 2h7.022A6.5 6.5 0 0116.5 8zM7 13H5a1 1 0 010-2h2a1 1 0 010 2zm2-4H5a1 1 0 010-2h4a1 1 0 010 2z"
                />
                <path
                  d="M20.587 13.696l-.787-.131a3.503 3.503 0 00-.593-1.051l.301-.804a.46.46 0 00-.21-.56l-1.005-.581a.52.52 0 00-.656.113l-.499.607a3.53 3.53 0 00-1.276 0l-.499-.607a.52.52 0 00-.656-.113l-1.005.581a.46.46 0 00-.21.56l.301.804c-.254.31-.456.665-.593 1.051l-.787.131a.48.48 0 00-.413.465v1.209a.48.48 0 00.413.465l.811.135c.144.382.353.733.614 1.038l-.292.78a.46.46 0 00.21.56l1.005.581a.52.52 0 00.656-.113l.515-.626a3.549 3.549 0 001.136 0l.515.626a.52.52 0 00.656.113l1.005-.581a.46.46 0 00.21-.56l-.292-.78c.261-.305.47-.656.614-1.038l.811-.135A.48.48 0 0021 15.37v-1.209a.48.48 0 00-.413-.465zM16.5 16.057a1.29 1.29 0 11.002-2.582 1.29 1.29 0 01-.002 2.582z"
                />
              </svg>
            </div>
            <div
              style="display: flex;border: 1px solid rgb(200,200,200);background-color: rgb(242,242,242);border-radius: 4px;height: 30px;width: calc(100% - 330px);"
            >
              <div style="line-height: 40px;">
                <span style="height: 100%">
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    style="width: 36px;height: 24px;fill:gray"
                    viewBox="0 0 22 22"
                  >
                    <path
                      d="M17 16H5c-.55 0-1 .45-1 1s.45 1 1 1h12c.55 0 1-.45 1-1s-.45-1-1-1zM6.96 15c.39 0 .74-.24.89-.6l.65-1.6h5l.66 1.6c.15.36.5.6.89.6.69 0 1.15-.71.88-1.34l-3.88-8.97C11.87 4.27 11.46 4 11 4s-.87.27-1.05.69l-3.88 8.97c-.27.63.2 1.34.89 1.34zM11 5.98L12.87 11H9.13L11 5.98z"
                    />
                  </svg>
                </span>
              </div>
              <input
                style="border: none;background-color: rgb(242,242,242);outline: none;width: calc(100% - 173px);"
              />
              <span style="font-size: 12px;color: gray">弹幕礼仪</span>
              <span>
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  style="width: 16px;height: 28px;margin-top: 2px;fill:gray;"
                  viewBox="0 0 16 16"
                >
                  <path
                    d="M9.188 7.999l-3.359 3.359a.75.75 0 101.061 1.061l3.889-3.889a.75.75 0 000-1.061L6.89 3.58a.75.75 0 10-1.061 1.061l3.359 3.358z"
                  />
                </svg>
              </span>
              <div class="jfm-send-btn">
                <el-button type="primary">发送</el-button>
              </div>
            </div>
          </div>
          <div style="display: flex;margin-top: 15px">
            <div style="display: flex">
              <div>
                <svg
                  t="1627224560274"
                  class="icon"
                  viewBox="0 0 1024 1024"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="2877"
                  width="25"
                  height="25"
                >
                  <path
                    d="M1020.377987 468.716066a84.323832 84.323832 0 0 0-53.615893-63.851873 150.6127 150.6127 0 0 0-48.741903-7.310985H660.175705c-11.210978 0-11.210978 0-9.748981-11.210978 5.361989-31.194938 9.748981-62.876875 16.084968-94.071812a237.859526 237.859526 0 0 0-4.87399-125.266751c-12.672975-37.043926-27.295946-73.112854-40.942919-109.669781a73.112854 73.112854 0 0 0-40.455919-45.32991 131.115739 131.115739 0 0 0-116.493768 3.412993 63.851873 63.851873 0 0 0-37.529925 61.413878c0 40.455919 0 80.911839 2.923994 121.367758a66.289868 66.289868 0 0 1-8.773982 37.043926c-31.194938 53.615893-53.615893 97.483806-86.272829 146.225709a349.966303 349.966303 0 0 1-32.169935 36.555927 93.096815 93.096815 0 0 0-35.58193 69.700861v453.299097a82.373836 82.373836 0 0 0 81.886837 82.861835h445.501113a240.78452 240.78452 0 0 0 75.549849-9.74898 116.005769 116.005769 0 0 0 83.347834-105.281791 133.065735 133.065735 0 0 0-6.335987-57.515885 12.672975 12.672975 0 0 1 2.436995-9.747981 129.165743 129.165743 0 0 0 28.757943-86.759827 141.839717 141.839717 0 0 0-7.798985-33.144934 13.647973 13.647973 0 0 1 0-14.622971 119.417762 119.417762 0 0 0 28.757943-78.961842 281.728439 281.728439 0 0 0-8.285984-41.917917v-10.235979a126.241749 126.241749 0 0 0 29.244942-61.414878V479.439045zM82.583855 438.983125h54.590892q82.373836 0 82.373836 82.373836v420.155163q0 82.373836-82.373836 82.373836h-54.589892q-82.374836 0-82.374835-82.373836V521.356961q0-82.373836 82.373835-82.373836z"
                    p-id="2878"
                    fill="#707070"
                  />
                </svg>
              </div>
              <div style="line-height: 30px;font-size: 14px;margin: 0px 30px 0px 15px">3.4万</div>
            </div>
            <div style="display: flex">
              <div>
                <svg
                  t="1627224695616"
                  class="icon"
                  viewBox="0 0 1024 1024"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="9809"
                  width="25"
                  height="25"
                >
                  <path
                    d="M511.87 33.99c-265.1 0-480 214.9-480 480s214.9 480 480 480 480-214.9 480-480-214.91-480-480-480z m240.39 496.09c-36.02 26.35-100.84 74.68-124.28 98.12-23.27 23.27-71.04 87.27-97.51 123.45-9.17 12.53-27.86 12.42-36.68-0.21-25.84-36.99-72.94-102.93-96.42-126.4-22.83-22.83-87.07-68.34-123.33-93.43-12.57-8.7-12.88-27.2-0.61-36.5 35.58-26.98 98.95-75.86 122.27-99.18 23.46-23.46 72.77-87.42 99.65-122.89 9.17-12.1 27.34-12 36.21 0.2 25.13 34.58 70.47 95.7 92.94 118.16 24.08 24.08 91.39 75.07 128.1 102.4 12.12 9.03 11.96 27.28-0.34 36.28z"
                    fill="#707070"
                    p-id="9810"
                  />
                </svg>
              </div>
              <div style="line-height: 30px;font-size: 14px;margin: 0px 30px 0px 15px">1.4万</div>
            </div>
            <div style="display: flex">
              <div>
                <svg
                  t="1627224753164"
                  class="icon"
                  viewBox="0 0 1024 1024"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="1758"
                  width="25"
                  height="25"
                >
                  <path
                    d="M565.273 34.627L677.369 272.17c8.706 18.32 25.411 31.051 44.823 33.996l250.776 38.081c48.698 7.411 68.225 70.046 32.934 105.98L824.407 635.164c-13.998 14.23-20.352 34.815-17.059 54.935l42.82 261.127c8.346 50.696-42.643 89.452-86.226 65.519L539.634 893.474c-17.286-9.526-37.992-9.526-55.278 0l-224.314 123.27c-43.583 23.934-94.572-14.822-86.22-65.518L216.638 690.1c3.32-20.12-3.089-40.705-17.087-54.935L18.11 450.227c-35.285-35.934-15.818-98.574 32.934-105.98l250.75-38.081c19.35-2.94 36.082-15.675 44.756-33.996L458.673 34.627c21.825-46.168 84.836-46.168 106.6 0z"
                    p-id="1759"
                    fill="#707070"
                  />
                </svg>
              </div>
              <div style="line-height: 30px;font-size: 14px;margin: 0px 30px 0px 15px">5.8万</div>
            </div>
            <div style="display: flex">
              <div>
                <svg
                  t="1627224786706"
                  class="icon"
                  viewBox="0 0 1024 1024"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="10748"
                  width="25"
                  height="25"
                >
                  <path
                    d="M640 682.666667v213.333333l384-429.312L640 42.666667v213.333333C39.722667 329.002667-185.514667 900.565333 187.477333 980.522667 25.173333 855.253333 326.186667 663.04 640 682.666667z"
                    p-id="10749"
                    fill="#707070"
                  />
                </svg>
              </div>
              <div style="line-height: 30px;font-size: 14px;margin: 0px 30px 0px 15px">2300</div>
            </div>
          </div>
          <div
            style="margin-top: 10px;border-top: 1px solid rgb(232,232,232);border-bottom: 1px solid rgb(232,232,232);padding: 15px 0px 10px 0px"
          >
            <div style="display:flex;margin-bottom: 10px">
              <div>
                <svg
                  t="1627225555770"
                  class="icon"
                  viewBox="0 0 1024 1024"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="11675"
                  width="16"
                  height="16"
                >
                  <path
                    d="M515.2 140.8h-6.4C307.2 140.8 140.8 307.2 140.8 508.8v6.4c0 201.6 166.4 368 368 368h6.4c201.6 0 368-166.4 368-368v-6.4c0-201.6-166.4-368-368-368z m-6.4 678.4c-166.4 0-304-137.6-304-304v-6.4c0-73.6 25.6-137.6 67.2-192l435.2 435.2c-51.2 41.6-118.4 67.2-192 67.2h-6.4z m310.4-304c0 73.6-25.6 137.6-67.2 192L316.8 272c51.2-41.6 118.4-67.2 192-67.2h6.4c166.4 0 304 137.6 304 304v6.4z"
                    fill="#d81e06"
                    p-id="11676"
                  />
                </svg>
              </div>
              <div style="font-size:12px;color: rgb(180,180,180)">未经作者授权，禁止转载</div>
            </div>
            <div style="font-size:13px">影视素材列表：《孔子》、《战国》、《鸿门宴传奇》、《见龙卸甲》、《赤壁》、《花木兰》</div>
            <div style="font-size:13px">BGM：Flight Of The Silverbird</div>

            <div style="margin-top: 20px;overflow: hidden;">
              <div
                style="float:left;font-size: 12px;color:#00a1d6;background-color: rgb(240,240,240);padding: 2px 15px;border-radius: 10px;margin-right: 10px;margin-bottom: 10px;"
                v-for="item in 10"
                :key="item"
              >超级英雄{{item}}</div>
            </div>
          </div>
          <div>
            <div style="font-size:18px;margin: 20px 0px;line-height: 24px;">264&nbsp;评论</div>
            <div>
              <el-tabs v-model="commentType">
                <el-tab-pane label="按热度排序" name="1">
                  <div style="display:flex;width: 100%;margin-bottom: 5px">
                    <div style="padding-top: 10px;">
                      <el-avatar icon="el-icon-user-solid"></el-avatar>
                    </div>
                    <div style="width: calc(100% - 30px);padding-left:30px;padding-right: 15px;">
                      <el-input
                        style="font-size:12px;height: 65px; "
                        type="textarea"
                        resize="none"
                        :rows="3"
                        placeholder="发一条友善的弹幕"
                        v-model="commentText"
                      ></el-input>
                    </div>
                    <div>
                      <el-button type="primary" style="height: 65px;ling-height: 65px;">
                        发表
                        <br />评论
                      </el-button>
                    </div>
                  </div>
                  <div
                    style="margin-left: 70px;line-height: 23px;display:inline-flex; border: 1px solid rgb(222,222,222);padding: 0px 10px;border-radius: 4px;box-shadow: 0px 1px 10px 0 rgb(106 115 133 / 25%);cursor: pointer;"
                  >
                    <div>
                      <svg
                        t="1627793608559"
                        class="icon"
                        viewBox="0 0 1025 1024"
                        version="1.1"
                        xmlns="http://www.w3.org/2000/svg"
                        p-id="2119"
                        width="15"
                        height="15"
                      >
                        <path
                          d="M512.016 1024C229.232 1024 0.016 794.784 0.016 512 0.016 229.216 229.232 0 512.016 0 794.784 0 1024 229.216 1024 512 1024 794.784 794.784 1024 512.016 1024ZM512.016 64C264.976 64 64.016 264.96 64.016 512 64.016 759.024 264.976 960 512.016 960 759.04 960 960 759.024 960 512 960 264.96 759.04 64 512.016 64ZM510.336 833.456C509.056 833.456 507.744 833.488 506.448 833.488 310.992 833.488 229.024 657.12 225.616 649.552 218.336 633.424 225.488 614.496 241.584 607.216 257.712 599.968 276.576 607.088 283.888 623.088 286.64 629.12 352.928 769.488 506.576 769.488 507.584 769.488 508.576 769.456 509.584 769.456 672.896 767.552 738.368 624.768 739.024 623.344 746.176 607.216 765.024 599.872 781.264 607.152 797.392 614.336 804.672 633.248 797.456 649.408 794.176 656.8 714.208 831.056 510.336 833.456ZM671.504 479.84C636.224 479.84 607.664 451.232 607.664 415.984 607.664 380.768 636.224 352.176 671.504 352.176 706.768 352.176 735.344 380.768 735.344 415.984 735.344 451.232 706.768 479.84 671.504 479.84ZM351.504 479.84C316.224 479.84 287.664 451.232 287.664 415.984 287.664 380.768 316.224 352.176 351.504 352.176 386.768 352.176 415.344 380.768 415.344 415.984 415.344 451.232 386.768 479.84 351.504 479.84Z"
                          p-id="2120"
                          fill="#707070"
                        />
                      </svg>
                    </div>
                    <div style="font-size: 12px;color: gray;margin-left: 5px">表情</div>
                  </div>
                  <div style="height: 30px;border-bottom: 1px solid rgb(232,232,232);"></div>
                  <div>
                    <div style="display:flex;padding-top: 10px;" v-for="item in 10" :key="item">
                      <div style="padding-top: 10px;">
                        <el-avatar icon="el-icon-user-solid"></el-avatar>
                      </div>
                      <div
                        style="margin-left: 30px;border-bottom: 1px solid rgb(232,232,232);padding-bottom: 10px;"
                      >
                        <div style="position:relative;line-height: 18px;padding-bottom: 5px">
                          <span
                            style="font-size: 12px;color: gray;margin-right: 15px;
                                    font-weight: bold;
                                    padding-bottom: 4px;
                                    word-wrap: break-word;"
                          >星空下の人</span>
                          <span style="font-size: 6px;position: absolute;bottom: 0px;">
                            <LV size="20" />
                          </span>
                        </div>
                        <div
                          style="cont-size: 14px;"
                        >还有啊，有些人点2就像我，点错了，还请别乱骂，别抱着这个就随意喷好吧，网络上就因为这样不分青红皂白，把人网暴死了的，说实话有点看不惯这种人</div>
                        <div style="margin-top: 6px;line-height: 22px;">
                          <span style="font-size:12px;color: gray;margin-right: 20px;">13分钟前</span>
                          <span style="margin-right: 25px;">
                            <svg
                              t="1627797716733"
                              class="icon"
                              viewBox="0 0 1054 1024"
                              version="1.1"
                              xmlns="http://www.w3.org/2000/svg"
                              p-id="5643"
                              width="15"
                              height="15"
                            >
                              <path
                                d="M1022.573469 408.544056a143.249009 143.249009 0 0 0-111.070124-51.512701h-247.797281a432.461708 432.461708 0 0 0 25.657033-113.718592 263.456348 263.456348 0 0 0-27.411643-152.286906 181.718006 181.718006 0 0 0-138.713508-89.385793 96.006963 96.006963 0 0 0-72.50181 15.559749c-39.892548 29.03383-47.242047 84.287492-55.717144 148.247992a392.238101 392.238101 0 0 1-40.289818 150.631614c-17.248147 27.742702-50.784373 64.589512-142.785528 64.589512h-96.006962a113.817909 113.817909 0 0 0-115.870472 111.268759v420.676025A113.817909 113.817909 0 0 0 115.870472 1023.981792h699.361064a146.228536 146.228536 0 0 0 88.061558-29.4311 136.197463 136.197463 0 0 0 49.923621-75.61376L1049.455418 524.083469a131.132269 131.132269 0 0 0-26.915055-115.440096zM77.302158 912.679927V492.003902a37.939303 37.939303 0 0 1 38.634526-37.078551h81.473495v494.833127H115.870472a37.939303 37.939303 0 0 1-38.634526-37.078551z m896.936771-405.579758l-96.205597 394.919674a63.662548 63.662548 0 0 1-62.735585 47.738635H274.778548V449.562203a208.00405 208.00405 0 0 0 146.394065-95.377951 444.677766 444.677766 0 0 0 50.618843-179.30128 573.658154 573.658154 0 0 1 12.017424-70.383035 51.876866 51.876866 0 0 1 13.705821-28.106866 21.088426 21.088426 0 0 1 14.43415-1.291128 104.548272 104.548272 0 0 1 82.268036 51.578913c33.999707 59.888481 18.969652 160.927533-13.440975 229.787699a50.983008 50.983008 0 0 0 3.873384 50.552632 55.518509 55.518509 0 0 0 46.348189 24.200376h280.638283a65.251629 65.251629 0 0 1 50.519526 23.405835 59.590528 59.590528 0 0 1 12.216059 52.472771z"
                                p-id="5644"
                                fill="#707070"
                              />
                            </svg>
                          </span>
                          <span style="margin-right: 25px;">
                            <svg
                              t="1627797869321"
                              class="icon"
                              viewBox="0 0 1024 1024"
                              version="1.1"
                              xmlns="http://www.w3.org/2000/svg"
                              p-id="6835"
                              width="18"
                              height="18"
                            >
                              <path
                                d="M860.8 723.2l6.4 57.6-6.4-57.6c12.8 0 25.6-3.2 35.2-12.8 6.4-9.6 6.4-22.4 3.2-32l57.6-12.8-57.6 12.8L800 342.4c-6.4-28.8-25.6-51.2-48-64-9.6-6.4-22.4-9.6-32-9.6H182.4c-22.4-3.2-41.6 6.4-51.2 25.6-6.4 9.6-6.4 19.2-9.6 28.8v342.4c0 19.2 9.6 38.4 28.8 48 6.4 3.2 12.8 6.4 19.2 6.4h192l19.2 25.6 147.2 188.8c6.4 9.6 19.2 12.8 28.8 9.6 16-3.2 25.6-19.2 22.4-35.2l-9.6-118.4-6.4-67.2h297.6z m-233.6 57.6l9.6 128c3.2 28.8-9.6 54.4-28.8 73.6-35.2 32-92.8 28.8-124.8-6.4l-156.8-195.2H179.2c-19.2 0-38.4-6.4-57.6-16-35.2-19.2-57.6-57.6-57.6-99.2V323.2c0-19.2 6.4-38.4 16-57.6 19.2-38.4 57.6-60.8 99.2-54.4h537.6c67.2 3.2 121.6 48 137.6 112l102.4 339.2c6.4 28.8 3.2 57.6-12.8 80-19.2 22.4-48 38.4-76.8 38.4h-240zM304 268.8v451.2h57.6V268.8H304z"
                                fill="#707070"
                                p-id="6836"
                              />
                            </svg>
                          </span>
                          <span style="font-size: 13px;color: gray;">回复</span>
                          <span style="float: right">
                            <svg
                              t="1627799043339"
                              class="icon"
                              viewBox="0 0 1024 1024"
                              version="1.1"
                              xmlns="http://www.w3.org/2000/svg"
                              p-id="7778"
                              width="15"
                              height="15"
                            >
                              <path
                                d="M512 158.72m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                                p-id="7779"
                                fill="#707070"
                              />
                              <path
                                d="M512 512m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                                p-id="7780"
                                fill="#707070"
                              />
                              <path
                                d="M512 865.28m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                                p-id="7781"
                                fill="#707070"
                              />
                            </svg>
                          </span>
                        </div>
                        <div
                          v-show="item===1"
                          v-for="it in 5"
                          :key="it"
                          style="margin-top: 6px;display: flex;margin-bottom: 10px;"
                        >
                          <div style="padding-top: 5px;">
                            <el-avatar icon="el-icon-user-solid" size="small"></el-avatar>
                          </div>
                          <div style="margin-left: 15px;width: calc(100% - 30px)">
                            <div style="position:relative;line-height: 18px;padding-bottom: 5px;">
                              <span
                                style="font-size: 12px;color: gray;margin-right: 15px;
                                    font-weight: bold;
                                    padding-bottom: 4px;
                                    word-wrap: break-word;"
                              >星空下の人</span>
                              <span style="position: absolute;">
                                <LV size="20" />
                              </span>
                              <span style="font-size: 12px;margin-left: 40px;">下次一定</span>
                            </div>
                            <div style="line-height: 22px;width: calc(100% - 30px)">
                              <span style="font-size:12px;color: gray;margin-right: 20px;">13分钟前</span>
                              <span style="margin-right: 25px;">
                                <svg
                                  t="1627797716733"
                                  class="icon"
                                  viewBox="0 0 1054 1024"
                                  version="1.1"
                                  xmlns="http://www.w3.org/2000/svg"
                                  p-id="5643"
                                  width="15"
                                  height="15"
                                >
                                  <path
                                    d="M1022.573469 408.544056a143.249009 143.249009 0 0 0-111.070124-51.512701h-247.797281a432.461708 432.461708 0 0 0 25.657033-113.718592 263.456348 263.456348 0 0 0-27.411643-152.286906 181.718006 181.718006 0 0 0-138.713508-89.385793 96.006963 96.006963 0 0 0-72.50181 15.559749c-39.892548 29.03383-47.242047 84.287492-55.717144 148.247992a392.238101 392.238101 0 0 1-40.289818 150.631614c-17.248147 27.742702-50.784373 64.589512-142.785528 64.589512h-96.006962a113.817909 113.817909 0 0 0-115.870472 111.268759v420.676025A113.817909 113.817909 0 0 0 115.870472 1023.981792h699.361064a146.228536 146.228536 0 0 0 88.061558-29.4311 136.197463 136.197463 0 0 0 49.923621-75.61376L1049.455418 524.083469a131.132269 131.132269 0 0 0-26.915055-115.440096zM77.302158 912.679927V492.003902a37.939303 37.939303 0 0 1 38.634526-37.078551h81.473495v494.833127H115.870472a37.939303 37.939303 0 0 1-38.634526-37.078551z m896.936771-405.579758l-96.205597 394.919674a63.662548 63.662548 0 0 1-62.735585 47.738635H274.778548V449.562203a208.00405 208.00405 0 0 0 146.394065-95.377951 444.677766 444.677766 0 0 0 50.618843-179.30128 573.658154 573.658154 0 0 1 12.017424-70.383035 51.876866 51.876866 0 0 1 13.705821-28.106866 21.088426 21.088426 0 0 1 14.43415-1.291128 104.548272 104.548272 0 0 1 82.268036 51.578913c33.999707 59.888481 18.969652 160.927533-13.440975 229.787699a50.983008 50.983008 0 0 0 3.873384 50.552632 55.518509 55.518509 0 0 0 46.348189 24.200376h280.638283a65.251629 65.251629 0 0 1 50.519526 23.405835 59.590528 59.590528 0 0 1 12.216059 52.472771z"
                                    p-id="5644"
                                    fill="#707070"
                                  />
                                </svg>
                              </span>
                              <span style="margin-right: 25px;">
                                <svg
                                  t="1627797869321"
                                  class="icon"
                                  viewBox="0 0 1024 1024"
                                  version="1.1"
                                  xmlns="http://www.w3.org/2000/svg"
                                  p-id="6835"
                                  width="18"
                                  height="18"
                                >
                                  <path
                                    d="M860.8 723.2l6.4 57.6-6.4-57.6c12.8 0 25.6-3.2 35.2-12.8 6.4-9.6 6.4-22.4 3.2-32l57.6-12.8-57.6 12.8L800 342.4c-6.4-28.8-25.6-51.2-48-64-9.6-6.4-22.4-9.6-32-9.6H182.4c-22.4-3.2-41.6 6.4-51.2 25.6-6.4 9.6-6.4 19.2-9.6 28.8v342.4c0 19.2 9.6 38.4 28.8 48 6.4 3.2 12.8 6.4 19.2 6.4h192l19.2 25.6 147.2 188.8c6.4 9.6 19.2 12.8 28.8 9.6 16-3.2 25.6-19.2 22.4-35.2l-9.6-118.4-6.4-67.2h297.6z m-233.6 57.6l9.6 128c3.2 28.8-9.6 54.4-28.8 73.6-35.2 32-92.8 28.8-124.8-6.4l-156.8-195.2H179.2c-19.2 0-38.4-6.4-57.6-16-35.2-19.2-57.6-57.6-57.6-99.2V323.2c0-19.2 6.4-38.4 16-57.6 19.2-38.4 57.6-60.8 99.2-54.4h537.6c67.2 3.2 121.6 48 137.6 112l102.4 339.2c6.4 28.8 3.2 57.6-12.8 80-19.2 22.4-48 38.4-76.8 38.4h-240zM304 268.8v451.2h57.6V268.8H304z"
                                    fill="#707070"
                                    p-id="6836"
                                  />
                                </svg>
                              </span>
                              <span style="font-size: 13px;color: gray;">回复</span>
                              <span style="float: right">
                                <svg
                                  t="1627799043339"
                                  class="icon"
                                  viewBox="0 0 1024 1024"
                                  version="1.1"
                                  xmlns="http://www.w3.org/2000/svg"
                                  p-id="7778"
                                  width="15"
                                  height="15"
                                >
                                  <path
                                    d="M512 158.72m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                                    p-id="7779"
                                    fill="#707070"
                                  />
                                  <path
                                    d="M512 512m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                                    p-id="7780"
                                    fill="#707070"
                                  />
                                  <path
                                    d="M512 865.28m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                                    p-id="7781"
                                    fill="#707070"
                                  />
                                </svg>
                              </span>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </el-tab-pane>
                <el-tab-pane label="按时间排序" name="2">按时间排序</el-tab-pane>
              </el-tabs>
            </div>
          </div>
        </div>
        <div style="width: 350px;padding-left: 30px;padding-top: 10px;">
          <div style="display:flex">
            <div style="padding-top: 5px;">
              <el-avatar icon="el-icon-user-solid"></el-avatar>
            </div>
            <div style="margin-left: 20px">
              <div style="position: relative">
                <span style="margin-right: 15px;">加菲猫-冷屏</span>
                <span style="position: absolute">
                  <svg
                    t="1627801442621"
                    class="icon"
                    viewBox="0 0 1024 1024"
                    version="1.1"
                    xmlns="http://www.w3.org/2000/svg"
                    p-id="8684"
                    width="20"
                    height="20"
                  >
                    <path
                      d="M867.046319 156.952658 156.952658 156.952658c-49.040926 0-88.317465 39.720653-88.317465 88.76158l-0.444115 532.570501c0 49.040926 39.720653 88.76158 88.76158 88.76158l710.09366 0c49.040926 0 88.76158-39.720653 88.76158-88.76158L955.807898 245.714238C955.808922 196.673311 916.087245 156.952658 867.046319 156.952658zM867.046319 334.476841l-355.047342 221.903949-355.047342-221.903949 0-88.76158 355.047342 221.903949 355.047342-221.903949L867.046319 334.476841z"
                      p-id="8685"
                      fill="gray"
                    />
                  </svg>
                </span>
                <span style="font-size: 14px;color: gray;margin-left: 25px">发消息</span>
              </div>
              <div style="font-size: 12px;color: gray;padding: 3px 0px;">官号里最能吃，能吃里最好看，好看里最会皮(˘͈</div>
              <div>
                <el-button type="primary" icon="el-icon-plus" style="padding: 6px 20px;">关注150.0万</el-button>
              </div>
            </div>
          </div>
          <div>
            <div
              style="line-height: 50px;position: relative; background-color: rgb(240,240,240); padding: 0px 15px; margin-top: 10px;"
            >
              <span style="margin-right: 10px">高级弹幕</span>
              <span style="position: absolute;bottom: -2px;">
                <svg
                  t="1627799043339"
                  class="icon"
                  viewBox="0 0 1024 1024"
                  version="1.1"
                  xmlns="http://www.w3.org/2000/svg"
                  p-id="7778"
                  width="15"
                  height="15"
                >
                  <path
                    d="M512 158.72m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                    p-id="7779"
                    fill="#707070"
                  />
                  <path
                    d="M512 512m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                    p-id="7780"
                    fill="#707070"
                  />
                  <path
                    d="M512 865.28m0-92.16a92.16 92.16 0 1 0 0 184.32 92.16 92.16 0 1 0 0-184.32Z"
                    p-id="7781"
                    fill="#707070"
                  />
                </svg>
              </span>
              <span style="color: gray;font-size: 12px;float: right;cursor: pointer;" @click="handleOpenZoom">{{openZoomType?'收起':'展开'}}</span>
            </div>
            <div ref="OpenZoom" class="OpenZoom" style="overflow: hidden;">
              <div style="line-height: 55px;padding-left: 10px;padding-right: 10px; ">
                <span
                  style="font-weight: 700;
    font-size: 12px;
    color: #222;
    vertical-align: middle;margin-right: 16px;"
                >屏蔽列表</span>
                <span>
                  <el-switch
                    v-model="barrage"
                    active-color="#409eff"
                    :width="30"
                    inactive-color="gray"
                  ></el-switch>
                </span>
                <span style="float: right;">
                  <i style="font-size: 18px;color:#00a1d6" class="el-icon-refresh"></i>
                  <span style="font-size: 12px;color:#00a1d6;margin-left: 3px;">同步屏蔽列表</span>
                </span>
              </div>
              <div style="padding: 0px 10px;">
                <input
                  type="text"
                  placeholder="添加关键屏蔽词"
                  style="height: 24px;border: 1px solid #ccd0d7;
    line-height: 24px;
    margin-right: 6px;
    padding: 1px 10px;
    border-radius: 2px;
    vertical-align: middle;box-sizing: border-box;font-size: 12px;width: calc(100% - 80px);outline: none;"
                />

                <el-button
                  style="padding-top: 4px;padding-bottom: 4px;background-color: #e5e9ef;"
                >添加</el-button>
              </div>
              <div style="padding: 0px 10px;">
                <div style="font-size:12px;margin-top: 15px;margin-bottom: 10px;">已屏蔽词</div>
                <div style="background-color: #f4f5f7;padding: 5px;">
                  <table style="width: 100%;border-collapse: collapse;
    table-layout: fixed;">
                    <tbody style="font-size: 13px;color: #99a2aa;">
                      <tr style="line-height: 30px;">
                        <td style="padding-left: 5px;">内容</td>
                        <td style="width: 40px;text-align: center;">状态</td>
                        <td style="width: 40px;text-align: center;">操作</td>
                        <td style="width: 40px;text-align: center;">同步</td>
                      </tr>
                      <tr  v-for="intm in 5" :key="intm" style="color: black;background-color: white;height: 24px;line-height: 24px;">
                        <td style="padding-left: 5px;">123</td>
                        <td style="width: 40px;text-align: center;color:#00a1d6">启用</td>
                        <td style="width: 40px;text-align: center;">
                          <i style="font-size: 16px;color: gray" class="el-icon-delete-solid"></i>
                        </td>
                        <td style="width: 40px;text-align: center;">
                          <i style="font-size: 16px;color: gray" class="el-icon-check"></i>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
          <div style="margin-top: 20px;margin-bottom: 10px;">
            <span>接下来播放</span>
            <span style="float: right;">
              <span style="color: gray;font-size: 12px;margin-right: 10px;">自动连播</span>
              <span>
                <el-switch
                  v-model="barrage"
                  active-color="#409eff"
                  :width="30"
                  inactive-color="gray"
                ></el-switch>
              </span>
            </span>
          </div>
          <div>
            <div
              v-for="item in 10"
              :key="item"
              :style="{'display': 'flex','width': '100%','padding-bottom': '10px','border-bottom':item===1?'1px solid rgb(232,232,232)':'','margin-bottom':item===1?'10px':'' }"
            >
              <div style="width: 45%;height: 80px;
    display: block;overflow:hidden">
                <img
                  :src="'/index-video-bottom/index-video-bottom1 (1).jpg'"
                  style="width: 100%;height: 100%;border-radius: 4px;"
                />
              </div>
              <div style="width: 55%;padding-left: 10px;">
                <div
                  style="font-size: 14px;
    font-weight: 500;
    height: 36px;
    line-height: 18px;
    margin-bottom: 6px;
    word-break: break-word;
    overflow: hidden;
    text-overflow: ellipsis;"
                >燃向！历届中国奥运天团赛场名场面！</div>
                <div
                  style="margin-bottom: 4px;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;color: #999;font-size: 12px;"
                >燃新闻</div>
                <div
                  style="display: inline-block;
    height: 16px;
    width: 100%;
    color: #999;
    font-size: 12px;"
                >17.9万 播放&nbsp;·&nbsp;278 弹幕</div>
              </div>
            </div>

            <div
              style="height: 42px;
    background: #f4f5f7;
    color: #6d7579;
    margin-top: 10px;
    text-align: center;
    line-height: 42px;
    cursor: pointer;font-size: 14px;cursor: pointer;"
            >展开</div>

            <div style="margin-top: 20px;position: relative">
              <img
                :src="'/index-video-bottom/index-video-bottom1 (2).jpg'"
                style="width: 100%;height: 100%"
              />
              <span
                style="position: absolute;bottom: 0px;padding-left: 15px;color: white;;font-size: 12px;line-height: 45px;left:0px;"
              >看视频赢好礼，哒哒哒~~啦啦啦</span>
            </div>

            <div style="font-size: 16px;line-height: 50px;">大家围观的直播</div>

            <div style="border: 1px solid rgb(232,232,232);
    border-radius: 8px;">
              <div style="position: relative">
                <img
                  :src="'/index-video-bottom/index-video-bottom1 (4).jpg'"
                  style="width: 100%;height: 100%;border-radius: 8px;"
                />
                <div
                  class="hover-bg"
                  style="position: absolute;top: 0px;width: 100%;height: 100%;border-radius: 8px;"
                ></div>
              </div>
              <div style="display:flex;padding-left: 10px;margin-top: 5px;">
                <div style="padding-top: 5px;">
                  <el-avatar icon="el-icon-user-solid"></el-avatar>
                </div>
                <div style="margin-left: 20px;padding-top:5px;">
                  <div style="position: relative">
                    <span style="margin-right: 15px;">加菲猫-冷屏</span>
                  </div>
                  <div
                    style="font-size: 12px;color: rgb(180,180,180);display: flex;padding: 5px 0px; "
                  >
                    <div style="display: flex">
                      <IconUser1 size="15" />
                      <div style="margin-left: 5px">32.9万</div>
                    </div>
                    <div style="display: flex;margin-left: 15px;">
                      <span>
                        <svg
                          t="1627805264075"
                          class="icon"
                          viewBox="0 0 1408 1024"
                          version="1.1"
                          xmlns="http://www.w3.org/2000/svg"
                          p-id="11054"
                          width="15"
                          height="15"
                        >
                          <path
                            d="M703.872 357.76c-40.832 0-79.232 16-108.16 44.864a151.936 151.936 0 0 0-44.864 108.16c0 40.832 15.872 79.232 44.8 108.16 28.992 28.928 67.392 44.8 108.16 44.8 40.832 0 79.232-15.872 108.16-44.8 28.992-28.928 44.864-67.328 44.864-108.16 0-40.768-15.872-79.168-44.8-108.16a151.68 151.68 0 0 0-108.16-44.8zM1381.12 511.616c-0.448-8.384-13.376-49.92-31.36-93.184-18.432-44.544-49.664-108.992-92.8-162.88A616.448 616.448 0 0 0 1049.6 87.68C950.144 37.76 833.728 12.48 703.872 12.48c-129.792 0-246.144 25.344-345.6 75.328a620.48 620.48 0 0 0-207.36 167.68C107.84 309.504 76.736 374.016 58.24 418.56 40.32 461.76 27.52 503.296 27.072 511.68v0.64c0.448 8.32 13.312 49.92 31.36 93.248 18.56 44.608 49.6 109.056 92.672 162.752A616.448 616.448 0 0 0 358.4 936.192c100.032 50.112 216.32 75.456 345.6 75.456 129.472 0 245.76-25.344 345.6-75.456a620.032 620.032 0 0 0 207.36-167.68c43.136-53.888 74.368-118.4 92.8-162.944 17.984-43.2 30.912-84.736 31.36-93.12v-0.32-0.576z m-677.248 259.2a260.288 260.288 0 0 1-259.968-259.968 260.352 260.352 0 0 1 259.968-259.904 260.352 260.352 0 0 1 259.904 259.904 260.288 260.288 0 0 1-259.904 259.968z"
                            p-id="11055"
                            fill="#707070"
                          />
                        </svg>
                      </span>
                      <div style="margin-left: 5px">323.9万</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import flvjs from "flv.js";
import { LV, IconUser1 } from "@/components/colorFont.js";
export default {
  name: "VideoIndex",
  components: {
    LV,
    IconUser1
  },
  data() {
    return {
      barrage: true,
      commentType: "1",
      commentText: "",
      openZoomType:false,
    };
  },
  methods: {
    handleOpenZoom() {
      if (!this.openZoomType) {
        this.$refs.OpenZoom.style.height = "300px";
        this.openZoomType = true;
      } else {
        this.$refs.OpenZoom.style.height = "0px";
         this.openZoomType = false;
      }
    }
  },
  mounted() {},
  computed: {}
};
</script>

<style scoped>
.jfm-dan1 /deep/ .el-switch__core:after {
  content: "弹";
  font-size: 10px;
  padding-left: 2px;
  line-height: 16px;
  color: #00a1d6;
}

.jfm-dan2 /deep/ .el-switch__core:after {
  content: "弹";
  font-size: 10px;
  padding-left: 2px;
  line-height: 16px;
}

.jfm-send-btn /deep/ .el-button {
  padding: 0px 15px;
  height: 32px;
  line-height: 32px;
  margin-top: -1px;
  margin-right: -1px;
  border-radius: 0px 4px 4px 0px;
  margin-left: 10px;
}

.hover-bg {
  background-color: rgb(0, 0, 0, 0);
}

.hover-bg:hover {
  background-color: rgb(0, 0, 0, 0.15);
  cursor: pointer;
}

.OpenZoom {
  height: 0px;
  transition: height 0.5s;
}
</style>