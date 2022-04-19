import axios from 'axios'

export default class UploadAdapter {
  constructor(loader) {
    this.loader = loader
  }
  upload() {
    return this.loader.file.then(file => new Promise((resolve, reject) => {
      let fileReader = new FileReader()
      fileReader.readAsDataURL(file)
      fileReader.onload = function (e) {
        resolve({
          default: e.target.result
        })
      }
    }))
  }
  abort() {
  }
}