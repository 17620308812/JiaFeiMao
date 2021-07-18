import axios from 'axios'

let BaseUrlConfig = 'http://localhost:8082'

export default (option) => {
    return new Promise((resolve, reject) => {
        let baseURL = option.baseURL ? option.baseURL : BaseUrlConfig;
        axios({
            withCredentials: true,
            url: option.url,
            baseURL: baseURL,
            method: option.method ? option.method : 'get',
            params: option.params,
            data: option.data,
            timeout: option.timeout ? option.timeout : 2000000, //超时时间
        }).then((response) => {
            console.log('response = ',response)
            resolve(response.data.data);
            if (response.status === 200) {
                if (response.data.returnCode === '0') {
                    resolve(response.data.data);
                } else {
                    reject(response.data.returnMsg);
                }
            } else {
                reject(response.message);
            }
        }).catch((error) => {
            console.log(error);
        })
    })
}