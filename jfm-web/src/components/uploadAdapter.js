import axios from 'axios'

export default class UploadAdapter {
  constructor(loader) {
    this.loader = loader
  }
  upload() {
    return this.loader.file.then(file => new Promise((resolve, reject) => {
      const data = new FormData()
      data.append('file', file)
      axios.request({
        url: `/services/businessservice/api/attachments/uploadFile`,// 上传文件的接口地址，实际请填写完整地址
        method: 'post',
        data,
        headers: {
          'Content-Type': 'multipart/form-data'
        }
      }).then(res => {
        console.log(res)
        if (res.data.meta.code === 200) {
          const url = res.data.url // 后台返回的上传成功后的图片地址
          resolve({
            default: url
          })
        }
      }).catch(error => {
        reject(error)
      })
    }))
  }
  abort() {
  }
}