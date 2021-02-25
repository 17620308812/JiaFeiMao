<template>
  <div style="padding-bottom: 20px">
    <div
      style="
        margin-top: 50px;
        height: 86px;
        background-color: #00a0d8;
        text-align: center;
      "
    >
      <img src="~@/resource/login-header.png" />
    </div>
    <div style="width: 980px; margin: 40px auto">
      <el-divider>
        <span style="font-size: 40px">注册</span>
      </el-divider>
      <div
        style="
          height: 350px;
          position: relative;
          margin: 60px auto 0px auto;
          width: 400px;
        "
        class="login-panel"
      >
        <el-form
          :model="ruleForm"
          :rules="rules"
          ref="ruleForm"
          label-width="0px"
          class="demo-ruleForm"
        >
          <el-form-item prop="userNickName">
            <el-input
              v-model="ruleForm.userNickName"
              placeholder="昵称"
            ></el-input>
          </el-form-item>
          <el-form-item prop="userPassword">
            <el-input
              type="password"
              v-model="ruleForm.userPassword"
              autocomplete="off"
              placeholder="密码"
            ></el-input>
          </el-form-item>
          <el-form-item prop="phoneNumber">
            <el-input
              placeholder="填写常用手机号"
              v-model="ruleForm.phoneNumber"
              class="input-with-select"
            >
              <el-select
                v-model="ruleForm.district"
                slot="prepend"
                placeholder="区域"
              >
                <el-option label="中国大陆" value="86"></el-option>
                <el-option label="中国香港" value="2"></el-option>
              </el-select>
            </el-input>
          </el-form-item>
          <el-form-item prop="verificationCode">
            <el-input
              placeholder="请输入手机验证码"
              v-model="ruleForm.verificationCode"
              class="input-with-select"
            >
              <el-button slot="append" type="primary">点击获取</el-button>
            </el-input>
          </el-form-item>

          <el-checkbox v-model="ruleForm.isAgree">
            <div style="font-size: 12px; color: #99a2aa; margin-bottom: 10px">
              <span>我已同意</span>
              <span style="color: #00a1d6">用户协议</span>
              <span>和</span>
              <span style="color: #00a1d6">隐私政策</span>
            </div>
          </el-checkbox>

          <el-form-item>
            <el-button
              style="width: 100%"
              type="primary"
              @click="submitForm('ruleForm')"
              :disabled="!ruleForm.isAgree"
              >注册</el-button
            >
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      ruleForm: {
        userNickName: "",
        userPassword: "",
        district: "86",
        verificationCode: "",
        isAgree: false,
      },
      rules: {
        userNickName: [
          { required: true, message: "请输入昵称", trigger: "blur" },
          { min: 3, max: 5, message: "长度在 3 到 10 个字符", trigger: "blur" },
        ],
        userPassword: [
          { required: true, message: "请输入密码", trigger: "blur" },
          {
            min: 6,
            max: 20,
            message: "长度在 3 到 25 个字符",
            trigger: "blur",
          },
        ],
        phoneNumber: [
          { required: true, message: "请输入手机号", trigger: "blur" },
          { min: 11, max: 11, message: "手机号格式不正确", trigger: "blur" },
        ],
        verificationCode: [
          { required: true, message: "请输入验证码", trigger: "blur" },
        ],
      },
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          this.$http({
            url: "/user/insert",
            method: "post",
            data: this.ruleForm,
          }).then((res) => {
            this.$message({
              message: "注册成功",
              type: "success",
            });
          });
        } else {
          return false;
        }
      });
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

.login-panel /deep/ .el-select .el-input {
  width: 110px;
}

.login-panel /deep/ .el-input-group__append button.el-button {
  color: #fff;
  background-color: #409eff;
  border-color: #409eff;
}

.login-panel /deep/ .el-checkbox__label {
  padding-left: 5px;
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
</style>