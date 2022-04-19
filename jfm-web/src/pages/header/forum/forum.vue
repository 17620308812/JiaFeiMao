<template>
  <div
    style="
      margin-top: 50px;
      box-shadow: inset 0px 4px 4px 0px rgb(242 242 242);
      background-color: #f9f9f9;
    "
  >
    <div style="width: 60%; margin: 0 auto; display: flex">
      <div
        style="
          min-with: 700px;
          width: calc(100% - 310px);
          margin-right: 10px;
          box-shadow: 0 1px 3px rgb(18 18 18 / 10%);
          margin-top: 10px;
          background-color: #ffffff;
        "
      >
        <div
          style="border-bottom: 1px solid #f0f2f7; padding: 20px; display: flex"
        >
          <div style="font-size: 16px; margin: 0 22px">关注</div>
          <div style="font-size: 16px; margin: 0 22px">推荐</div>
          <div style="font-size: 16px; margin: 0 22px">热榜</div>
          <div style="font-size: 16px; margin: 0 22px">视频</div>
        </div>
        <div
          style="border-bottom: 1px solid #f0f2f7; padding: 20px"
          v-for="item in 10"
          :key="item"
        >
          <div style="font-size: 18px; font-weight: 600">
            <span
              style="
                display: -webkit-box;
                -webkit-box-orient: vertical;
                -webkit-line-clamp: 2;
                overflow: hidden;
              "
            >
              Java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征</span
            >
          </div>
          <div style="display: flex; margin-top: 9px">
            <img
              src="~@/resource/index-scroll/index-scroll-1.jpg"
              :style="{
                width: '100%',
                height: '105px',
                'border-radius': '5px',
                'margin-right': '20px',
                display: item % 3 === 0 ? '' : 'none',
              }"
            />
            <div style="color: #4a4a4a; line-height: 27px; position: relative">
              <span
                :style="{
                  display: '-webkit-box',
                  '-webkit-box-orient': 'vertical',
                  '-webkit-line-clamp': item % 3 === 0 ? 4 : 2,
                  overflow: 'hidden',
                }"
              >
                20世纪90年代，硬件领域出现了单片式计算机系统，这种价格低廉的系统一出现就立即引起了自动控制领域人员的注意，因为使用它可以大幅度提升消费类电子产品（如电视机顶盒、面包烤箱、移动电话等）的智能化程度。Sun公司为了抢占市场先机，在1991年成立了一个称为Green的项目小组，帕特里克、詹姆斯·高斯林、麦克·舍林丹和其他几个工程师一起组成的工作小组在加利福尼亚州门洛帕克市沙丘路的一个小工作室里面研究开发新技术，专攻计算机在家电产品上的嵌入式应用。
              </span>
              <span
                style="
                  display: flex;
                  float: right;
                  bottom: 0px;
                  line-height: 24px;
                  background-color: white;
                  position: absolute;
                  right: 0px;
                "
              >
                <span>... ...</span>
                <span style="margin-left: 4px; color: #175199; font-size: 14px"
                  >阅读全文</span
                >
                <span style="display: inline-flex; align-items: center;color: #175199;"
                  ><svg
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    data-new-api="ArrowDownSmall24"
                    data-old-api="ArrowDown"
                    class="Zi Zi--ArrowDown ContentItem-arrowIcon"
                    fill="currentColor"
                  >
                    <path
                      d="M12 13.248L8.22 9.223a.684.684 0 00-1.01 0 .796.796 0 000 1.075l4.15 4.42a.867.867 0 001.28 0l4.15-4.42a.796.796 0 000-1.075.684.684 0 00-1.01 0L12 13.248z"
                      fill-rule="evenodd"
                      clip-rule="evenodd"
                    ></path></svg
                ></span>
              </span>
            </div>
          </div>
          <div style="margin-top: 8px; display: inline-flex; font-size: 14px">
            <span
              class="tags-span"
              style="background: rgba(0, 102, 255, 0.1); color: #06f"
            >
              <span class="tags-span-icon">
                <svg
                  width="10"
                  height="10"
                  viewBox="0 0 24 24"
                  data-new-api="AgreeFill24"
                  data-old-api="TriangleUp"
                  class="Zi Zi--TriangleUp VoteButton-TriangleUp"
                  fill="currentColor"
                >
                  <path
                    d="M13.792 3.681c-.781-1.406-2.803-1.406-3.584 0l-7.79 14.023c-.76 1.367.228 3.046 1.791 3.046h15.582c1.563 0 2.55-1.68 1.791-3.046l-7.79-14.023z"
                    fill-rule="evenodd"
                    clip-rule="evenodd"
                  ></path></svg
              ></span>
              <span>赞同 249</span>
            </span>
            <span
              style="
                display: inline-block;
                align-items: center;
                padding: 0 12px;
                background: rgba(0, 102, 255, 0.1);
                color: #06f;
                line-height: 30px;
                margin-left: 5px;
                border-radius: 5px;
              "
              ><svg
                width="10"
                height="10"
                viewBox="0 0 24 24"
                data-new-api="OpposeFill24"
                data-old-api="TriangleDown"
                class="Zi Zi--TriangleDown"
                fill="currentColor"
              >
                <path
                  d="M13.792 20.319c-.781 1.406-2.803 1.406-3.584 0L2.418 6.296c-.76-1.367.228-3.046 1.791-3.046h15.582c1.563 0 2.55 1.68 1.791 3.046l-7.79 14.023z"
                  fill-rule="evenodd"
                  clip-rule="evenodd"
                ></path></svg
            ></span>
            <span
              class="tags-span"
              style="color: #8590a6; padding: 0px 5px 0px 12px"
            >
              <span class="tags-span-icon" style="padding: 0px 5px 0px 12px">
                <svg
                  width="1.2em"
                  height="1.2em"
                  viewBox="0 0 24 24"
                  data-new-api="ChatBubbleFill24"
                  data-old-api="Comment"
                  class="Zi Zi--Comment Button-zi"
                  fill="currentColor"
                >
                  <path
                    d="M11.982 3C17.211 3 21 7.271 21 12.014c0 1.514-.441 3.072-1.215 4.496a.946.946 0 00-.063.813l.603 2.018c.135.487-.279.847-.738.703l-1.818-.54c-.495-.163-.882.044-1.341.324C15.114 20.602 13.476 21 12 21c-4.464 0-9-3.452-9-9.014C3 7.19 6.87 3 11.982 3z"
                  ></path>
                </svg>
              </span>
              <span>249 条评论</span>
            </span>
            <span
              class="tags-span"
              style="color: #8590a6; padding: 0px 5px 0px 12px"
            >
              <span class="tags-span-icon" style="padding: 0px 5px 0px 12px">
                <svg
                  width="1.2em"
                  height="1.2em"
                  viewBox="0 0 24 24"
                  data-new-api="PaperplaneFill24"
                  data-old-api="Share"
                  class="Zi Zi--Share Button-zi"
                  fill="currentColor"
                >
                  <path
                    d="M20.223 1.881a.8.8 0 011.205.778l-1.874 16.393a.9.9 0 01-1.204.742l-4.617-1.692a.7.7 0 00-.83.28l-1.929 3.021c-.43.674-1.474.37-1.474-.43v-3.866a.8.8 0 01.18-.505l5.809-7.15a.595.595 0 00-.897-.782l-5.933 6.357a1.1 1.1 0 01-1.257.251l-4.085-1.847a.8.8 0 01-.08-1.415L20.223 1.88z"
                  ></path>
                </svg>
              </span>
              <span>分享</span>
            </span>
            <span
              class="tags-span"
              style="color: #8590a6; padding: 0px 5px 0px 12px"
            >
              <span class="tags-span-icon" style="padding: 0px 5px 0px 12px">
                <svg
                  width="1.2em"
                  height="1.2em"
                  viewBox="0 0 24 24"
                  data-new-api="StarFill24"
                  data-old-api="Star"
                  class="Zi Zi--Star Button-zi"
                  fill="currentColor"
                >
                  <path
                    d="M10.484 3.307c.673-1.168 2.358-1.168 3.032 0l2.377 4.122a.25.25 0 00.165.12l4.655.987c1.319.28 1.84 1.882.937 2.884l-3.186 3.535a.25.25 0 00-.063.193l.5 4.733c.142 1.34-1.222 2.33-2.453 1.782l-4.346-1.938a.25.25 0 00-.204 0l-4.346 1.938c-1.231.549-2.595-.442-2.453-1.782l.5-4.733a.25.25 0 00-.064-.193L2.35 11.42c-.903-1.002-.382-2.604.937-2.884l4.655-.987a.25.25 0 00.164-.12l2.378-4.122z"
                  ></path>
                </svg>
              </span>
              <span>收藏</span>
            </span>
            <span
              class="tags-span"
              style="color: #8590a6; padding: 0px 5px 0px 12px"
            >
              <span class="tags-span-icon" style="padding: 0px 5px 0px 12px">
                <svg
                  width="1.2em"
                  height="1.2em"
                  viewBox="0 0 24 24"
                  data-new-api="FlagFill24"
                  data-old-api="FlagFill24"
                  class="ZDI ZDI--FlagFill24"
                  fill="currentColor"
                >
                  <path
                    d="M12.842 4.421c-1.86-1.24-3.957-1.408-5.798-1.025-1.827.38-3.467 1.313-4.47 2.381a.75.75 0 00-.171.732l4.44 14.546a.75.75 0 101.434-.438l-1.08-3.542c.025-.018.053-.036.083-.054.298-.184.801-.415 1.568-.523 1.386-.197 2.307.129 3.341.543l.187.075c1.005.405 2.161.872 3.791.804 1.401-.003 2.707-.45 3.67-1.015a5.217 5.217 0 001.212-.953c.284-.312.581-.752.581-1.255V5.046a.75.75 0 00-1.17-.622c-1.82 1.23-4.881 1.823-7.618-.003z"
                  ></path>
                </svg>
              </span>
              <span>举报</span>
            </span>
            <span class="tags-span-icon">
              <svg
                width="1.2em"
                height="1.2em"
                viewBox="0 0 24 24"
                data-new-api="Dots24"
                data-old-api="Dots"
                class="Zi Zi--Dots Button-zi"
                fill="currentColor"
              >
                <path
                  d="M5.34 12a1.665 1.665 0 11-3.33 0 1.665 1.665 0 013.33 0zm8.325 0a1.665 1.665 0 11-3.33 0 1.665 1.665 0 013.33 0zm8.325 0a1.665 1.665 0 11-3.33 0 1.665 1.665 0 013.33 0z"
                ></path>
              </svg>
            </span>
          </div>
        </div>
      </div>
      <div style="width: 300px">
        <div
          style="
            box-shadow: 0 1px 3px rgb(18 18 18 / 10%);
            margin-top: 10px;
            background-color: #ffffff;
            padding-bottom: 16px;
          "
        >
          <div
            style="
              display: flex;
              line-height: 52px;
              height: 52px;
              width: 100%;
              position: relative;
            "
          >
            <span
              style="
                display: inline-flex;
                align-items: center;
                margin-left: 16px;
              "
              ><svg
                width="18"
                height="18"
                viewBox="0 0 18 18"
                data-new-api="UserPencilFill24"
                data-old-api="Creator"
                class="Zi Zi--Creator CreatorEntrance-creatorIcon"
                fill="#444"
              >
                <path
                  d="M6.5 7.5A5.5 5.5 0 0112 2a5.5 5.5 0 015.5 5.5A5.5 5.5 0 0112 13a5.5 5.5 0 01-5.5-5.5zm8.11 9.498c.404-.408.91-1 1.17-1.51.067-.133.13-.284.165-.442.034-.15.058-.373-.033-.602a.872.872 0 00-.545-.509 1.37 1.37 0 00-.604-.043c-.657.082-1.518.184-2.373.24-.867.055-1.68.058-2.254-.041-1.189-.204-2.045-.19-2.781.087-.722.272-1.25.773-1.804 1.302-1.533 1.462-2.434 3.311-2.65 4.831-.11.78.535 1.339 1.199 1.339h8.1a.96.96 0 00.955-.929c.06-1.767.7-2.96 1.456-3.723zm6.504-1.568a.75.75 0 10-1.228-.86l-2.903 4.146a.75.75 0 001.229.86l2.902-4.146zm-4.227 6.099a.75.75 0 10-1.241-.842l-.267.392a.75.75 0 001.242.842l.266-.392z"
                  fill-rule="evenodd"
                  clip-rule="evenodd"
                ></path></svg
            ></span>
            <span style="font-size: 14px; color: #444; margin-left: 10px"
              >创作中心</span
            >
            <span
              style="
                color: rgb(133, 144, 166);
                font-size: 12px;
                position: absolute;
                right: 16px;
              "
              >收件箱（0）</span
            >
          </div>
          <div style="display: flex; margin: 0px 16px">
            <div style="width: 25%">
              <div style="width: 40px; height: 40px; margin: 5px auto 10px">
                <svg
                  width="40"
                  height="40"
                  viewBox="0 0 40 40"
                  class="GlobalWriteV2-navIcon"
                  fill="currentColor"
                >
                  <g fill="#06F" fill-rule="evenodd">
                    <circle cx="20" cy="20" r="20" opacity=".12"></circle>
                    <path
                      d="M23.487 10.463c1.896 0 2.583.193 3.277.555a3.824 3.824 0 011.607 1.573c.371.678.569 1.35.569 3.206v8.472c0 1.855-.198 2.527-.569 3.205a3.824 3.824 0 01-1.607 1.573c-.694.363-1.381.556-3.277.556h-6.96c-1.895 0-2.583-.193-3.276-.556a3.824 3.824 0 01-1.608-1.573c-.37-.678-.568-1.35-.568-3.205v-8.472c0-1.855.197-2.528.568-3.206.37-.678.915-1.21 1.608-1.573.693-.362 1.38-.556 3.277-.556h6.959zm0 2.08h-6.96c-1.407 0-1.836.081-2.273.31a1.72 1.72 0 00-.735.72c-.234.427-.317.847-.317 2.224v8.472c0 1.377.083 1.796.317 2.224.172.316.412.551.735.72.437.229.866.31 2.274.31h6.959c1.407 0 1.836-.081 2.274-.31a1.72 1.72 0 00.735-.72c.234-.428.317-.847.317-2.224v-8.472c0-1.377-.083-1.797-.317-2.225a1.72 1.72 0 00-.735-.72c-.438-.228-.867-.309-2.274-.309zm-1.991 9.778v1.873h-5.955V22.32h5.955zm2.977-3.328v1.872h-8.932v-1.872h8.932zm0-3.33v1.873h-8.932v-1.872h8.932z"
                      fill-rule="nonzero"
                    ></path>
                  </g>
                </svg>
              </div>
              <div style="font-size: 12px; text-align: center; color: #444">
                问答问题
              </div>
            </div>
            <div style="width: 25%">
              <div style="width: 40px; height: 40px; margin: 5px auto 10px">
                <svg
                  width="40"
                  height="40"
                  viewBox="0 0 40 40"
                  class="GlobalWriteV2-navIcon"
                  fill="currentColor"
                >
                  <g fill="#FF9607" fill-rule="evenodd">
                    <circle cx="20" cy="20" r="20" opacity=".12"></circle>
                    <path
                      d="M24.233 24.777v-9.555c0-.942-.748-1.706-1.67-1.706H13.61c-.922 0-1.67.764-1.67 1.707v9.554c0 .943.748 1.707 1.67 1.707h8.954c.921 0 1.669-.764 1.669-1.707zm3.478-10.349a2.302 2.302 0 013.297.243c.367.434.57.989.57 1.563v7.532c0 1.32-1.047 2.389-2.337 2.389a2.308 2.308 0 01-1.53-.583l-1.475-1.306v.512c0 2.073-1.644 3.753-3.672 3.753H13.61c-2.028 0-3.672-1.68-3.672-3.753v-9.555c0-2.074 1.644-3.754 3.672-3.754h8.954c2.028 0 3.672 1.68 3.672 3.754v.51l1.475-1.305zm-1.475 7.13l2.786 2.466a.33.33 0 00.219.083.338.338 0 00.334-.341v-7.532a.346.346 0 00-.082-.223.329.329 0 00-.47-.035l-2.787 2.466v3.116z"
                      fill-rule="nonzero"
                    ></path>
                  </g>
                </svg>
              </div>
              <div style="font-size: 12px; text-align: center; color: #444">
                发视频
              </div>
            </div>
            <div style="width: 25%">
              <div style="width: 40px; height: 40px; margin: 5px auto 10px">
                <svg
                  width="40"
                  height="40"
                  viewBox="0 0 40 40"
                  class="GlobalWriteV2-navIcon"
                  fill="currentColor"
                >
                  <g fill="none" fill-rule="evenodd">
                    <circle
                      cx="20"
                      cy="20"
                      r="20"
                      fill="#F4C807"
                      opacity=".12"
                    ></circle>
                    <path d="M6 6h28v28H6z"></path>
                    <path
                      fill="#F4C807"
                      d="M20.406 11.772l-2.172 2.176h-2.29c-1.438 0-1.875.085-2.322.324-.33.176-.575.422-.751.752-.24.448-.324.886-.324 2.326v7.12c0 1.44.085 1.878.324 2.326.176.33.421.576.75.752.421.225.834.314 2.08.323l7.35.001c1.438 0 1.876-.084 2.323-.324.33-.176.575-.422.751-.752.24-.448.324-.886.324-2.326v-4.905l2.172-2.175v7.08c0 1.94-.202 2.643-.58 3.352a3.95 3.95 0 01-1.643 1.645c-.708.379-1.41.58-3.346.58h-7.108c-1.936 0-2.639-.201-3.347-.58a3.95 3.95 0 01-1.642-1.645c-.378-.71-.58-1.413-.58-3.352v-7.12c0-1.94.202-2.643.58-3.352a3.95 3.95 0 011.642-1.645c.708-.379 1.41-.58 3.347-.58h4.462zm6.908-2.053c.384.116.747.338 1.168.759l.188.189c.42.421.642.785.758 1.17a1.98 1.98 0 010 1.163c-.116.385-.337.749-.758 1.17l-6.9 6.911c-.62.622-.827.81-1.078 1.004-.251.193-.496.34-.784.47-.288.131-.553.226-1.392.48l-1.088.332a1.303 1.303 0 01-1.625-1.629l.33-1.09c.255-.84.35-1.104.48-1.393.13-.29.277-.534.47-.785.193-.252.381-.46 1.001-1.081l6.9-6.911c.42-.421.784-.643 1.168-.76a1.97 1.97 0 011.162 0zm-3.204 4.096l-4.797 4.805c-.547.548-.709.723-.852.91-.112.146-.19.276-.265.443-.097.214-.175.44-.4 1.182l-.094.31.31-.095c.74-.225.965-.303 1.179-.4.167-.076.297-.154.442-.266.187-.143.361-.305.909-.853l4.797-4.805-1.23-1.23zm2.546-2.43c-.109.033-.23.11-.443.324l-.874.875 1.228 1.231.875-.876c.213-.213.29-.334.323-.444a.24.24 0 000-.153c-.033-.11-.11-.23-.323-.445l-.189-.188c-.213-.214-.334-.291-.443-.325a.238.238 0 00-.154 0z"
                      fill-rule="nonzero"
                    ></path>
                  </g>
                </svg>
              </div>
              <div style="font-size: 12px; text-align: center; color: #444">
                写文章
              </div>
            </div>
            <div style="width: 25%">
              <div style="width: 40px; height: 40px; margin: 5px auto 10px">
                <svg
                  width="40"
                  height="40"
                  viewBox="0 0 40 40"
                  class="GlobalWriteV2-navIcon"
                  fill="currentColor"
                >
                  <g fill="#26BFBF" fill-rule="evenodd">
                    <circle cx="20" cy="20" r="20" opacity=".12"></circle>
                    <path
                      d="M21.987 11.686v2.169h-6.125c-1.43 0-1.863.064-2.297.306-.332.128-.574.383-.74.702-.255.447-.332.893-.332 2.297v7.018c0 1.442.09 1.876.332 2.297.166.345.408.587.74.766.434.23.868.319 2.297.319h7.018c1.43 0 1.863-.077 2.297-.32.345-.165.587-.408.766-.74.216-.408.296-.816.305-2.054l.001-6.316.025.025h2.17v6.074c0 1.914-.217 2.616-.587 3.318a3.92 3.92 0 01-1.634 1.62c-.689.383-1.403.575-3.317.575h-7.018c-1.915 0-2.616-.204-3.318-.575a3.891 3.891 0 01-1.62-1.62c-.384-.702-.575-1.404-.575-3.318v-7.018c0-1.914.204-2.629.574-3.318a3.996 3.996 0 011.62-1.633c.703-.383 1.404-.574 3.318-.574h6.1zm1.889 6.954c1.059 1.06 1.059 2.807 0 3.88l-.039.038a2.719 2.719 0 01-3.879 0l-2.45-2.553a.801.801 0 00-1.123 0l-.05.052c-.32.357-.32.893 0 1.212a.75.75 0 00.726.217c.51-.128 1.047.23 1.149.74a.946.946 0 01-.727 1.148 2.649 2.649 0 01-2.527-.74 2.796 2.796 0 010-3.905l.038-.025c1.098-1.085 2.808-1.085 3.892 0l2.463 2.488a.764.764 0 001.11 0l.038-.025a.855.855 0 000-1.187.876.876 0 00-.74-.217c-.51.128-1.02-.204-1.148-.727-.128-.51.204-1.021.727-1.149l.013-.013a2.703 2.703 0 012.527.766zm4.338-9.315v2.578h2.578v1.722h-2.578v2.59h-1.723v-2.602h-2.59v-1.71h2.59V9.325h1.723z"
                      fill-rule="nonzero"
                    ></path>
                  </g>
                </svg>
              </div>
              <div style="font-size: 12px; text-align: center; color: #444">
                写想法
              </div>
            </div>
          </div>
          <div
            style="
              display: flex;
              justify-content: center;
              border: 1px solid rgba(0, 102, 255, 0.5);
              color: rgb(0, 102, 255);
              border-radius: 4px;
              cursor: pointer;
              height: 40px;
              font-size: 14px;
              line-height: 40px;
              margin: 20px 16px 0px 16px;
            "
          >
            <span style="display: inline-flex; align-items: center"
              ><svg
                width="16"
                height="16"
                viewBox="0 0 24 24"
                data-new-api="PlusFill24"
                data-old-api="Plus"
                class="Zi Zi--Plus css-1qkvt8e"
                fill="currentColor"
              >
                <path
                  d="M13.25 3.25a1.25 1.25 0 10-2.5 0v7.5h-7.5a1.25 1.25 0 100 2.5h7.5v7.5a1.25 1.25 0 102.5 0v-7.5h7.5a1.25 1.25 0 000-2.5h-7.5v-7.5z"
                  fill-rule="evenodd"
                  clip-rule="evenodd"
                ></path></svg
            ></span>
            <span>开始创作</span>
          </div>
        </div>
        <div
          style="
            box-shadow: 0 1px 3px rgb(18 18 18 / 10%);
            margin-top: 10px;
            background-color: #ffffff;
            padding-bottom: 16px;
            position: sticky;
            top: 0;
          "
        >
          <div
            v-for="item in [
              '我的收藏',
              '我关注的问题',
              '我的邀请',
              '我的余额',
              '我的礼券',
              '站务中心',
              '帮助与客服',
              '版权服务中心',
            ]"
            :key="item"
            style="
              display: flex;
              align-items: center;
              height: 40px;
              width: 100%;
              position: relative;
              color: rgb(133, 144, 166);
            "
          >
            <span class="tags-span-icon" style="padding: 0px 5px 0px 16px">
              <svg
                width="18"
                height="18"
                viewBox="0 0 24 24"
                data-new-api="StarFill24"
                data-old-api="Star"
                class="Zi Zi--Star GlobalSideBar-navIcon"
                fill="currentColor"
              >
                <path
                  d="M10.484 3.307c.673-1.168 2.358-1.168 3.032 0l2.377 4.122a.25.25 0 00.165.12l4.655.987c1.319.28 1.84 1.882.937 2.884l-3.186 3.535a.25.25 0 00-.063.193l.5 4.733c.142 1.34-1.222 2.33-2.453 1.782l-4.346-1.938a.25.25 0 00-.204 0l-4.346 1.938c-1.231.549-2.595-.442-2.453-1.782l.5-4.733a.25.25 0 00-.064-.193L2.35 11.42c-.903-1.002-.382-2.604.937-2.884l4.655-.987a.25.25 0 00.164-.12l2.378-4.122z"
                ></path>
              </svg> </span
            ><span style="font-size: 14px; flex: 1 1">{{ item }}</span>
            <span
              style="
                padding: 6px 10px;
                border-radius: 2px;
                background: #f6f6f6;
                font-size: 12px;
                color: #8590a6;
                float: right;
                margin-right: 26px;
              "
              >0</span
            >
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Forum",
};
</script>

<style scoped>
.tags-span {
  line-height: 30px;
  padding: 0px 12px 0px 0px;
  display: inline-flex;
  border-radius: 5px;
}
.tags-span-icon {
  display: inline-flex;
  align-items: center;
  padding: 0 12px;
}
</style>