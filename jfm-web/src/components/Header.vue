<template>
  <div class="fix-header">
    <div class="fix-header-left">
      <img src="~@/resource/logo.png" />
      <ul>
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/index"
          >主页</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/novel"
          >小说</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/wallpaper"
          >壁纸</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/cartoon"
          >漫画</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/forum"
          >论坛</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/game"
          >游戏</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/live"
          >直播</router-link
        >
        <router-link
          :class="[isIndex === true ? 'index' : 'other']"
          tag="li"
          to="/downloadApp"
        >
          <div style="display: flex">
            <span>下载APP</span>
            <div style="padding-top: 10px; height: 40px">
              <IconShouji :size="30" />
            </div>
          </div>
        </router-link>
      </ul>
    </div>

    <div style="width: 30%; line-height: 50px; margin: auto">
      <div :style="{ display: this.$route.path === '/search' ? 'none' : '' }">
        <el-input
          placeholder="请输入内容"
          size="small"
          v-model="searchText"
          class="input-with-select"
        >
          <el-button
            slot="append"
            icon="el-icon-search"
            @click="handleSearchBtn"
          ></el-button>
        </el-input>
      </div>
    </div>

    <div class="fix-header-right">
      <div style="padding-top: 5px">
        <el-avatar icon="el-icon-user-solid"></el-avatar>
      </div>
      <router-link
        tag="div"
        :class="['login-btn', isIndex === true ? 'index' : 'other']"
        to="/login"
        >登陆</router-link
      >
      <router-link
        tag="div"
        :class="['register-btn', isIndex === true ? 'index' : 'other']"
        to="/register"
        >注册</router-link
      >
      <el-badge :value="200" :max="99" class="item">
        <el-button type="danger" size="small">评论</el-button>
      </el-badge>
    </div>
  </div>
</template>

<script>
import { IconShouji } from "@/components/colorFont";

export default {
  name: "Header",
  components: {
    IconShouji,
  },
  data() {
    return {
      searchText: "",
      isIndex: true,
    };
  },
  methods: {
    handleSearchBtn() {
      this.$router.push("/search");
      console.log(this.searchText);
    },
    handelChangePath(path) {
      if (path === "/index" || path === "/" || path === "/wallpaper") {
        this.isIndex = true;
      } else {
        this.isIndex = false;
      }
    },
  },
  created() {
    this.handelChangePath(this.$route.path);
  },
  watch: {
    $route(to) {
      this.handelChangePath(to.path);
    },
  },
};
</script>

<style lang="less" scoped>
.fix-header /deep/ .input-with-select .el-input-group__append {
  background-color: rgb(212, 212, 212);
}

.fix-header /deep/ .input-with-select .el-input-group__append:hover {
  background-color: #1890ff;
  color: white;
}

.fix-header /deep/ .el-icon-search {
  font-weight: 700;
  font-size: 16px;
}

.fix-header /deep/ .el-badge__content.is-fixed {
  top: 15px;
  right: 15px;
}

.fix-header {
  height: 50px;
  min-width: 1350px;
  width: 100%;
  position: absolute;
  top: 0px;
  left: 0px;
  display: flex;
  z-index: 1;
  //border-bottom: 1px solid rgb(222, 222, 222);
  //background-image: url('~@/resource/head-bg.png');
  .fix-header-left {
    height: 100%;
    img {
      margin-left: 20px;
      height: 100%;
      float: left;
      margin-right: 5px;
    }
    ul {
      list-style: none;
      float: left;
      padding-left: 0px;
      margin: 0px;
      line-height: 50px;
      li {
        padding: 0 5px;
        float: left;
        cursor: pointer;
      }
    }
  }
  .fix-header-right {
    float: right;
    line-height: 50px;
    display: flex;
    padding-right: 40px;
    .login-btn {
      padding: 0px 10px;
      cursor: pointer;
    }
    .register-btn {
      padding: 0px 10px;
      margin-right: 10px;
      cursor: pointer;
    }
  }
  .index {
    color: white;
  }
  .other {
    color: black;
  }
  // .index:hover {
  //   background-color: gray;
  // }
  .other:hover {
    background-color: rgb(222, 222, 222);
  }
}
</style>