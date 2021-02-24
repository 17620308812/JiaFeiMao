<template>
  <div style="padding-bottom:20px">
    <div style="margin-top:50px;height:86px;background-color:#00a0d8;text-align: center;">
      <img src="~@/resource/login-header.png" />
    </div>
    <div style="width:980px;margin: 40px auto;">
      <el-divider>
        <span style="font-size:40px;">登陆</span>
      </el-divider>
      <div style="height:350px;position:relative;margin-top:60px" class="login-panel">
        <div style="width:50%;float:left;text-align:center">
          <div class="erweima-top"></div>
          <div style="overflow:hidden;margin-top: -8px;">
            <img src="~@/assets/login-erweima.png" style="margin:-10px;height:150px;width:150px" />
          </div>
          <div class="erweima-bottom">
            <p style="font-size:20px;">扫描二维码登录</p>

            <span style="color:#717171;font-size:14px">请使用</span>
            <span style="color:#00a1d6;font-size:14px;cursor: pointer;margin-left:5px">加菲猫客户端</span>
            <br />
            <span style="color:#717171;font-size:14px">扫码登录</span>
            <br />
            <span style="color:#717171;font-size:14px">或扫码下载APP</span>
          </div>
        </div>
        <el-divider class="login-vertical-line" direction="vertical"></el-divider>
        <div style="width:50%;float:left;">
          <div style="padding:30px 45px 0px 45px">
            <div style="margin-bottom:10px">
              <span
                style="margin-right:10px;font-size:14px;cursor: pointer;"
                :class="loginType==='1'?'select-login-type':'select-no-login-type'"
                @click="handelLoginType('1')"
              >密码登陆</span>
              <span
                style="margin-right:10px;font-size:14px;cursor: pointer;"
                :class="loginType==='2'?'select-login-type':'select-no-login-type'"
                @click="handelLoginType('2')"
              >短信登陆</span>
            </div>
            <el-form
              :model="ruleForm"
              status-icon
              :rules="rules"
              ref="ruleForm"
              label-width="0px"
              class="demo-ruleForm"
            >
              <el-form-item prop="account">
                <el-input v-model="ruleForm.account" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item prop="pass">
                <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
              </el-form-item>
              <div style="line-height:20px;margin-bottom:5px;margin-top:40px;">
                <el-checkbox v-model="ruleForm.remeber">
                  <span style="font-size:12px;">记住我</span>
                </el-checkbox>
                <span style="color:rgb(212,212,212);font-size:12px;margin-left:10px">不是自己的电脑不要勾选此项</span>

                <span style="float:right;font-size:12px;">
                  <span style="color: #02a7de;cursor: pointer;margin-right:5px">无法验证？</span>
                  <span style="color: #02a7de;cursor: pointer;">忘记密码？</span>
                </span>
              </div>

              <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm')">
                  <div style="width:140px">登陆</div>
                </el-button>
                <div style="float:right;">
                  <el-button @click="resetForm('ruleForm')">
                    <div style="width:140px">注册</div>
                  </el-button>
                </div>
              </el-form-item>

              <div style="margin-top:-10px;line-height:21px;">
                <div style="float:left">
                  <img src="~@/resource/weixin-logo.jpg" style="width:21px;height:21px" />
                </div>
                <div
                  style="float:left;color:gray;font-size:12px;margin-left:3px;margin-right:20px;cursor: pointer;"
                >微信账号登陆</div>
                <div style="float:left">
                  <img src="~@/resource/qq-logo.jpg" style="width:21px;height:21px" />
                </div>
                <div
                  style="float:left;color:gray;font-size:12px;margin-left:3px;margin-right:10px;cursor: pointer;"
                >QQ账号登陆</div>
              </div>
            </el-form>
          </div>
        </div>
      </div>
    </div>

    <div style="text-align:center;color:#99a2aa;font-size:12px;min-width:980px">
      <span>登录即代表你同意</span>
      <span style="color:#00a1d6">用户协议</span>
      <span>和</span>
      <span style="color:#00a1d6">隐私政策</span>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    var validateAccount = (rule, value, callback) => {
      if (value === "") {
        callback(new Error("请输入账号"));
      } else {
        if (this.ruleForm.checkPass !== "") {
          this.$refs.ruleForm.validateField("checkPass");
        }
        callback();
      }
    };
    var validatePass = (rule, value, callback) => {
      if (value === "") {
        callback(new Error("请输入密码"));
      } else {
        if (this.ruleForm.checkPass !== "") {
          this.$refs.ruleForm.validateField("checkPass");
        }
        callback();
      }
    };

    return {
      loginType: "1",
      ruleForm: {
        account: "",
        pass: "",
        remeber: false,
      },
      rules: {
        account: [{ validator: validateAccount, trigger: "blur" }],
        pass: [{ validator: validatePass, trigger: "blur" }],
      },
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          alert("submit!");
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    },
    handelLoginType(type) {
      this.loginType = type;
    },
  },
};
</script>

<style lang="less" scoped>
.login-panel /deep/ .el-divider--vertical {
  height: 100%;
  position: absolute;
  margin: 0px;
}
.erweima-top {
  background: url("~@/resource/e6f2388d454c82004905753802e9cfe709d80d08.png")
    no-repeat;
  width: 70px;
  height: 70px;
  margin: auto;
}
.erweima-bottom {
  background: url("~@/resource/2233login.af9c53d.png") no-repeat;
  width: 480px;
  height: 155px;
  padding: 5px;
}
.select-login-type {
  color: #02a7de;
}
.select-no-login-type {
  color: #555;
}
</style>